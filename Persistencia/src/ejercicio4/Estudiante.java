package ejercicio4;

import java.io.Serializable;

public class Estudiante implements Serializable {
    private String ru;
    private String nombre;
    private String paterno;
    private String materno;
    private int edad;

    public Estudiante(String ru, String nombre, String paterno, String materno, int edad) {
        this.ru = ru;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
    }

    public String getMaterno() {
        return materno;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "ru='" + ru + '\'' +
                ", nombre='" + nombre + '\'' +
                ", paterno='" + paterno + '\'' +
                ", materno='" + materno + '\'' +
                ", edad=" + edad +
                '}';
    }
}
