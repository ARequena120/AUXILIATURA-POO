package ejercicio4;

import java.io.Serializable;

public class Nota implements Serializable {
    private String materno;
    private double notaFinal;
    private Estudiante estudiante;

    public Nota(String materno, double notaFinal, Estudiante estudiante) {
        this.materno = materno;
        this.notaFinal = notaFinal;
        this.estudiante = estudiante;
    }

    public String getMaterno() {
        return materno;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "materno='" + materno + '\'' +
                ", notaFinal=" + notaFinal +
                ", estudiante=" + estudiante +
                '}';
    }
}
