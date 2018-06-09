package com.choa.weather;

import java.util.Scanner;

public class WeatherSearch {
	private Scanner sc;
	
	public WeatherSearch() {
		sc=new Scanner(System.in);
	}
	
	public WeatherDTO search(WeatherDTO [] ar) {
		WeatherView v=new WeatherView();
		System.out.println("검색할 도시명을 입력하세요");
		String s=sc.next();
		WeatherDTO weatherDTO=null;
		for(int i=0;i<ar.length;i++) {
			if(s.equals(ar[i].getCity())) {
				weatherDTO=ar[i];
				break;
			}
			}
			return weatherDTO;
		}
	}

