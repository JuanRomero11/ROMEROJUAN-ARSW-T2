package edu.eci.arsw.weather.model;

public class Wind {
    private double speed;
    private double deg;
    /**
     * constructor o instacia de Wind
     */
    public Wind() {
    }

    public double getSpeed() {
        return speed;
    }
    /**
     * cambiar velocidad del viento.
     *
     * @param speed nueva velocidad
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDeg() {
        return deg;
    }
    /**
     * cambiar grados.
     *
     * @param deg nuevo deg
     */
    public void setDeg(double deg) {
        this.deg = deg;
    }
}
