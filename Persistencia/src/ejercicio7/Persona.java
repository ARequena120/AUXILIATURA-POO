package ejercicio7;

import java.io.Serializable;

public class Persona implements Serializable {
    protected String nombre;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    protected int ci;

    public Persona() {}

    public Persona(String nombre, String apPat, String apMat, int ci) {
        this.nombre = nombre;
        this.apellidoPaterno = apPat;
        this.apellidoMaterno = apMat;
        this.ci = ci;
    }

    public void mostrar() {
        System.out.println("Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", ci=" + ci +
                '}');
    }

    public int getCi() {
        return ci;
    }
}
