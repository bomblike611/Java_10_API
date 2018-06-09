package com.choa.weather;

public class WeatherView {

	
	public void view(String message) {
		System.out.println("==============================");
		System.out.println(message);
	}
	
	
	public void view(WeatherDTO [] ar) {
		for(int i=0;i<ar.length;i++) {
		System.out.println("==============================");
		System.out.println("city : "+ar[i].getCity());
		System.out.println("기온 : "+ar[i].getGion());
		System.out.println("습도 : "+ar[i].getHum());
		System.out.println("미세먼지농도 : "+ar[i].getMise());
		}
	}
	
	public void view(WeatherDTO wetherDTO) {
	
		System.out.println("city : "+wetherDTO.getCity());
		System.out.println("기온 : "+wetherDTO.getGion());
		System.out.println("습도 : "+wetherDTO.getHum());
		System.out.println("미세먼지농도 : "+wetherDTO.getMise());
	}
	
}
