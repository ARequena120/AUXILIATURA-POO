package ejercicio2;

public class Calculadora {

    private int a,b;

    // Constructor
    public Calculadora(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Métodos de operación
    public int sumar() {
        return a + b;
    }

    public int restar() {
        return a - b;
    }

    public int multiplicar() {
        return a * b;
    }

    public int dividir() {
        if (b == 0) {
            throw new ArithmeticException("Error: división por cero.");
        }
        return a / b;
    }

    // Clase interna para excepción personalizada
    public static class NumeroInvalidoException extends Exception {
        public NumeroInvalidoException(String mensaje) {
            super(mensaje);
        }
    }

    // Método para convertir String a entero
    public static int convertirAEntero(String valor) throws NumeroInvalidoException {
        try {
            return Integer.parseInt(valor);
        } catch (NumberFormatException e) {
            throw new NumeroInvalidoException("Error: el valor '" + valor + "' no es un número válido.");
        }
    }
}
