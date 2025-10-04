package ejercicio11;

public class JefePolicia extends Persona implements Empleado, Policia {
    private double sueldo;
    private int antiguedad;
    private String grado;
    private String departamento;
    
    public JefePolicia(String nombre, int edad, double sueldo, 
                     int antiguedad, String grado, String departamento) {
        super(nombre, edad);
        this.sueldo = sueldo;
        this.antiguedad = antiguedad;
        this.grado = grado;
        this.departamento = departamento;
    }
    
    // Implementación de interfaces
    @Override public double getSueldo() { return sueldo; }
    @Override public int getAntiguedad() { return antiguedad; }
    @Override public String getGrado() { return grado; }
    @Override public String getDepartamento() { return departamento; }
    
    // -------------------- MÉTODOS SOLICITADOS --------------------
    // b) Comparación de sueldos (método estático)
    public static void compararMayorSueldo(JefePolicia j1, JefePolicia j2) {
        String resultado = (j1.getSueldo() > j2.getSueldo()) ? 
            j1.getNombre() : (j2.getSueldo() > j1.getSueldo()) ? 
            j2.getNombre() : "Ambos";
        System.out.println(resultado + " tiene el mayor sueldo");
    }
    
    // c) Comparación de grados (método de instancia)
    public void verificarGradoEquivalente(JefePolicia otroJefe) {
        boolean igualGrado = this.grado.equalsIgnoreCase(otroJefe.getGrado());
        System.out.printf("%s y %s %s el mismo grado%n",
            this.getNombre(), 
            otroJefe.getNombre(),
            igualGrado ? "tienen" : "NO tienen");
    }
}