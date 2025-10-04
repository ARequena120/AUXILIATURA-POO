package ejercicio7;

public class main {
	    public static void main(String[] args) {
	        // c) Crea dos mascotas (energía inicial 50)
	        System.out.println("=== Creación de dos mascotas ===");
	        Mascota firulais = new Mascota("Firulais", "Perro", 50);
	        Mascota michis = new Mascota("Michis", "Gato", 50);
	        System.out.println("Mascota 1: " + firulais);
	        System.out.println("Mascota 2: " + michis);
	        System.out.println();

	        // Aliméntalas y muestra energía
	        System.out.println("=== Inciso a) Alimentar mascotas ===");
	        firulais.alimentar();
	        System.out.println("Energía de " + firulais.getNombre() + ": " + firulais.getEnergia());
	        System.out.println();

	        michis.alimentar();
	        System.out.println("Energía de " + michis.getNombre() + ": " + michis.getEnergia());
	        System.out.println();

	        // Hazlas jugar y muestra energía
	        System.out.println("=== Inciso b) Jugar con mascotas ===");
	        firulais.jugar();
	        System.out.println("Energía de " + firulais.getNombre() + " después de jugar: " + firulais.getEnergia());
	        System.out.println();

	        michis.jugar();
	        System.out.println("Energía de " + michis.getNombre() + " después de jugar: " + michis.getEnergia());
	        System.out.println();

	        // Estado final
	        System.out.println("=== Estado final de las mascotas ===");
	        System.out.println(firulais);
	        System.out.println(michis);
	    }
	
}
