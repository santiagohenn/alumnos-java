package Rp1;// *** Nazareno Nathanael Kapelinski, DNI 31911195*** //



public class Esquina {

   private Semaforo s1;
   private Semaforo s2;

    public Esquina(String color1, String color2) {
      this.s1 = new Semaforo(color1);
      this.s2 = new Semaforo(color2);
    }
    
  /* public static void main(String[] args) {
    	Esquina e = new Esquina("verde", "rojo");
    	System.out.println(e.getS1().getColor());
    	System.out.println(e.getS2().getColor());
    	System.out.println(e.getS1().isIntermitente());
    	System.out.println(e.getS2().isIntermitente());
    	e.cambiar();
    	System.out.println(e.getS1().getColor());
    	System.out.println(e.getS2().getColor());
    	e.cambiar();
    	System.out.println(e.getS1().getColor());
    	System.out.println(e.getS2().getColor());
    	e.cambiar();
    	System.out.println(e.getS1().getColor());
    	System.out.println(e.getS2().getColor());
    	e.cambiar();
    	System.out.println(e.getS1().getColor());
    	System.out.println(e.getS2().getColor());
    	e.cambiar();
    	e.cambiar();
    	e.cambiar();
    	e.cambiar();
    	System.out.println(e.getS1().getColor());
    	System.out.println(e.getS2().getColor());
    	e.setError();
    	System.out.println(e.getS1().getColor());
    	System.out.println(e.getS2().getColor());
    	System.out.println(e.getS1().isIntermitente());
        System.out.println(e.getS2().isIntermitente());
        e.cambiar();
        System.out.println(e.getS1().getColor());
        System.out.println(e.getS2().getColor());
        System.out.println(e.getS1().isIntermitente());
        System.out.println(e.getS2().isIntermitente());
    
    }*/

    public Semaforo getS1() {
        return s1;
    }

    public Semaforo getS2() {
    	return s2;
    }

    public void cambiar() {
       if (s1.getColor() == "verde" && s2.getColor() == "rojo") {
    	   s1.setColor("amarillo");
    	   s2.setColor("rojo");
    	   return;
       } if (s1.getColor() == "amarillo" && s2.getColor() == "rojo" ) {
    	   s1.setColor("rojo");
    	   s2.setColor("verde");
    	   return;
       }if (s1.getColor() == "rojo" && s2.getColor() == "verde" ) {
    	   s1.setColor("rojo");
    	   s2.setColor("amarillo");
    	   return;
       }if (s1.getColor() == "rojo" && s2.getColor() == "amarillo" ) {
    	   s1.setColor("verde");
    	   s2.setColor("rojo");
    	   return;
       } if ( (s1.getColor() == "amarillo" && s2.getColor() == "amarillo" ) ) {
    	   s1.setColor("verde");
    	   s2.setColor("rojo");
    	   s1.setIntermitente(false);
    	   s2.setIntermitente(false);
    	   return;
    	   }
      
    }

    public void setError() {
    	s1.setIntermitente(true);
    	s2.setIntermitente(true);
    	s1.setColor("amarillo");
    	s2.setColor("amarillo");

    }

}
