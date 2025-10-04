package ejercicio3;

public class main {

	public static void main(String[] args) {
		 Animal[] zoo = {
		            new Leon("Simba", 5),
		            new Pinguino("Kowalski", 3),
		            new Canguro("Saltarín", 4)
		        };

		        System.out.println("=== Desplazamiento de animales ===");
		        for (Animal animal : zoo) {
		            animal.desplazarse();
		        }
	}

}
