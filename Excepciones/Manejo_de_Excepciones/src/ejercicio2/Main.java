package ejercicio2;

import ejercicio2.Calculadora.NumeroInvalidoException;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Pruebas con atributos a y b ===");

        // Crear instancia con valores
        Calculadora calc = new Calculadora(10, 5);

        System.out.println("Suma: " + calc.sumar());
        System.out.println("Resta: " + calc.restar());
        System.out.println("Multiplicación: " + calc.multiplicar());

        // División válida
        try {
            System.out.println("División: " + calc.dividir());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // División por cero
        Calculadora calcError = new Calculadora(10, 0);
        try {
            System.out.println("División por cero: " + calcError.dividir());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Conversión válida
        try {
            int numero = Calculadora.convertirAEntero("123");
            System.out.println("Conversión exitosa: " + numero);
        } catch (NumeroInvalidoException e) {
            System.out.println(e.getMessage());
        }

        // Conversión inválida
        try {
            int numero = Calculadora.convertirAEntero("abc");
            System.out.println("Conversión: " + numero);
        } catch (NumeroInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
