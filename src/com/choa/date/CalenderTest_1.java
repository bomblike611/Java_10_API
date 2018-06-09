package com.choa.date;

import java.util.Calendar;

public class CalenderTest_1 {
	public static void main(String[] args) {
		Calendar ca= Calendar.getInstance();
		
		
		
		System.out.println(ca.getTime());
		ca.set(Calendar.YEAR, 2010);
		System.out.println(ca.getTime());
		ca.set(1995, 05, 11);
		System.out.println(ca.getTime());
		
		
		int year=ca.get(Calendar.YEAR);
		int month=ca.get(Calendar.MONTH);
		int day=ca.get(Calendar.DATE);
		int hour=ca.get(Calendar.HOUR);
		int minute=ca.get(Calendar.MINUTE);
		int second=ca.get(Calendar.SECOND);
		System.out.println("년 :"+year);
		System.out.println("월 :"+month);
		System.out.println("일 :"+day);
		System.out.println("시 :"+hour);
		System.out.println("분 :"+minute);
		System.out.println("초 :"+second);
		//get
		
		//=======roll=========
		ca.roll(Calendar.DATE, 3);
		System.out.println(ca.getTime());
		
		ca.set(2000,0,30);
		ca.roll(Calendar.DATE, 3);
		System.out.println(ca.getTime());
		
		
		//======add========
		ca.set(2000, 11, 30);
		ca.add(Calendar.DATE, 3);
		System.out.println(ca.getTime());
		
		
		//===========
		ca= Calendar.getInstance();
		Calendar ca2=Calendar.getInstance();
		ca.set(2001,1,3);
		System.out.println("====================================");
		System.out.println("현재시간 : "+ca2.getTime());
		System.out.println("바뀐시간 : "+ca.getTime());
		long cur = ca2.getTimeInMillis();
		long fur = ca.getTimeInMillis();
		System.out.println(cur);
		System.out.println(fur);
		long ch=cur-fur;
		System.out.println(ch);
		System.out.println("초 : "+ch/1000);
		System.out.println("분 : "+ch/(1000*60));
		System.out.println("시 : "+ch/(1000*60*60));
		System.out.println("일 : "+ch/(1000*60*60*24));
		System.out.println("년 : "+ch/(1000*60*60*24*365L));
	}
}
