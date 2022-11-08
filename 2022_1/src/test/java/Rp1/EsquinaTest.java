package Rp1;

import org.junit.Assert;
import org.junit.Test;

public class EsquinaTest {

    @Test
    public void constructorTest0() {
        try {
            Esquina es = new Esquina("verde", "rojo");
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void fnTest0() {
        Esquina es = new Esquina("verde", "rojo");
        Assert.assertEquals("verde", es.getS1().getColor());
        Assert.assertEquals("rojo", es.getS2().getColor());
    }

    @Test
    public void fnTest1() {
        Esquina es = new Esquina("verde", "rojo");
        Assert.assertFalse(es.getS1().isIntermitente());
        Assert.assertFalse(es.getS2().isIntermitente());
    }

    @Test
    public void fnTest2() {
        Esquina es = new Esquina("verde", "rojo");
        es.cambiar();
        Assert.assertEquals("amarillo", es.getS1().getColor());
        Assert.assertEquals("rojo", es.getS2().getColor());
    }

    @Test
    public void fnTest3() {
        Esquina es = new Esquina("verde", "rojo");
        es.cambiar();
        es.cambiar();
        Assert.assertEquals("rojo", es.getS1().getColor());
        Assert.assertEquals("verde", es.getS2().getColor());
    }

    @Test
    public void fnTest4() {
        Esquina es = new Esquina("rojo", "verde");
        es.cambiar();
        Assert.assertEquals("rojo", es.getS1().getColor());
        Assert.assertEquals("amarillo", es.getS2().getColor());
    }

    @Test
    public void fnTest5() {
        Esquina es = new Esquina("rojo", "verde");
        es.cambiar();
        es.cambiar();
        Assert.assertEquals("verde", es.getS1().getColor());
        Assert.assertEquals("rojo", es.getS2().getColor());
    }

    @Test
    public void fnTest6() {
        Esquina es = new Esquina("rojo", "verde");
        es.cambiar();
        es.cambiar();
        es.cambiar();
        es.cambiar();
        Assert.assertEquals("rojo", es.getS1().getColor());
        Assert.assertEquals("verde", es.getS2().getColor());
    }

    @Test
    public void fnTest7() {
        Esquina es = new Esquina("rojo", "verde");
        es.setError();
        Assert.assertEquals("amarillo", es.getS1().getColor());
        Assert.assertEquals("amarillo", es.getS2().getColor());
    }

    @Test
    public void fnTest8() {
        Esquina es = new Esquina("rojo", "verde");
        es.setError();
        Assert.assertTrue(es.getS1().isIntermitente());
        Assert.assertTrue(es.getS2().isIntermitente());
    }

    @Test
    public void fnTest9() {
        Esquina es = new Esquina("rojo", "verde");
        es.setError();
        Assert.assertEquals("amarillo", es.getS1().getColor());
        Assert.assertEquals("amarillo", es.getS2().getColor());
        Assert.assertTrue(es.getS1().isIntermitente());
        Assert.assertTrue(es.getS2().isIntermitente());
    }

    @Test
    public void fnTest10() {
        Esquina es = new Esquina("verde", "rojo");
        es.setError();
        es.cambiar();
        Assert.assertEquals("verde", es.getS1().getColor());
        Assert.assertEquals("rojo", es.getS2().getColor());
    }

}
