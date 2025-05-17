package com.jbobadilla.classAsociacion;

import java.util.Date;

public class Trabajo {
    private float sueldo;
    private Date fContrato;

    private Persona persona;
    private Empresa empresa;

    public Trabajo(float sueldo, Date fContrato, Persona persona, Empresa empresa) {
        this.sueldo = sueldo;
        this.fContrato = fContrato;
        this.persona = persona;
        persona.setTrabajos(this);
        this.empresa = empresa;
        this.empresa.setTrabajos(this);
    }

    public Persona getPersona() {
        return persona;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public Date getfContrato() {
        return fContrato;
    }

    public void setfContrato(Date fContrato) {
        this.fContrato = fContrato;
    }
}
