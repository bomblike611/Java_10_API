package com.choa.collection;

import java.util.ArrayList;

public class Test_2 {

	public static void main(String[] args) {
		ArrayList<String> ar= new ArrayList<>();
		ar.add("guckkasten");
		ar.add("ropun");
		ar.add("jannabi");
		
		
		
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("==========================");
		
		//향상된 for문 foreach
		for(String s:ar) {//for(데이터타입 참조변수 : 배열 또는 컬렉션 참조변수)
			System.out.println(s);
		}

	}

}
