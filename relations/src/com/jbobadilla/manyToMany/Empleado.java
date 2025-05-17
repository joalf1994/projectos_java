package com.jbobadilla.manyToMany;

import java.util.HashSet;
import java.util.Set;

public class Empleado {
    private String dni;
    private String nombre;

    private Set<Empresa> empresas = new HashSet<Empresa>();

    public Empleado(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }
    public void setEmpresa(Empresa empresa) {
        empresas.add(empresa);
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

    public void realizarInfomre(Empresa empresa) {
        System.out.println("Empleado: " + nombre + " y estoy realizando un informe para la empresa: " + empresa.getRazonSocial());
        empresa.recepcionarInformeFinal("20% en perdidas en ventas");
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
