package com.jbobadilla.manyToManyDirect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Empresa {
    private String ruc;
    private String razonSocial;

    private Set<Empleado> empleados = new HashSet<>();

    public Empresa(String ruc, String razonSocial) {
        this.ruc = ruc;
        this.razonSocial = razonSocial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void contratar(Empleado empleado) {
        System.out.println("la empresa " + razonSocial + " está contratando a: " + empleado.getNombre() + " " + empleado.getApellido());
        empleados.add(empleado);
    }

    public void contratar(String dni, String nombre, String apellido) {
        Empleado e = null;
        System.out.println("la empresa " + razonSocial + " está contratando a: " + nombre + " " + apellido);
        e = new Empleado(dni, nombre, apellido);
        empleados.add(e);
    }

    public void solicitarInforme(String dni) {
        Empleado e = null;
        boolean encontrado = false;
        Iterator<Empleado> iterator = empleados.iterator();
        while (iterator.hasNext() && !encontrado) {
            e = iterator.next();
            if (e.getDni().equals(dni)) {
                encontrado = true;
                break;
            }
        }
        if(encontrado) {
            System.out.println("soy la empresa " + razonSocial + " y voy a solicitar el informe del empleado " + dni);
            e.realizarInfomre();
        } else {
            System.out.println("No se encontro el empleado " + dni);
        }
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "ruc='" + ruc + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", empleados=" + empleados +
                '}';
    }
}
