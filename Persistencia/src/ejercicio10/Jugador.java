package ejercicio10;

public class Jugador {
    private String nombre;
    private int nivel;
    private int puntaje;

    public Jugador(String nombre, int nivel, int puntaje) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public String formatoArchivo() {
        return nombre + "," + nivel + "," + puntaje;
    }

    public void mostrar() {
        System.out.println("Jugador: " + nombre + " | Nivel: " + nivel + " | Puntaje: " + puntaje);
    }

    public static Jugador desdeLinea(String linea) {
        String[] partes = linea.split(",");
        return new Jugador(partes[0], Integer.parseInt(partes[1]), Integer.parseInt(partes[2]));
    }
}