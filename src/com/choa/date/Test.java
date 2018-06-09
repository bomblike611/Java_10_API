package com.choa.date;

public class Test {
	private int num;
	private static Test t;

	private Test() {
		
	}
	
	public static Test getTest() {
		if(t==null) {
			t=new Test();
		}
		return t;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
	
}
