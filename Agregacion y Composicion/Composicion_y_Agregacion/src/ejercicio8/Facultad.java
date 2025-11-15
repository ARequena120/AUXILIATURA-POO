package ejercicio8;

public class Facultad {
    String nombre;
    String sigla;

    public Facultad(String nombre, String sigla) {
        this.nombre = nombre;
        this.sigla = sigla;
    }

    public void mostrar() {
        System.out.println("Facultad: " + nombre + " (" + sigla + ")");
    }
}
