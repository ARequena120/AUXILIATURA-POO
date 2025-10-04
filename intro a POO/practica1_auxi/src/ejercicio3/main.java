package ejercicio3;

public class main {
	public static void main(String[] args) {
        
        Producto laptop = new Producto("Laptop", 1000.0, 10);
        System.out.println("Estado inicial: " + laptop);
        System.out.println();
        // b) Vender 3 unidades
        System.out.println("=== Prueba del método vender() ===");
        laptop.vender(3);  // Stock pasa a 7
        System.out.println("Estado después de venta: " + laptop);
        System.out.println();
        // c) Reabastecer 5 unidades
        System.out.println("=== Prueba del método reabastecer() ===");
        laptop.reabastecer(5);  // Stock pasa a 12
        System.out.println("Estado después de reabastecimiento: " + laptop);
        System.out.println();
        
    }
}
