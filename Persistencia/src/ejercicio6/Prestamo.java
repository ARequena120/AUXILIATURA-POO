package ejercicio6;

import java.io.Serializable;

public class Prestamo implements Serializable {
    private int codCliente;
    private int codLibro;
    private String fechaPrestamo;
    private int cantidad;

    public Prestamo() {}

    public Prestamo(int codCliente, int codLibro, String fechaPrestamo, int cantidad) {
        this.codCliente = codCliente;
        this.codLibro = codLibro;
        this.fechaPrestamo = fechaPrestamo;
        this.cantidad = cantidad;
    }

    public void mostrar() {
        System.out.println("Prestamo{" +
                "codCliente=" + codCliente +
                ", codLibro=" + codLibro +
                ", fecha='" + fechaPrestamo + '\'' +
                ", cantidad=" + cantidad +
                '}');
    }

    public int getCodCliente() {
        return codCliente;
    }

    public int getCodLibro() {
        return codLibro;
    }

    public int getCantidad() {
        return cantidad;
    }
}
