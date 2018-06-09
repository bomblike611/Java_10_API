package com.choa.weather;

public class WeatherDTO {
	private String city;
	private String gion;
	private String mise;
	private String hum;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGion() {
		return gion;
	}
	public void setGion(String gion) {
		this.gion = gion;
	}
	public String getMise() {
		return mise;
	}
	public void setMise(String mise) {
		this.mise = mise;
	}
	public String getHum() {
		return hum;
	}
	public void setHum(String hum) {
		this.hum = hum;
	}

	public void info() {
		System.out.println("city : "+this.getCity());
		System.out.println("기온 : "+this.getGion());
		System.out.println("습도 : "+this.getHum());
		System.out.println("미세먼지농도 : "+this.getMise());
	}

}
