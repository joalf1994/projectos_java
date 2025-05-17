package com.jbobadilla.oneToMany;

public class Asignatura {
    private String codigo;
    private String descricion;
    private int creditos;

    private Profesor profesor;

    public Asignatura() {
    }

    public Asignatura(String codigo, String descricion, int creditos) {
        this.codigo = codigo;
        this.descricion = descricion;
        this.creditos = creditos;
    }

    public String getDescricion() {
        return descricion;
    }

    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "codigo='" + codigo + '\'' +
                ", descricion='" + descricion + '\'' +
                ", creditos=" + creditos +
                ", profesor=" + profesor +
                '}';
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void tarea() {
        System.out.println("Nueva tarea para el curso " + descricion);
        profesor.verTarea("esta tarea pertenece a profesor " + profesor);


    }
}
