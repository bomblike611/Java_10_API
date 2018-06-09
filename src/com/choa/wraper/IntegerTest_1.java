package com.choa.wraper;

public class IntegerTest_1 {

	public static void main(String[] args) {
		Integer n1=new Integer(10);
		Integer n2=new Integer("20");
		
		int num1=n1.intValue();
		int num2=n2.intValue();
		
		
		//t1,t2는 n1,n2와 같음
		Integer t1=Integer.valueOf(20);
		Integer t2=Integer.valueOf("40");
		int num3= t1.intValue();
		int num4= t2.intValue();
		
		
		System.out.println(num1+num2);
		System.out.println(num3+num4);
		
		int num5 = Integer.parseInt("50");//문자열을 바로 int타입으로 바꿔줌
		
		

	}

}
