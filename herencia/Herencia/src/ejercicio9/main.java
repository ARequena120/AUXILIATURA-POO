package ejercicio9;

public class main {

	public static void main(String[] args) {
        // Creación de presidentes (dos formas)
        Presidente p1 = new Presidente("Juan", "Pérez", "Abogado", 15, 
                                      "Partido Liberal", "Líder");
        
        Presidente p2 = new Presidente("María", "Gómez", "Economista", 10);
        p2.setNombrePartido("Partido Verde");
        p2.setRolPartido("Coordinadora");
        
        // Crear vector con 3 presidentes
        Presidente[] presidentes = {
            p1,
            p2,
            new Presidente("Carlos", "López", "Ingeniero", 20, 
                          "Partido Progresista", "Vocero")
        };
        
        // Buscar presidente por nombre
        String nombreBuscado = "María";
        for (Presidente presidente : presidentes) {
            if (presidente.getNombre().equals(nombreBuscado)) {
                System.out.println("Partido: " + presidente.getNombreP());
                System.out.println("Profesión: " + presidente.getProfesion());
                break;
            }
        }
    }

}
