package com.choa.string;

public class StringTest_4 {
	public static void main(String[] args) {
		String names="iu,choa,hani,suji";

		String [] ar=names.split(",");

		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		System.out.println("=======Substring=======");
		String s=names.substring(4);
		System.out.println(s);
	}	
}
