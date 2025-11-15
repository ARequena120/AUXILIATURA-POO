package ejercicio4;

public class ropero {
    String material;
    ropa[] prendas = new ropa[20];
    int nroRopas = 0;

    public ropero(String material) {
        this.material = material;
    }

    // b) Adicionar N prendas
    public void adicionarPrenda(ropa prenda) {
        if (nroRopas < prendas.length) {
            prendas[nroRopas++] = prenda;
        } else {
            System.out.println("El ropero está lleno.");
        }
    }

    // c) Eliminar prendas por material o tipo
    public void eliminarPorMaterialOTipo(String materialX, String tipoY) {
        for (int i = 0; i < nroRopas; i++) {
            if (prendas[i] != null &&
               (prendas[i].material.equalsIgnoreCase(materialX) ||
                prendas[i].tipo.equalsIgnoreCase(tipoY))) {
                prendas[i] = null;
            }
        }
        compactar();
    }

    // d) Mostrar prendas por material y tipo
    public void mostrarPorMaterialYTipo(String materialX, String tipoY) {
        for (int i = 0; i < nroRopas; i++) {
            if (prendas[i] != null &&
                prendas[i].material.equalsIgnoreCase(materialX) &&
                prendas[i].tipo.equalsIgnoreCase(tipoY)) {
                prendas[i].mostrar();
            }
        }
    }

    // Método auxiliar para compactar el arreglo
    private void compactar() {
        ropa[] nuevo = new ropa[20];
        int contador = 0;
        for (int i = 0; i < nroRopas; i++) {
            if (prendas[i] != null) {
                nuevo[contador++] = prendas[i];
            }
        }
        prendas = nuevo;
        nroRopas = contador;
    }

    public void mostrarTodo() {
        System.out.println("Ropero de material: " + material);
        for (int i = 0; i < nroRopas; i++) {
            prendas[i].mostrar();
        }
    }
}

