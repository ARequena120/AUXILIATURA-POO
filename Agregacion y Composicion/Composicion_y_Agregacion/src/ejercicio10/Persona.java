package ejercicio10;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int CI;

    public Persona(String nombre, String apellido, int edad, int CI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.CI = CI;
    }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public int getEdad() { return edad; }
    public int getCI() { return CI; }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " " + apellido + ", Edad: " + edad + ", CI: " + CI);
    }
}

