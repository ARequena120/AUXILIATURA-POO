class Crucero:
    def __init__(self, nombre="", pais_origen="", pais_destino=""):
        self.nombre = nombre
        self.pais_origen = pais_origen
        self.pais_destino = pais_destino
        # Matriz 3x100 según UML: [nombres, habitaciones, costos]
        self.pasajeros = [[], [], []]  
    
    def __pos__(self):  # Operador ++ (carga datos demo)
        self.nombre = "Caribe Paradise"
        self.pais_origen = "México"
        self.pais_destino = "Jamaica"
        # Datos de ejemplo para 5 pasajeros
        self.pasajeros = [
            ["Juan Vargas", "Martina Vasques", "Luis Méndez", "Ana Castillo", "Pedro López"],
            ["502", "603", "715", "204", "301"],
            ["500", "1000", "750", "1200", "900"]
        ]
        return self
    
    def __neg__(self):  # Operador -- (muestra información)
        print(f"\nCRUCERO: {self.nombre.upper()}")
        print(f"Ruta: {self.pais_origen} → {self.pais_destino}")
        print(f"Pasajeros registrados: {len(self.pasajeros[0])}")
        return self
    
    def __eq__(self, otro):  # Comparación costos totales
        total_self = sum(float(c) for c in self.pasajeros[2])
        total_otro = sum(float(c) for c in otro.pasajeros[2])
        return total_self == total_otro
    
    def __add__(self, otro):  # Comparación cantidad pasajeros
        return len(self.pasajeros[0]) == len(otro.pasajeros[0])
    
    def __sub__(self, otro):  # Estadísticas de género
        def contar_generos(pasajeros):
            masculinos = sum(1 for nombre in pasajeros[0] if nombre.split()[-1][-1].upper() in ['O', 'S'])
            femeninos = len(pasajeros[0]) - masculinos
            return masculinos, femeninos
        
        m1, f1 = contar_generos(self.pasajeros)
        m2, f2 = contar_generos(otro.pasajeros)
        
        print("\nESTADÍSTICAS DE GÉNERO")
        print(f"{self.nombre}: M({m1}) / F({f1})")
        print(f"{otro.nombre}: M({m2}) / F({f2})")

# Instanciación (Inciso a)
crucero1 = +Crucero()  # Carga datos con ++
crucero2 = Crucero("Mediterráneo Dream", "España", "Italia")
crucero2.pasajeros = [
    ["Carlos Ruiz", "María González"],
    ["405", "208"],
    ["850", "1300"]
]

# Ejemplo de uso
-crucero1  # Muestra información
print("\nComparación costos totales:", crucero1 == crucero2)
print("Misma cantidad pasajeros:", crucero1 + crucero2)
crucero1 - crucero2
