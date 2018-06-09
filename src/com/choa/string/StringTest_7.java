package com.choa.string;

public class StringTest_7 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("iu의 국어점수 : ");
		sb.append(10);
		sb.append("수학 점수 :");
		
		//stringbuffer 클래스를 string으로 바꾸기 위해서는 string을 리턴하는 투스트링 메소드를 호출(오버라이딩됨).
		
		String s=sb.toString();
		
		System.out.println(s);
		
	}
}
