using System;

namespace ejercicio2
{
	public class Program
	{
	    public static void Main()
	    {
	        Videojuego[] juegos = 
	        {
	            new Videojuego(),
	            new Videojuego("FIFA 2026", "PS5"),
	            new Videojuego("Halo Infinite", "Xbox", 4)
	        };
	
	        // Modificar jugadores
	        juegos[0].AgregarJugadores();
	        juegos[1].AgregarJugadores(2);
	        
	        Console.Write("Ingrese jugadores para " + juegos[2].ObtenerNombre() + ": ");
	        juegos[2].AgregarJugadores(int.Parse(Console.ReadLine()));
	
	        // Mostrar información
	        Console.WriteLine("\n--- LISTADO COMPLETO ---");
	        foreach(var juego in juegos)
	        {
	            Console.WriteLine("Nombre: " + juego.ObtenerNombre());
	            Console.WriteLine("Plataforma: " + juego.ObtenerPlataforma());
	            Console.WriteLine("Jugadores: " + juego.ObtenerJugadores());
	            Console.WriteLine("Detalle completo: " + juego.ToString());
	            Console.WriteLine("-----------------------------");
	        }
	        Console.ReadKey();
	    }
	}
}