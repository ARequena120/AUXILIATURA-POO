class MP4:
    def __init__(self, marca, capacidadGb):
        self.marca = marca
        self.capacidadGb = capacidadGb
        self.nroCanciones = 0
        self.canciones = [[], [], []]  # [nombres, artistas, pesos(KB)]
        self.nroVideos = 0
        self.videos = []  # Lista de [nombre, artista, peso(MB)]
    
    def borrar_cancion(self, nombre=None, artista=None, peso=None):
        indices = []
        # Determinar tipo de borrado
        if nombre and not artista and not peso:
            for i in range(len(self.canciones[0])):
                if self.canciones[0][i] == nombre:
                    indices.append(i)
        elif artista and not nombre and not peso:
            for i in range(len(self.canciones[1])):
                if self.canciones[1][i] == artista:
                    indices.append(i)
        elif nombre and artista and peso:
            for i in range(len(self.canciones[0])):
                if (self.canciones[0][i] == nombre and 
                    self.canciones[1][i] == artista and 
                    self.canciones[2][i] == peso):
                    indices.append(i)
        
        # Eliminar en orden inverso
        for i in reversed(indices):
            del self.canciones[0][i]
            del self.canciones[1][i]
            del self.canciones[2][i]
        self.nroCanciones = len(self.canciones[0])
    
    def __add__(self, cancion):
        nombre, artista, peso = cancion
        # Verificar existencia
        existe = any(
            self.canciones[0][i] == nombre and 
            self.canciones[1][i] == artista 
            for i in range(self.nroCanciones)
        )
        if not existe and self.nroCanciones < 100:
            self.canciones[0].append(nombre)
            self.canciones[1].append(artista)
            self.canciones[2].append(peso)
            self.nroCanciones += 1
        return self
    
    def __sub__(self, video):
        nombre, artista, peso = video
        # Verificar existencia
        existe = any(
            v[0] == nombre and v[1] == artista 
            for v in self.videos
        )
        if not existe and self.nroVideos < 100:
            self.videos.append([nombre, artista, peso])
            self.nroVideos += 1
        return self
    
    def mostrar_capacidad(self):
        total_canciones = sum(self.canciones[2]) * 1e-6  # KB a GB
        total_videos = sum(v[2] for v in self.videos) * 0.001  # MB a GB
        usado = total_canciones + total_videos
        return f"Capacidad disponible: {self.capacidadGb - usado:.2f} GB"

# Ejemplo de uso
if __name__ == "__main__":
    # Crear reproductor
    mi_mp4 = MP4("Sony", 10.0)  # 10GB de capacidad
    
    # Añadir canciones con operador +
    mi_mp4 = mi_mp4 + ("Back To Black", "Amy Winehouse", 100)
    mi_mp4 += ("Lost On You", "LP", 150)
    
    # Añadir videos con operador -
    mi_mp4 = mi_mp4 - ("Heathens", "twenty one pilots", 50)
    mi_mp4 -= ("Harmonica Andromeda", "KSHMR", 70)
    
    # Mostrar capacidad
    print(mi_mp4.mostrar_capacidad())  # 10 - (0.00025 + 0.12) ≈ 9.87975 GB
    
    # Borrar canción por nombre
    mi_mp4.borrar_cancion(nombre="Lost On You")
    
    # Borrar canción por artista y peso
    mi_mp4.borrar_cancion(artista="Amy Winehouse")
    
    # Nuevo cálculo de capacidad
    print(mi_mp4.mostrar_capacidad())
