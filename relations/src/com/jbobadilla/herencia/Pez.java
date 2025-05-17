package com.jbobadilla.herencia;

public class Pez extends Animal {
    private int numOjos;
    public Pez(String nombre, String tipoPiel, String tipoRespiracion, String tipoReproduccion, String habitat, int numOjos) {
        super(nombre, tipoPiel, tipoRespiracion, tipoReproduccion, habitat);
        this.numOjos = numOjos;
    }

    public int getNumOjos() {
        return numOjos;
    }

    public void setNumOjos(int numOjos) {
        this.numOjos = numOjos;
    }

    @Override
    public String toString() {
        return super.toString() + "Pez{" +
                "numOjos=" + numOjos +
                '}';
    }
}
