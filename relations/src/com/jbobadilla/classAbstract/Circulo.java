package com.jbobadilla.classAbstract;

public class Circulo extends Figura {
    private double radio;
    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
}
