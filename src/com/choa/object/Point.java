package com.choa.object;

public class Point extends Object{
	int numA;
	int numB;
	
	@Override
	public boolean equals(Object obj) {
		if(((Point)obj).numA==this.numA&&((Point)obj).numB==this.numB) {
			return true;
		}else {
			return false;
		}
		
		
	}

}
