package ejercicio5;
import java.io.Serializable;
import java.util.Scanner;

public class Farmacia implements Serializable {
    private String nombreFarmacia;
    private int sucursal;
    private String direccion;
    private int nroMedicamentos;
    private Medicamento[] m = new Medicamento[100];

    public Farmacia() {}

    public void leer() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre de la farmacia: ");
        nombreFarmacia = sc.nextLine();

        System.out.print("Sucursal (número entero): ");
        sucursal = Integer.parseInt(sc.nextLine());

        System.out.print("Dirección: ");
        direccion = sc.nextLine();

        System.out.print("Número de medicamentos: ");
        nroMedicamentos = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < nroMedicamentos; i++) {
            m[i] = new Medicamento();
            System.out.println("Medicamento " + (i + 1));
            m[i].leer();
        }
    }

    public void mostrar() {
        System.out.println("Farmacia{" +
                "nombre='" + nombreFarmacia + '\'' +
                ", sucursal=" + sucursal +
                ", direccion='" + direccion + '\'' +
                '}');
        for (int i = 0; i < nroMedicamentos; i++) {
            if (m[i] != null) {
                m[i].mostrar();
            }
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public int getSucursal() {
        return sucursal;
    }

    public void mostrarMedicamentos(String tipoBuscado) {
        for (int i = 0; i < nroMedicamentos; i++) {
            if (m[i] != null && m[i].getTipo().equalsIgnoreCase(tipoBuscado)) {
                m[i].mostrar();
            }
        }
    }

    public boolean contieneMedicamento(String nombreBuscado) {
        for (int i = 0; i < nroMedicamentos; i++) {
            if (m[i] != null && m[i].getNombre().equalsIgnoreCase(nombreBuscado)) {
                return true;
            }
        }
        return false;
    }

    public void moverMedicamentos(String tipo, Farmacia destino) {
        for (int i = 0; i < nroMedicamentos; i++) {
            if (m[i] != null && m[i].getTipo().equalsIgnoreCase(tipo)) {
                destino.agregarMedicamento(m[i]);
                m[i] = null;
            }
        }
        compactar();
    }

    public void agregarMedicamento(Medicamento med) {
        m[nroMedicamentos++] = med;
    }

    private void compactar() {
        Medicamento[] nuevo = new Medicamento[100];
        int j = 0;
        for (int i = 0; i < nroMedicamentos; i++) {
            if (m[i] != null) {
                nuevo[j++] = m[i];
            }
        }
        m = nuevo;
        nroMedicamentos = j;
    }

    public double precioMedicamentoTos() {
        for (int i = 0; i < nroMedicamentos; i++) {
            if (m[i] != null && m[i].getTipo().equalsIgnoreCase("Tos")) {
                return m[i].getPrecio();
            }
        }
        return 0;
    }

    public void mostrarMedicamentosMenorTos(double precioLimite) {
        for (int i = 0; i < nroMedicamentos; i++) {
            if (m[i] != null && m[i].getTipo().equalsIgnoreCase("Tos") && m[i].getPrecio() < precioLimite) {
                m[i].mostrar();
            }
        }
    }
}
