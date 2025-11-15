package ejercicio2;

public class Empleado {
    String nombre;
    String cargo;
    double sueldo;

    public Empleado(String nombre, String cargo, double sueldo) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + ", Cargo: " + cargo + ", Sueldo: " + sueldo);
    }
}
