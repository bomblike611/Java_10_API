package com.choa.wraper;

import java.util.Scanner;

public class WrapperTest_2_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("비번을 입력하세요");
		System.out.println("영어소&대문자 각 2개이상,숫자 3개이상");
		System.out.println("최소 6글자 이상");
		String pw=sc.next();
		int num=pw.length();
		
		int num2=0;
		int upper=0;
		int lower=0;
		
		if(num>5) {
			for(int i=0;i<num;i++) {
				if(Character.isUpperCase(pw.charAt(i))) {
					upper++;
				}else if(Character.isLowerCase(pw.charAt(i))) {
					lower++;
				}else if(Character.isDigit(pw.charAt(i))) {
					num2++;
				}
			}
			if(upper>1 && lower>1&&num2>2) {
				System.out.println("Sucess");
			}else {
				System.out.println("fail");
			}
		}
		

		
		
	}

}
