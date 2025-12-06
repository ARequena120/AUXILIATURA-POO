package ejercicio8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArchRefri archivo = new ArchRefri("refri.dat");

        System.out.print("¿Cuántos alimentos desea registrar? ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nAlimento " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Fecha de vencimiento (YYYY-MM-DD): ");
            String fecha = sc.nextLine();
            System.out.print("Cantidad: ");
            int cantidad = Integer.parseInt(sc.nextLine());

            archivo.adicionar(new Alimento(nombre, fecha, cantidad));
        }

        System.out.println("\n--- Listado de alimentos ---");
        archivo.listar();

        System.out.print("\nModificar alimento por nombre: ");
        String modNombre = sc.nextLine();
        archivo.modificarPorNombre(modNombre);

        System.out.print("\nEliminar alimento por nombre: ");
        String elimNombre = sc.nextLine();
        archivo.eliminarPorNombre(elimNombre);

        System.out.print("\nMostrar alimentos caducados antes de fecha X (YYYY-MM-DD): ");
        String fechaX = sc.nextLine();
        archivo.mostrarCaducadosAntesDe(fechaX);

        System.out.println("\nEliminar alimentos con cantidad 0:");
        archivo.eliminarCantidadCero();

        System.out.println("\nBuscar alimentos ya vencidos:");
        archivo.buscarVencidos();

        System.out.println("\nMostrar alimento con mayor cantidad:");
        archivo.mostrarMayorCantidad();
    }
}

