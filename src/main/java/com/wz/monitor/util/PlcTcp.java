package com.wz.monitor.util;

public class PlcTcp {
	/**
	 * 
	 * @param resource 源节点号   如 192.168.0.1   节点号为1
	 * @param target 目标节点号   如 192.168.0.65   节点号为65 传入的值为16进值
	 * @return
	 */
	public static byte[] getHead(int resource,int target){
		
		 byte[] pacchetto = new byte[10]; 
		 //头信息
		 //icf 固定为80
		 pacchetto[0]=80;
		 //rsv 固定 00
		 pacchetto[1]=00;
		 //GCT 固定02
		 pacchetto[2]=02;
		 //dna
		 pacchetto[3]=00;
		 //dna1
		 pacchetto[4]=(byte)target;
		 //dna2
		 pacchetto[5]=00;
		 //sna 源网络号
		 pacchetto[6]=0;
		 //sa1 源节点号
		 pacchetto[7]=(byte)resource;
		 //sa2 源单元号
		 pacchetto[8]=00;
		 //sid 00
		 pacchetto[9]=00;
		return pacchetto;
	}
}
