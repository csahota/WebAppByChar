package com.weatherbychar.dao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.TimeZone;

import javax.xml.bind.annotation.XmlRootElement;

import com.weatherbychar.util.WeatherUtils;

/**
 * @author Char Sahota
 * @date Sep. 21, 2019
 *
 */
@XmlRootElement
public class CityWeatherData {
	
	private OWA_Coord coord;
	private List<OWA_Weather> weather;
	private String base;
	private OWA_Main main;
	private String visibility;
	private OWA_Wind wind;
	private OWA_Clouds clouds;
	private String dt;
	private OWA_Sys sys;
	private String timezone;
	private String id;
	private String name;
	private String cod;
		
	public OWA_Coord getCoord() {
		return coord;
	}
	public void setCoord(OWA_Coord coord) {
		this.coord = coord;
	}
	public List<OWA_Weather> getWeather() {
		return weather;
	}
	public void setWeather(List<OWA_Weather> weather) {
		this.weather = weather;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public OWA_Main getMain() {
		return main;
	}
	public void setMain(OWA_Main main) {
		this.main = main;
	}
	public String getVisibility() {
		return visibility;
	}
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
	public OWA_Wind getWind() {
		return wind;
	}
	public void setWind(OWA_Wind wind) {
		this.wind = wind;
	}
	public OWA_Clouds getClouds() {
		return clouds;
	}
	public void setClouds(OWA_Clouds clouds) {
		this.clouds = clouds;
	}
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	public OWA_Sys getSys() {
		return sys;
	}
	public void setSys(OWA_Sys sys) {
		this.sys = sys;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String toTodaysDateTime() {
	    
	    LocalDate today = LocalDate.now();
	    
	    return DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(today);
	}
	
	public String toCelcius() {
	    return WeatherUtils.convertToCelcius(getMain().getTemp());
	}
	
	public String toFahrenheit() {
	    return WeatherUtils.convertToFahrenheit(getMain().getTemp());
	}
	public String getDescription() {
	    return weather.get(0).getDescription();
	}
	public String toSunrise() {
	    
		 LocalDateTime dateTime =LocalDateTime.ofInstant(Instant.ofEpochSecond(Long.parseLong(getSys().getSunrise())), 
				 TimeZone.getTimeZone(ZoneId.of(WeatherUtils.getZones(getName()))).toZoneId());
	        
		    return dateTime.format(DateTimeFormatter.ofPattern("MMM dd yyyy hh:mm:ss: a"));
	}
	public String toSunset() {

	    LocalDateTime dateTime =LocalDateTime.ofInstant(Instant.ofEpochSecond(Long.parseLong(getSys().getSunset())),
	    		TimeZone.getTimeZone(ZoneId.of(WeatherUtils.getZones(getName()))).toZoneId());
			        
	    return dateTime.format(DateTimeFormatter.ofPattern("MMM dd yyyy hh:mm:ss: a"));
	    
	}
	public String toString() {
		StringBuffer buff = new StringBuffer();
		buff.append("\n******* OPEN WEATHER APP DATA - ").append(name).append(" - *******");
		buff.append("\nOWA main data : ").append(main);
		buff.append("\nOpenWeather coord : ").append(coord);
		for(OWA_Weather w : weather) {
			buff.append("\nOWA Weather : ").append(w);
		}
		buff.append("\nOpenWeather sunrise : ").append(toSunrise());
		buff.append("\nOpenWeather sunset : ").append(toSunset());
		buff.append("\nOpenWeather timezone : ").append(getTimezone());
		buff.append("\nOpenWeather dt(Time of day forcasted) : ").append(dt);
		buff.append("\n******* END *******");
		return buff.toString();
	}
}
