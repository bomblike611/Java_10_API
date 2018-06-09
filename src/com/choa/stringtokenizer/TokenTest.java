package com.choa.stringtokenizer;

import java.util.StringTokenizer;

public class TokenTest {
	public static void main(String[] args) {
		
		String str="iu-25-160-choa-28-158-suji-24-168";
		StringTokenizer st=new StringTokenizer(str,"-");
		int count=st.countTokens();
		
		while(st.hasMoreTokens()) {
			String s=st.nextToken();
			String s2=st.nextToken();
			String s3=st.nextToken();
			System.out.println(s);
			System.out.println(s2);
			System.out.println(s3);
		}
	}
}
