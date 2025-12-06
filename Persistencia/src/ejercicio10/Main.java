package ejercicio10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorJugadores gestor = new GestorJugadores();

        while (true) {
            System.out.println("\n--- Menú de Jugadores ---");
            System.out.println("1. Registrar jugador");
            System.out.println("2. Mostrar todos los jugadores");
            System.out.println("3. Buscar jugador por nombre");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            int op = Integer.parseInt(sc.nextLine());

            if (op == 1) {
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Nivel: ");
                int nivel = Integer.parseInt(sc.nextLine());
                System.out.print("Puntaje: ");
                int puntaje = Integer.parseInt(sc.nextLine());
                gestor.guardarJugador(new Jugador(nombre, nivel, puntaje));
                System.out.println("Jugador guardado.");
            } else if (op == 2) {
                gestor.mostrarTodos();
            } else if (op == 3) {
                System.out.print("Nombre a buscar: ");
                String nombre = sc.nextLine();
                gestor.buscarPorNombre(nombre);
            } else if (op == 4) {
                System.out.println("¡Hasta pronto!");
                break;
            } else {
                System.out.println("Opción inválida.");
            }
        }
    }
}