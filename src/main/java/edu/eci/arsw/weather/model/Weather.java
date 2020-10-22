package edu.eci.arsw.weather.model;

public class Weather {
    private int id;
    private String main;
    private String description;
    /**
     * constructor o instacia de Weather
     */
    public Weather() {
    }

    public int getId() {
        return id;
    }
    /**
     * cambiar Id.
     *
     * @param id nuevo id
     */
    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }
    
    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }
    /**
     * cambiar descripcion.
     *
     * @param description nueva descripcion
     */
    public void	 setDescription(String description) {
        this.description = description;
    }
}
