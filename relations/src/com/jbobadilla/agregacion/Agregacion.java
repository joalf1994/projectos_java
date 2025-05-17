package com.jbobadilla.agregacion;

public class Agregacion {
    public static void main(String[] args) {
        Carro c = new Carro("AC-12", "Azul");
        AutoParte autoparte = new AutoParte("100", "espejo");
        c.addAutoParte(autoparte);
    }
}
