package ejercicio14;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void mostrarInformacion() {
        System.out.println("Empresa: " + nombre);
        System.out.println("Empleados:");
        for (Empleado e : empleados) {
            e.mostrarDatos();
        }
    }

    public Empleado buscarEmpleadoPorNombre(String nombreBuscado) {
        for (Empleado e : empleados) {
            if (e.getNombre().equalsIgnoreCase(nombreBuscado)) {
                return e;
            }
        }
        return null;
    }

    public boolean eliminarEmpleadoPorNombre(String nombreBuscado) {
        return empleados.removeIf(e -> e.getNombre().equalsIgnoreCase(nombreBuscado));
    }

    public double calcularPromedioSalarial() {
        if (empleados.isEmpty()) return 0;
        double suma = 0;
        for (Empleado e : empleados) {
            suma += e.getSalario();
        }
        return suma / empleados.size();
    }

    public void listarEmpleadosConSalarioMayorA(double valor) {
        System.out.println("Empleados con salario mayor a " + valor + ":");
        for (Empleado e : empleados) {
            if (e.getSalario() > valor) {
                e.mostrarDatos();
            }
        }
    }
}
