package com.jbobadilla.herencia;

public class Reptil extends Animal {
    private boolean tienePatas;
    public Reptil(String nombre, String tipoPiel, String tipoRespiracion, String tipoReproduccion, String habitat, boolean tienePatas) {
        super(nombre, tipoPiel, tipoRespiracion, tipoReproduccion, habitat);
        this.tienePatas = tienePatas;
    }

    public boolean isTienePatas() {
        return tienePatas;
    }

    public void setTienePatas(boolean tienePatas) {
        this.tienePatas = tienePatas;
    }

    @Override
    public String toString() {
        return super.toString() + "Reptil{" +
                "tienePatas=" + tienePatas +
                '}';
    }
}
