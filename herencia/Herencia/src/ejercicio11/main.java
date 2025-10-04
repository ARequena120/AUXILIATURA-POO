package ejercicio11;

public class main {

	public static void main(String[] args) {
		JefePolicia jefe1 = new JefePolicia(
	            "Carlos Rojas", 45, 8500.50, 15, "COMISARIO", "Narcóticos");
	            
	        JefePolicia jefe2 = new JefePolicia(
	            "Ana Méndez", 38, 9200.75, 12, "superintendente", "Homicidios");
	        
	        // a) Mostrar datos completos
	        System.out.println("=== DATOS JEFE 1 ===");
	        System.out.println("Nombre: " + jefe1.getNombre());
	        System.out.println("Edad: " + jefe1.getEdad());
	        System.out.println("Sueldo: $" + jefe1.getSueldo());
	        System.out.println("Grado: " + jefe1.getGrado());
	        
	        System.out.println("\n=== DATOS JEFE 2 ===");
	        System.out.println("Departamento: " + jefe2.getDepartamento());
	        System.out.println("Antigüedad: " + jefe2.getAntiguedad() + " años");
	        
	        // b) Comparación de sueldos
	        System.out.println("\n--- Comparativa salarial ---");
	        JefePolicia.compararMayorSueldo(jefe1, jefe2); 
	        
	        // c) Comparación de grados
	        System.out.println("\n--- Verificación de grados ---");
	        jefe1.verificarGradoEquivalente(jefe2);  
	    }

}
