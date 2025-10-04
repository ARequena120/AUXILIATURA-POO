package ejercicio5;

public class Persona {
	private String nombre,paterno,materno;
	private int edad,ci;
	
    public Persona(String nombre, String paterno, String materno, int edad, int ci) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
        this.ci = ci;
    }
    // b) Método para mostrar todos los datos de la persona
    public void mostrarDatos() {
        System.out.println("Datos de la persona:");
        System.out.println("- Nombre completo: " + nombre + " " + paterno + " " + materno);
        System.out.println("- Edad: " + edad + " años");
        System.out.println("- CI: " + ci);
      
    }
    // c) Método que determina si la persona es mayor de edad (edad >= 18)
    public boolean mayorDeEdad() {
        boolean esMayor = (this.edad >= 18);
        System.out.println(this.nombre + " " + paterno + " " + materno + " es " + (esMayor ? "mayor" : "menor") + " de edad.");
        return esMayor;
    }
    // d) Método para modificar la edad (solo si nuevo >= 0)
    public boolean modificarEdad(int nuevo) {
        if (nuevo < 0) {
            System.out.println("Error: La edad no puede ser negativa.");
            return false;
        }
        this.edad = nuevo;
        System.out.println("Edad modificada exitosamente para " + this.nombre + " " + paterno + " " + materno + ". Nueva edad: " + this.edad);
        return true;
    }
   
    @Override
	public String toString() {
	    return "Persona [nombre=" + nombre + ", paterno=" + paterno + ", materno=" + materno + ", edad=" + edad + ", ci=" + ci + "]";
	}
	
	public String getNombre() {
	    return this.nombre;
	}
	public String getPaterno() {
	    return this.paterno;
	}
	public String getMaterno() {
	    return this.materno;
	}
	public int getEdad() {
	    return this.edad;
	}
	public int getCi() {
	    return this.ci;
	}
}
