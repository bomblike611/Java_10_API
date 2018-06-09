package com.choa.collection.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Teacher {
	private PointInit p;
	private ArrayList<Student> ar;
	private StudentView v;
	private StudentSearch ss;
	
	public Teacher() {
		p=new PointInit();
		v=new StudentView();
		ss=new StudentSearch();
	}

	public void start() {
		boolean check=true;
		Scanner sc=new Scanner(System.in);

		while(check) {
			System.out.println("///////////////");
			System.out.println("1.학생정보초기화");//getPoint
			System.out.println("2.학생정보전체 출력");//view
			System.out.println("3.학생이름검색");
			System.out.println("4.학생정보추가");
			System.out.println("5.프로그램 종료");
			System.out.println("///////////////");
			int count=sc.nextInt();
			
			switch(count) {
			case 1:
				ar=p.getPoint2();
				System.out.println("학생정보가 초기화되었습니다.");
				break;
			case 2:
				v.view(ar);
				break;
			case 3:
				Student s2=ss.search(ar);
				if(s2==null) {
					System.out.println("잘못입력하셨습니다.");
				}else {
				v.view(s2);
				}
				break;
			case 4:
				ss.addStudent(ar);
				System.out.println("입력이 완료되었습니다.");
				break;
			case 5:
				System.out.println("------------종료합니다------------");
				check=!check;
				break;
			default :
				System.out.println("잘못입력하셨습니다.");
				break;
			}
			
		}
	}

}
