package com.choa.weather;

import java.util.Scanner;

public class WeatherMain {

	public static void main(String[] args) {
		WeatherInit wi=new WeatherInit();
		WeatherView wv=new WeatherView();
		WeatherSearch ws=new WeatherSearch();
		Scanner sc=new Scanner(System.in);
		WeatherDTO [] ar=wi.getWeather2();

		boolean check=true;
		while(check) {
			System.out.println("1. 전체날씨정보출력");
			System.out.println("2. 날씨정보검색");
			System.out.println("3. 프로그램 종료");
			int select=sc.nextInt();
			switch (select) {
			case 1:
				wv.view(ar);
				break;
			case 2:
				WeatherDTO weatherDTO =ws.search(ar);
				if(weatherDTO!=null) {
				wv.view(weatherDTO);
				}else {
					wv.view("도시명을 잘못입력하셨습니다.");
				}
				
				break;
			case 3:
				check=!check;
				break;
			default:
				System.out.println("번호를 잘못입력하셨습니다.");
			}

		}
	}
}
