package com.weatherbychar.util;

/**
 * @author Char Sahota
 * @date Sep. 21, 2019
 *
 */
public class Constants {
	
	//Example call to API
	//api.openweathermap.org/data/2.5/forecast?id=2643743&APPID=76e66bd95870e1940155f60d0ff92a56
	
	public static final String OPENWEATHERAPP_BASE_URL = "https://api.openweathermap.org";
	public static final String OPENWEATHERAPP_FORECAST_PATH = "data/2.5/forecast";
	public static final String OPENWEATHERAPP_WEATHER_PATH = "data/2.5/weather";
	public static final String OPENWEATHERAPP_KEY = "76e66bd95870e1940155f60d0ff92a56";

	public static final String OPENWEATHERAPP_PARAM_NAME_CITY_ID = "id";
	public static final String OPENWEATHERAPP_PARAM_NAME_API_KEY = "APPID";

	public static final String OPENWEATHERAPP_CITY_ID_LONDON = "2643743";
	public static final String OPENWEATHERAPP_CITY_JSON_LONDON = "{\"id\": 2643743,\"name\": \"London\",\"country\": \"GB\",\"coord\": {\"lon\": -0.12574,\"lat\": 51.50853}";

	public static final String OPENWEATHERAPP_CITY_ID_HONGKONG = "1819729";
	public static final String OPENWEATHERAPP_CITY_JSON_HONGKONG = "{\"id\": 1819729,\"name\": \"Hong Kong\",\"country\": \"HK\",\"coord\": {\"lon\": 114.157692,lat\": 22.285521}";

	public static final String OPENWEATHERAPP_CITY_ID_VANCOUVER = "6173331";
	public static final String OPENWEATHERAPP_CITY_JSON_VANCOUVER = "{\"id\": 6173331,\"name\": \"Vancouver\",\"country\": \"CA\",\"coord\": {\"lon\": -123.119339,\"lat\": 49.24966}";
	
	static final float TEMP_CONVERSION_FACTOR = Float.parseFloat("273.15");
	
	

}
