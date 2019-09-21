package com.weatherbychar.dao;

/**
 * @author Char Sahota
 * @date Sep. 21, 2019
 *
 */
public class OWA_Sys {

	private String type;
	private String id;
	private String message;
	private String country;
	private String sunrise;
	private String sunset;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSunrise() {
		return sunrise;
	}
	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}
	public String getSunset() {
		return sunset;
	}
	public void setSunset(String sunset) {
		this.sunset = sunset;
	}
	
	public String toString() {
	    
	    StringBuffer buff = new StringBuffer();
	    buff.append("\n\t sunrise : ").append(getSunrise());
	    buff.append("\n\t sunset : ").append(getSunset());
	    
	    return buff.toString();
	}
}
