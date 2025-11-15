package ejercicio10;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Crear participantes
        Participante p1 = new Participante("Ana", "Lopez", 25, 123456, 1);
        Participante p2 = new Participante("Luis", "Gomez", 30, 234567, 2);
        Participante p3 = new Participante("Marta", "Perez", 22, 345678, 3);

        // Crear speakers
        Speaker s1 = new Speaker("Carlos", "Torres", 40, 111111, "IA");
        Speaker s2 = new Speaker("Julia", "Mendez", 35, 222222, "Ciberseguridad");

        // Crear charlas
        Charla charla1 = new Charla("Auditorio A", "Introducción a IA", 101, s1);
        charla1.agregarParticipante(p1);
        charla1.agregarParticipante(p2);

        Charla charla2 = new Charla("Sala B", "Seguridad en la nube", 102, s2);
        charla2.agregarParticipante(p3);

        // Crear evento
        Evento evento = new Evento(1);
        evento.agregarCharla(charla1);
        evento.agregarCharla(charla2);

        // Mostrar datos del evento
        System.out.println("=== Evento Original ===");
        evento.mostrarDatos();

        // Ordenar charlas por número de participantes (inciso d)
        Charla[] charlas = Arrays.copyOf(evento.getCharlas(), evento.getNroCharlas());
        Arrays.sort(charlas, Comparator.comparingInt(Charla::getCantidadParticipantes).reversed());

        System.out.println("\n=== Charlas Ordenadas por Cantidad de Participantes ===");
        for (Charla charla : charlas) {
            charla.mostrarDatos();
            System.out.println("Cantidad de Participantes: " + charla.getCantidadParticipantes());
            System.out.println("-------------------------");
        }
    }
}

