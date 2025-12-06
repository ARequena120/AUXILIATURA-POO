package ejercicio9;

import java.io.*;
import java.util.*;

public class ArchZoo {
    private String nombre;

    public ArchZoo(String nombre) {
        this.nombre = nombre;
    }

    public void adicionar(Zoologico z) {
        List<Zoologico> lista = leer();
        lista.add(z);
        escribir(lista);
    }

    public List<Zoologico> leer() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombre))) {
            return (List<Zoologico>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public void escribir(List<Zoologico> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombre))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listar() {
        for (Zoologico z : leer()) {
            z.mostrar();
        }
    }

    public void modificar(int id) {
        List<Zoologico> lista = leer();
        for (Zoologico z : lista) {
            if (z.getId() == id) {
                System.out.println("Modificando zoológico con ID " + id);
                z.leer();
                escribir(lista);
                return;
            }
        }
        System.out.println("No se encontró el zoológico.");
    }

    public void eliminar(int id) {
        List<Zoologico> lista = leer();
        lista.removeIf(z -> z.getId() == id);
        escribir(lista);
        System.out.println("Zoológico eliminado si existía.");
    }

    public void zoologicosConMasVariedad() {
        int max = 0;
        for (Zoologico z : leer()) {
            if (z.getNroAnimales() > max) {
                max = z.getNroAnimales();
            }
        }
        for (Zoologico z : leer()) {
            if (z.getNroAnimales() == max) {
                System.out.println("Zoológico con mayor variedad:");
                z.mostrar();
            }
        }
    }

    public void eliminarZoologicosVacios() {
        List<Zoologico> lista = leer();
        lista.removeIf(z -> z.getNroAnimales() == 0);
        escribir(lista);
        System.out.println("Zoológicos vacíos eliminados.");
    }

    public void mostrarAnimalesPorEspecie(String especie) {
        for (Zoologico z : leer()) {
            for (int i = 0; i < z.getNroAnimales(); i++) {
                Animal a = z.getAnimal(i);
                if (a.getEspecie().equalsIgnoreCase(especie)) {
                    System.out.println("Zoológico: " + z.getNombre());
                    a.mostrar();
                }
            }
        }
    }

    public void moverAnimales(int origen, int destino) {
        List<Zoologico> lista = leer();
        Zoologico zooOrigen = null, zooDestino = null;
        for (Zoologico z : lista) {
            if (z.getId() == origen) zooOrigen = z;
            if (z.getId() == destino) zooDestino = z;
        }
        if (zooOrigen != null && zooDestino != null) {
            for (int i = 0; i < zooOrigen.getNroAnimales(); i++) {
                zooDestino.agregarAnimal(zooOrigen.getAnimal(i));
            }
            zooOrigen = new Zoologico(); // vaciar origen
            escribir(lista);
            System.out.println("Animales movidos de " + origen + " a " + destino);
        } else {
            System.out.println("Zoológicos no encontrados.");
        }
    }
}
