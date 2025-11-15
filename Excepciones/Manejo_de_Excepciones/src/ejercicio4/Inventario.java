package ejercicio4;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos = new ArrayList<>();

    // Clase interna para excepción personalizada
    public static class ProductoNoEncontradoException extends Exception {
        public ProductoNoEncontradoException(String mensaje) {
            super(mensaje);
        }
    }

    public void agregarProducto(Producto p) throws Exception {
        for (Producto prod : productos) {
            if (prod.getCodigo().equals(p.getCodigo())) {
                throw new Exception("Error: el código ya existe.");
            }
        }
        if (p.getPrecio() < 0 || p.getStock() < 0) {
            throw new Exception("Error: precio o stock no pueden ser negativos.");
        }
        productos.add(p);
    }

    public Producto buscarProducto(String codigo) throws ProductoNoEncontradoException {
        for (Producto p : productos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        throw new ProductoNoEncontradoException("Producto con código '" + codigo + "' no encontrado.");
    }

    public void venderProducto(String codigo, int cantidad) throws Exception {
        Producto p = buscarProducto(codigo);
        if (p.getStock() >= cantidad) {
            p.reducirStock(cantidad);
        } else {
            throw new StockInsuficienteException("Stock insuficiente para el producto '" + p.getNombre() + "'.");
        }
    }

    // Otra excepción personalizada como clase interna
    public static class StockInsuficienteException extends Exception {
        public StockInsuficienteException(String mensaje) {
            super(mensaje);
        }
    }
}
