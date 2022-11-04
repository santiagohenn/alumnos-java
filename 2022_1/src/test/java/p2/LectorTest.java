package p2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;
import java.util.Map;

public class LectorTest {

    @Test
    public void LectorTest0() {
        Lector l = new Lector("input.txt");
    }

    @Test
    public void LectorTest1() {
        Lector l = new Lector("");
        Assert.assertTrue(l.getDni() >= 0);
    }

    @Test
    public void LectorTest2() {
        Lector l = new Lector("input.txt");
        Assert.assertEquals("linea3", l.leerLinea(3));
    }

    @Test
    public void LectorTest3() {
        Lector l = new Lector("input.txt");
        Map<Integer, String> mapa = l.leerLineas(new int[]{0,2,4});
        Assert.assertEquals("linea0", mapa.get(0));
        Assert.assertEquals("linea2", mapa.get(2));
        Assert.assertEquals("linea4", mapa.get(4));
    }

    @Test
    public void LectorTest4() {
        Lector l = new Lector("input.txt");
        Map<Integer, String> mapa = l.leerLineas(new int[]{});
        Assert.assertEquals(0, mapa.size());
    }

    @Test
    public void LectorTest5() {
        Lector l = new Lector("input.txt");
        Map<Integer, String> mapa = l.leerLineas(new int[]{0,2,4,6});
        Assert.assertEquals(4, mapa.size());
    }

    @Test
    public void LectorTest6() {
        Lector l = new Lector("input.txt");
        String s = l.leerLinea(999);
        Assert.assertEquals("error", s.toLowerCase(Locale.ROOT));
    }

    @Test
    public void LectorTest7() {
        Lector l = new Lector("input.txt");
        String s = l.leerLinea(-1);
        Assert.assertEquals("error", s.toLowerCase(Locale.ROOT));
    }

    @Test
    public void LectorTest8() {
        Lector l = new Lector("this_file_does_not_exists.txt");
        String s = l.leerLinea(0);
        Assert.assertEquals("error", s.toLowerCase(Locale.ROOT));
    }

    @Test
    public void LectorTest9() {
        Lector l = new Lector("this_file_does_not_exists.txt");
        String s = l.leerLinea(0);
        Assert.assertEquals("error", s);
    }


}
