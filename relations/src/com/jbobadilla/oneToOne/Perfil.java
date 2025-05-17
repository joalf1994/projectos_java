package com.jbobadilla.oneToOne;

public class Perfil {
    private String descipcion;
    private Usuario usuario;

    public Perfil() {
    }

    public Perfil(String descipcion) {
        this.descipcion = descipcion;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    @Override
    public String toString() {
        return "* descipcion='" + descipcion;
    }

    public void reporte() {
        System.out.println("Descipcion: " + descipcion);
        usuario.imprimir();
    }
}
