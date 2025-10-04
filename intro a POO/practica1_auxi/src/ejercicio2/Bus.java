package ejercicio2;

public class Bus {
    private int capacidad;      
    private int pasajeros;    
    private double costoPasaje;

    
    public Bus(int capacidad) {
        this.capacidad = capacidad;
        this.pasajeros = 0;
        this.costoPasaje=1.50;
    }

    // a) Método para subir X pasajeros y actualizar datos del bus
    public boolean subirPasajeros(int x) {
        if (x <= 0) {
            System.out.println("Error: No se pueden subir 0 o menos pasajeros.");
            return false;
        }
        int disponibles = this.capacidad - this.pasajeros;
        if (x > disponibles) {
            System.out.println("Error: Solo hay " + disponibles + " asientos disponibles. No se suben pasajeros.");
            return false;
        }
        this.pasajeros += x;
        System.out.println("Se subieron " + x + " pasajeros. Total ahora: " + this.pasajeros);
        return true;
    }

    // b) Método para cobrar pasaje a los pasajeros (total basado en actuales)
    public double cobrarPasaje() {
        double total = this.pasajeros * this.costoPasaje;
        System.out.println("Cobro total por " + this.pasajeros + " pasajeros: " + total + " Bs.");
        return total;
    }

    // c) Método para mostrar cuántos asientos quedan disponibles
    public int asientosDisponibles() {
        int disponibles = this.capacidad - this.pasajeros;
        System.out.println("Asientos disponibles: " + disponibles + " de " + this.capacidad);
        return disponibles;
    }

    
    @Override
    public String toString() {
        return "Bus [capacidad=" + capacidad + ", pasajeros=" + pasajeros + ", disponibles=" + (capacidad - pasajeros) + "]";
    }

    
    public int getPasajeros() {
        return this.pasajeros;
    }

    public int getCapacidad() {
        return this.capacidad;
    }
}

