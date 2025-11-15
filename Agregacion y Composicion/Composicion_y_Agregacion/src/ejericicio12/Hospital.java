package ejericicio12;

import java.util.ArrayList;

public class Hospital {
    private String nombreHospital;
    private ArrayList<Doctor> doctores;

    public Hospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
        this.doctores = new ArrayList<>();
    }

    public void asignarDoctor(Doctor doctor) {
        if (!doctores.contains(doctor)) {
            doctores.add(doctor);
        }
    }

    public void mostrarDoctores() {
        System.out.println("Hospital: " + nombreHospital);
        for (Doctor d : doctores) {
            d.mostrarDatos();
        }
        System.out.println("-------------------------");
    }
}
