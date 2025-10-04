package ejercicio3;

public class Producto {
	    private String nombre;  
	    private double precio;  
	    private int stock;      

	
	    public Producto(String nombre, double precio, int stock) {
	        this.nombre = nombre;
	        this.precio = precio;
	        this.stock = stock;
	    }

	    

	    // b) Método para vender cantidad: Resta del stock si es posible
	    public boolean vender(int cantidad) {
	        if (cantidad <= 0) {
	            System.out.println("Error: La cantidad a vender debe ser mayor a 0.");
	            return false;
	        }
	        if (cantidad > this.stock) {
	            System.out.println("Error: Stock insuficiente. Solo hay " + this.stock + " unidades disponibles.");
	            return false;
	        }
	        this.stock -= cantidad;
	        System.out.println("Venta exitosa: Se vendieron " + cantidad + " unidades de " + this.nombre + ". Stock restante: " + this.stock);
	        return true;
	    }

	    // c) Método para reabastecer: Suma al stock si cantidad > 0
	    public boolean reabastecer(int cantidad) {
	        if (cantidad <= 0) {
	            System.out.println("Error: La cantidad a reabastecer debe ser mayor a 0.");
	            return false;
	        }
	        this.stock += cantidad;
	        System.out.println("Reabastecimiento exitoso: Se agregaron " + cantidad + " unidades a " + this.nombre + ". Stock actual: " + this.stock);
	        return true;
	    }

	    
	    @Override
	    public String toString() {
	        return "Producto [nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + "]";
	    }

	   
	    public String getNombre() {
	        return this.nombre;
	    }

	    public double getPrecio() {
	        return this.precio;
	    }

	    public int getStock() {
	        return this.stock;
	    }
	}