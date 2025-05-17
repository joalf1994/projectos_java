package com.jbobadilla.composicion;

import java.util.HashSet;
import java.util.Set;

public class Libro {
    private String codigo;
    private String autor;
    private Set<Pagina> paginas = new HashSet<Pagina>();

    public Libro(String codigo, String autor) {
        this.codigo = codigo;
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void asociarPagina(Pagina pagina) {
        paginas.add(pagina);
        pagina.setLibro(this);
    }

    public class Pagina {
        private int numero;
        private String contenido;

        private Libro libro;

        public Pagina(int numero, String contenido) {
            this.contenido = contenido;
            this.numero = numero;
        }

        public void setLibro(Libro libro) {
            this.libro = libro;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public String getContenido() {
            return contenido;
        }

        public void setContenido(String contenido) {
            this.contenido = contenido;
        }
    }
}
