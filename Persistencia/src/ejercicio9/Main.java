package ejercicio9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArchZoo archivo = new ArchZoo("zoo.dat");

        System.out.print("¿Cuántos zoológicos desea registrar? ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nZoológico " + (i + 1));
            Zoologico z = new Zoologico();
            z.leer();
            archivo.adicionar(z);
        }

        System.out.println("\n--- Listado de zoológicos ---");
        archivo.listar();

        System.out.print("\nModificar zoológico por ID: ");
        int idMod = Integer.parseInt(sc.nextLine());
        archivo.modificar(idMod);

        System.out.print("\nEliminar zoológico por ID: ");
        int idElim = Integer.parseInt(sc.nextLine());
        archivo.eliminar(idElim);

        System.out.println("\nZoológicos con mayor variedad de animales:");
        archivo.zoologicosConMasVariedad();

        System.out.println("\nEliminar zoológicos vacíos:");
        archivo.eliminarZoologicosVacios();

        System.out.print("\nMostrar animales por especie: ");
        String especie = sc.nextLine();
        archivo.mostrarAnimalesPorEspecie(especie);

        System.out.print("\nMover animales de un zoológico a otro.");
        System.out.print("\nID del zoológico origen: ");
        int idOrigen = Integer.parseInt(sc.nextLine());
        System.out.print("ID del zoológico destino: ");
        int idDestino = Integer.parseInt(sc.nextLine());
        archivo.moverAnimales(idOrigen, idDestino);

        System.out.println("\n--- Listado final de zoológicos ---");
        archivo.listar();
    }
}