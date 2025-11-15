package ejercicio6;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("12345", "Juan Pérez", 1000.0);

        cuenta.mostrarInfo();

        // Depósito válido
        try {
            cuenta.depositar(500.0);
            System.out.println("Depósito válido realizado.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error al depositar: " + e.getMessage());
        }

        // Depósito inválido
        try {
            cuenta.depositar(-100.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al depositar: " + e.getMessage());
        }

        // Retiro válido
        try {
            cuenta.retirar(300.0);
            System.out.println("Retiro válido realizado.");
        } catch (CuentaBancaria.FondosInsuficientesException e) {
            System.out.println("Error al retirar: " + e.getMessage());
        }

        // Retiro que excede el saldo
        try {
            cuenta.retirar(2000.0);
        } catch (CuentaBancaria.FondosInsuficientesException e) {
            System.out.println("Error al retirar: " + e.getMessage());
        }

        cuenta.mostrarInfo();
    }
}
