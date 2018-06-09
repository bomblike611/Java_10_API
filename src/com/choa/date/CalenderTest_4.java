package com.choa.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderTest_4 {
	//Calendar인데.....ㅠ...

	public static void main(String[] args) {
		Calendar ca=Calendar.getInstance();
		
		System.out.println(ca.getTime());
		int year =ca.get(Calendar.YEAR);
		int month = ca.get(Calendar.MONTH)+1;
		int date=ca.get(Calendar.DATE);
		
		System.out.println(year +"년 "+month+"월 "+date+"일 ");
		
		
		SimpleDateFormat sd =new SimpleDateFormat("yyyy.MM.dd HH:mm:ss E");
		String result = sd.format(ca.getTime());
		
		System.out.println(result);

	}

}
