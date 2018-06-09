package com.choa.string;

import java.util.Scanner;

public class StringTest_5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String [] imgs= {"gif","jpg","png"};
		System.out.println("파일명을 입력하세요");
		String name=sc.next();
		
		int count=0;
		int s= name.lastIndexOf(".");
		String s2=name.substring(s+1);
		
		for(int i=0;i<imgs.length;i++) {
			if(s2.equals(imgs[i])) {
				count++;
			}
		}
		if(count>=1) {
			System.out.println("이미지 파일입니다.");
		}else {
			System.out.println("이미지 파일이 아닙니다.");
		}
		
		
		System.out.println(s2);
		
	}
}
