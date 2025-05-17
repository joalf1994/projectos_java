package com.jbobadilla.oneToManyDirect;

import java.time.LocalDate;
import java.util.*;

public class Cliente {
    private String dni;
    private String nombre;
    private String apellido;
    private List<Factura> facturaList = new ArrayList<>();

    private static int contId;

    public Cliente() {
        contId++;
    }
    public Cliente(String dni, String nombre, String apellido) {
        this();
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void addFactura(Factura pedido) {
        System.out.println("Nuevo pedido para el usuario: " + nombre + " " + apellido);
        facturaList.add(pedido);
    }

    public void addFactura(String ruc, String nroFactura, LocalDate fEmision, String descripcion, double importe) {
        Factura pedido = new Factura(ruc, nroFactura, fEmision, descripcion, importe);
        System.out.println("Nuevo pedido para el usuario: " + nombre + " " + apellido);
        facturaList.add(pedido);
    }

    public void verPedido(String nroFactura) {
        boolean encontrado = false;
        Factura factura = null;
        for (Factura facturaIter : facturaList) {
            if (facturaIter.getNroFactura().equals(nroFactura)) {
                factura = facturaIter;
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("Factura " + nroFactura);
            factura.imprimir();
        }
    }

    public void setFacturaList(List<Factura> facturaList) {
        this.facturaList = facturaList;
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
        return "Cliente " + contId + ": " +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido;
    }
}
