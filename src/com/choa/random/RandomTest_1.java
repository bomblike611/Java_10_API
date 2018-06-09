package com.choa.random;

import java.util.Random;

public class RandomTest_1 {

	public static void main(String[] args) {
		Random r= new Random();
		//int 범위의 랜덤한 숫자를 반환
		int num= r.nextInt();
		System.out.println(num);
		
		//0부터 입력한 숫자 미만만큼의 랜덤한 숫자 반환
		int num2=r.nextInt(10);
		System.out.println(num2);
		
	}

}
