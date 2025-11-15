package ejercicio4;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Agregar productos
        try {
            Producto p1 = new Producto("001", "Laptop", 1500.0, 10);
            Producto p2 = new Producto("002", "Mouse", 25.0, 50);
            Producto p3 = new Producto("001", "Teclado", 45.0, 20); // Código repetido

            inventario.agregarProducto(p1);
            inventario.agregarProducto(p2);
            inventario.agregarProducto(p3); // Lanza excepción por código duplicado
        } catch (Exception e) {
            System.out.println("Error al agregar producto: " + e.getMessage());
        }

        // Buscar producto existente
        try {
            Producto encontrado = inventario.buscarProducto("002");
            System.out.println("Producto encontrado: " + encontrado.getNombre());
        } catch (Inventario.ProductoNoEncontradoException e) {
            System.out.println("Error al buscar producto: " + e.getMessage());
        }

        // Buscar producto inexistente
        try {
            inventario.buscarProducto("999"); // No existe
        } catch (Inventario.ProductoNoEncontradoException e) {
            System.out.println("Error al buscar producto: " + e.getMessage());
        }

        // Venta con stock suficiente
        try {
            inventario.venderProducto("002", 5);
            System.out.println("Venta realizada correctamente.");
        } catch (Exception e) {
            System.out.println("Error al vender producto: " + e.getMessage());
        }

        // Venta con stock insuficiente
        try {
            inventario.venderProducto("002", 100); // Excede el stock
        } catch (Exception e) {
            System.out.println("Error al vender producto: " + e.getMessage());
        }
    }
}
