package ejercicio8;

import java.io.*;
import java.util.*;

public class ArchRefri {
    private String nombre;

    public ArchRefri(String nombre) {
        this.nombre = nombre;
    }

    public void adicionar(Alimento a) {
        List<Alimento> lista = leer();
        lista.add(a);
        escribir(lista);
    }

    public List<Alimento> leer() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombre))) {
            return (List<Alimento>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public void escribir(List<Alimento> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombre))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listar() {
        for (Alimento a : leer()) {
            a.mostrar();
        }
    }

    public void modificarPorNombre(String nombreBuscado) {
        List<Alimento> lista = leer();
        Scanner sc = new Scanner(System.in);
        for (Alimento a : lista) {
            if (a.getNombre().equalsIgnoreCase(nombreBuscado)) {
                System.out.print("Nueva cantidad: ");
                int nuevaCantidad = Integer.parseInt(sc.nextLine());
                System.out.print("Nueva fecha de vencimiento: ");
                String nuevaFecha = sc.nextLine();
                a.setCantidad(nuevaCantidad);
                a.setFechaVencimiento(nuevaFecha);
                escribir(lista);
                System.out.println("Alimento modificado.");
                return;
            }
        }
        System.out.println("No se encontró el alimento.");
    }

    public void eliminarPorNombre(String nombreBuscado) {
        List<Alimento> lista = leer();
        lista.removeIf(a -> a.getNombre().equalsIgnoreCase(nombreBuscado));
        escribir(lista);
        System.out.println("Alimento eliminado si existía.");
    }

    public void mostrarCaducadosAntesDe(String fechaX) {
        for (Alimento a : leer()) {
            if (a.getFechaVencimiento().compareTo(fechaX) < 0) {
                a.mostrar();
            }
        }
    }

    public void eliminarCantidadCero() {
        List<Alimento> lista = leer();
        lista.removeIf(a -> a.getCantidad() == 0);
        escribir(lista);
        System.out.println("Alimentos con cantidad 0 eliminados.");
    }

    public void buscarVencidos() {
        String hoy = "2025-12-06"; // puedes usar LocalDate.now() si deseas
        for (Alimento a : leer()) {
            if (a.getFechaVencimiento().compareTo(hoy) < 0) {
                a.mostrar();
            }
        }
    }

    public void mostrarMayorCantidad() {
        List<Alimento> lista = leer();
        int max = -1;
        for (Alimento a : lista) {
            if (a.getCantidad() > max) {
                max = a.getCantidad();
            }
        }
        for (Alimento a : lista) {
            if (a.getCantidad() == max) {
                System.out.println("Alimento con mayor cantidad:");
                a.mostrar();
            }
        }
    }
}

