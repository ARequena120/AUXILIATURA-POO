package ejercicio7;

public class main {

	public static void main(String[] args) {
        // a) Instanciación
        Estudiante est1 = new Estudiante("Ana", "Perez", "Gomez", 20, 
                                       "123456", "MAT2023");
        Estudiante est2 = new Estudiante("Carlos", "Lopez", "Mendez", 22, 
                                       "789012", "MAT2023");
        Docente doc = new Docente("Maria", "Rojas", "Sanchez", 35, 
                                5500.50, "PROF-12345");

        // b) Mostrar información
        System.out.println("=== Estudiantes ===");
        est1.mostrar();
        System.out.println();
        est2.mostrar();
        System.out.println("\n=== Docente ===");
        doc.mostrar();

        // c) Promedio edades
        System.out.println("\nPromedio edades estudiantes: " 
                          + Estudiante.promedio());

        // d) Modificar edad
        est1.modificarEdad(21);
        System.out.println("\nEdad modificada de Ana: " + est1.edad);

        // e) Comparar edades
        System.out.println("\n¿Estudiante igual edad que docente? " 
                          + (est1.edad == doc.edad || est2.edad == doc.edad));
    }
}
