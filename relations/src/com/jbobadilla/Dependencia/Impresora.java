package com.jbobadilla.Dependencia;

public class Impresora {
    public Impresora() {
    }
    public void imprimir(Documento documento) {
        String texto = documento.getTexto();
        System.out.println("Imprimiendo documento: " + texto);
    }
}
