package reg;

import Rp2.Decodificador;
import Rp2.Operaciones;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class OperacionesTest {

    Operaciones op;

    @Before
    public void instanciateOperations() {
        op = new Operaciones();
    }

    @Test
    public void sizeAndDeleteTest0() {

        Map<String, String> mapa = new HashMap<>();
        mapa.put("dummyKey", "dummyValue");
        op.sizeAndDelete(mapa);
        Assert.assertEquals(1, mapa.size());

    }

    @Test
    public void sizeAndDeleteTest1() {

        Map<String, String> mapa = new HashMap<>();

        for (int i = 0; i < 2; i++) {
            mapa.put("key" + i, "dummyValue");
        }

        op.sizeAndDelete(mapa);
        Assert.assertEquals(2, mapa.size());

    }

    @Test
    public void sizeAndDeleteTest2() {

        Map<String, String> mapa = new HashMap<>();

        for (int i = 0; i < 4; i++) {
            mapa.put("key" + i, "dummyValue");
        }

        op.sizeAndDelete(mapa);
        Assert.assertEquals(0, mapa.size());

    }

    @Test
    public void sizeAndDeleteTest3() {

        Map<String, String> mapa = new HashMap<>();

        for (int i = 0; i < 50; i++) {
            mapa.put("key" + i, "dummyValue");
        }

        op.sizeAndDelete(mapa);
        Assert.assertEquals(0, mapa.size());

    }

    @Test
    public void valoresTest0() {

        Map<String, String> mapa = new HashMap<>();
        mapa.put("d1", "");
        mapa.put("d2", "");
        mapa.put("d3", "");
        List<String> lista = op.valores(mapa);
        Assert.assertEquals(3, lista.size());

    }

    @Test
    public void valoresTest1() {

        Map<String, String> mapa = new LinkedHashMap<>();
        mapa.put("d1", "d1");
        mapa.put("d2", "d2");
        mapa.put("d3", "d3");
        List<String> lista = op.valores(mapa);
        Assert.assertEquals("d1", lista.get(0));
        Assert.assertEquals("d2", lista.get(1));
        Assert.assertEquals("d3", lista.get(2));

    }

    @Test
    public void sumarLlavesTest0() {

        Map<Double, String> mapa = new HashMap<>();
        mapa.put(3.14, "d1");
        mapa.put(3.17, "d2");
        double res = op.sumarLlaves(mapa);
        Assert.assertEquals(6.31, res, 1E-15);

    }

    @Test
    public void sumarLlavesTest1() {

        Map<Double, String> mapa = new HashMap<>();
        mapa.put(1000D, "d1");
        mapa.put(1001D, "d2");
        mapa.put(1002D, "d3");
        double res = op.sumarLlaves(mapa);
        Assert.assertEquals(3003, res, 1E-16);

    }

    @Test
    public void sumarLlavesTest3() {
        Map<Double, String> mapa = new HashMap<>();
        double res = op.sumarLlaves(mapa);
        Assert.assertEquals(0, res, 1E-16);
    }

    @Test
    public void readerTest0() {
        try {
            Assert.assertFalse(op.reader("bad_file.txt"));
            FileReader fr = new FileReader("hw.txt");
        } catch (FileNotFoundException fnf) {
            Assert.fail();
        }
    }

    @Test
    public void readerTest1() {
        try {
            Assert.assertFalse(op.reader("coded.txt"));
            FileReader fr = new FileReader("hw.txt");
        } catch (FileNotFoundException fnf) {
            Assert.fail();
        }
    }

    @Test
    public void writeDNITest() {

        String ruta = "hw.txt";

        // Clear the file
        try {
            FileWriter fr = new FileWriter(ruta);
            fr.write("");
            fr.close();
        } catch (IOException e) {
            Assert.fail();
        }

        // Assert if the Exception is handled in the method
        try {
            op.writeDNI("Z:/unable_to_reach_this");
        } catch (IOException ioe) {
            Assert.fail();
            System.out.println("Modifica la clausula del método");
        }

        // Write the file
        try {
            op.writeDNI("hw.txt");
        } catch (IOException ioe) {
            Assert.fail();
        }

        // Read the file contents
        try {
            FileReader fr = new FileReader(ruta);
            BufferedReader br = new BufferedReader(fr);
            String red = br.readLine();
            fr.close();
            Assert.assertNotEquals("dni", red);
            Assert.assertNotEquals("", red);
            Assert.assertTrue(red.length() > 3);
        } catch (IOException e) {
            Assert.fail();
        } catch (Exception e) {
            System.out.println("Unspecified error.");
            Assert.fail();
        }

    }

    @Test
    public void writeDNITest2() {

        String ruta = "C:\\Projects\\alumnos-java\\2022_1\\hw.txt";

        // Clear the file
        try {
            FileWriter fr = new FileWriter(ruta);
            fr.write("");
            fr.close();
        } catch (IOException e) {
            Assert.fail();
        }

        // Assert if the Exception is handled in the method
        try {
            op.writeDNI("Z:/unable_to_reach_this");
        } catch (IOException ioe) {
            System.out.println("Modifica la clausula del método");
        }

        // Write the file
        try {
            op.writeDNI(ruta);
        } catch (IOException ioe) {
            System.out.println("No se encuentra el archivo");
            Assert.fail();
        }

        // Read the file contents
        try {
            FileReader fr = new FileReader(ruta);
            BufferedReader br = new BufferedReader(fr);
            String red = br.readLine();
            fr.close(); br.close();
            Decodificador deco = new Decodificador();
            Assert.assertTrue(red.contains(String.valueOf(deco.getDni())));
            System.out.println("No coincide el output esperado");
        } catch (IOException e) {
            Assert.fail();
        } catch (Exception e) {
            System.out.println("Unspecified error.");
            Assert.fail();
        }

    }

}
