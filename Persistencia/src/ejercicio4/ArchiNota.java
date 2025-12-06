package ejercicio4;

import java.io.*;
import java.util.*;

public class ArchiNota {
    private String nombreArchi;

    public ArchiNota(String nombreArchi) {
        this.nombreArchi = nombreArchi;
    }

    public void agregarNotas(List<Nota> nuevasNotas) {
        List<Nota> lista = leerNotas();
        lista.addAll(nuevasNotas);
        escribirNotas(lista);
    }

    public double promedioNotas() {
        List<Nota> lista = leerNotas();
        if (lista.isEmpty()) return 0;
        double suma = 0;
        for (Nota n : lista) {
            suma += n.getNotaFinal();
        }
        return suma / lista.size();
    }

    public List<Nota> mejoresNotas() {
        List<Nota> lista = leerNotas();
        double max = lista.stream().mapToDouble(Nota::getNotaFinal).max().orElse(0);
        List<Nota> mejores = new ArrayList<>();
        for (Nota n : lista) {
            if (n.getNotaFinal() == max) {
                mejores.add(n);
            }
        }
        return mejores;
    }

    public void eliminarPorMateria(String materia) {
        List<Nota> lista = leerNotas();
        lista.removeIf(n -> n.getMaterno().equalsIgnoreCase(materia));
        escribirNotas(lista);
    }

    private List<Nota> leerNotas() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchi))) {
            return (List<Nota>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    private void escribirNotas(List<Nota> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchi))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
