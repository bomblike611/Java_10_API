package com.choa.object;

public class ObjectTest_1 {
	public static void main(String[] args) {
		Object obj=new Object();
		Object obj2=new Object();
		boolean ch=obj.equals(obj2);
		
		System.out.println(ch);
		String s=obj.toString();
		System.out.println(obj);
		System.out.println(s);
		
		int result =obj.hashCode();
		System.out.println(result);
		
	}
}
