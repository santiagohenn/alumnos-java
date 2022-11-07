package p2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.util.*;

public class OperacionesTest {

    Operaciones op;

    @Before
    public void instanciateOperations() {
        op = new Operaciones();
    }

    @Test
    public void firstElementTest0() {
        Operaciones op = new Operaciones();
        List<List<String>> listas = new ArrayList<>();
        List<String> lista = Arrays.asList("first", "second", "third");
        listas.add(lista);
        Assert.assertEquals("first", op.firstElement(listas));
    }

    @Test
    public void firstElementTest1() {

        Operaciones op = new Operaciones();
        List<List<String>> listas = new ArrayList<>();
        List<String> lista = new ArrayList<>();
        listas.add(lista);

        try {
            op.firstElement(listas);
            Assert.fail();
        } catch (IndexOutOfBoundsException e) {
            Assert.assertTrue(true);
        }

    }

    @Test
    public void listSizeTest0() {

        Operaciones op = new Operaciones();
        List<List<String>> listas = new ArrayList<>();
        listas.add(Arrays.asList("rojo", "amarillo"));
        listas.add(Arrays.asList("red", "yellow", "blue"));
        listas.add(Arrays.asList("rosso", "giallo"));
        Assert.assertEquals(3, op.listSize(listas));

    }

    @Test
    public void listSizeTest1() {

        Operaciones op = new Operaciones();
        List<List<String>> listas = new ArrayList<>();
        listas.add(Arrays.asList());
        listas.add(Arrays.asList());
        Assert.assertEquals(0, op.listSize(listas));

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

        for (int i = 0; i < 9; i++) {
            mapa.put("key" + i, "dummyValue");
        }

        op.sizeAndDelete(mapa);
        Assert.assertEquals(9, mapa.size());

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
    public void addAlumnoTest0() {

        Map<Integer, String> mapa = new HashMap<>();
        op.addAlumno(mapa);
        Assert.assertTrue(mapa.containsKey(123456789));
        Assert.assertEquals(1, mapa.size());

    }

    @Test
    public void addAlumnoTest1() {

        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(123456789, "Alumno");
        op.addAlumno(mapa);
        Assert.assertFalse(mapa.containsKey(123456789));
        Assert.assertEquals(0, mapa.size());

    }

    @Test
    public void llavesTest0() {

        Map<String, String> mapa = new HashMap<>();
        mapa.put("d1", "");
        mapa.put("d2", "");
        mapa.put("d3", "");
        List<String> lista = op.llaves(mapa);
        Assert.assertEquals(3, lista.size());

    }

    @Test
    public void llavesTest1() {

        Map<String, String> mapa = new LinkedHashMap<>();
        mapa.put("d1", "");
        mapa.put("d2", "");
        mapa.put("d3", "");
        List<String> lista = op.llaves(mapa);
        Assert.assertEquals("d1", lista.get(0));
        Assert.assertEquals("d2", lista.get(1));
        Assert.assertEquals("d3", lista.get(2));

    }

    @Test
    public void sumarValoresTest0() {

        Map<String, Double> mapa = new HashMap<>();
        mapa.put("d1", 3.14);
        mapa.put("d2", 3.14);
        double res = op.sumarValores(mapa);
        Assert.assertEquals(6.28, res, 1E-16);

    }

    @Test
    public void sumarValoresTest1() {

        Map<String, Double> mapa = new HashMap<>();
        mapa.put("d1", 1000D);
        mapa.put("d2", 1000D);
        mapa.put("d3", 999D);
        double res = op.sumarValores(mapa);
        Assert.assertEquals(2999, res, 1E-16);

    }

    @Test
    public void sumarValoresTest3() {

        Map<String, Double> mapa = new HashMap<>();
        double res = op.sumarValores(mapa);
        Assert.assertEquals(0, res, 1E-16);

    }

    @Test
    public void inputStreamTest0() {

        try {
            Assert.assertEquals(FileInputStream.class, op.inputStream("input.txt").getClass());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void inputStreamTest1() {

        try {
            FileInputStream fis = op.inputStream("bad_file.txt");
        } catch (FileNotFoundException e) {
            Assert.assertTrue(true);
        }

    }

    @Test
    public void writerTest0() {
        try {
            FileWriter fis = op.writer("input.txt");
        } catch (IOException e) {
            Assert.fail();
        }
    }

    @Test
    public void writerTest1() {
        try {
            FileWriter fis = op.writer("bad_file.txt");
        } catch (IOException e) {
            Assert.assertTrue(true);
        }
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
        op.writeHelloWorld("hw.txt");
        Lector lec = new Lector("hw.txt");
        String hw = lec.leerLinea(0);
        System.out.println(hw);
    }

    @Test
    public void hwTest1() {
        Assert.assertTrue(op.reader("bad_file.txt"));
    }


}
