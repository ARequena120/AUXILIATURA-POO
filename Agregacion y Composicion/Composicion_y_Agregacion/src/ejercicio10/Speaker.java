package ejercicio10;

public class Speaker extends Persona {
    private String especialidad;

    public Speaker(String nombre, String apellido, int edad, int CI, String especialidad) {
        super(nombre, apellido, edad, CI);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() { return especialidad; }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Especialidad: " + especialidad);
    }
}
