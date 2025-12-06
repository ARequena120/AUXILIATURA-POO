package ejercicio6;

import java.io.Serializable;

public class Libro implements Serializable {
    private int codLibro;
    private String titulo;
    private double precio;

    public Libro() {}

    public Libro(int codLibro, String titulo, double precio) {
        this.codLibro = codLibro;
        this.titulo = titulo;
        this.precio = precio;
    }

    public void mostrar() {
        System.out.println("Libro{" +
                "codLibro=" + codLibro +
                ", titulo='" + titulo + '\'' +
                ", precio=" + precio +
                '}');
    }

    public int getCodLibro() {
        return codLibro;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTitulo() {
        return titulo;
    }
}
