package com.choa.string;

public class StringTest_2 {

	public static void main(String[] args) {
		String t1=new String("choa");
		System.out.println(t1);
		String t2=new String("choa");
		String t3="choa";
		String t4="choa";
		System.out.println(t1.equals(t2));
		System.out.println(t3.equals(t4));
		System.out.println(t1.equals(t3));//문자열 비교는 equals 활용
	}

}
