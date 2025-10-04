package ejercicio5;

public class main {

	public static void main(String[] args) {
        System.out.println("=== Inciso a) Instanciación de dos personas ===");
        Persona p1 = new Persona("Juan", "Pérez", "Gómez", 25, 12345678);
        Persona p2 = new Persona("María", "Pérez", "López", 17, 87654321);
        System.out.println("Persona 1 creada: " + p1);
        System.out.println("Persona 2 creada: " + p2);
        System.out.println();
        // b) Mostrar datos de ambas
        System.out.println("=== Inciso b) Mostrar datos de las personas ===");
        p1.mostrarDatos();
        p2.mostrarDatos();
        System.out.println();
        // c) Verificar si son mayores de edad
        System.out.println("=== Inciso c) Verificar mayor de edad ===");
        p1.mayorDeEdad();
        p2.mayorDeEdad();
        System.out.println();
     // d) Modificar edad de la segunda persona (e.g., a 20 para cambiar a mayor)
        System.out.println("=== Inciso d) Modificar edad ===");
        p2.modificarEdad(20);  // Cambia de 17 a 20
        System.out.println("Estado después de modificación: " + p2);
        System.out.println();
        // e) Verificar si tienen el mismo apellido paterno
        System.out.println("=== Inciso e) Verificar mismo apellido paterno ===");
        if (p1.getPaterno().equals(p2.getPaterno())) {
            System.out.println(p1.getNombre() + " " + p1.getPaterno() + " y " + p2.getNombre() + " " + p2.getPaterno() + " tienen el mismo apellido paterno: " + p1.getPaterno());
        } else {
            System.out.println("Las personas tienen apellidos paternos diferentes.");
        }
        System.out.println();
	}

}
