package Rp2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Decodificador {

    private int dni = 12345678;

    public static void main(String[] args) {

        List<String> decodificadas = leerArchivo("C:/Projects/alumnos-java/2022_1/coded.txt");
        String s = decodificar(decodificadas.get(0));
        System.out.println(s);
        Display d = new Display(800, 100);
        d.mostrar(s);

    }

    public int getDni() {
        return dni;
    }

    public static String decodificar(String codificada) {

        char[] chars = codificada.toCharArray();

        for (int i = 0 ; i < chars.length ; i++) {
            chars[i] = (char) (chars[i] - 2);
        }

        return new String(chars);

    }

    public static List<String> leerArchivo(String ruta) {

        List<String> lines = new ArrayList<>();

        try {
            FileReader fr = new FileReader(ruta);
            BufferedReader br = new BufferedReader(fr);
            String s;

            while ((s = br.readLine()) != null) {
                lines.add(s);
            }
            fr.close();

        } catch (IOException e) {
            lines.add("error");
            e.printStackTrace();
        }

        return lines;

    }

}
