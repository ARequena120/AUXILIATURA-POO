package ejercicio7;

import java.io.*;
import java.util.*;

public class ArchNiño {
    private String na;

    public ArchNiño(String na) {
        this.na = na;
    }

    public void adicionar(Niño n) {
        List<Niño> lista = leer();
        lista.add(n);
        escribir(lista);
    }

    public List<Niño> leer() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(na))) {
            return (List<Niño>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public void escribir(List<Niño> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(na))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listar() {
        for (Niño n : leer()) {
            n.mostrar();
        }
    }

    public void buscarPorCi(int ci) {
        for (Niño n : leer()) {
            if (n.getCi() == ci) {
                System.out.println("Niño encontrado:");
                n.mostrar();
                return;
            }
        }
        System.out.println("No se encontró ningún niño con ese CI.");
    }

    public void promedioEdad() {
        List<Niño> lista = leer();
        if (lista.isEmpty()) {
            System.out.println("No hay niños registrados.");
            return;
        }
        double suma = 0;
        for (Niño n : lista) {
            suma += n.getEdad();
        }
        System.out.println("Promedio de edad: " + (suma / lista.size()));
    }

    public void niñosConPesoAdecuado() {
        for (Niño n : leer()) {
            if (esPesoAdecuado(n)) {
                System.out.println("Niño con peso adecuado:");
                n.mostrar();
            }
        }
    }

    public void niñosConPesoInadecuado() {
        for (Niño n : leer()) {
            if (!esPesoAdecuado(n)) {
                System.out.println("Niño con peso/talla inadecuado:");
                n.mostrar();
            }
        }
    }

    public void niñosConTallaMasAlta() {
        List<Niño> lista = leer();
        double maxTalla = 0;
        for (Niño n : lista) {
            if (n.getTalla() > maxTalla) {
                maxTalla = n.getTalla();
            }
        }
        for (Niño n : lista) {
            if (n.getTalla() == maxTalla) {
                System.out.println("Niño con talla más alta:");
                n.mostrar();
            }
        }
    }

    private boolean esPesoAdecuado(Niño n) {
        int edad = n.getEdad();
        double peso = n.getPeso();
        double talla = n.getTalla();

        // Ejemplo simple de validación (puedes ajustar según criterios médicos reales)
        if (edad <= 5 && peso >= 10 && peso <= 20 && talla >= 0.8 && talla <= 1.2) return true;
        if (edad > 5 && edad <= 10 && peso >= 20 && peso <= 35 && talla >= 1.2 && talla <= 1.5) return true;
        return false;
    }
}

