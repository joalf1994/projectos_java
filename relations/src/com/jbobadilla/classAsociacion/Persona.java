package com.jbobadilla.classAsociacion;

import java.util.HashSet;
import java.util.Set;

public class Persona {
    private String dni;
    private String nombre;
    private Set<Trabajo> trabajos = new HashSet<Trabajo>();

    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public void setTrabajos(Trabajo trabajo) {
        this.trabajos.add(trabajo);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void realizarInventario(){
        System.out.println("Soy " + nombre + " y estoy realizando un inventario");
        redactarDocumentoInforme();
    }

    public void redactarDocumentoInforme(){
        System.out.println("Soy " + nombre + " y estoy redactando un documento de informe");
    }

    public void renunciar(){
        System.out.println("Soy " + nombre + " y renuncio a mi trabajo");
    }
}
