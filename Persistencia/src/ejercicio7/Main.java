package ejercicio7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArchNiño archivo = new ArchNiño("niños.dat");

        System.out.print("¿Cuántos niños desea registrar? ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nNiño " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Apellido paterno: ");
            String apPat = sc.nextLine();
            System.out.print("Apellido materno: ");
            String apMat = sc.nextLine();
            System.out.print("CI: ");
            int ci = Integer.parseInt(sc.nextLine());
            System.out.print("Edad: ");
            int edad = Integer.parseInt(sc.nextLine());
            System.out.print("Peso (kg): ");
            double peso = Double.parseDouble(sc.nextLine());
            System.out.print("Talla (m): ");
            double talla = Double.parseDouble(sc.nextLine());

            Niño nino = new Niño(nombre, apPat, apMat, ci, edad, peso, talla);
            archivo.adicionar(nino);
        }

        System.out.println("\n--- Listado de niños ---");
        archivo.listar();

        System.out.println("\n--- Niños con peso adecuado ---");
        archivo.niñosConPesoAdecuado();

        System.out.println("\n--- Niños con peso/talla inadecuado ---");
        archivo.niñosConPesoInadecuado();

        System.out.println("\n--- Promedio de edad ---");
        archivo.promedioEdad();

        System.out.print("\nIngrese CI para buscar niño: ");
        int ciBuscar = Integer.parseInt(sc.nextLine());
        archivo.buscarPorCi(ciBuscar);

        System.out.println("\n--- Niños con la talla más alta ---");
        archivo.niñosConTallaMasAlta();
    }
}
