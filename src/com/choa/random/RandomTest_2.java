package com.choa.random;

import java.util.Random;

public class RandomTest_2 {

	public static void main(String[] args) {
		//로또 번호 6개 
		//1~45번까지 
		int num = 0;
		Random r=new Random();
		int []ar=new int[6];
		for(int i=0;i<ar.length;i++) {
			for(int j=0; j<=i;j++) {
				if(ar[i]==ar[i-j]) {
					num=r.nextInt(45)+1;
					ar[i-j]=num;
				}
			}
			ar[i]=num;
			System.out.println((i+1)+"번째 번호 : "+ar[i]);

		}
		
		//강사님이 짜신것.
		
		System.out.println("=========================");

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
		for(int i=0;i<ar2.length;i++) {
		System.out.println((i+1)+"번째 번호 : "+ar2[i]);
		}


	}

}
