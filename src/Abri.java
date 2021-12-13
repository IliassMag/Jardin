public class Abri {

    private int abriX;
    private int abriY;
    private String nom;

    public Abri(){};

    public Abri(int abriX, int abriY, String nom) {
        this.abriX = abriX;
        this.abriY = abriY;
        this.nom = nom;
    }

    public int getAbriX() {
        return abriX;
    }

    public void setAbriX(int abriX) {
        this.abriX = abriX;
    }

    public int getAbriY() {
        return abriY;
    }

    public void setAbriY(int abriY) {
        this.abriY = abriY;
    }
}
