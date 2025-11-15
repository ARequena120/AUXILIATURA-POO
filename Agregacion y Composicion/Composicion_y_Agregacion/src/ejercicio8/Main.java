package ejercicio8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Facultad f1 = new Facultad("Ingeniería", "FING");
        Facultad f2 = new Facultad("Arquitectura", "FARQ");

        Fraternidad fr1 = new Fraternidad("Tinku Real", "Tinku");
        Fraternidad fr2 = new Fraternidad("Caporales Poder", "Caporales");

        Bailarin b1 = new Bailarin("Luis", 20, f1, fr1);
        Bailarin b2 = new Bailarin("Ana", 22, f2, fr1);
        Bailarin b3 = new Bailarin("Carlos", 19, f1, fr2);
        Bailarin b4 = new Bailarin("María", 21, f2, fr2);
        Bailarin b5 = new Bailarin("Jorge", 23, f1, fr1);

        fr1.asignarEncargado(b1);
        fr1.agregarIntegrante(b1);
        fr1.agregarIntegrante(b2);
        fr1.agregarIntegrante(b5);

        fr2.asignarEncargado(b3);
        fr2.agregarIntegrante(b3);
        fr2.agregarIntegrante(b4);

        ArrayList<Bailarin> todos = new ArrayList<>();
        todos.add(b1);
        todos.add(b2);
        todos.add(b3);
        todos.add(b4);
        todos.add(b5);

        System.out.println("🎭 Bailarines:");
        for (Bailarin b : todos) {
            b.mostrar();
        }

        System.out.println("\n👥 Encargados:");
        System.out.println(fr1.nombre + ": " + fr1.encargado.nombre);
        System.out.println(fr2.nombre + ": " + fr2.encargado.nombre);

        System.out.println("\n🔍 Verificación de duplicados:");
        for (Bailarin b : todos) {
            int count = 0;
            if (fr1.integrantes.contains(b)) count++;
            if (fr2.integrantes.contains(b)) count++;
            if (count > 1) {
                System.out.println(b.nombre + " está en más de una fraternidad.");
            }
        }
    }
}
