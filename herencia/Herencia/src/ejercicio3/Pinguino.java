package ejercicio3;

public class Pinguino extends Animal {
    public Pinguino(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void desplazarse() {
        System.out.println(getNombre() + " el pingüino desliza sobre el hielo");
    }
}
