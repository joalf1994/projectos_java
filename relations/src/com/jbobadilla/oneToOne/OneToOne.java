package com.jbobadilla.oneToOne;

public class OneToOne {
    /* 1 a 1 Bidireccional:
     * Un usuario conoce al Perfil y Perfil conoce al Usuario.
     * Puedes navegar desde cualquiera de los dos hacia el otro.
     */
    public static void main(String[] args) {
        Usuario usuario = new Usuario("10101010", "Carlos", "Chavez", "chavez@gmail.com", "programador fullStack");
        usuario.verPerfil();
    }
}
