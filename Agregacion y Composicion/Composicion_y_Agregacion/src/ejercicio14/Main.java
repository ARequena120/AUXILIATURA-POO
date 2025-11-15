package ejercicio14;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("TechBol");

        // Agregar empleados
        empresa.agregarEmpleado(new Empleado("Ana", "Desarrolladora", 4500));
        empresa.agregarEmpleado(new Empleado("Luis", "Diseñador", 3800));
        empresa.agregarEmpleado(new Empleado("Carlos", "Gerente", 6000));

        // Mostrar información
        empresa.mostrarInformacion();

        // Buscar empleado
        System.out.println("\nBuscando a 'Luis':");
        Empleado encontrado = empresa.buscarEmpleadoPorNombre("Luis");
        if (encontrado != null) {
            encontrado.mostrarDatos();
        } else {
            System.out.println("Empleado no encontrado.");
        }

        // Eliminar empleado
        System.out.println("\nEliminando a 'Ana':");
        boolean eliminado = empresa.eliminarEmpleadoPorNombre("Ana");
        System.out.println(eliminado ? "Empleado eliminado." : "Empleado no encontrado.");

        // Mostrar información actualizada
        empresa.mostrarInformacion();

        // Promedio salarial
        System.out.println("\nPromedio salarial: " + empresa.calcularPromedioSalarial());

        // Listar empleados con salario mayor a 4000
        empresa.listarEmpleadosConSalarioMayorA(4000);
    }
}

