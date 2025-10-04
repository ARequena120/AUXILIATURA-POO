
using System;

namespace ejercicio7
{
	class Program
	{
		public static void Main(string[] args)
		{
			// Crear parada principal
	        Parada terminalCentral = new Parada("Terminal Central de Transportes");
	        
	        // Registrar administradores
	        terminalCentral.AdicionarAdmin("María González");
	        terminalCentral.AdicionarAdmin("Luis Pérez");
	        terminalCentral.AdicionarAdmin("Ana Beltrán");
	        
	        // Registrar vehículos
	        terminalCentral.AdicionarAuto("Toyota Hilux", "Carlos Rojas", "ABC-123");
	        terminalCentral.AdicionarAuto("Nissan NP300", "Fernanda Morales", "XYZ-789");
	        terminalCentral.AdicionarAuto("Chevrolet S10", "Diego Armando", "QWE-456");
	        
	        // Mostrar reporte detallado
	        terminalCentral.Mostrar();
	        
	        Console.WriteLine("\nPresione cualquier tecla para salir...");
	        Console.ReadKey();
		}
	}
}