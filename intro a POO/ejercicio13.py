#CLASE FRUTA
class Fruta:
    def __init__(self, nombre: str, tipo: str, vitaminas: list):
        self.nombre = nombre
        self.tipo = tipo
        self.vitaminas = vitaminas.copy()
    
    def Verificar(self, vitamina: str) -> bool:
        return any(v == vitamina for v in self.vitaminas)
    
    def MostrarVitaminas(self) -> str:
        activas = [v for v in self.vitaminas if v.strip()]
        return f"Vitaminas de {self.nombre}: {', '.join(activas)}" if activas else "Sin vitaminas"
    
    @staticmethod
    def VitaminasCitricas(frutas: list) -> dict:
        citricos = [f for f in frutas if f.tipo.lower() == 'cítrica']
        todas_vitaminas = [v for f in citricos for v in f.vitaminas if v]
        return {
            'total': len(citricos),
            'vitaminas_unicas': len(set(todas_vitaminas)),
            'frecuencia': {vit: todas_vitaminas.count(vit) for vit in set(todas_vitaminas)}
        } if citricos else {}
    
    @staticmethod
    def OrdenAlfabetico(frutas: list) -> list:
        return sorted(frutas, key=lambda x: x.vitaminas[0].lower() if x.vitaminas else 'zzz')

#CLASE MAIN 
if __name__ == "__main__":
    frutas = [
        Fruta("Naranja", "Cítrica", ["C", "B1", "Ácido fólico"]),
        Fruta("Kiwi", "Subtropical", ["C", "E", "K"]),
        Fruta("Limón", "Cítrica", ["C", "B6"]),
        Fruta("Manzana", "Templada", [])
    ]
    
    print("=== VERIFICACIÓN ===")
    print(f"Naranja tiene vitamina C? {frutas[0].Verificar('C')}")
    print(f"Manzana tiene vitaminas? {frutas[-1].MostrarVitaminas()}\n")
    
    print("=== ESTADÍSTICAS CÍTRICAS ===")
    stats = Fruta.VitaminasCitricas(frutas)
    print(f"Total cítricos: {stats.get('total', 0)}")
    print(f"Vitaminas únicas: {stats.get('vitaminas_unicas', 0)}")
    print("Frecuencia:", stats.get('frecuencia', 'N/A'))
    
    print("\n=== ORDEN ALFABÉTICO ===")
    for fruta in Fruta.OrdenAlfabetico(frutas):
        vit_principal = fruta.vitaminas[0] if fruta.vitaminas else "Sin vitamina"
        print(f"{fruta.nombre:<8} → {vit_principal}")
