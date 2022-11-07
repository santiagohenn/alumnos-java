package p2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lector {

    private String ruta;
    private int dni = 1234567;

    public Lector(String ruta) {
        this.ruta = ruta;
    }

    public String leerLinea(int num) {

        List<String> lineas = new ArrayList<>();

        try {
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

        } catch (IOException e) {
            return "error";
        }

        return lineas.get(num);
    }

    public Map<Integer, String> leerLineas(int[] lineas) {

        Map<Integer, String> mapa = new HashMap<>();

        for (int i : lineas) {
            mapa.put(i, leerLinea(i));
        }

        return mapa;

    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

}
