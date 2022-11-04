package p1;

import java.util.List;

public class Operaciones {

    /**
     * Este método toma dos numeros (double) y devuelve el promedio
     * de ellos
     * **/
    public double promedio(double n1, double n2) {

double promedioo = (n1 + n2)/2;
return promedioo;
    }

    /**
     * Este método toma dos numeros enteros y determina si el segundo
     * (n2) es divisor del primero (n1), devuelve true si es asi y 
     * false de otra manera
     * **/
    public boolean esDivisor(int n1, int n2) {
        if (n1%n2==0)
        {
        	return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Este método toma un array de enteros como parámetro y devuelve
     * el mayor elemento de dicho array
     * **/
    public int buscarMayor(int[] arr) {
        
    	int arreglo=0;
    	for (int i = 0; i<5; i++)
    	{
    		
    		if (arr [i]>arreglo)
    		{
    			arreglo = arr [i];
    		}
    		
    		
    	}
		return arreglo;
    }

    /**
     * Este método toma una matriz de enteros como parámetro y devuelve
     * la suma de todos sus elementos
     * **/
    public int sumarElementos(int[][] arr) {
    
        int suma = 0;
        for (int i = 0; i<arr.length; i++)
        {
            suma += arr [i][0];

            for (int j = 1; j<arr.length; j++)
            {
                suma += arr [i][j];
            }
        }
        return suma;
    	
    }


    /**
     * Este método toma un ArrayList<Double> como parametro y devuelve el menor
     * de sus elementos
     * **/
    public double buscarMenor(List<Double> arr) {
        return 0.0;
    }

}
