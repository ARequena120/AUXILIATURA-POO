package ejercicio2;

import java.io.*;
import java.util.*;

public class ArchivoTrabajador {
    private String nombreArch;

    public ArchivoTrabajador(String nombreArch) {
        this.nombreArch = nombreArch;
    }

    public void crearArchivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArch))) {
            oos.writeObject(new ArrayList<Trabajador>());
            System.out.println("Archivo creado.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarTrabajador(Trabajador t) {
        List<Trabajador> lista = leerTrabajadores();
        lista.add(t);
        escribirTrabajadores(lista);
    }

    public void aumentaSalario(int aumento, Trabajador t) {
        List<Trabajador> lista = leerTrabajadores();
        for (Trabajador tr : lista) {
            if (tr.getCarnet() == t.getCarnet()) {
                tr.aumentarSalario(aumento);
                break;
            }
        }
        escribirTrabajadores(lista);
    }

    public Trabajador buscarMayorSalario() {
        List<Trabajador> lista = leerTrabajadores();
        return lista.stream().max(Comparator.comparingDouble(Trabajador::getSalario)).orElse(null);
    }

    public List<Trabajador> ordenarPorSalario() {
        List<Trabajador> lista = leerTrabajadores();
        lista.sort(Comparator.comparingDouble(Trabajador::getSalario));
        return lista;
    }

    private List<Trabajador> leerTrabajadores() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArch))) {
            return (List<Trabajador>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    private void escribirTrabajadores(List<Trabajador> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArch))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
