package com.choa.weather;

public class WeatherInit{

	private StringBuffer data;


	public WeatherInit() {
		data=new StringBuffer();
		data.append("seoul 10 0.3 50");
		data.append(" daegu 37 0.9 80");
		data.append(" busan -12 0.07 65");
		data.append(" jeju 42 1.3 20");
		System.out.println(data.toString());
	}

	/*public WeatherDTO getWeather() {
		WeatherDTO wdto = new WeatherDTO();
		StringBuffer [] ar =data.split(" ");
		for(int i=0;i<ar.length;i++) {
			if(i==0) {
				String count=ar[i];
				count=count.trim();
				wdto.setCity(count);
			}else if(i==1) {
				String count=ar[i];
				count=count.trim();
				wdto.setGion(count);
			}else if(i==2) {
				String count=ar[i];
				count=count.trim();
				wdto.setHum(count);
			}else {
				String count=ar[i];
				count=count.trim();
				wdto.setMise(count);
			}

		}



		return wdto;
	}*/


	public WeatherDTO [] getWeather() {
		String [] ar =(data.toString()).split(" ");
		WeatherDTO [] ar2=new WeatherDTO[ar.length/4];
		int index=0;
		for(int i=0;i<ar2.length;i++) {
			WeatherDTO wdto = new WeatherDTO();
			wdto.setCity(ar[4*i]);
			wdto.setGion(ar[4*i+1]);
			wdto.setHum(ar[4*i+2]);
			wdto.setMise(ar[4*i+3]);
			ar2[i]=wdto;
			}
		
return ar2;
	}


//강사님이 짜신것
public WeatherDTO [] getWeather2() {
	String [] ar =(data.toString()).split(" ");
	WeatherDTO [] ar2=new WeatherDTO[ar.length/4];
	int index=0;
	for(int i=0;i<ar2.length;i++) {
		WeatherDTO wdto = new WeatherDTO();
		wdto.setCity(ar[index]);
		wdto.setGion(ar[++index]);
		wdto.setHum(ar[++index]);
		wdto.setMise(ar[++index]);
		ar2[i]=wdto;
		index++;
		}
	
return ar2;
}
}

//강사님이 짜신것.
/*public WeatherDTO getWeather2() {
		WeatherDTO w = new WeatherDTO();
		String [] ar =data.split(" ");
		w.setCity(ar[0]);
		w.setGion(ar[1]);
		w.setMise(ar[2]);
		w.setHum(ar[3]);


	return w;


}*/

