package com.jbobadilla.agregacion;

import java.util.HashSet;
import java.util.Set;

public class Carro {
    private String placa;
    private String color;

    private Set<AutoParte> autoPartes = new HashSet<>();

    public Carro(String placa, String color) {
        this.placa = placa;
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void addAutoParte(AutoParte autoParte){
        autoPartes.add(autoParte);
        autoParte.setCarro(this);
    }
}

