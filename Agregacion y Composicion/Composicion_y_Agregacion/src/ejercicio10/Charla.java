	package ejercicio10;

public class Charla {
    private String lugar;
    private String nombreCharla;
    private int nroCharla;
    private Participante[] P = new Participante[50];
    private int nroParticipantes = 0;
    private Speaker speaker;

    public Charla(String lugar, String nombreCharla, int nroCharla, Speaker speaker) {
        this.lugar = lugar;
        this.nombreCharla = nombreCharla;
        this.nroCharla = nroCharla;
        this.speaker = speaker;
    }

    public void agregarParticipante(Participante p) {
        if (nroParticipantes < 50) {
            P[nroParticipantes++] = p;
        }
    }

    public int getCantidadParticipantes() {
        return nroParticipantes;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void mostrarDatos() {
        System.out.println("Charla: " + nombreCharla + ", Lugar: " + lugar + ", Nro: " + nroCharla);
        if (speaker != null) {
            System.out.print("Speaker: ");
            speaker.mostrarDatos();
        }
        System.out.println("Participantes:");
        for (int i = 0; i < nroParticipantes; i++) {
            P[i].mostrarDatos();
        }
    }
}

