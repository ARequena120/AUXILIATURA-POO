class Empleado:
    def __init__(self, nombre, sueldomes):
        self.nombre = nombre
        self.sueldomes = sueldomes
    
    def get_nombre(self):
        return self.nombre
    
    def get_sueldomes(self):
        return self.sueldomes
    
    def calcular_sueldo_total(self):
        return self.sueldomes

class Administrativo(Empleado):
    def __init__(self, nombre, sueldomes, cargo, hora_extra, sueldo_hora):
        super().__init__(nombre, sueldomes)
        self.cargo = cargo
        self.hora_extra = hora_extra
        self.sueldo_hora = sueldo_hora
    
    def calcular_sueldo_total(self):
        return super().calcular_sueldo_total() + (self.hora_extra * self.sueldo_hora)

class Chef(Empleado):
    def __init__(self, nombre, sueldomes, tipo, hora_extra, sueldo_hora):
        super().__init__(nombre, sueldomes)
        self.tipo = tipo
        self.hora_extra = hora_extra
        self.sueldo_hora = sueldo_hora
    
    def calcular_sueldo_total(self):
        return self.sueldomes + (self.hora_extra * self.sueldo_hora)

class Mesero(Empleado):
    def __init__(self, nombre, sueldomes, propina, hora_extra, sueldo_hora):
        super().__init__(nombre, sueldomes)
        self.propina = propina
        self.hora_extra = hora_extra
        self.sueldo_hora = sueldo_hora
    
    def calcular_sueldo_total(self):
        return (super().calcular_sueldo_total() 
                + (self.hora_extra * self.sueldo_hora) 
                + self.propina)

# a) Instanciación de objetos
chef = Chef("Luis Pérez", 4500, "Ejecutivo", 8, 15.75)
mesero1 = Mesero("Ana Gómez", 1200, 350.50, 10, 8.25)
mesero2 = Mesero("Carlos Ruiz", 1300, 420.0, 12, 8.50)
admin1 = Administrativo("María López", 1800, "Contadora", 5, 12.0)
admin2 = Administrativo("Pedro Vargas", 2000, "Gerente", 8, 15.0)

# b) Mostrar empleados con sueldomes = X
def filtrar_por_sueldo(empleados, x):
    return [e for e in empleados if e.get_sueldomes() == x]

empleados = [chef, mesero1, mesero2, admin1, admin2]
x = 1800
filtrados = filtrar_por_sueldo(empleados, x)
print(f"Empleados con sueldo mensual de {x}:")
for e in filtrados:
    print(f"- {e.get_nombre()}")

# c) Cálculo de sueldo total
print("\nSueldos totales:")
for emp in empleados:
    total = emp.calcular_sueldo_total()
    print(f"{emp.get_nombre():<15} ${total:.2f}")
