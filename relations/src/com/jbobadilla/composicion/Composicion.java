package com.jbobadilla.composicion;

public class Composicion {
    public static void main(String[] args) {
        Libro libro = new Libro("100", "Deitel & Deitel");
        Libro.Pagina pagina = libro.new Pagina(12, "arreglos bidimensionales");
        libro.asociarPagina(pagina);
    }
}
