package com.jbobadilla.herencia;

public class Ave extends Animal {
    private boolean vuela;

    public Ave(String nombre, String tipoPiel, String tipoRespiracion, String tipoReproduccion, String habitat, boolean vuela) {
        super(nombre, tipoPiel, tipoRespiracion, tipoReproduccion, habitat);
        this.vuela = vuela;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    @Override
    public String toString() {
        return super.toString() + "Ave{" +
                "vuela=" + vuela +
                '}';
    }
}
