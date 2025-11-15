package ejercicio8;

import java.util.ArrayList;

public class Fraternidad {
    String nombre;
    String estilo;
    Bailarin encargado;
    ArrayList<Bailarin> integrantes;

    public Fraternidad(String nombre, String estilo) {
        this.nombre = nombre;
        this.estilo = estilo;
        this.integrantes = new ArrayList<>();
    }

    public void asignarEncargado(Bailarin b) {
        this.encargado = b;
    }

    public void agregarIntegrante(Bailarin b) {
        if (!integrantes.contains(b)) {
            integrantes.add(b);
        } else {
            System.out.println(b.nombre + " ya está en la fraternidad " + nombre);
        }
    }

    public void mostrarIntegrantes() {
        System.out.println("Fraternidad: " + nombre + " (" + estilo + ")");
        System.out.println("Encargado: " + (encargado != null ? encargado.nombre : "No asignado"));
        for (Bailarin b : integrantes) {
            b.mostrar();
        }
    }
}
