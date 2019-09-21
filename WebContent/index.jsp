<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Weather By Char</title>
</head>
<body>
<form action="/WeatherByChar/cityForm"  method="post">
	<p>Select a city: <select name="city" onchange="this.form.submit();" value="${cityId}" >
		<option></option>
		<option value="2643743" ${cityId == '2643743' ? 'selected' : ''}>London, GB</option>
		<option value="6173331" ${cityId == '6173331' ? 'selected' : ''}>Vancouver, BC</option>
		<option value="1819729" ${cityId == '1819729' ? 'selected' : ''}>Hong Kong, HK</option>
	</select></p>
</form>
<p>Name: ${name} </p>
<p>Description: ${description} </p>
<p>Celcius: ${celcius} <sup>o</sup>C</p>
<p>Fahrenheit: ${fahrenheit} <sup>o</sup>F</p>
<p>Sunrise: ${sunrise} </p>
<p>Sunset: ${sunset} </p>
</body>
</html>