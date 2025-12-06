package ejercicio1;

import java.io.Serializable;

public class Charango implements Serializable {
    private String material;
    private int nroCuerdas;
    private boolean[] cuerdas;

    public Charango(String material, int nroCuerdas, boolean[] cuerdas) {
        this.material = material;
        this.nroCuerdas = nroCuerdas;
        this.cuerdas = cuerdas;
    }

    public String getMaterial() {
        return material;
    }

    public int getNroCuerdas() {
        return nroCuerdas;
    }

    public boolean[] getCuerdas() {
        return cuerdas;
    }

    public boolean tieneMasDe6CuerdasMalas() {
        int malas = 0;
        for (boolean estado : cuerdas) {
            if (!estado) malas++;
        }
        return malas > 6;
    }

    @Override
    public String toString() {
        return "Charango{" +
                "material='" + material + '\'' +
                ", nroCuerdas=" + nroCuerdas +
                '}';
    }
}
