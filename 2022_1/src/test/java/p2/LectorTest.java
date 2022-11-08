package p2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Locale;
import java.util.Map;

public class LectorTest {

    Lector l;

    @Before
    public void instantiateLector() {
        l = new Lector("input.txt");
    }

    @Test
    public void constructorTest() {
        Lector l = new Lector("input.txt");
    }

    @Test
    public void getRutaTest() {
        Lector l = new Lector("ruta.txt");
        Assert.assertEquals("ruta.txt", l.getRuta());
    }

    @Test
    public void setRutaTest() {
        Lector l = new Lector("ruta.txt");
        l.setRuta("ruta2.txt");
        Assert.assertEquals("ruta2.txt", l.getRuta());
    }

    @Test
    public void getDNITest1() {
        System.out.println("DNI Alumno: " + l.getDni());
        Assert.assertTrue(l.getDni() > 1000);
    }

    @Test
    public void setDNITest1() {
        Lector l = new Lector("dummy_ruta.txt");
        l.setDni(1357);
        Assert.assertEquals(1357, l.getDni());
    }

    @Test
    public void leerLineaTest0() {
        Lector l = new Lector("input.txt");
        Assert.assertEquals("07ef686bed0402265cabb4f13c16eb97", l.leerLinea(3));
    }

    @Test
    public void leerLineaTest1() {
        Lector l = new Lector("input.txt");
        Assert.assertEquals("fed9c791450c01ef7f91fbc93bfd693c", l.leerLinea(39));
    }

    @Test
    public void leerLineasTest0() {
        Lector l = new Lector("input.txt");
        Map<Integer, String> mapa = l.leerLineas(new int[]{0, 39, 149});
        Assert.assertEquals("24b42058ce6823b5173ef6fa7b9fa4cb", mapa.get(0));
        Assert.assertEquals("fed9c791450c01ef7f91fbc93bfd693c", mapa.get(39));
        Assert.assertEquals("81018c48fd41f6667b384698c006c5c4", mapa.get(149));
    }

    @Test
    public void leerLineasTest1() {
        Lector l = new Lector("input.txt");
        Map<Integer, String> mapa = l.leerLineas(new int[]{-999, 0, 999});
        Assert.assertEquals("error", mapa.get(-999));
        Assert.assertEquals("24b42058ce6823b5173ef6fa7b9fa4cb", mapa.get(0));
        Assert.assertEquals("error", mapa.get(999).toLowerCase(Locale.ROOT));
    }

    @Test
    public void leerLineasTest2() {
        Lector l = new Lector("input.txt");
        Map<Integer, String> mapa = l.leerLineas(new int[]{-1, 150});
        Assert.assertEquals("error", mapa.get(-1).toLowerCase(Locale.ROOT));
        Assert.assertEquals("error", mapa.get(150).toLowerCase(Locale.ROOT));
    }


    @Test
    public void leerLineasTest3() {
        Lector l = new Lector("input.txt");
        Map<Integer, String> mapa = l.leerLineas(new int[]{});
        Assert.assertEquals(0, mapa.size());
    }

    @Test
    public void leerLineasTest4() {
        Lector l = new Lector("input.txt");
        Map<Integer, String> mapa = l.leerLineas(new int[]{0, 2, 4, 6});
        Assert.assertEquals(4, mapa.size());
    }

    @Test
    public void leerLineaTest5() {
        Lector l = new Lector("input.txt");
        String s = l.leerLinea(999);
        Assert.assertEquals("error", s.toLowerCase(Locale.ROOT));
    }

    @Test
    public void leerLineaTest6() {
        Lector l = new Lector("input.txt");
        String s = l.leerLinea(-1);
        Assert.assertEquals("error", s.toLowerCase(Locale.ROOT));
    }

    @Test
    public void leerLineaTest7() {
        Lector l = new Lector("this_file_does_not_exists.txt");
        String s = l.leerLinea(0);
        Assert.assertEquals("error", s.toLowerCase(Locale.ROOT));
    }

    @Test
    public void leerLineaTest8() {
        Lector l = new Lector("this_file_does_not_exists.txt");
        String s = l.leerLinea(0);
        Assert.assertEquals("error", s);
    }

}
