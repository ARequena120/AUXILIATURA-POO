package ejercicio5;

public class Vehiculo {
    protected String conductor;
    protected String placa;
    protected int id;

    public Vehiculo(String conductor, String placa, int id) {
        this.conductor = conductor;
        this.placa = placa;
        this.id = id;
    }

    // Método para cambiar conductor (requisito c)
    public void cambiarConductor(String nuevoConductor) {
        this.conductor = nuevoConductor;
    }

    // Getters
    public String getConductor() { return conductor; }
    public String getPlaca() { return placa; }
    public int getId() { return id; }
}
