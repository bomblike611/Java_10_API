package com.choa.wraper;

import java.util.Scanner;

public class WrapperTest_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("비번을 입력하세요");
		System.out.println("영어소&대문자 각 2개이상,숫자 3개이상");
		System.out.println("최소 6글자 이상");
		String pw=sc.next();
		
		String s=new String(pw);
		
		int dae=0;
		int so=0;
		int sutja=0;
		
		char []ar=s.toCharArray();
		
		for(int i=0;i<ar.length;i++) {
			if(Character.isUpperCase(ar[i])) {
				dae++;
			}else if(Character.isLowerCase(ar[i])) {
				so++;
			}else if(Character.isDigit(ar[i])) {
				sutja++;
			}
		}
		if(dae>=2&&so>=2&&sutja>=3&&ar.length>=6) {
			System.out.println("PW가 등록되었습니다.");
		}else {
			System.out.println("PW가 잘못되었습니다.");
		}

	}

}
