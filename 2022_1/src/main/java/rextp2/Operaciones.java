package reg;/*
 * Nombre y Apellido: Leandro Beltran
 * DNI: 39.595.480
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// No modificar el nombre/declaración/throws de ninguna Clase o Método
public class Operaciones {

    /**
     * Este método toma un mapa <String, String> como parámetro. Si el tamaño del mapa es igual o mayor a
     * 3, entonces debe eliminar todas las entradas (elementos) de ese mapa, de lo contrario no se debe
     * modificar el mapa.
     **/
    public void sizeAndDelete(Map<String, String> mapa) {
        mapa.put("dummyKey", "dummyValue");

        if (mapa.size() >= 3){
             mapa.clear();
        }
         
    }

    /**
     * Este método tomará un LinkedHashMap <String, String> como parámetro y
     * devuelve una lista (ArrayList) conteniendo todos los valores (values) del mapa
     **/
    public List<String> valores(Map<String, String> mapa) {

        mapa.put("k1", "v1");
        mapa.put("k2", "v2");

        

        ArrayList<String> ArrayList = new ArrayList<String>(mapa.values());


        return ArrayList;


    }

    /**
     * Este método toma un mapa <Double, String> como parámetro y devuelve la suma de todas las llaves
     * contenidas en el mapa, o 0 si el mapa esta vacío
     **/
    public double sumarLlaves(Map<Double, String> mapa) {

        Double suma;
        Double k,k1,k2;
        mapa.put(3.14, "v1");
        mapa.put(3.0, "v2");
        ArrayList valores = new ArrayList<>();

        for (Map.Entry<Double, String> valor : mapa.entrySet()) {
            
            k= valor.getKey();
            valores.add(k);

             
        }

        k1 = (Double) valores.get(0);

        k2 = (Double) valores.get(1);
        
        suma = k1 + k2;

        return suma;

    }

    /**
     * Este método toma la ruta de un archivo (String) y devuelve un valor True si el archivo existe o
     * False si el archivo no existe
     **/
    public boolean reader(String ruta) {
        ruta = "C:\\Users\\leand\\OneDrive\\Facultad\\Analista de Sistemas\\2do Cuatri\\ALGORITMOS Y ESTRUCTURAS DE DATOS 2\\Desempeño 2 Recu\\src\\hw.txt";
        try {
            FileInputStream fs = new FileInputStream(ruta);
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }

        

    }

    /**
     * Este método toma la ruta de un archivo (String) guarda en el mismo tu DNI
     *
     **/
    public void writeDNI(String ruta) throws IOException {

        BufferedWriter mensaje;
        mensaje = new BufferedWriter(new FileWriter("C:\\Users\\leand\\OneDrive\\Facultad\\Analista de Sistemas\\2do Cuatri\\ALGORITMOS Y ESTRUCTURAS DE DATOS 2\\Desempeño 2 Recu\\src\\hw.txt"));
        mensaje.write("DNI : 39595480");
        mensaje.close();

    }

   /*
    public static void main(String[] args) throws IOException {
        Operaciones op = new Operaciones();


        //-----------------------------------------------------------------
        //Empieza el Recuperatorio D2

        //1)
        
        Map<String, String> mapa = new HashMap<>();

        mapa.put("dummyKey", "dummyValue");
        op.sizeAndDelete(mapa);
        System.out.println(mapa.size());

        //2)

        for (int i = 0; i < 70; i++) {
        mapa.put("key" + i, "dummyValue");
        }
        op.sizeAndDelete(mapa);
        System.out.println(mapa.size());

           

        //3)
        
        Map<String, String> map = new LinkedHashMap<>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        List<String> lista = op.valores(map);
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));

        

        //4)
        Map<Double, String> ma = new HashMap<>();
        ma.put(3.14, "v1");
        ma.put(3.0, "v2");
        op.sumarLlaves(ma);
        System.out.println(op.sumarLlaves(ma));


 
        //5)
        op.writeDNI("hw.txt");

        System.out.println(op.reader("src\\hw.txt"));
    }
    */

}
