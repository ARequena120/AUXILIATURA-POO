using System;

namespace ejercicio3
{
	public class Matriz
	{
	    private float[,] matriz = new float[10, 10];
	
	    public Matriz()
	    {
	        for (int i = 0; i < 10; i++)
	            matriz[i, i] = 1.0f;
	    }
	
	    public Matriz(float[,] valores)
	    {
	        for (int i = 0; i < 10; i++)
	            for (int j = 0; j < 10; j++)
	                matriz[i, j] = valores[i, j];
	    }
	
	    public Matriz Sumar(Matriz otra)
	    {
	        Matriz resultado = new Matriz(new float[10,10]);
	        for (int i = 0; i < 10; i++)
	            for (int j = 0; j < 10; j++)
	                resultado.matriz[i, j] = this.matriz[i, j] + otra.matriz[i, j];
	        return resultado;
	    }
	
	    public Matriz Restar(Matriz otra)
	    {
	        Matriz resultado = new Matriz(new float[10,10]);
	        for (int i = 0; i < 10; i++)
	            for (int j = 0; j < 10; j++)
	                resultado.matriz[i, j] = this.matriz[i, j] - otra.matriz[i, j];
	        return resultado;
	    }
	
	    public bool Igual(Matriz otra)
	    {
	        for (int i = 0; i < 10; i++)
	            for (int j = 0; j < 10; j++)
	                if (this.matriz[i, j] != otra.matriz[i, j])
	                    return false;
	        return true;
	    }
	}

}
