class Pedido:
    def __init__(self, estado, productos):
        self._estado = estado
        self._productos = productos

    def getEstado(self):
        return self._estado

    def setEstado(self, nuevo_estado):
        self._estado = nuevo_estado

    def getProductos(self):
        return self._productos

    def setProductos(self, nuevos_productos):
        self._productos = nuevos_productos

    def __del__(self):
        print("Pedido eliminado del sistema")

class Producto:
    def __init__(self, nombre, disponible):
        self._nombre = nombre
        self._disponible = disponible

    def getNombre(self):
        return self._nombre

    def setNombre(self, nuevo_nombre):
        self._nombre = nuevo_nombre

    def getDisponible(self):
        return self._disponible

    def setDisponible(self, nuevo_estado):
        self._disponible = nuevo_estado

    def __del__(self):
        print("Producto retirado del menú")

# c) Creación y muestra de objetos
cafe = Producto("Café Americano", True)
pastel = Producto("Pastel de Chocolate", False)
pedido1 = Pedido("registrado", [cafe, pastel])

print("=== PEDIDO ===")
print(f"Estado: {pedido1.getEstado()}")
print("Productos:")
for producto in pedido1.getProductos():
    print(f"- {producto.getNombre()} | Disponible: {'Sí' if producto.getDisponible() else 'No'}")

# Al finalizar se ejecutan automáticamente los destructores
