package ejercicio7;

public class Mascota {
	private String nombre,tipo;
	private int energia;
	    // Constructor: Inicializa los atributos (energía por defecto 50 si no se pasa)
	    public Mascota(String nombre, String tipo, int energia) {
	        this.nombre = nombre;
	        this.tipo = tipo;
	        this.energia = Math.max(0, Math.min(100, energia));  // Asegura límites iniciales
	    }

	    // Constructor alternativo sin energía (usa 50 por defecto)
	    public Mascota(String nombre, String tipo) {
	        this(nombre, tipo, 50);
	    }

	    // a) Método para alimentar: +20 de energía, máximo 100
	    public boolean alimentar() {
	        int nuevaEnergia = this.energia + 20;
	        if (nuevaEnergia > 100) {
	            nuevaEnergia = 100;  // Límite máximo
	            System.out.println(this.nombre + " (" + this.tipo + ") está completamente energizada. Energía: " + nuevaEnergia);
	        } else {
	            System.out.println(this.nombre + " (" + this.tipo + ") ha sido alimentada. Energía: " + nuevaEnergia);
	        }
	        this.energia = nuevaEnergia;
	        return true;
	    }

	    // b) Método para jugar: -15 de energía, mínimo 0
	    public boolean jugar() {
	        int nuevaEnergia = this.energia - 15;
	        if (nuevaEnergia < 0) {
	            nuevaEnergia = 0;  // Límite mínimo
	            System.out.println(this.nombre + " (" + this.tipo + ") está exhausta y no puede jugar más. Energía: " + nuevaEnergia);
	        } else {
	            System.out.println(this.nombre + " (" + this.tipo + ") ha jugado. Energía: " + nuevaEnergia);
	        }
	        this.energia = nuevaEnergia;
	        return true;
	    }

	    // Método toString para mostrar el estado completo de la mascota
	    @Override
	    public String toString() {
	        return "Mascota [nombre=" + nombre + ", tipo=" + tipo + ", energia=" + energia + "]";
	    }

	    // Getter para energía (útil para mostrar en c))
	    public int getEnergia() {
	        return this.energia;
	    }

	    // Getters adicionales para acceso (opcional)
	    public String getNombre() {
	        return this.nombre;
	    }

	    public String getTipo() {
	        return this.tipo;
	    }
	}