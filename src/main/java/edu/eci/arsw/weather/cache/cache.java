package edu.eci.arsw.weather.cache;

import edu.eci.arsw.weather.model.City;

public interface cache {

    void saveCache(String name, City city);
}