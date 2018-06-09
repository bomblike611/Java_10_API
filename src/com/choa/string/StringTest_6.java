package com.choa.string;

public class StringTest_6 {

	public static void main(String[] args) {
		int num=10;

		String n=String.valueOf(num);

		System.out.println(n);

		String name="seoul, daegu, busan, incheon";
		String []ar=name.split(",");

		for(int i=0;i<ar.length;i++) {
			String city=ar[i];
			city=city.trim();//공백을 맨앞과 맨뒤를 지워줌
			if(city.equals("busan")) {
				System.out.println("select busan");
			}
		}
		System.out.println("finish");

	}

}
