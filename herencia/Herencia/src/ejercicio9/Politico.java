package ejercicio9;

public class Politico {
    private String profesion;
    private int añosExp;
    
    public Politico(String profesión, int añosExp) {
        this.profesion = profesión;
        this.añosExp = añosExp;
    }
    
    public String getProfesion() { 
        return this.profesion;
    }
    
    public int getAñosExp() {
        return añosExp;
    }
}
