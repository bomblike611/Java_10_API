package com.choa.collection;

import java.util.HashMap;
import java.util.Iterator;

import com.choa.collection.ex1.Student;

public class MapTest_1 {

	public static void main(String[] args) {

		//해쉬맵의 키값은 주로 스트링타입으로 쓰임
		HashMap<String, Student> map =new HashMap<>();
		Student s= new Student();
		s.setName("iu");
		s.setNum(1);
		map.put("아이유", s);
		s=new Student();//새로운 객체생성. s가 원래 가리켰던 iu 주소값은 해쉬맵에 저장됨.
		s.setName("choa");
		s.setNum(2);
		map.put("초아", s);

		//키를 모아 iterator 컬렉션으로 모음
		Iterator<String> it=map.keySet().iterator();

		while(it.hasNext()) {//다음요소가 있으면 true, 없으면 false
			String key=it.next();
			Student student=map.get(key);
			System.out.println(student.getName());
			System.out.println(student.getNum());

		}

	}

}
