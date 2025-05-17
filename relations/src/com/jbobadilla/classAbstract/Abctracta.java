package com.jbobadilla.classAbstract;

public class Abctracta {
    public static void main(String[] args) {
        Figura c1 = new Circulo(4,"rojo");
        System.out.println("Area del c1: " + c1.area());


        Circulo c2 = new Circulo(6,"rojo");
        System.out.println("Area del c2: " + c2.area());

        Cuadrado c3 = new Cuadrado(5,"verde");
        System.out.println("Area del cuadrado es: " + c3.area());
    }
}
