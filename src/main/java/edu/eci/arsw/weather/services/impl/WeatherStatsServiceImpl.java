package edu.eci.arsw.weather.services.impl;

import com.google.gson.Gson;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.weather.model.*;
import edu.eci.arsw.weather.httpconnectionservices.HttpWeatherServiceI;
import edu.eci.arsw.weather.services.WeatherStatsService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherStatsServiceImpl implements WeatherStatsService {
    @Autowired
    private HttpWeatherServiceI weatherService;
    /**
     * se obtendran los datos de la API openweathermap para poder realizar el mapeo 
     * a las clases del model ya creadas y poder manejar los datos mas facilmente, esta funcion
     * retorna un objeto de tipo City el cual contiene toda la informacion meteorologica de la ciudad.
     *
     * @param name nombre de la ciudad
     * @return City cityWeather
     */
    @Override
    public City getStatsByCity(String name) throws UnirestException {
        City cityWeather = new City();
        JSONObject object = weatherService.getWeatherByCity(name);
        Coord coord = formatObject("coord",object,Coord.class);
        Wind wind = formatObject("wind",object,Wind.class);

        Clouds clouds = formatObject("clouds",object,Clouds.class);
        MainStats mainStats = formatObject("main",object,MainStats.class);
        JSONObject objectWeather = object.getJSONArray("weather").getJSONObject(0);
        Weather weather = mapWeather(objectWeather);
        cityWeather.setCoord(coord);
        cityWeather.setWeather(weather);
        cityWeather.setWind(wind);
        cityWeather.setClouds(clouds);
        cityWeather.setName(object.getString("name"));
        cityWeather.setTimezone(object.getInt("timezone"));
        cityWeather.setCod(object.getInt("cod"));
        cityWeather.setVisibility(object.getInt("visibility"));
        return cityWeather;
    }
    /**
     * metodo que nos ayudaa traer los datos tipo JSON de la ciudad 
     *
     * @param objectWeater objeto json
     * @return Weather datos del clima
     */
    private Weather mapWeather(JSONObject objectWeater) {
        Gson datos = new Gson();
        return datos.fromJson(objectWeater.toString(),Weather.class);
    }
    /**
     * metodo que nos ayuda para realizar el mapeo de los datos de entrada tipo JSON
     *
     * @param objectName nombre del objeto
     * @param object objeto JSON con los datos
     * @return objectClass clase en la que vamos a mapear los datos
     */
    private <T> T formatObject(String objectName, JSONObject object, Class objectClass){
        Gson gson = new Gson();
        String stringObject =  object.getJSONObject(objectName).toString();
        T formattedObject = (T) gson.fromJson(stringObject,objectClass);
        return formattedObject;
    }
    
}
