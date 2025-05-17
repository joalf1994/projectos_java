package com.jbobadilla.oneToMany;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Profesor {
    private String dni;
    private String nombre;
    private String apellido;

    private Set<Asignatura> asignaturas = new HashSet<>();

    public Profesor() {
    }

    public Profesor(String dni, String nombre, String apellido) {
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

    @Override
    public String toString() {
        return "Profesor{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    public void addAsignatura(Asignatura asignatura) {
        System.out.println("soy el profesor " + nombre + " " + apellido + " y voy a enseñar la asignatura " + asignatura.getDescricion());
        asignaturas.add(asignatura);
        asignatura.setProfesor(this);
    }

    public void addAsignatura(String codigo, String descricion, int creditos) {
        Asignatura asignatura = new Asignatura(codigo, descricion, creditos);
        System.out.println("soy el profesor " + nombre + " " + apellido + " y voy a enseñar la asignatura " + descricion);
        asignaturas.add(asignatura);
        asignatura.setProfesor(this);
    }

    public void dejarTarea(String codigo) {
        Asignatura asignatura = null;
        boolean encontrado = false;
        Iterator<Asignatura> iterator = asignaturas.iterator();
        while (iterator.hasNext() && !encontrado) {
            asignatura = iterator.next();
            if (asignatura.getCodigo().equals(codigo)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            asignatura.tarea();
        } else {
            System.out.println("No se encontro el asignatura " + codigo);
        }
    }

    public void verTarea(String tarea) {
        System.out.println(tarea);
    }
}
