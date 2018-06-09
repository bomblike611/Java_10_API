package com.choa.random;

import java.util.Calendar;
import java.util.Random;

public class RandomTest_3 {

	public static void main(String[] args) {
		Calendar ca=Calendar.getInstance();
		Random r=new Random(ca.getTimeInMillis());
		
		int num=r.nextInt(100);
		
		System.out.println(num);

	}

}
