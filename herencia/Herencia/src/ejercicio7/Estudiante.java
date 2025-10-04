package ejercicio7;
import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {
    private String ru;
    private String matricula;
    private static List<Estudiante> estudiantes = new ArrayList<>();

    public Estudiante(String nombre, String paterno, String materno, int edad, 
                    String ru, String matricula) {
        super(nombre, paterno, materno, edad);
        this.ru = ru;
        this.matricula = matricula;
        estudiantes.add(this);
    }
    
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("RU: " + ru);
        System.out.println("Matrícula: " + matricula);
    }
    
    public void modificarEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
    }
    
    public static double promedio() {
        return estudiantes.stream()
                .mapToInt(e -> e.edad)
                .average()
                .orElse(0.0);
    }
}
