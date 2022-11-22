package Rp2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Decodificador {

    private int dni = 12345678;

    public Decodificador() {

    }

    public int getDni() {
        return dni;
    }

    public String decodificar(String codificada) {

        char[] chars = codificada.toCharArray();

        for (int i = 0 ; i < chars.length ; i++) {
            chars[i] = (char) (chars[i] - 2);
        }

        return new String(chars);

    }

    public List<String> leerArchivo(String ruta) {

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
        }

        return lines;

    }

}
