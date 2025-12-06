package ejercicio1;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Charango> lista = new ArrayList<>();

        // Crear objetos
        lista.add(new Charango("Madera", 10, new boolean[]{true, true, false, false, false, false, false, false, true, true}));
        lista.add(new Charango("Carbono", 10, new boolean[]{true, true, true, true, true, true, true, true, true, true}));
        lista.add(new Charango("Plástico", 8, new boolean[]{false, false, false, false, false, false, false, false, false, false}));

        // Guardar en archivo
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("charangos.dat"))) {
            oos.writeObject(lista);
            System.out.println("Charangos guardados.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Leer desde archivo
        List<Charango> cargados = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("charangos.dat"))) {
            cargados = (List<Charango>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // b) Eliminar charangos con más de 6 cuerdas malas
        cargados.removeIf(Charango::tieneMasDe6CuerdasMalas);

        // c) Listar charangos de material "Madera"
        System.out.println("\nCharangos de material Madera:");
        for (Charango c : cargados) {
            if (c.getMaterial().equalsIgnoreCase("Madera")) {
                System.out.println(c);
            }
        }

        // d) Buscar charangos con 10 cuerdas
        System.out.println("\nCharangos con 10 cuerdas:");
        for (Charango c : cargados) {
            if (c.getNroCuerdas() == 10) {
                System.out.println(c);
            }
        }

        // e) Ordenar por material
        cargados.sort(Comparator.comparing(Charango::getMaterial));
        System.out.println("\nCharangos ordenados por material:");
        for (Charango c : cargados) {
            System.out.println(c);
        }
    }
}
