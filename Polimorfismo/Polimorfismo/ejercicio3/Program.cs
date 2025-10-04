using System;

namespace ejercicio3
{
	public class Program
	{
	    public static void Main()
	    {
	        Matriz identidad = new Matriz();
	        float[,] datos = new float[10,10];
	        datos[0,0] = 5; datos[1,1] = 5;
	        
	        Matriz mPersonal = new Matriz(datos);
	        Matriz suma = identidad.Sumar(mPersonal);
	        Matriz resta = mPersonal.Restar(identidad);
	        
	        Console.WriteLine("¿Son iguales? " + suma.Igual(resta));
	        Console.WriteLine("Presione tecla para salir...");
	        Console.ReadKey();
	    }
	}
}