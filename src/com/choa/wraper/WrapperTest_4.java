package com.choa.wraper;

import java.util.Scanner;

public class WrapperTest_4 {

	public static void main(String[] args) {
		//주민번호를 입력
		//971219-1234567
		//맨마지막번호를 따로 빼놓음
		Scanner sc=new Scanner(System.in);
		System.out.println("주민 번호 입력");
		String jumin=sc.next();

		char [] numbers =jumin.toCharArray();
		int num=2;
		int sum=0;
		int result=0;
		int rest=0;//나머지

		for(int i=0;i<numbers.length-1;i++) {
			if(i==6) {
				continue;
			}
			sum=sum+Integer.parseInt(String.valueOf(numbers[i]))*num;
			num++;
			if(num==10) {
				num=2;
			}
		}
		
		rest=sum%11;
		result=11-rest;
		if(result>9) {
			result=result%10;
		}
		int check=Integer.parseInt(String.valueOf(numbers[numbers.length-1]));
		if(result==check) {
			System.out.println("제대로 된 주민번호");
		}else {
			System.out.println("잘못된 주민번호");
		}
		

		//9(첫번째)*2
		//7*3
		//1*4
		//2*5
		//1*6
		//9*7

		//1*8
		//2*9
		//3*2
		//4*3
		//5*6
		//6*5
		//결과값을 모두 더함
		//hap/11 == 몫,나머지
		//11-나머지 =결과값1
		//결과값==빼놓은 마지막번호
		//같다면 제대로 된 번호
		//만약 결과값1이 두자리이상이면 결과값을 10으로 다시 나누어 나머지를 구함
		//나머지를 다시 마지막번호와 비교

	}

}
