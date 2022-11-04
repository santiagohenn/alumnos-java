package p2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Operaciones {

    /**
     * Este método toma una lista de listas de Strings y devuelve el primer elemento (index 0) de la primer
     * lista de las listas pasadas como parametros
     **/
    public String firstElement(List<List<String>> listaDeListas) {
        return listaDeListas.get(0).get(0);
    }

    /**
     * Este método toma una lista de listas de Strings y devuelve el tamaño de la SEGUNDA lista (index 1)
     * de las listas pasadas como parametro
     **/
    public int listSize(List<List<String>> listaDeListas) {
        return listaDeListas.get(1).size();
    }

    /**
     * Este método toma un mapa <String, String> como parámetro. Si el tamaño del mapa es igual o mayor a
     * 10, entonces debe eliminar todas las entradas (elementos) de ese mapa, de lo contrario no se debe
     * modificar el mapa.
     **/
    public void sizeAndDelete(Map<String, String> mapa) {
        if (mapa.size() >= 10) {
            mapa.clear();
        }
    }

    /**
     * Este método toma un mapa <Integer, String> como parámetro. Si el mapa no contiene TU DNI como llave,
     * entonces se debe agregar la entrada < TU DNI (Llave, Integer), Tu nombre (Valor, String) > Si el mapa
     * contiene tu DNI, entonces debes borrar esa entrada (llave, valor) del mapa.
     **/
    public void addAlumno(Map<Integer, String> mapa) {
        if (mapa.containsKey(123456789)) {
            mapa.remove(123456789);
        } else {
            mapa.put(123456789, "Alumno");
        }
    }


    /**
     * Este método toma un mapa <String, String> como parámetro y devuelve una lista (ArrayList) conteniendo
     * todas las llaves del mapa
     **/
    public List<String> llaves(Map<String, String> mapa) {
        return new ArrayList<>(mapa.keySet());
    }

    /**
     * Este método toma un mapa <String, Double> como parámetro y devuelve la suma de todos los valores
     * contenidos en el mapa, o 0 si el mapa esta vacío
     **/
    public double sumarValores(Map<String, Double> mapa) {
        double suma = 0;
        if (mapa.size() == 0) {
            return 0;
        }
        for (Double v : mapa.values()) {
            suma += v;
        }
        return suma;
    }

    /**
     * Este método toma la ruta de un archivo (String) y devuelve un objeto FileInputStream inicializado con
     * dicha ruta
     **/
    public FileInputStream inputStream(String ruta) throws FileNotFoundException {
        return new FileInputStream(ruta);
    }

    /**
     * Este método toma la ruta de un archivo (String) y devuelve un objeto FileWriter inicializado con
     * dicha ruta
     **/
    public FileWriter writer(String ruta) throws IOException {
        return new FileWriter(ruta);
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
     * Este método toma la ruta de un archivo (String) guarda en el mismo la frase "Hola Mundo!"
     **/
    public void writeHelloWorld(String ruta) {
        try (FileWriter fw = new FileWriter(ruta)) {
            fw.write("Hola Mundo!");
        } catch (IOException exc) {
            System.out.println("No puede abrir el archivo.");
        }
    }

}
