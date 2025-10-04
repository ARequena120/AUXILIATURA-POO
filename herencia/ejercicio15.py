class Nadador:
    def __init__(self, estilo_natacion):
        self.estilo_natacion = estilo_natacion
    
    def nadar(self):
        print(f"Nadando estilo {self.estilo_natacion}")

class Ciclista:
    def __init__(self, tipo_bicicleta):
        self.tipo_bicicleta = tipo_bicicleta
    
    def pedalear(self):
        print(f"Pedaleando en bicicleta tipo {self.tipo_bicicleta}")

class Corredor:
    def __init__(self, distancia_preferida):
        self.distancia_preferida = distancia_preferida
    
    def correr(self):
        print(f"Corriendo una distancia de {self.distancia_preferida} km")

# a) Clase Triatleta con herencia múltiple
class Triatleta(Nadador, Ciclista, Corredor):
    def __init__(self, estilo_nat, tipo_bici, distancia_pref):
        # Inicializar todas las clases padre
        Nadador.__init__(self, estilo_nat)
        Ciclista.__init__(self, tipo_bici)
        Corredor.__init__(self, distancia_pref)

# b) Instanciación del objeto
triatleta_1 = Triatleta(
    estilo_nat="crol",
    tipo_bici="carretera",
    distancia_pref=42.195  # Maratón completo
)

# c) Uso de métodos heredados
print("Acciones del triatleta:")
triatleta_1.nadar()
triatleta_1.pedalear()
triatleta_1.correr()
