package ejericicio12;

public class Main {
    public static void main(String[] args) {
        // Crear doctores
        Doctor d1 = new Doctor("María Ruiz", "Cardiología");
        Doctor d2 = new Doctor("Juan Pérez", "Neurología");
        Doctor d3 = new Doctor("Lucía Torres", "Pediatría");

        // Crear hospitales
        Hospital h1 = new Hospital("Hospital Central");
        Hospital h2 = new Hospital("Clínica Vida");

        // Asignar doctores a hospitales
        h1.asignarDoctor(d1);
        h1.asignarDoctor(d2);

        h2.asignarDoctor(d2); // Doctor compartido
        h2.asignarDoctor(d3);

        // Mostrar doctores por hospital
        h1.mostrarDoctores();
        h2.mostrarDoctores();
    }
}
