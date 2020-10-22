package edu.eci.arsw.weather.model;

public class Coord {
    private double lon;
    private double lat;
    /**
     * constructor o instacia de Coord
     */
    public Coord() {
    }

    
    public double getLon() {
        return lon;
    }
    /**
     * cambiar longitud.
     *
     * @param lon nueva longitud
     */
    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }
    /**
     * cambiar latitud.
     *
     * @param lat nueva latitud
     */
    public void setLat(double lat) {
        this.lat = lat;
    }
}
