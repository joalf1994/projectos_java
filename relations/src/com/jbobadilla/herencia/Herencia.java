package com.jbobadilla.herencia;

public class Herencia {
    public static void main(String[] args) {
        Animal pato = new Ave("Pato", "plumas", "pulmones", "oviparo", "mar", true);
        System.out.println(pato.toString());

        Mamifero perro = new Mamifero("Perro", "pelo", "pulmones", "sexual", "domestico", true);
        System.out.println(perro.toString());
    }
}
