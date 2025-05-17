package com.jbobadilla.oneToOneDirect;

public class Pasaporte {
    private String nroPasaporte;
    private String nacionalidad;

    public Pasaporte() {}
    Pasaporte(String nroPasaporte, String nacionalidad) {
        this.nroPasaporte = nroPasaporte;
        this.nacionalidad = nacionalidad;
    }

    public String getNroPasaporte() {
        return nroPasaporte;
    }

    public void setNroPasaporte(String nroPasaporte) {
        this.nroPasaporte = nroPasaporte;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void imprimir() {
        System.out.println(" * nroPasaporte='" + nroPasaporte +
                "\n * nacionalidad='" + nacionalidad);
        System.out.println();
    }
 }
