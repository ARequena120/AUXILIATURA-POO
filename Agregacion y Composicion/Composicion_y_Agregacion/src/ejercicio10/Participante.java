package ejercicio10;

public class Participante extends Persona {
    private int nroTicket;

    public Participante(String nombre, String apellido, int edad, int CI, int nroTicket) {
        super(nombre, apellido, edad, CI);
        this.nroTicket = nroTicket;
    }

    public int getNroTicket() { return nroTicket; }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Nro Ticket: " + nroTicket);
    }
}
