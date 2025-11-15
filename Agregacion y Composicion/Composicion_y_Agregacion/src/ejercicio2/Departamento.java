package ejercicio2;

import java.util.ArrayList;

public class Departamento {
    String nombre;
    String area;
    ArrayList<Empleado> empleados;

    public Departamento(String nombre, String area) {
        this.nombre = nombre;
        this.area = area;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void mostrarEmpleados() {
        System.out.println("Departamento: " + nombre + " (" + area + ")");
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados.");
        } else {
            for (Empleado e : empleados) {
                e.mostrarDatos();
            }
        }
    }

    public void cambioSalario(double nuevoSueldo) {
        for (Empleado e : empleados) {
            e.sueldo = nuevoSueldo;
        }
    }

    public boolean contieneEmpleado(Empleado e) {
        return empleados.contains(e);
    }

    public void moverEmpleadosA(Departamento destino) {
        destino.empleados.addAll(this.empleados);
        this.empleados.clear();
    }
}
	