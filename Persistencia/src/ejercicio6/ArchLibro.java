package ejercicio6;

import java.io.*;
import java.util.*;

public class ArchLibro {
    private String nomArch;

    public ArchLibro(String nomArch) {
        this.nomArch = nomArch;
    }

    public void adicionar(Libro l) {
        List<Libro> lista = leer();
        lista.add(l);
        escribir(lista);
    }

    public List<Libro> leer() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomArch))) {
            return (List<Libro>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public void escribir(List<Libro> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomArch))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listarPorPrecio(double x, double y) {
        for (Libro l : leer()) {
            if (l.getPrecio() >= x && l.getPrecio() <= y) {
                l.mostrar();
            }
        }
    }

    public void librosNuncaPrestados(List<Prestamo> prestamos) {
        Set<Integer> prestados = new HashSet<>();
        for (Prestamo p : prestamos) {
            prestados.add(p.getCodLibro());
        }
        for (Libro l : leer()) {
            if (!prestados.contains(l.getCodLibro())) {
                l.mostrar();
            }
        }
    }

    public Libro buscarPorCodigo(int cod) {
        for (Libro l : leer()) {
            if (l.getCodLibro() == cod) return l;
        }
        return null;
    }

    public Libro libroMasPrestado(List<Prestamo> prestamos) {
        Map<Integer, Integer> contador = new HashMap<>();
        for (Prestamo p : prestamos) {
            contador.put(p.getCodLibro(), contador.getOrDefault(p.getCodLibro(), 0) + p.getCantidad());
        }
        int max = 0, codMax = -1;
        for (Map.Entry<Integer, Integer> entry : contador.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                codMax = entry.getKey();
            }
        }
        return buscarPorCodigo(codMax);
    }

    public double ingresoTotalPorLibro(int codLibro, List<Prestamo> prestamos) {
        double total = 0;
        Libro libro = buscarPorCodigo(codLibro);
        if (libro == null) return 0;
        for (Prestamo p : prestamos) {
            if (p.getCodLibro() == codLibro) {
                total += p.getCantidad() * libro.getPrecio();
            }
        }
        return total;
    }
}
