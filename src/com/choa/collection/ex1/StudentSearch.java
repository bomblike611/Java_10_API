package com.choa.collection.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSearch {

	private Scanner sc;

	public StudentSearch() {
		sc=new Scanner(System.in);
	}


	public void addStudent(ArrayList<Student> ar) {
		//호출할때마다 학생한명 추가
		boolean check=true;
		while(check) {
			Student s=new Student();
			System.out.println("학생의 이름을 입력해주세요");
			String name=sc.next();//s.setName(sc.next()); 이렇게 해도됨
			for(int i=0; i<ar.size();i++) {
				if(ar.get(i).getName().equals(name)) {
					System.out.println("중복된 이름입니다.");
					check=false;
					i=+ar.size();
				}
			}
			s.setName(name);		

			System.out.println("학생의 번호를 입력해주세요");
			int num=sc.nextInt();
			for(int i=0; i<ar.size();i++) {
				if(ar.get(i).getNum()==num) {
					System.out.println("중복된 번호입니다.");
					check=false;
					i=+ar.size();
				}
			}
			s.setNum(num);		
			System.out.println("국어점수를 입력해주세요");
			int kor=sc.nextInt();
			s.setKor(kor);
			System.out.println("영어점수를 입력해주세요");
			int eng=sc.nextInt();
			s.setEng(eng);
			System.out.println("수학점수를 입력해주세요");
			int math=sc.nextInt();
			s.setMath(math);
			s.setTotal(s.getEng()+s.getKor()+s.getMath());
			s.setAvg(s.getTotal()/3.0);
			ar.add(s);
			check=false;
		}
	}

	public Student search(ArrayList<Student> ar) {
		System.out.println("학생이름을 입력해주세요");
		String name=sc.next();

		for(int i=0; i<ar.size();i++) {
			if(ar.get(i).getName().equals(name)) {
				return ar.get(i);
			}
		}

		return null;
	}
}
