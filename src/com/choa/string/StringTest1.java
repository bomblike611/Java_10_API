package com.choa.string;

import java.util.Scanner;

public class StringTest1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int count=0;//대문자의 갯수
		int count2=0;//소문자의 갯수
		
		System.out.println("아이디는 최소 6글자 이상");
		System.out.println("소문자 2글자 이상,대문자 2글자 이상");
		System.out.println("아이디를 입력하세요 :");
		String id=sc.next();
		
		
	/*	
		if(id.length()>=6) {
			for(int i=0;i<id.length();i++) {
				if((65<=id.codePointAt(i)&&id.codePointAt(i)<91)) {
					count++;
				}else if((97<=id.codePointAt(i)&&id.codePointAt(i)<123)) {
					count2++;
				}
			}
			if(count>=2&&count2>=2) {
			System.out.println("입력완료");}
			else {
				System.out.println("잘못입력하셨습니다.");
			}
		}else {
			System.out.println("잘못입력하셨습니다.");
		}*/
		for(int i=0;i<id.length();i++) {
			char ch=id.charAt(i);
			if(ch>=65&&ch<=90) {
				count++;
			}else if(ch>=97&&ch<=122){
				count2++;
			}else {
				
			}
		}
		System.out.println("대문자의 갯수는 :"+count);
		System.out.println("소문자의 갯수는 :"+count2);
		
		
		


	}

}
