package ejercicio6;

public class Registro {
    String fecha;
    String observaciones;
    Medicamento medicamento;
    Paciente paciente;
    Farmaceutico farmacéutico;

    public Registro(String fecha, String observaciones, Medicamento medicamento,Paciente paciente, Farmaceutico farmacéutico) {
        this.fecha = fecha;
        this.observaciones = observaciones;
        this.medicamento = medicamento;
        this.paciente = paciente;
        this.farmacéutico = farmacéutico;
    }
}

