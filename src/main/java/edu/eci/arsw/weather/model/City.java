package edu.eci.arsw.weather.model;

public class City{

    private Coord coord;
    private Clouds clouds;
    private Weather weather;
    private Wind wind;
    private String name;
    private int timezone;
    private int visibility;
    private int cod;
    
    /**
     * constructor o instacia de City
     */
    public City() {
    }

    public Coord getCoord() {
        return coord;
    }
    /**
     * cambiar Coord.
     *
     * @param coord nuevo Coord
     */
    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public Clouds getClouds() {
        return clouds;
    }
    /**
     * Reemplazar Clouds.
     *
     * @param clouds nuevo clouds
     */
    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }


    public Weather getWeather() {
        return weather;
    }
    /**
     * Reemplazar clima.
     *
     * @param weather nuevo weather
     */
    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Wind getWind() {
        return wind;
    }
    /**
     * Reemplazar wind.
     *
     * @param wind nuevo wind
     */
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public String getName() {
        return name;
    }
    /**
     * Reemplazar nombre de la ciudad.
     *
     * @param name nuevo nombre
     */
    public void setName(String name) {
        this.name = name;
    }

    public int getTimezone() {
        return timezone;
    }
    /**
     * Reemplazar timezone.
     *
     * @param timezone nuevo timezone
     */
    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public int getVisibility() {
        return visibility;
    }
    /**
     * Reemplazar visibility.
     *
     * @param visibility nuevo visibility
     */
    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public int getCod() {
        return cod;
    }
    /**
     * Reemplazar codigo.
     *
     * @param cod nuevo codigo
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

}
