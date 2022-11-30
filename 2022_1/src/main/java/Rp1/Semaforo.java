package Rp1;// *** Nazareno Nathanael Kapelinski, DNI 31911195*** //



	public class Semaforo {

		
		
	 /*       public static void main(String[] args) {
			Semaforo s = new Semaforo("verde");
			System.out.println(s.getColor());
			System.out.println(s.isIntermitente());
			s.setIntermitente(true);
			System.out.println(s.isIntermitente());
			s.setColor("amarillo");
			System.out.println(s.getColor());
			s.setColor("rojo");
			System.out.println(s.getColor());
			
			
		}     */
		                                       
	   
		private String color ;
		private boolean intermitente = false;

		
	    public Semaforo(String color ) {
	        this.color = color;
	        return;
	    }
 

	    public boolean isIntermitente() {
	        return intermitente;
	    }
	    public String getColor() {
	    	return color;
	    }

	    public void setIntermitente(boolean intermitente) {
	        this.intermitente = intermitente;
	    }
	    public void setColor(String color) {
	        this.color = color;
	    }
	}


	
	


