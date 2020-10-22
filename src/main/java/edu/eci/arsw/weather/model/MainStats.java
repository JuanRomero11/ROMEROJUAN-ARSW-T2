package edu.eci.arsw.weather.model;

public class MainStats {
    private double temp;
    private double temp_min;
    private double temp_max;
    private double pressure;
    private double humidity;
    /**
     * constructor o instacia de MainStats
     */
    public MainStats() {
    }

    

    public double getTemp() {
        return temp;
    }
    /**
     * cambiar temperatura.
     *
     * @param temp nueva temperatura
     */
    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getTemp_min() {
        return temp_min;
    }
    /**
     * cambiar temperatura minima.
     *
     * @param temp_min nueva temperatura minima
     */
    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }
    
    public double getTemp_max() {
        return temp_max;
    }
    /**
     * cambiar temperatura maxima.
     *
     * @param temp_maxima nueva temperatura maxima
     */
    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getHumidity() {
        return humidity;
    }
    /**
     * cambiar humedad.
     *
     * @param humidity nuevo dato de humedad
     */
    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
}
