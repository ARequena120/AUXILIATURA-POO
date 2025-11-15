package ejercicio2;
public class Main {
    public static void main(String[] args) {
        Departamento d1 = new Departamento("Recursos Humanos", "Administración");
        Departamento d2 = new Departamento("Investigación", "Tecnología");

        d1.agregarEmpleado(new Empleado("Ana", "Analista", 3000));
        d1.agregarEmpleado(new Empleado("Luis", "Jefe", 5000));
        d1.agregarEmpleado(new Empleado("Carlos", "Asistente", 2500));
        d1.agregarEmpleado(new Empleado("Marta", "Secretaria", 2800));
        d1.agregarEmpleado(new Empleado("Pedro", "Consultor", 3200));

        System.out.println("Antes de mover:");
        d1.mostrarEmpleados();
        d2.mostrarEmpleados();

        d1.cambioSalario(3500);

        boolean hayCoincidencia = false;
        for (Empleado e : d1.empleados) {
            if (d2.contieneEmpleado(e)) {
                hayCoincidencia = true;
                break;
            }
        }
        System.out.println("¿Algún empleado de d1 está en d2? " + hayCoincidencia);

        d1.moverEmpleadosA(d2);

        System.out.println("\nDespués de mover:");
        d1.mostrarEmpleados();
        d2.mostrarEmpleados();
    }
}
