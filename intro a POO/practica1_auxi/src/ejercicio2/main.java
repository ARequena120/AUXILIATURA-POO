package ejercicio2;

public class main {

	public static void main(String[] args) {
		 // d) Crea una instancia del bus (capacidad de 50 asientos)
       System.out.println("=== Inciso d) Creación de instancia del Bus ===");
       Bus miBus = new Bus(20);
       System.out.println("Estado inicial del bus: " + miBus);
       System.out.println();
       // a) Subir X pasajeros (ejemplo: X=10)
       System.out.println("=== Inciso a) Subir X pasajeros y actualizar datos ===");
       miBus.subirPasajeros(10);
       System.out.println();
       
       // b) Cobrar pasaje
       System.out.println("=== Inciso b) Cobrar pasaje a los pasajeros ===");
       miBus.cobrarPasaje();
       System.out.println();
       
       // c) Mostrar asientos disponibles
       System.out.println("=== Inciso c) Mostrar asientos disponibles ===");
       miBus.asientosDisponibles();
       System.out.println();
   }

}
