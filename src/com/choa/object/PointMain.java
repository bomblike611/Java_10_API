package com.choa.object;

public class PointMain {

	public static void main(String[] args) {
		Point p1=new Point();
		Point p2=new Point();
		p1.numA=10;
		p1.numB=20;
		
		p2.numA=10;
		p2.numB=20;
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		
		
		
	}

}
