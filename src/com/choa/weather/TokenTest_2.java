package com.choa.weather;

import java.util.StringTokenizer;
import java.util.WeakHashMap;

public class TokenTest_2 {
	public static void main(String[] args) {
		StringBuffer data=null;
		data=new StringBuffer();
		data.append("seoul 10 0.3 50");
		data.append(" daegu 37 0.9 80");
		data.append(" busan -12 0.07 65");
		data.append(" jeju 42 1.3 20");
		
		WeatherDTO []ar=new WeatherDTO[4];
		StringTokenizer st=new StringTokenizer(data.toString(), " ");
		int index=0;
		
		while(st.hasMoreTokens()) {
			WeatherDTO w=new WeatherDTO();
			w.setCity(st.nextToken());
			w.setGion(st.nextToken());
			w.setMise(st.nextToken());
			w.setHum(st.nextToken());
			ar[index]=w;
			index++;
		}
		
	}
}
