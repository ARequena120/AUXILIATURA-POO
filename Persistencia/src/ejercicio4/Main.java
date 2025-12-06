package ejercicio4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArchiNota archivo = new ArchiNota("notas.dat");

        Estudiante e1 = new Estudiante("RU001", "Carlos", "Perez", "Alvarez", 20);
        Estudiante e2 = new Estudiante("RU002", "Lucía", "Gómez", "Alvarez", 21);
        Estudiante e3 = new Estudiante("RU003", "Mario", "Lopez", "Fernandez", 22);

        Nota n1 = new Nota("Matemática", 85.5, e1);
        Nota n2 = new Nota("Matemática", 92.0, e2);
        Nota n3 = new Nota("Física", 92.0, e3);

        archivo.agregarNotas(Arrays.asList(n1, n2, n3));

        System.out.println("\nPromedio de notas:");
        System.out.println(archivo.promedioNotas());

        System.out.println("\nEstudiantes con la mejor nota:");
        for (Nota n : archivo.mejoresNotas()) {
            System.out.println(n);
        }

        archivo.eliminarPorMateria("Matemática");
        System.out.println("\nDespués de eliminar Matemática:");
        for (Nota n : archivo.mejoresNotas()) {
            System.out.println(n);
        }
    }
}
