package ejercicio6;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArchLibro archLibro = new ArchLibro("libros.dat");
        ArchCliente archCliente = new ArchCliente("clientes.dat");
        ArchPrestamo archPrestamo = new ArchPrestamo("prestamos.dat");

        // Ingreso de libros
        System.out.print("¿Cuántos libros desea ingresar? ");
        int nLibros = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < nLibros; i++) {
            System.out.println("\nLibro " + (i + 1));
            System.out.print("Código: ");
            int cod = Integer.parseInt(sc.nextLine());
            System.out.print("Título: ");
            String titulo = sc.nextLine();
            System.out.print("Precio: ");
            double precio = Double.parseDouble(sc.nextLine());
            archLibro.adicionar(new Libro(cod, titulo, precio));
        }

        // Ingreso de clientes
        System.out.print("\n¿Cuántos clientes desea ingresar? ");
        int nClientes = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < nClientes; i++) {
            System.out.println("\nCliente " + (i + 1));
            System.out.print("Código: ");
            int cod = Integer.parseInt(sc.nextLine());
            System.out.print("CI: ");
            String ci = sc.nextLine();
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Apellido: ");
            String apellido = sc.nextLine();
            archCliente.adicionar(new Cliente(cod, ci, nombre, apellido));
        }

        // Ingreso de préstamos
        System.out.print("\n¿Cuántos préstamos desea ingresar? ");
        int nPrestamos = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < nPrestamos; i++) {
            System.out.println("\nPréstamo " + (i + 1));
            System.out.print("Código cliente: ");
            int codCliente = Integer.parseInt(sc.nextLine());
            System.out.print("Código libro: ");
            int codLibro = Integer.parseInt(sc.nextLine());
            System.out.print("Fecha: ");
            String fecha = sc.nextLine();
            System.out.print("Cantidad: ");
            int cantidad = Integer.parseInt(sc.nextLine());
            archPrestamo.adicionar(new Prestamo(codCliente, codLibro, fecha, cantidad));
        }

        // Obtener lista de préstamos
        List<Prestamo> prestamos = archPrestamo.leer();

        // a) Listar libros cuyo precio esté entre x e y
        System.out.print("\n(a) Ingrese precio mínimo: ");
        double x = Double.parseDouble(sc.nextLine());
        System.out.print("Ingrese precio máximo: ");
        double y = Double.parseDouble(sc.nextLine());
        System.out.println("Libros entre " + x + " y " + y + ":");
        archLibro.listarPorPrecio(x, y);

        // b) Calcular ingreso total generado por un libro específico
        System.out.print("\n(b) Ingrese código de libro para calcular ingreso: ");
        int codIngreso = Integer.parseInt(sc.nextLine());
        double ingreso = archLibro.ingresoTotalPorLibro(codIngreso, prestamos);
        System.out.println("Ingreso total generado: " + ingreso);

        // c) Mostrar libros que nunca fueron vendidos
        System.out.println("\n(c) Libros nunca prestados:");
        archLibro.librosNuncaPrestados(prestamos);

        // d) Mostrar clientes que compraron un libro específico
        System.out.print("\n(d) Ingrese código de libro para ver clientes que lo prestaron: ");
        int codLibroClientes = Integer.parseInt(sc.nextLine());
        archCliente.clientesQuePrestaronLibro(codLibroClientes, prestamos);

        // e) Definir el libro más prestado
        System.out.println("\n(e) Libro más prestado:");
        Libro masPrestado = archLibro.libroMasPrestado(prestamos);
        if (masPrestado != null) masPrestado.mostrar();

        // f) Cliente con más préstamos
        System.out.println("\n(f) Cliente con más préstamos:");
        Cliente topCliente = archCliente.clienteConMasPrestamos(prestamos);
        if (topCliente != null) topCliente.mostrar();
    }
}
