using System;

namespace ejercicio2
{
	public class Videojuego
	{
	    // Campos privados
	    private string nombre;
	    private string plataforma;
	    private int jugadoresActuales;
	
	    // Constructores
	    public Videojuego()
	    {
	        nombre = "Juego sin nombre";
	        plataforma = "Plataforma no especificada";
	        jugadoresActuales = 0;
	    }
	
	    public Videojuego(string nombre, string plataforma) : this()
	    {
	        this.nombre = nombre;
	        this.plataforma = plataforma;
	    }
	
	    public Videojuego(string nombre, string plataforma, int jugadoresIniciales) : this(nombre, plataforma)
	    {
	        if(jugadoresIniciales >= 0)
	            jugadoresActuales = jugadoresIniciales;
	    }
	
	    // Métodos de acceso
	    public string ObtenerNombre()
	    {
	        return nombre;
	    }
	
	    public string ObtenerPlataforma()
	    {
	        return plataforma;
	    }
	
	    public int ObtenerJugadores()
	    {
	        return jugadoresActuales;
	    }
	
	    // Métodos de modificación
	    public void AgregarJugadores()
	    {
	        jugadoresActuales++;
	    }
	
	    public void AgregarJugadores(int cantidad)
	    {
	        if(cantidad > 0)
	            jugadoresActuales += cantidad;
	    }
	
	    // Sobreescritura de ToString
	    public override string ToString()
	    {
	        return nombre + " - Plataforma: " + plataforma + " | Jugadores conectados: " + jugadoresActuales.ToString();
	    }
	}
}
