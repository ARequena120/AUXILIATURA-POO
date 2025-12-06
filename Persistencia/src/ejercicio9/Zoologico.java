package ejercicio9;

import java.io.Serializable;
import java.util.Scanner;

public class Zoologico implements Serializable {
    private int id;
    private String nombre;
    private int nroAnimales;
    private Animal[] animales = new Animal[30];

    public Zoologico() {}

    public void leer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.print("Nombre del zoológico: ");
        nombre = sc.nextLine();
        System.out.print("Número de animales: ");
        nroAnimales = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < nroAnimales; i++) {
            System.out.println("Animal " + (i + 1));
            System.out.print("Especie: ");
            String especie = sc.nextLine();
            System.out.print("Nombre: ");
            String nombreAnimal = sc.nextLine();
            System.out.print("Cantidad: ");
            int cantidad = Integer.parseInt(sc.nextLine());
            animales[i] = new Animal(especie, nombreAnimal, cantidad);
        }
    }

    public void mostrar() {
        System.out.println("Zoológico{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", nroAnimales=" + nroAnimales +
                '}');
        for (int i = 0; i < nroAnimales; i++) {
            animales[i].mostrar();
        }
    }

    public int getId() {
        return id;
    }

    public int getNroAnimales() {
        return nroAnimales;
    }

    public Animal getAnimal(int i) {
        return animales[i];
    }

    public void agregarAnimal(Animal a) {
        if (nroAnimales < 30) {
            animales[nroAnimales++] = a;
        }
    }

    public String getNombre() {
        return nombre;
    }
}