package com.choa.collection;

import java.util.ArrayList;
import java.util.HashMap;

public class Test_3 {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<>();
		ar.add("S1");
		ar.add("S2");
		ArrayList<String> ar2=new ArrayList<>();
		ar2.add("t1");
		ar2.add("t2");
		
		
		HashMap<String, ArrayList<String>> map=new HashMap<>();
		
		map.put("s",ar);
		map.put("t", ar2);
		
		HashMap<String, ArrayList<String>> map2=new HashMap<>();
		
		ArrayList<HashMap<String, ArrayList<String>>> ars=new ArrayList<>();
		
		HashMap<String, String> m1=new HashMap<>();
		HashMap<String, String> m2=new HashMap<>();
		
		HashMap<HashMap<String,String>, HashMap<String,String>> h2=new HashMap<>();
		
		for(int i=0;i<map.get("t").size();i++) {
			System.out.println(map.get("t").get(i));
		}


				
	}

}
