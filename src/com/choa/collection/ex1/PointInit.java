package com.choa.collection.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

import com.choa.weather.WeatherDTO;

public class PointInit {
	
	private String studentInfo;
	
	public PointInit() {
		StringBuffer sb=new StringBuffer();
		sb.append("iu,1,30,15,20");
		sb.append(",choa-2-17-32-75");
		sb.append(",suji, 3, 52, 68, 85");
		sb.append(",hani, 6, 72, 85, 68");
		studentInfo=sb.toString();
	}
	
	
	public ArrayList<Student> getPoint() {
		studentInfo=studentInfo.replace('-', ',');
		String [] s=studentInfo.split(",");
		System.out.println(s.length);
		Student [] ar=new Student[s.length/5];
		ArrayList<Student> al=new ArrayList<>();
		
		for(int i=0;i<s.length;i++) {
			s[i]=s[i].trim();
		}
		
		int index=0;
		for(int i=0;i<ar.length;i++) {
			Student st=new Student();
			st.setName(s[index]);
			st.setNum(Integer.parseInt(s[++index]));
			st.setKor(Integer.parseInt(s[++index]));
			st.setEng(Integer.parseInt(s[++index]));
			st.setMath(Integer.parseInt(s[++index]));
			int t=st.getEng()+st.getKor()+st.getMath();
			st.setTotal(t);
			st.setAvg(t/3.0);
			ar[i]=st;
			al.add(ar[i]);
			index++;
		}
		
	return al;
		
	}
	
	//강사님이 하신것
	public ArrayList<Student> getPoint2() {
		studentInfo =studentInfo.replace('-', ',');
		StringTokenizer st= new StringTokenizer(studentInfo, ",");
		ArrayList<Student> ar=new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			Student student =new Student();
			student.setName(st.nextToken().trim());
			student.setNum(Integer.parseInt(st.nextToken().trim()));
			student.setKor(Integer.parseInt(st.nextToken().trim()));
			student.setEng(Integer.parseInt(st.nextToken().trim()));
			student.setMath(Integer.parseInt(st.nextToken().trim()));
			student.setTotal(student.getEng()+student.getKor()+student.getMath());
			student.setAvg(student.getTotal()/3.0);
			ar.add(student);
		}
		
		return ar;
	}
	}
	

