package com.jbobadilla.classAbstract;

public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(double lado, String color) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 2 * lado;
    }
}
