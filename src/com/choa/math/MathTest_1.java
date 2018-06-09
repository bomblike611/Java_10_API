package com.choa.math;

public class MathTest_1 {
	public static void main(String[] args) {
		double d=Math.ceil(2.12);//올림
		System.out.println(d);
		System.out.println("=============");
		d=Math.floor(2.56);
		System.out.println(d);
		System.out.println("====round====");
		long l=Math.round(2.46);//반올림
		System.out.println(l);
		System.out.println("===random===");
		double r=Math.random();
		System.out.println(r);
		
	}
}
