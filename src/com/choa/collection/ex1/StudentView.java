package com.choa.collection.ex1;

import java.util.ArrayList;

public class StudentView {

	public void view(ArrayList<Student> ar) {
		for(int i=0;i<ar.size();i++) {
			this.view(ar.get(i));
		}
	}
	
	public void view(Student student) {
		System.out.println("====================================");
		System.out.println("NAME :"+student.getName());
		System.out.println("NUMBER :"+student.getNum());
		System.out.println("KOR :"+student.getKor());
		System.out.println("ENG :"+student.getEng());
		System.out.println("MATH :"+student.getMath());
		System.out.println("TOTAL :"+student.getTotal());
		System.out.println("AVG :"+student.getAvg());
	}
	
}
