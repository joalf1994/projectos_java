package com.jbobadilla.manyToManyDirect;

public class Empleado {
    private String dni;
    private String nombre;
    private String apellido;

    public Empleado(String dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void realizarInfomre() {
        System.out.println("Empleado: " + nombre + " " + apellido + " y estoy realizando un informe");
    }
}