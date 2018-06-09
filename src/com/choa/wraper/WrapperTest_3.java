package com.choa.wraper;

import java.util.Calendar;
import java.util.Scanner;

public class WrapperTest_3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("주민번호를 입력 000000-1234567");
		String jumin =sc.next();

		//성별 : 1.남자 2.여자 3.2000년대 남자 4.2000년대 여자 5.외국인
		//나이 : 
		//12~2월 :겨울
		//3~5월 :봄
		//6~8월 :여름
		//9~11월 :가을
		

		String s=new String(jumin);
		String birth=s.substring(0, 6);
		String gender=s.substring(7,8);
		int b = Integer.parseInt(birth);
		int year=b/10000;
		int month=b/100-year*100;
		int date=b-(month*100+year*10000);
		int g = Integer.parseInt(gender);
		
		Calendar ca=Calendar.getInstance();
		Calendar ca2=Calendar.getInstance();
		
		
		
		if(jumin.length()==14) {
			if(g==1) {
				System.out.println("성별 : 남자");
				ca.set(year+1900, month-1,date);
			}else if(g==2) {
				System.out.println("성별 : 여자");
				ca.set(year+1900, month-1,date);
			}else if(g==3) {
				System.out.println("성별 :2000년 이후 남자");
				ca.set(year+2000, month-1,date);
			}else if(g==4) {
				System.out.println("성별 :2000년 이후 여자");
				ca.set(year+2000, month-1,date);
			}else if(g==5) {
				System.out.println("외쿡인입니다.");
				ca.set(year+1900, month-1,date);
			}
			long now = ca2.getTimeInMillis();
			long me = ca.getTimeInMillis();
			long hh=now-me;
			long count=hh/(1000*60*60*24*365L);
			System.out.println("만 나이 :"+count);
			if(month==12||month==1||month==2) {
				System.out.println("겨울에 태어났습니다.");
			}else if(2<month&&month<6) {
				System.out.println("봄에 태어났습니다.");
			}else if(5<month&&month<9) {
				System.out.println("여름에 태어났습니다.");
			}else if(8<month&&month<12) {
				System.out.println("가을에 태어났습니다.");
			}

		}else {
			System.out.println("잘못입력하셨습니다.");
		}

	}
}
