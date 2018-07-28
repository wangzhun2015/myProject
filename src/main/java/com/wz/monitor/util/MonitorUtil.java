package com.wz.monitor.util;

public class MonitorUtil {

	/** 
	 * java中将4字节的byte数组转成一个int值的工具方法如下：
	* @param byte[]
	* @return int
	*/  
	public static int byteArrayToInt(byte[] b){  
	    byte[] a = new byte[4];  
	    int i = a.length - 1,j = b.length - 1;  
	    for (; i >= 0 ; i--,j--) {//从b的尾部(即int值的低位)开始copy数据  
	        if(j >= 0)  
	            a[i] = b[j];  
	        else  
	            a[i] = 0;//如果b.length不足4,则将高位补0  
	  }  
	    int v0 = (a[0] & 0xff) << 24;//&0xff将byte值无差异转成int,避免Java自动类型提升后,会保留高位的符号位  
	    int v1 = (a[1] & 0xff) << 16;  
	    int v2 = (a[2] & 0xff) << 8;  
	    int v3 = (a[3] & 0xff) ;  
	    return v0 + v1 + v2 + v3;  
	}
	public static byte[] int2Bytes(int value) {  
			int byteNum = (40 -Integer.numberOfLeadingZeros (value < 0 ? ~value : value))/ 8;
			byte[] byteArray = new byte[4];

			for (int n = 0; n < byteNum; n++)
			byteArray[3 - n] = (byte) (value>>> (n * 8));

			return (byteArray);
	} 
	
	public static String  string10To16(String value){
				String  ss = Integer.toHexString(Integer.parseInt(value));
				if(ss.length()<2){
					ss="0"+ss;
				}
			return 	ss.toUpperCase();
	}
}
