using System;

namespace ejercicio5
{

	public class celular
	{
	    // Atributos privados
	    private string nroTel;
	    private string dueño;
	    private int espacio;  // en GB
	    private int ram;      // en GB
	    private int nroApp;
	
	    // Constructor por defecto
	    public celular()
	    {
	        nroTel = "0000000000";
	        dueño = "Desconocido";
	        espacio = 0;
	        ram = 0;
	        nroApp = 0;
	    }
	
	    // Constructor con parámetros
	    public celular(string nroTel, string dueño, int espacio, int ram, int nroApp)
	    {
	        this.nroTel = nroTel;
	        this.dueño = dueño;
	        this.espacio = espacio;
	        this.ram = ram;
	        this.nroApp = nroApp;
	    }
	
	    // Getters y Setters como métodos
	
	    public string GetNroTel()
	    {
	        return nroTel;
	    }
	
	    public void SetNroTel(string nroTel)
	    {
	        this.nroTel = nroTel;
	    }
	
	    public string GetDueño()
	    {
	        return dueño;
	    }
	
	    public void SetDueño(string dueño)
	    {
	        this.dueño = dueño;
	    }
	
	    public int GetEspacio()
	    {
	        return espacio;
	    }
	
	    public void SetEspacio(int espacio)
	    {
	        this.espacio = espacio;
	    }
	
	    public int GetRam()
	    {
	        return ram;
	    }
	
	    public void SetRam(int ram)
	    {
	        this.ram = ram;
	    }
	
	    public int GetNroApp()
	    {
	        return nroApp;
	    }
	
	    public void SetNroApp(int nroApp)
	    {
	        this.nroApp = nroApp;
	    }
	
	    // Sobrecarga operador ++ para aumentar nroApp en 10
	    public static celular operator ++(celular c)
	    {
	        c.nroApp += 10;
	        return c;
	    }
	
	    // Sobrecarga operador -- para disminuir espacio en 5
	    public static celular operator --(celular c)
	    {
	        c.espacio -= 5;
	        if (c.espacio < 0)
	            c.espacio = 0;  // Evitar espacio negativo
	        return c;
	    }
	
	    // Método ToString sin usar interpolación de cadenas
	    public override string ToString()
	    {
	        return "nroTel: " + nroTel + ", dueño: " + dueño + ", espacio: " + espacio + "GB, ram: " + ram + "GB, nroApp: " + nroApp;
	    }
	}
}
