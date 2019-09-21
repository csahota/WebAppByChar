package com.weatherbychar.dao;

/**
 * @author Char Sahota
 * @date Sep. 21, 2019
 *
 */
public class OWA_Coord {
	
	private String lon;
	private String lat;
	
	public String getLon() {
		return lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}

	public String toString() {
		StringBuffer buff = new StringBuffer();
		buff.append("\nOWA coord lon : ").append(lon);
		buff.append("\nOWA coord lat : ").append(lat);
		
		return buff.toString();
	}
}
