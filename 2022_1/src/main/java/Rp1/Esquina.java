package Rp1;

public class Esquina {

    private Semaforo s1;
    private Semaforo s2;

    public Esquina(String color1, String color2) {
        s1 = new Semaforo(color1);
        s2 = new Semaforo(color2);
    }

    public void cambiar() {

        if (s1.getColor().equals("rojo")) {
            if (s2.getColor().equals("verde")) {
                s2.setColor("amarillo");
            } else {
                s2.setColor("rojo");
                s1.setColor("verde");
            }
        } else if (s2.getColor().equals("rojo")) {
            if (s1.getColor().equals("verde")) {
                s1.setColor("amarillo");
            } else {
                s1.setColor("rojo");
                s2.setColor("verde");
            }
        }

        if (s1.isIntermitente() || s2.isIntermitente()) {
            s1.setIntermitente(false);
            s2.setIntermitente(false);
            s1.setColor("verde");
            s2.setColor("rojo");
        }

    }

    public Semaforo getS1() {
        return s1;
    }

    public Semaforo getS2() {
        return s2;
    }

    public void setError() {
        s1.setColor("amarillo");
        s2.setColor("amarillo");
        this.s1.setIntermitente(true);
        this.s2.setIntermitente(true);
    }

}
