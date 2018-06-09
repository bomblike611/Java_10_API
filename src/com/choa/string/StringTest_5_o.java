package com.choa.string;

import java.util.Scanner;

public class StringTest_5_o {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String [] imgs= {"gif","jpg","png"};
		System.out.println("파일명을 입력하세요");
		String name=sc.next();
		
		String result="이미지 파일이 아닙니다.";
		int s= name.lastIndexOf(".");
		String s2=name.substring(s+1);
		
		for(int i=0;i<imgs.length;i++) {
			if(s2.equals(imgs[i])) {
				result=name+"은 이미지 파일입니다.";
				break;
			}
		}
		System.out.println(result);
		
		
	}
}
