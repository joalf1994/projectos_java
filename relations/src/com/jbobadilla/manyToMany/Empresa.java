package com.jbobadilla.manyToMany;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Empresa {
    private String ruc;
    private String razonSocial;

    private Set<Empleado> empleados = new HashSet<Empleado>();

    public Empresa(String ruc, String razonSocial) {
        this.ruc = ruc;
        this.razonSocial = razonSocial;
    }

    public void contratar(Empleado empleado) {
        System.out.println("Soy la empresa " + razonSocial + " y voy a contratar a: " + empleado.getNombre());
        empleados.add(empleado);
        empleado.setEmpresa(this);
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

    @Override
    public String toString() {
        return "Empresa{" +
                "ruc='" + ruc + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                '}';
    }

    public void solicitarInforme(String dni) {
        Empleado e = null;
        boolean encontrado = false;
        Iterator<Empleado> iterator = empleados.iterator();
        while(iterator.hasNext() && !encontrado) {
            e = iterator.next();
            if (e.getDni().equals(dni)) {
                encontrado = true;
                break;
            }
        }
        if(encontrado) {
            e.realizarInfomre(this);
        } else {
            System.out.println("No se encontro el empleado " + dni);
        }
    }

    public void recepcionarInformeFinal(String conclusiones) {
        System.out.println("Soy la empresa " + razonSocial + " y recibi la conclusion " + conclusiones);
    }
}
