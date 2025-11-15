package ejercicio6;

public class Main {
    public static void main(String[] args) {
        // Crear pacientes
        Paciente paciente1 = new Paciente("Laura Gómez", "Hipertensión");
        Paciente paciente2 = new Paciente("Carlos Pérez", "Diabetes tipo 2");

        // Crear farmacéuticos
        Farmaceutico farm1 = new Farmaceutico("Dra. Silvia", "FAR12345");
        Farmaceutico farm2 = new Farmaceutico("Dr. Jorge", "FAR67890");

        // Crear medicamentos
        Medicamento med1 = new Medicamento("Losartán", "Antihipertensivo");
        Medicamento med2 = new Medicamento("Metformina", "Antidiabético");
        Medicamento med3 = new Medicamento("Paracetamol", "Analgésico");

        // Crear receta
        Receta receta1 = new Receta("RX001", "2025-11-05");
        receta1.agregarMedicamento(med1);
        receta1.agregarMedicamento(med3);

        // Crear registros
        Registro reg1 = new Registro("2025-11-05", "Primera entrega", med1, paciente1, farm1);
        Registro reg2 = new Registro("2025-11-05", "Entrega adicional", med3, paciente1, farm1);
        Registro reg3 = new Registro("2025-11-05", "Control mensual", med2, paciente2, farm2);

        // Mostrar información
        System.out.println("Registro 1:");
        System.out.println("Paciente: " + reg1.paciente.nombre);
        System.out.println("Medicamento: " + reg1.medicamento.nombre);
        System.out.println("Farmacéutico: " + reg1.farmacéutico.nombre);
        System.out.println("Observaciones: " + reg1.observaciones);

        System.out.println("\nReceta RX001 contiene:");
        for (Medicamento m : receta1.medicamentos) {
            System.out.println("- " + m.nombre + " (" + m.principioActivo + ")");
        }
    }
}
