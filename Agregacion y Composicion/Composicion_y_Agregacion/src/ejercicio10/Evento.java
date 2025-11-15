package ejercicio10;

public class Evento {
    private int nroC;
    private Charla[] C = new Charla[50];
    private int nroCharlas = 0;

    public Evento(int nroC) {
        this.nroC = nroC;
    }

    public void agregarCharla(Charla charla) {
        if (nroCharlas < 50) {
            C[nroCharlas++] = charla;
        }
    }

    public Charla[] getCharlas() {
        return C;
    }

    public int getNroCharlas() {
        return nroCharlas;
    }

    public void mostrarDatos() {
        System.out.println("Evento Nro: " + nroC);
        for (int i = 0; i < nroCharlas; i++) {
            C[i].mostrarDatos();
        }
    }
}

