package ejercicio6;

import java.io.*;
import java.util.*;

public class ArchCliente {
    private String nomArch;

    public ArchCliente(String nomArch) {
        this.nomArch = nomArch;
    }

    public void adicionar(Cliente c) {
        List<Cliente> lista = leer();
        lista.add(c);
        escribir(lista);
    }

    public List<Cliente> leer() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomArch))) {
            return (List<Cliente>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public void escribir(List<Cliente> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomArch))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Cliente buscarPorCodigo(int cod) {
        for (Cliente c : leer()) {
            if (c.getCodCliente() == cod) return c;
        }
        return null;
    }

    public void clientesQuePrestaronLibro(int codLibro, List<Prestamo> prestamos) {
        Set<Integer> codClientes = new HashSet<>();
        for (Prestamo p : prestamos) {
            if (p.getCodLibro() == codLibro) {
                codClientes.add(p.getCodCliente());
            }
        }
        for (int cod : codClientes) {
            Cliente c = buscarPorCodigo(cod);
            if (c != null) c.mostrar();
        }
    }

    public Cliente clienteConMasPrestamos(List<Prestamo> prestamos) {
        Map<Integer, Integer> contador = new HashMap<>();
        for (Prestamo p : prestamos) {
            contador.put(p.getCodCliente(), contador.getOrDefault(p.getCodCliente(), 0) + p.getCantidad());
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
}
