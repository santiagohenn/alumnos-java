package Rp1;

public class Semaforo {

    private String color;
    private boolean intermitente = false;

    public Semaforo(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isIntermitente() {
        return intermitente;
    }

    public void setIntermitente(boolean intermitente) {
        this.intermitente = intermitente;
    }
}
