package com.choa.string;

public class StringTest_3 {
	public static void main(String[] args) {
		String s="JavaTest";
		//해당문자의 인덱스 번호 반환
		//순서는 앞에서부터 찾아서 찾으면 종료
		//해당 문자가 없으면 -1을 반환
		//lastindexOf() 찾는순서가 뒤에서부터
		int index=s.indexOf('A');
		int index2=s.indexOf("va",0);
		
		System.out.println(index2);
		
		String ex="test.ex.jpg";
		
		String ns=s.replace('a', 'e');
		System.out.println(s);
		System.out.println(ns);
		
		
		
		
	}
}
