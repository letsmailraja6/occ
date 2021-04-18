package com.app;

public class BinaryReversalMain {

	public static void main(String[] args) {
		System.out.println(binaryReversal("4567"));

	}
	
	public static String binaryReversal(String str) {
		str=Long.toBinaryString(Long.parseLong(str));
		int len=str.length()%8==0?0:8-str.length()%8;
		//System.out.println("len "+len);
		StringBuilder sb=new StringBuilder(str);
		for (int i = 0; i < len; i++) {
			sb.insert(0, 0);
		}
		str=sb.reverse().toString();
		
		return Long.parseLong(str,2)+"";
	}

}
