package com.bskj.demo;

import java.net.*;
import java.io.*;

public class JavaFins {
	// variabili connessione
	Socket client = null;
	String ip = "";
	int port = 0;
	// varibili per leggere e scrivere
	OutputStream out_data = null;
	PrintStream printStream = null;
	InputStream inputStream;
	byte[] buffer = null;
	byte clientNode = 0, serverNode = 0;

	JavaFins() {
		System.out.println("Start program... \n");
		ip = "localhost";
		port = 9600;
	}

	private void Connetti() {
		try {
			client = new Socket(ip, port);
			out_data = client.getOutputStream();
			inputStream = client.getInputStream();
			System.out.println("Connected to " + client.getInetAddress()
					+ " on port: " + client.getPort() + "\n");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block e.printStackTrace();
		}
	}

	private void Leggi() {
		byte[] pacchetto = new byte[20];
		int errore = 0;
		pacchetto[0] = 70;
		// header -> FINS
		pacchetto[1] = 73;
		pacchetto[2] = 78;
		pacchetto[3] = 83;
		pacchetto[4] = 0;
		// length = 12 bytes
		pacchetto[5] = 0;
		pacchetto[6] = 0;
		pacchetto[7] = 12;
		pacchetto[8] = 0;
		// command = 0 pacchetto[9] = 0;
		pacchetto[10] = 0;
		pacchetto[11] = 0;
		pacchetto[12] = 0;
		// error code = 0
		pacchetto[13] = 0;
		pacchetto[14] = 0;
		pacchetto[15] = 0;
		pacchetto[16] = 0;
		// client node address automatically obtained when it is set to 0
		pacchetto[17] = 0;
		pacchetto[18] = 0;
		pacchetto[19] = 0;
		try {
			printStream = new PrintStream(client.getOutputStream(), true);
			// apro stream di scrittura
			printStream.write(pacchetto);
			// mando pacchetto al PLC
			System.out.println("Attendo risposta...");
			while (true) { // aggiungere thread.slepp per non interrompere il
							// pacchetto ?
				if (inputStream.available() > 0 && inputStream != null) {
					inputStream
							.read(buffer = new byte[inputStream.available()]);
					break;
				}
			}
			if (buffer.length > 0)
			// se l'array di byte ricevuto è maggiore di zero
			{
				errore = buffer[15];
				if (errore == 0)
				// byte di eventuali errori
				{
					clientNode = buffer[20];
					// byte clientNode
					serverNode = buffer[23];
					// byte serverNode=
					StampoPacchetto(buffer);
					// stampo pacchetto
				} else if (errore == 1) {
					System.out.println("The header is not FINS...");
				} else if (errore == 2) {
					System.out.println("The data length is too long...");
				} else if (errore == 3) {
					System.out.println("Command is not supported....");
				} else if (errore == 20) {
					System.out.println("Alla connections are in use...");
				}

				else if (errore == 21) {
					System.out
							.println("The specific node is already connected...");
				} else if (errore == 22) {
					System.out
							.println("Attempt to access a protected node from an unspecific ip address...");
				} else if (errore == 23) {
					System.out.println("Fins node address is out of range...");
				} else if (errore == 24) {
					System.out
							.println("Fins node address is being used by the client and server....");
				} else if (errore == 25) {
					System.out
							.println("All node addresses avaiable for allocation have been used...");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void LeggiWord() {
		byte[] pacchetto = new byte[34];
		pacchetto[0] = 70;
		// header -> FINS
		pacchetto[1] = 73;
		pacchetto[2] = 78;
		pacchetto[3] = 83;
		pacchetto[4] = 0;
		// length after command
		pacchetto[5] = 0;
		pacchetto[6] = 0;
		pacchetto[7] = 22;
		pacchetto[8] = 0;
		// command = 2
		pacchetto[9] = 0;
		pacchetto[10] = 0;
		pacchetto[11] = 2;
		pacchetto[12] = 0;
		// error code = 0
		pacchetto[13] = 0;
		pacchetto[14] = 0;
		pacchetto[15] = 0;
		// fins frame
		pacchetto[16] = -128;
		// icf
		pacchetto[17] = 0;
		// rsv
		pacchetto[18] = 2;
		// gct
		pacchetto[19] = 0;
		// dna
		pacchetto[20] = 0;
		// da1
		pacchetto[21] = 0;
		// da2
		pacchetto[22] = 0;
		// sna
		pacchetto[23] = clientNode;
		// sa1
		pacchetto[24] = 0;
		// sa2
		pacchetto[25] = 100;
		// sid
		pacchetto[26] = 1;
		// mrc
		pacchetto[27] = 1;
		// src
		pacchetto[28] = -126;
		// tipo di memoria 82 -> DM
		pacchetto[29] = 0;
		// word inizio
		pacchetto[30] = -116;
		pacchetto[31] = 0; // bit inizio
		pacchetto[32] = 0;
		pacchetto[33] = 32;
		// quante word
		// invio pacchetto che legge 150 word dal plc
		try {
			printStream = new PrintStream(client.getOutputStream(), true);
			// apro stream di scrittura
			printStream.write(pacchetto);
			// mando pacchetto al PLC
			System.out.println("Attendo risposta...");
			while (true) { // aggiungere thread.slepp per non interrompere il
							// pacchetto ?
				if (inputStream.available() > 0 && inputStream != null) {
					inputStream.read(buffer = new byte[inputStream.available()]);
					break;
				}
			}

			if (buffer.length > 0)
			// se l'array di byte ricevuto è maggiore di zero
			{
				if (buffer[15] == 0) // byte di eventuali error
				{ // buffer[28] - buffer[29] ricevo MRES e SRES
					// buffer[30] ->
					StampoPacchetto(buffer);
					// stampo pacchetto
				} else
					System.out.println("Errore pacchetto...");
			}
		} catch (IOException e) {
			// TODO Auto-generated
			e.printStackTrace();
		}
	} // FUNZIONE CHE MI STAMPA I BYTE DI UN PACCHETTO (ARRAY DI BYTE)

	public void StampoPacchetto(byte[] pacchettoDaServer) {
		for (byte b : pacchettoDaServer) { // print character
			System.out.print(b + " ");
		}
	}

	public static void main(String args[]) {
		JavaFins prova = new JavaFins();
		prova.Connetti();
		prova.LeggiWord();
	}
	// connetto al plc prova.Leggi();
	// leggo client node address -> PAG 177

	// leggo word allarmi
}