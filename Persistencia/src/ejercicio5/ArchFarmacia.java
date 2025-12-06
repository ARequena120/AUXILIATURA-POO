package ejercicio5;

import java.io.*;
import java.util.*;

public class ArchFarmacia {
    private String na;

    public ArchFarmacia(String na) {
        this.na = na;
    }

    public void crearArchivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(na))) {
            oos.writeObject(new ArrayList<Farmacia>());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void adicionar(Farmacia f) {
        List<Farmacia> lista = leer();
        lista.add(f);
        escribir(lista);
    }

    public void listar() {
        for (Farmacia f : leer()) {
            f.mostrar();
        }
    }

    public void mostrarMedicamentosTosSucursal(int sucursal) {
        for (Farmacia f : leer()) {
            if (f.getSucursal() == sucursal) {
                f.mostrarMedicamentos("Tos");
            }
        }
    }

    public void mostrarSucursalConTapsin() {
        for (Farmacia f : leer()) {
            if (f.contieneMedicamento("Tapsin")) {
                System.out.println("Sucursal: " + f.getSucursal() + ", Dirección: " + f.getDireccion());
            }
        }
    }

    public void buscarPorTipo(String tipo) {
        for (Farmacia f : leer()) {
            f.mostrarMedicamentos(tipo);
        }
    }

    public void ordenarPorDireccion() {
        List<Farmacia> lista = leer();
        lista.sort(Comparator.comparing(Farmacia::getDireccion));
        escribir(lista);
    }

    public void moverMedicamentosTipo(String tipo, int origen, int destino) {
        List<Farmacia> lista = leer();
        Farmacia fOrigen = null, fDestino = null;
        for (Farmacia f : lista) {
            if (f.getSucursal() == origen) fOrigen = f;
            if (f.getSucursal() == destino) fDestino = f;
        }
        if (fOrigen != null && fDestino != null) {
            fOrigen.moverMedicamentos(tipo, fDestino);
            escribir(lista);
        }
    }

    private List<Farmacia> leer() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(na))) {
            return (List<Farmacia>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    private void escribir(List<Farmacia> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(na))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
