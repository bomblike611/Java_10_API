package com.choa.random;

import java.util.Random;

public class RandomTest_2_2 {

	public static void main(String[] args) {
	
		//랜덤숫자 중복 제거하기
		int num2 = 0;
		Random r2=new Random();
		int []ar2=new int[6];
		for(int i=0;i<ar2.length;i++) {
			ar2[i]=r2.nextInt(45)+1;
			for(int j=0; j<i;j++) {
				if(ar2[j]==ar2[i]) {
					i--;
					break;
				}
			}
			
			

		}
		//정렬하자!
		for(int i=0;i<ar2.length-1;i++) {
			for(int j=i+1;j<ar2.length;j++) {
				if(ar2[i]>ar2[j]) {
					int num=ar2[i];
					ar2[i]=ar2[j];
					ar2[j]=num;
					
				}
			}
		}
		
		
		
		//프린트문
		for(int i=0;i<ar2.length;i++) {
		System.out.println((i+1)+"번째 번호 : "+ar2[i]);
		}

	}

}
