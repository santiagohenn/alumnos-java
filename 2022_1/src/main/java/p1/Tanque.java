package p1;

public class Tanque {
	private double nivel;
	private double capacidad;
	private boolean alarma;

	public Tanque(double cap) {

		nivel = 0;
		capacidad = cap;
		alarma = false;


	}

	public void cargar(double cantidad1) {
		for (int i = 0; i < 10; i++) {
			nivel = nivel + cantidad1;
			{
				if (nivel >= capacidad) {
					alarma = true;

				} else {
					alarma = false;
				}
			}


		}


	}


	public void vaciar(double cantidad2) {
		for (int i = 0; i < 10; i++) {

			nivel = nivel - cantidad2;
			if (nivel < capacidad)

				alarma = false;
		}

	}


	public double getNivel() {

		return nivel;
	}


	public boolean getAlarma() {

		return alarma;
	}
}
 