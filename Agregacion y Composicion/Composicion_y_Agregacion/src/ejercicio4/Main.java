package ejercicio4;

public class Main {
    public static void main(String[] args) {
        ropero ropero = new ropero("Madera");

        // b) Adicionar prendas
        ropero.adicionarPrenda(new ropa("Camisa", "Algodón"));
        ropero.adicionarPrenda(new ropa("Pantalón", "Jeans"));
        ropero.adicionarPrenda(new ropa("Chaqueta", "Cuero"));
        ropero.adicionarPrenda(new ropa("Camisa", "Seda"));

        System.out.println("Contenido inicial:");
        ropero.mostrarTodo();

        // c) Eliminar prendas de material "Cuero" o tipo "Camisa"
        ropero.eliminarPorMaterialOTipo("Cuero", "Camisa");

        System.out.println("\nDespués de eliminar:");
        ropero.mostrarTodo();

        // d) Mostrar prendas de material "Jeans" y tipo "Pantalón"
        System.out.println("\nPrendas de material 'Jeans' y tipo 'Pantalón':");
        ropero.mostrarPorMaterialYTipo("Jeans", "Pantalón");
    }
}
