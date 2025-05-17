package com.jbobadilla.oneToOneDirect;

import java.time.LocalDate;

public class Persona {
    private int id;
    private String dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private static int contId;

    /* Relacion OneToOne */
    private Pasaporte pasaporte;

    /** Constructores */
    public Persona() {
        this.id = ++contId;
        pasaporte = new Pasaporte();
    }

    public Persona(String dni, String nombre, String apellido, LocalDate fechaNacimiento) {
        this();
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String nroPasaporte, String nacionalidad) {
        this(dni, nombre, apellido, fechaNacimiento);
        pasaporte = new Pasaporte(nroPasaporte, nacionalidad);
    }

    public void setNroPasaporte(String nroPasaporte) {
        this.pasaporte.setNroPasaporte(nroPasaporte);
    }

    public void setNacionalidad(String nacionalidad) {
        this.pasaporte.setNacionalidad(nacionalidad);
    }

    /** Métodos de instancia */
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void imprimir() {
        System.out.println("Persona " + id + ":\n * dni: " + dni +
                "\n * nombre: " + nombre +
                "\n * apellido: " + apellido +
                "\n * fechaNac: " + fechaNacimiento);
        pasaporte.imprimir();
    }
}
