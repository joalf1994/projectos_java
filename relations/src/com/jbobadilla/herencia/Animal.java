package com.jbobadilla.herencia;

public class Animal {
    private String nombre;
    private String tipoPiel;
    private String tipoRespiracion;
    private String tipoReproduccion;
    private String habitat;

    public Animal(String nombre, String tipoPiel, String tipoRespiracion, String tipoReproduccion, String habitat) {
        this.nombre = nombre;
        this.tipoPiel = tipoPiel;
        this.tipoRespiracion = tipoRespiracion;
        this.tipoReproduccion = tipoReproduccion;
        this.habitat = habitat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoPiel() {
        return tipoPiel;
    }

    public void setTipoPiel(String tipoPiel) {
        this.tipoPiel = tipoPiel;
    }

    public String getTipoRespiracion() {
        return tipoRespiracion;
    }

    public void setTipoRespiracion(String tipoRespiracion) {
        this.tipoRespiracion = tipoRespiracion;
    }

    public String getTipoReproduccion() {
        return tipoReproduccion;
    }

    public void setTipoReproduccion(String tipoReproduccion) {
        this.tipoReproduccion = tipoReproduccion;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", tipoPiel='" + tipoPiel + '\'' +
                ", tipoRespiracion='" + tipoRespiracion + '\'' +
                ", tipoReproduccion='" + tipoReproduccion + '\'' +
                ", habitat='" + habitat + '\'' +
                '}';
    }
}
