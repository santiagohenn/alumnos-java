package p2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lector {

    private String ruta;

    public Lector(String ruta) {
        System.out.println("DNI");
        this.ruta = ruta;
    }

    public String leerLinea(int num) throws IOException {

        List<String> lineas = new ArrayList<>();
        FileReader fr = new FileReader(ruta);
        BufferedReader br = new BufferedReader(fr);
        String s;

        while ((s = br.readLine()) != null) {
            lineas.add(s);
        }
        fr.close();

        if (num < 0 || num > lineas.size()) {
            return "error";
        }

        return lineas.get(num);
    }

}
