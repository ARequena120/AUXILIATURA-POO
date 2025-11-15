package ejercicio8;

public class Bailarin {
    String nombre;
    int edad;
    Facultad facultad;
    Fraternidad fraternidad;

    public Bailarin(String nombre, int edad, Facultad facultad, Fraternidad fraternidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.facultad = facultad;
        this.fraternidad = fraternidad;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre +
                           ", Edad: " + edad +
                           ", Facultad: " + facultad.nombre +
                           ", Fraternidad: " + fraternidad.nombre);
    }
}

