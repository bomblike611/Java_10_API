package com.choa.date;

import java.util.Calendar;
import java.util.Scanner;

public class CalenderTest_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//시간당 Pc방 이용료가 1000원
		System.out.println("퇴실 시간 입력 0 ~ 24");
		int hour=sc.nextInt();
		
		Calendar ca=Calendar.getInstance();
		Calendar ca2=Calendar.getInstance();
		ca.set(Calendar.HOUR,hour);
		
		long now = ca2.getTimeInMillis();
		long me = ca.getTimeInMillis();
		long sigan=me-now;
		
		sigan=sigan/1000/60/60;
		
		int money=((int)sigan+1)*1000;
		
		System.out.println(money+"원을 내세요");
		
	}
}
