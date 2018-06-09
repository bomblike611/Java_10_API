package com.choa.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest_1 {

	public static void main(String[] args) {
		//배열은 배열의 크기가 정해져 있고
		//같은 데이터타입만 저장이 가능
		
		ArrayList ar=new ArrayList();
		//arraylist에 들어갈때에는 object타입으로 들어감. 따라서 get으로 불러오면 object타입임.
		ar.add("first");
		System.out.println("size :"+ar.size());
		ar.add(2);
		System.out.println("size :"+ar.size());
		ar.add('3');
		System.out.println("size :"+ar.size());
		ar.add(new Scanner(System.in));
		System.out.println("size :"+ar.size());
		ar.set(0, 1);
		ar.add(1, "insert");
		ar.remove(0);
		
		
		
		//List 계열은 배열 기반
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
			
		}
		
		Test t=new Test();
		ar.add(t);
		
		
		
		/*if(ar.get(0) instanceof String){
		
		}
		
		//Object타입이기때문에 형변환을 해주어야함
		String n1=(String)ar.get(0);
		int n2=(Integer)ar.get(1);
		*/
		

	}

}
