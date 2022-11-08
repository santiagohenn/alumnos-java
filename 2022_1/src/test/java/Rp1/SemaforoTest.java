package Rp1;

import org.junit.Assert;
import org.junit.Test;

public class SemaforoTest {

    @Test
    public void constructorTest0() {
        try {
            Semaforo s = new Semaforo("rojo");
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void constructorTest1() {
        Semaforo s = new Semaforo("rojo");
        Assert.assertEquals("rojo", s.getColor());
    }

    @Test
    public void colorTest0() {
        Semaforo s = new Semaforo("rojo");
        Assert.assertEquals("rojo", s.getColor());
        s.setColor("amarillo");
        Assert.assertEquals("amarillo", s.getColor());
        s.setColor("verde");
        Assert.assertEquals("verde", s.getColor());
    }

    @Test
    public void intermitenteTest0() {
        Semaforo s = new Semaforo("rojo");
        Assert.assertFalse(s.isIntermitente());
    }

    @Test
    public void intermitenteTest1() {
        Semaforo s = new Semaforo("amarillo");
        s.setIntermitente(true);
        Assert.assertTrue(s.isIntermitente());
    }



}
