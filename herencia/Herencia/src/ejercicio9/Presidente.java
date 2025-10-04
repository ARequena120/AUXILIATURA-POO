package ejercicio9;

public class Presidente extends Politico implements Partido {
    private String nombre;
    private String apellido;
    private String nombrePartido;
    private String rolPartido;
    
    // Constructor completo
    public Presidente(String nombre, String apellido, 
                     String profesión, int añosExp,
                     String nombrePartido, String rolPartido) {
        super(profesión, añosExp);
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombrePartido = nombrePartido;
        this.rolPartido = rolPartido;
    }
    
    // Constructor alternativo
    public Presidente(String nombre, String apellido, 
                     String profesión, int añosExp) {
        super(profesión, añosExp);
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    // Implementación interfaz Partido
    @Override
    public String getNombreP() {
        return nombrePartido;
    }
    
    @Override
    public String getRol() {
        return rolPartido;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setNombrePartido(String nombrePartido) {
        this.nombrePartido = nombrePartido;
    }
    
    public void setRolPartido(String rolPartido) {
        this.rolPartido = rolPartido;
    }
}