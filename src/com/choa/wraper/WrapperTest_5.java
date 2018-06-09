package com.choa.wraper;

public class WrapperTest_5 {

	public static void main(String[] args) {
	int num=10;
	
	
	//Integer 객체로 만드는 방법
	Integer num1=new Integer(num);
	Integer num2=Integer.valueOf(num);
	
	//Autoboxing -같은 타입끼리 자동으로 바꾸어줌
	Integer num3=num;
	
	//Autounboxing
	num=num3;
	
	Double d1=3.14;
	d1=(double)num;
	}

}
