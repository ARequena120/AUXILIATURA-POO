package ejercicio6;

import java.util.ArrayList;

public class Receta {
    String codigo;
    String fechaEmision;
    ArrayList<Medicamento> medicamentos;

    public Receta(String codigo, String fechaEmision) {
        this.codigo = codigo;
        this.fechaEmision = fechaEmision;
        this.medicamentos = new ArrayList<>();
    }

    public void agregarMedicamento(Medicamento m) {
        medicamentos.add(m);
    }
}

