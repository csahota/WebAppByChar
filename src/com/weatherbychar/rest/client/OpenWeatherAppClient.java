package com.weatherbychar.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.weatherbychar.dao.CityWeatherData;
import com.weatherbychar.util.Constants;

/**
 * @author Char Sahota
 * @date Aug. 7, 2019
 *
 */
public class OpenWeatherAppClient {
	
	private static final Logger logger = LogManager.getLogger(OpenWeatherAppClient.class);
	
	private static Client client = ClientBuilder.newClient();
	private static WebTarget resourceWeatherTarget = client.target(Constants.OPENWEATHERAPP_BASE_URL);

	public static CityWeatherData findJsonWeather(String cityId) {

		logger.info("Method : findJsonWeather - Weather requested for : ".concat(cityId));
		
		if(cityId != null && !cityId.isEmpty()) {
			
			try {
			
				return resourceWeatherTarget.path(Constants.OPENWEATHERAPP_WEATHER_PATH)
						.queryParam(Constants.OPENWEATHERAPP_PARAM_NAME_CITY_ID, cityId)
						.queryParam(Constants.OPENWEATHERAPP_PARAM_NAME_API_KEY, Constants.OPENWEATHERAPP_KEY)
						.request(MediaType.APPLICATION_JSON).get(CityWeatherData.class);
				
			} catch (Exception e) {
				
				logger.error("Method : findJsonWeather - Exception Occured ", e);
			}
		}
		return null;	
	}
	
	public static void main(String[] args) {
		
		CityWeatherData data = findJsonWeather(Constants.OPENWEATHERAPP_CITY_ID_LONDON);
		System.out.println(data);
		    
		data = findJsonWeather(Constants.OPENWEATHERAPP_CITY_ID_HONGKONG);
		System.out.println(data);
		
		data = findJsonWeather(Constants.OPENWEATHERAPP_CITY_ID_VANCOUVER);
		System.out.println(data);
		
	}

}
