package ejercicio10;

import java.io.*;
import java.util.*;

public class GestorJugadores {
    private String archivo = "jugadores.txt";

    public void guardarJugador(Jugador j) {
        try (FileWriter fw = new FileWriter(archivo, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(j.formatoArchivo());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error al guardar jugador.");
        }
    }

    public List<Jugador> leerJugadores() {
        List<Jugador> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lista.add(Jugador.desdeLinea(linea));
            }
        } catch (IOException e) {
            System.out.println("Error al leer jugadores.");
        }
        return lista;
    }

    public void mostrarTodos() {
        List<Jugador> lista = leerJugadores();
        if (lista.isEmpty()) {
            System.out.println("No hay jugadores registrados.");
        } else {
            for (Jugador j : lista) {
                j.mostrar();
            }
        }
    }

    public void buscarPorNombre(String nombreBuscado) {
        List<Jugador> lista = leerJugadores();
        boolean encontrado = false;
        for (Jugador j : lista) {
            if (j.getNombre().equalsIgnoreCase(nombreBuscado)) {
                j.mostrar();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Jugador no encontrado.");
        }
    }
}