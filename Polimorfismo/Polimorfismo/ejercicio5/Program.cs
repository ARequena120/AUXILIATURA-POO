/*
 * Created by SharpDevelop.
 * User: User
 * Date: 1/10/2025
 * Time: 15:14
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;

namespace ejercicio5
{
	class Program
	{
		public static void Main(string[] args)
		{
			// Crear objeto celular con datos iniciales usando el constructor con parámetros
	        celular miCelular = new celular("9876543210", "Ana Gómez", 32, 4, 15);
	        // Mostrar datos antes de aplicar operadores usando getters
	        Console.WriteLine("=== Datos antes de aplicar operadores ===");
	        Console.WriteLine("nroTel: " + miCelular.GetNroTel());
	        Console.WriteLine("dueño: " + miCelular.GetDueño());
	        Console.WriteLine("espacio: " + miCelular.GetEspacio() + "GB");
	        Console.WriteLine("ram: " + miCelular.GetRam() + "GB");
	        Console.WriteLine("nroApp: " + miCelular.GetNroApp());
	        // Aplicar operador ++ (incrementar nroApp en 10)
	        miCelular++;
	        Console.WriteLine("\nSe aplicó operador ++ (incrementar nroApp en 10)");
	        // Mostrar datos después de operador ++
	        Console.WriteLine("nroApp actualizado: " + miCelular.GetNroApp());
			// Aplicar operador -- (disminuir espacio en 5)
	        miCelular--;
	        Console.WriteLine("\nSe aplicó operador -- (disminuir espacio en 5)");
	        // Mostrar datos después de operador --
	        Console.WriteLine("espacio actualizado: " + miCelular.GetEspacio() + "GB");
	        // Mostrar todos los datos finales usando ToString
	        Console.WriteLine("\n=== Datos finales del celular ===");
	        Console.WriteLine(miCelular.ToString());
			Console.ReadKey(true);
		}
	}
}