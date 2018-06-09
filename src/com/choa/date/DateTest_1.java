package com.choa.date;

import java.util.Date;

public class DateTest_1 {
	public static void main(String[] args) {
		Date d=new Date();
		
		System.out.println(d);
		//싱글톤 디자인패턴 - 객체를 단 한번만 생성
		Test t=Test.getTest();
		
	}
}
