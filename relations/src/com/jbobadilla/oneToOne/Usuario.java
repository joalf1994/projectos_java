package com.jbobadilla.oneToOne;

public class Usuario {
    private String dni;
    private String nombre;
    private String apellido;
    private String correo;

    private Perfil perfil;

    public Usuario() {
        perfil = new Perfil();
        perfil.setUsuario(this);
    }

    public Usuario(String dni, String nombre, String apellido, String correo) {
        this();
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    public Usuario(String dni, String nombre, String apellido, String correo, String descripcion) {
        this(dni, nombre, apellido, correo);
        perfil = new Perfil(descripcion);
        perfil.setUsuario(this);
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void verPerfil() {
        System.out.println("Usuario: " + this.dni + " nombre: " + this.nombre + " apellido: " + this.apellido);
        perfil.reporte();
    }

    public void imprimir(){
        System.out.println("imprimiendo...");
    }
}
