package ejercicio2M;

import ejercicio3M.SortUtil;

public class Libro {

    private String titulo;
    private String isbn;
    private String autor;
    private Boolean disponible;

    public Libro(){

    }

    public Libro(String titulo, String isbn, String autor, boolean disponible) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.disponible = disponible;
    }

    public void prestamo(){
        if(this.disponible.equals(true))
            System.out.println("Se ha prestado el libro: " + this.titulo);
        else
            System.out.println("El libro " + this.titulo + " no està disponible");
    }

    public void devolucion(){
        if(this.disponible.equals(false))
            this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "titulo='" + titulo  + ", isbn='" + isbn  + ", autor='" + autor;
    }
}
