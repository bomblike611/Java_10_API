package com.choa.date;

import java.util.Calendar;
import java.util.Scanner;

public class CalenderTest_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("태어난 년도를 입력하세요");
		int year=sc.nextInt();
		System.out.println("태어난 월을 입력하세요");
		int month=sc.nextInt();
		System.out.println("태어난 일을 입력하세요");
		int day=sc.nextInt();
		
		//19세 이상이면 술집에 들어갈 수 있음
		Calendar ca=Calendar.getInstance();
		Calendar ca2=Calendar.getInstance();
		ca.set(year, month-1,day);
		long now = ca2.getTimeInMillis();
		long me = ca.getTimeInMillis();
		long hh=now-me;
		long count=hh/(1000*60*60*24*365L);
		
		if(count>=19) {
			System.out.println("술집이용가능");
		}else {
			System.out.println("카페가세요");
		}
		
		ca.add(Calendar.DATE, (int)(19*365.2425));
		
		if(ca2.equals(ca)) {
			System.out.println("술집이[용가능");
		}else {
			System.out.println("카페[가세요");
		}
		
	}
}
