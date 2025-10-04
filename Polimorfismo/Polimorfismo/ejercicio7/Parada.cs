using System;

namespace ejercicio7
{
	public class Parada
	{
	    private string[] admins = new string[10];
	    private string[,] autos = new string[10, 3];
	    private string nombreP;
	    private int nroAdmins = 0;
	    private int nroAutos = 0;
	
	    // Constructores
	    public Parada()
	    {
	        nombreP = "Parada sin nombre";
	    }
	
	    public Parada(string nombre)
	    {
	        nombreP = nombre;
	    }
	
	    // Método para mostrar información
	    public void Mostrar()
	    {
	        Console.WriteLine("\n=== INFORMACIÓN COMPLETA DE LA PARADA ===");
	        Console.WriteLine("Nombre: " + nombreP);
	        Console.WriteLine("\nAdministradores registrados (" + nroAdmins + "):");
	        for (int i = 0; i < nroAdmins; i++)
	        {
	            Console.WriteLine("[" + (i+1) + "] " + admins[i]);
	        }
	        
	        Console.WriteLine("\nVehículos registrados (" + nroAutos + "):");
	        for (int i = 0; i < nroAutos; i++)
	        {
	            Console.WriteLine("Auto #" + (i+1));
	            Console.WriteLine("  Modelo  : " + autos[i,0]);
	            Console.WriteLine("  Conductor: " + autos[i,1]);
	            Console.WriteLine("  Placa    : " + autos[i,2]);
	            Console.WriteLine("----------------------");
	        }
	    }
	
	    // Métodos para agregar elementos
	    public void AdicionarAdmin(string nombreAdmin)
	    {
	        if (nroAdmins < 10)
	        {
	            admins[nroAdmins] = nombreAdmin;
	            nroAdmins++;
	            Console.WriteLine("Administrador agregado: " + nombreAdmin);
	        }
	        else
	        {
	            Console.WriteLine("¡Alerta! Capacidad máxima de administradores alcanzada");
	        }
	    }
	
	    public void AdicionarAuto(string modelo, string conductor, string placa)
	    {
	        if (nroAutos < 10)
	        {
	            autos[nroAutos, 0] = modelo;
	            autos[nroAutos, 1] = conductor;
	            autos[nroAutos, 2] = placa;
	            nroAutos++;
	            Console.WriteLine("Auto registrado: " + modelo + " - " + placa);
	        }
	        else
	        {
	            Console.WriteLine("¡Alerta! No hay espacio para más vehículos");
	        }
	    }
	}
}
