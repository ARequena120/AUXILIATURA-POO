package ejercicio1;

public class main {

	 public static void main(String[] args) {
	        // Crear un cliente
	        Cliente cliente1 = new Cliente("Juan", "Perez", "1234567LP", "COMP-001", "CLI-2025-001" );
	        
	        // Crear un jefe
	        Jefe jefe1 = new Jefe("Maria", "Gomez", "9876543SC", "Central", "Gerente");
	        
	        // Mostrar datos
	        System.out.println("=== Datos del Cliente ===");
	        System.out.println(cliente1.mostrarDatos());
	        System.out.println("Nro Compra: " + cliente1.getNroCompra());
	        
	        System.out.println("\n=== Datos del Jefe ===");
	        System.out.println(jefe1.mostrarDatos());
	        System.out.println("Sucursal: " + jefe1.getSucursal());
	    }

}
