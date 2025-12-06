package ejercicio7;

public class Niño extends Persona {
    private int edad;
    private double peso;
    private double talla;

    public Niño() {}

    public Niño(String nombre, String apPat, String apMat, int ci, int edad, double peso, double talla) {
        super(nombre, apPat, apMat, ci);
        this.edad = edad;
        this.peso = peso;
        this.talla = talla;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Niño{" +
                "edad=" + edad +
                ", peso=" + peso +
                ", talla=" + talla +
                '}');
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getTalla() {
        return talla;
    }
}

