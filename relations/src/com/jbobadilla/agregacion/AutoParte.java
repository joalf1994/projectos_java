package com.jbobadilla.agregacion;

public class AutoParte {
    private String codigo;
    private String denominacion;
    private Carro carro;

    public AutoParte(String codigo, String denominacion) {
        this.codigo = codigo;
        this.denominacion = denominacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
}
