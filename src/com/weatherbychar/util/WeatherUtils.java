package com.weatherbychar.util;

import java.util.TimeZone;

/**
 * @author Char Sahota
 * @date Sep. 21, 2019
 *
 */
public class WeatherUtils {

    public static String convertToCelcius(String kalvinParam){

        String temp = null;

        if(kalvinParam != null && !kalvinParam.isEmpty()){

            float kalvin = Float.parseFloat(kalvinParam);

            temp = String.valueOf(Math.round(kalvin - Constants.TEMP_CONVERSION_FACTOR));

        }

        return temp;
    }

    public static String convertToFahrenheit(String kalvinParam){

        String temp = null;

        if(kalvinParam != null && !kalvinParam.isEmpty()){

            float kalvin = Float.parseFloat(kalvinParam);

            temp = String.valueOf(Math.round((kalvin - Constants.TEMP_CONVERSION_FACTOR) * 9/5 + 32));

        }

        return temp;
    }
    
    public static String getZones(String country) {
        
    	StringBuffer removedSpaces = new StringBuffer();
    	char[] letters = country.toCharArray();
    	for(char c : letters) {
    		if(c == 32) {
    			removedSpaces.append("_");
    		} else {
    			removedSpaces.append(c);
    		}
    	}
    	
    	String countryCode = removedSpaces.toString();
    	
        for (String id : TimeZone.getAvailableIDs()) {
            if (id.indexOf(countryCode) > -1) {
                return id;
            }
        }
        return null;

    }
}
