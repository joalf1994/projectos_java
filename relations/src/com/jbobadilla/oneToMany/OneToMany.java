package com.jbobadilla.oneToMany;

public class OneToMany {
    public static void main(String[] args) {
        /* Relación bidireccional de 1 a Muchos:
         * Profesor y Asignaturas
         * Un profesor puede enseñar varias asignaturas.
         * Cada asignatura es impartida por un solo profesor.
         * Puedes navegar desde el profesor hacia sus asignaturas, y también desde una asignatura hacia el profesor que la imparte.
         */

        Profesor p1 = new Profesor("10101010", "Angel", "Quipuscoa");
        Asignatura sociales = new Asignatura("A001", "Ciencias Sociales", 4);
        Asignatura geografia = new Asignatura("A002", "Geografia", 4);

        p1.addAsignatura(sociales);
        p1.addAsignatura(geografia);
        p1.addAsignatura(new Asignatura("A003", "Historia del Perú", 4));

        p1.dejarTarea("A003");
    }
}
