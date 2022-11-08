package Rp1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Operaciones {

    /**
     * Este método toma tres numeros (double) y devuelve el mayor
     * de ellos
     * **/
    public double mayor(double n1, double n2, double n3) {
        return Collections.max(Arrays.asList(n1, n2, n3));
    }

    /**
     * Este método toma dos numeros enteros y determina si el segundo
     * (n2) es divisor del primero (n1)
     * **/
    public boolean esDivisor(int n1, int n2) {
        return (n1 % n2 == 0);
    }

    /**
     * Este método toma un array de enteros como parámetro y devuelve
     * el menor elemento de dicho array
     * **/
    public int buscarMenor(int[] arr) {

        int min = arr[0];
        for (int n : arr) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

    /**
     * Este método toma una matriz de enteros como parámetro y devuelve
     * la suma de todos sus elementos
     * **/
    public int sumarElementos(int[][] arr) {

        int suma = 0;

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                suma += arr[i][j];
            }
        }

        return suma;
    }

    /**
     * Este método toma un ArrayList<Double> como parametro y devuelve el mayor
     * de sus elementos
     * **/
    public double buscarMayor(List<Double> arr) {
        return Collections.max(arr);
    }

}
