
public class Embotelladora {
	
	private double alcohol, gel;
	private boolean error = false;
	Embotelladora ()
	{
		
	}
	
	public void cargarAlcohol (double cantidad1)
	{
		alcohol = cantidad1;
		System.out.println("El contenedor de alcohol tiene: " + alcohol);
	}
	public void cargarGel (double cantidad2)
	{
		gel = cantidad2;
		System.out.println("El contenedor de gel tiene: " + gel);
		
	}
public void embotellar ()
{
	double botella = 0.0;
	for (double i = 0.0; i<0.7; i = i + 0.1)
	{
		botella = botella + 0.1;
		alcohol = alcohol - 0.1;

	}
	for (double j = 0.0; j<0.3; j = j + 0.1)
	{
		botella = botella + 0.1;
		gel = gel - 0.1;
	}
	if (alcohol<0.07||gel<0.03)
	{
		error = true;
	}
}
public double getGel ()
{
	return gel;
}
public double getAlcohol ()
{
	return alcohol;
}
public boolean getError ()
{
	return error;
}
		
		
		
		
	
	
	public static void main (String []args)
	{
		Embotelladora e = new Embotelladora();
		System.out.println ("El contenedor de alcohol tiene: " + e.getAlcohol());
		System.out.println ("El contenedor de gel tiene: " + e.getGel());
		e.cargarAlcohol(100.0);
		e.cargarGel(100);
		e.embotellar();
		System.out.println("El contenedor de alcohol contiene: " + e.getAlcohol());
		System.out.println("El contenedor de gel contiene: " + e.getGel());
		
	
	}
	
	

}
