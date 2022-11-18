package Rp2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Operaciones {

    /**
     * Este método toma un mapa <String, String> como parámetro. Si el tamaño del mapa es igual o mayor a
     * 3, entonces debe eliminar todas las entradas (elementos) de ese mapa, de lo contrario no se debe
     * modificar el mapa.
     **/
    public void sizeAndDelete(Map<String, String> mapa) {
        if (mapa.size() >= 3) {
            mapa.clear();
        }
    }

    /**
     * Este método tomará un LinkedHashMap <String, String> como parámetro y
     * devuelve una lista (ArrayList) conteniendo todos los valores (values) del mapa
     **/
    public List<String> valores(Map<String, String> mapa) {
        return new ArrayList<>(mapa.values());
    }

    /**
     * Este método toma un mapa <Double, String> como parámetro y devuelve la suma de todas las llaves
     * contenidas en el mapa, o 0 si el mapa esta vacío
     **/
    public double sumarLlaves(Map<Double, String> mapa) {
        double suma = 0;
        if (mapa.size() == 0) {
            return 0;
        }
        for (Double k : mapa.keySet()) {
            suma += k;
        }
        return suma;
    }

    /**
     * Este método toma la ruta de un archivo (String) y devuelve un valor True si el archivo existe o
     * False si el archivo no existe
     **/
    public boolean reader(String ruta) {
        FileReader fr = null;
        try {
            fr = new FileReader(ruta);
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }

    /**
     * Este método toma la ruta de un archivo (String) guarda en el mismo tu DNI
     **/
    public void writeDNI(String ruta) {
        try (FileWriter fw = new FileWriter(ruta)) {
            fw.write("dni");
        } catch (IOException exc) {
            System.out.println("No puede abrir el archivo.");
        }
    }

}
