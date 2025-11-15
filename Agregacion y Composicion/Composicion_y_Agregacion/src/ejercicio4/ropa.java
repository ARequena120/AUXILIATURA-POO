package ejercicio4;

public class ropa {
    String tipo;
    String material;

    public ropa(String tipo, String material) {
        this.tipo = tipo;
        this.material = material;
    }

    public void mostrar() {
        System.out.println("Tipo: " + tipo + ", Material: " + material);
    }
}

