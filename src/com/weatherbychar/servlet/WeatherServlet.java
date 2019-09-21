package com.weatherbychar.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.weatherbychar.dao.CityWeatherData;
import com.weatherbychar.rest.client.OpenWeatherAppClient;

/**
 * Servlet implementation class WeatherServlet
 *
 * @author Char Sahota
 * @date Sep. 21, 2019
 *
 */
@WebServlet("/cityForm")
public class WeatherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LogManager.getLogger(WeatherServlet.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WeatherServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	    // CityWeatherData weather = OpenWeatherAppClient.findJsonWeather(request.getParameter("city").toString());
		// response.getWriter().write(weather.toString());
		response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String destination = "index.jsp";
	    RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
	    
	    String cityId = request.getParameter("city");
	    
	    if(cityId != null && !cityId.isEmpty()) {
	    	
	    	try {
	    		
			    CityWeatherData cityWeather = OpenWeatherAppClient.findJsonWeather(cityId);
			    
			    request.setAttribute("name", cityWeather.getName());
			    request.setAttribute("today", cityWeather.toTodaysDateTime());
			    request.setAttribute("cityId", cityWeather.getId());
			    
			    request.setAttribute("description", cityWeather.getDescription());
			    
			    request.setAttribute("celcius", cityWeather.toCelcius());
			    request.setAttribute("fahrenheit", cityWeather.toFahrenheit());
			    
			    request.setAttribute("sunrise", cityWeather.toSunrise());
			    request.setAttribute("sunset", cityWeather.toSunset());
			    
			    requestDispatcher.forward(request, response);
	    		
	    	} catch(Exception e) {
	    		logger.error("An error occured while retreiving weather data for city id : " + cityId, e);
	    		//TODO: Redirect to index page with error.
	    		response.sendRedirect("index.jsp");
	    	}
	    }
	}

}
