package ejercicio6;

import java.io.*;
import java.util.*;

public class ArchPrestamo {
    private String nomArch;

    public ArchPrestamo(String nomArch) {
        this.nomArch = nomArch;
    }

    public void adicionar(Prestamo p) {
        List<Prestamo> lista = leer();
        lista.add(p);
        escribir(lista);
    }

    public List<Prestamo> leer() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomArch))) {
            return (List<Prestamo>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public void escribir(List<Prestamo> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomArch))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

