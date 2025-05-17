package com.jbobadilla.classAsociacion;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Empresa {
    private String ruc;
    private String razonSocial;

    private Set<Trabajo> trabajos = new HashSet<>();

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

    public void setTrabajos(Trabajo trabajo) {
        this.trabajos.add(trabajo);
    }

    public void contratar(Persona persona, float sueldo, Date fContrato){
        System.out.println("Soy la Compañia " + razonSocial + " y estoy contratando");
        if(byEmpleado(persona.getDni()) == null){
            new Trabajo(sueldo, fContrato, persona, this);
            System.out.println("Contratado");
        } else {
            System.out.println("La persona con dni " + persona.getDni() + " ya esta contratada");
        }

    }

    private Persona byEmpleado(String dni){
        boolean noEncontrado = true;
        Trabajo auxTrabajo = null;
        Persona auxPersona = null;
        Iterator<Trabajo> iterator = trabajos.iterator();
        while (iterator.hasNext() && noEncontrado) {
            auxTrabajo = iterator.next();
            auxPersona = auxTrabajo.getPersona();
            if(auxPersona.getDni().equals(dni)){
                noEncontrado = false;
            }
        }
        if (noEncontrado) {
            auxPersona = null;
        }
        return auxPersona;
    }

    public void listarEmpleados() {
        Trabajo auxTrabajo;
        Persona auxPersona;
        Iterator<Trabajo> iterator = trabajos.iterator();
        while (iterator.hasNext()) {
            auxTrabajo = iterator.next();
            auxPersona = auxTrabajo.getPersona();
            System.out.println("Dni: " + auxPersona.getDni() + " nombre: " + auxPersona.getNombre());
        }
    }
}
