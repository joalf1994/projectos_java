package com.jbobadilla.herencia;

public class Anfibio extends Animal{
    private String colorPiel;
    public Anfibio(String nombre, String tipoPiel, String tipoRespiracion, String tipoReproduccion, String habitat, String colorPiel) {
        super(nombre, tipoPiel, tipoRespiracion, tipoReproduccion, habitat);
        this.colorPiel = colorPiel;
    }
    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    @Override
    public String toString() {
        return super.toString() + "Anfibio{" +
                "colorPiel='" + colorPiel + '\'' +
                '}';
    }
}
