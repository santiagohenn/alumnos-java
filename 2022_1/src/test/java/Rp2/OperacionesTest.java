package Rp2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Rp2.Operaciones;
import p2.Lector;

import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class OperacionesTest {

    Operaciones op;

    @Before
    public void instanciateOperations() {
        op = new Rp2.Operaciones();
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

        for (int i = 0; i < 10; i++) {
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
        mapa.put(3.16, "d2");
        double res = op.sumarLlaves(mapa);
        Assert.assertEquals(6.30, res, 1E-15);

    }

    @Test
    public void sumarValoresTest1() {

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
        Assert.assertTrue(op.reader("input.txt"));
    }

    @Test
    public void readerTest1() {
        Assert.assertTrue(op.reader("bad_file.txt"));
    }

    @Test
    public void hwTest0() {
        File file = new File("hw.txt");
        try {
            boolean result = Files.deleteIfExists(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        op.writeDNI("hw.txt");
        Lector lec = new Lector("hw.txt");
        String hw = lec.leerLinea(0).replaceAll(" ","")
                .toLowerCase(Locale.ROOT);
        Assert.assertEquals("dni", hw);
    }

}
