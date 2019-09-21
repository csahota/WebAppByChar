package com.weatherbychar.dao;

import com.weatherbychar.util.WeatherUtils;

/**
 * @author Char Sahota
 * @date Sep. 21, 2019
 *
 */
public class OWA_Main {
	
	private String temp;
	private String pressure;
	private String humidity;
	private String temp_min;
	private String temp_max;
	
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	public String getPressure() {
		return pressure;
	}
	public void setPressure(String pressure) {
		this.pressure = pressure;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getTemp_min() {
		return temp_min;
	}
	public void setTemp_min(String temp_min) {
		this.temp_min = temp_min;
	}
	public String getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(String temp_max) {
		this.temp_max = temp_max;
	}
	
	public String toString() {
		StringBuffer buff = new StringBuffer();
	    buff.append("\n\t humidity : ").append(humidity);
	    buff.append("\n\t preasure : ").append(pressure);
		buff.append("\n\tTemp in Celcius:");
	    buff.append("\n\t temperature : ").append(WeatherUtils.convertToCelcius(temp));
	    buff.append("\n\t temp min : ").append(WeatherUtils.convertToCelcius(temp_min));
	    buff.append("\n\t temp min : ").append(WeatherUtils.convertToCelcius(temp_max));
		buff.append("\n\tTemp in Fahrenheit:");
	    buff.append("\n\t temperature : ").append(WeatherUtils.convertToFahrenheit(temp));
	    buff.append("\n\t temp min : ").append(WeatherUtils.convertToFahrenheit(temp_min));
	    buff.append("\n\t temp min : ").append(WeatherUtils.convertToFahrenheit(temp_max));
		
		return buff.toString();
	}

}
