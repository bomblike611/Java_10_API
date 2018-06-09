package com.choa.math;

import java.util.StringTokenizer;

public class MathTest_3 {
	public static void main(String[] args) {
		String food="분식, 분식, 분식, 햄버거, 돈까스, 순대국밥, 돈까스, 분식, 분식, 굶기";
		//저녁메뉴가 랜덤하게 하나 출력
		
		String []ar=food.split(", ");
		//스플릿 사용
		System.out.println("무엇을 드시겠습니까?");
		double d=Math.random()*10;
		int p=(int)d;
		System.out.println(ar[p]);
		
		
		//토큰사용
		String food2="김밥, 빵, 라면, 햄버거, 돈까스, 샌드위치, 랍스터, 짜장면, 삼겹살, 굶기";
		String []ar2=new String[10];
		int i=0;
		StringTokenizer st=new StringTokenizer(food,",");
		while(st.hasMoreTokens()){
			ar[i]=st.nextToken();
			i++;
		}
		
		
	}
}
