package ejercicio5;

public class main {

	public static void main(String[] args) {
		// a) Instanciación de vehículos
        Vehiculo[] flota = {
            new Bus("Juan Pérez", "ABC-123", 1, 50, "Sindicato A"),
            new Auto("María Gómez", "XYZ-789", 2, 150, true),
            new Moto("Pedro López", "MOT-456", 3, 250, true)
        };

        // b) Mostrar placa y conductor
        System.out.println("=== Información de vehículos ===");
        for (Vehiculo vehiculo : flota) {
            System.out.println("Placa: " + vehiculo.getPlaca());
            System.out.println("Conductor: " + vehiculo.getConductor());
            System.out.println("-------------------");
        }

        // c) Cambiar conductor de un vehículo
        flota[0].cambiarConductor("Carlos Ruiz");
        System.out.println("\nConductor actualizado del bus: " + flota[0].getConductor());

	}

}
