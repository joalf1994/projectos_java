package com.jbobadilla.Dependencia;

public class Dependencia {
    public static void main(String[] args) {
        Documento documento = new Documento("Hola mundo");
        Impresora impresora = new Impresora();
        impresora.imprimir(documento);
    }
}
