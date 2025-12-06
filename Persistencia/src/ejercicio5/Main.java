package ejercicio5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArchFarmacia archivo = new ArchFarmacia("farmacias.dat");
        archivo.crearArchivo();

        System.out.print("¿Cuántas farmacias desea ingresar? ");
        int n = Integer.parseInt(sc.nextLine());

        // Ingresar farmacias desde teclado
        for (int i = 0; i < n; i++) {
            System.out.println("\nIngrese datos de la farmacia " + (i + 1));
            Farmacia f = new Farmacia();
            f.leer(); // aquí se piden los datos por consola
            archivo.adicionar(f);
        }

        // a) Mostrar los medicamentos para la tos, de la Sucursal número X
        System.out.print("\nIngrese número de sucursal para mostrar medicamentos de Tos: ");
        int sucursalTos = Integer.parseInt(sc.nextLine());
        System.out.println("\n(a) Medicamentos para la tos en sucursal " + sucursalTos + ":");
        archivo.mostrarMedicamentosTosSucursal(sucursalTos);

        // b) Mostrar el número de sucursal y su dirección que tienen el medicamento “Tapsin”
        System.out.println("\n(b) Sucursal y dirección que tienen 'Tapsin':");
        archivo.mostrarSucursalConTapsin();

        // c) Buscar medicamentos por tipo
        System.out.print("\nIngrese tipo de medicamento a buscar: ");
        String tipoBuscado = sc.nextLine();
        System.out.println("\n(c) Medicamentos por tipo '" + tipoBuscado + "':");
        archivo.buscarPorTipo(tipoBuscado);

        // d) Ordenar las farmacias según su dirección en orden alfabético
        System.out.println("\n(d) Farmacias ordenadas por dirección:");
        archivo.ordenarPorDireccion();
        archivo.listar();

        // e) Mover los medicamentos de tipo x de la farmacia y a la farmacia z
        System.out.print("\nIngrese tipo de medicamento a mover: ");
        String tipoMover = sc.nextLine();
        System.out.print("Ingrese sucursal origen: ");
        int origen = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese sucursal destino: ");
        int destino = Integer.parseInt(sc.nextLine());

        System.out.println("\n(e) Mover medicamentos tipo '" + tipoMover +
                "' de sucursal " + origen + " a sucursal " + destino + ":");
        archivo.moverMedicamentosTipo(tipoMover, origen, destino);
        archivo.listar();
    }
}
