public class Tanque {

    private double capacidad;
    private double nivel = 0;
    private boolean alarma = false;

    public Tanque(double capacidad) {
        this.capacidad = capacidad;
    }

    public void cargar(double cantidad) {
        nivel += cantidad;
        if (nivel > capacidad) {
            alarma = true;
        }
    }

    public void vaciar(double cantidad) {
        nivel -= cantidad;
        if (nivel < capacidad) {
            alarma = false;
        }
    }

    public double getNivel() {
        return this.nivel;
    }

    public boolean getAlarma() {
        return alarma;
    }

}
