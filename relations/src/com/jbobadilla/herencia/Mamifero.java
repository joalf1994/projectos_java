package com.jbobadilla.herencia;

public class Mamifero extends Animal {
    private boolean terrestre;
    public Mamifero(String nombre, String tipoPiel, String tipoRespiracion, String tipoReproduccion, String habitat, boolean terrestre) {
        super(nombre,tipoPiel, tipoRespiracion, tipoReproduccion, habitat);
        this.terrestre = terrestre;
    }

    public boolean isTerrestre() {
        return terrestre;
    }

    public void setTerrestre(boolean terrestre) {
        this.terrestre = terrestre;
    }

    @Override
    public String toString() {
        return super.toString() + "Mamifero{" +
                "terrestre=" + terrestre +
                '}';
    }
}
