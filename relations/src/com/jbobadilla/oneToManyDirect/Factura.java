package com.jbobadilla.oneToManyDirect;

import java.time.LocalDate;

public class Factura {
    private String ruc;
    private String nroFactura;
    private LocalDate fEmision;
    private String descripcion;
    private double importe;

    public Factura() {
    }

    public Factura(String ruc, String nroFactura, LocalDate fEmision, String descripcion, double importe) {
        this.ruc = ruc;
        this.nroFactura = nroFactura;
        this.fEmision = fEmision;
        this.descripcion = descripcion;
        this.importe = importe;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(String nroFactura) {
        this.nroFactura = nroFactura;
    }

    public LocalDate getfEmision() {
        return fEmision;
    }

    public void setfEmision(LocalDate fEmision) {
        this.fEmision = fEmision;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "ruc='" + ruc + '\'' +
                ", nroFactura='" + nroFactura + '\'' +
                ", fEmision=" + fEmision +
                ", descripcion='" + descripcion + '\'' +
                ", importe=" + importe;
    }

    public void imprimir() {
        System.out.println(toString());
    }
}
