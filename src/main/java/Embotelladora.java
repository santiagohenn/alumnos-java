public class Embotelladora {

    private Tanque alcohol = new Tanque(100);
    private Tanque gel = new Tanque(100);
    private boolean error = false;

    public Embotelladora() {

    }

    public void cargarAlcohol(double cantidad) {
        alcohol.cargar(cantidad);
    }

    public void cargarGel(double cantidad) {
        gel.cargar(cantidad);
    }

    public void embotellar() {
        if (alcohol.getNivel() < 0.7 || gel.getNivel() < 0.3) {
            error = true;
        } else {
            alcohol.vaciar(0.7);
            gel.vaciar(0.3);
        }
    }

    public boolean getError() {
        return error;
    }

    public double getAlcohol() {
        return alcohol.getNivel();
    }

    public double getGel() {
        return gel.getNivel();
    }
}
