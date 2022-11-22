package Rp2;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DecodificadorTest {

    @Test
    public void constructorTest() {
        Decodificador deco = new Decodificador();
    }

    @Test
    public void getDNITest() {
        Decodificador deco = new Decodificador();
        Assert.assertNotNull(deco.getDni());
        System.out.println("DNI: " + deco.getDni());
    }

    @Test
    public void leerArchivoTest0() {
        Decodificador deco = new Decodificador();
        List<String> lista = deco.leerArchivo("coded.txt");
    }

    @Test
    public void leerArchivoTest1() {
        Decodificador deco = new Decodificador();
        List<String> lista = deco.leerArchivo("coded.txt");
        Assert.assertEquals(100, lista.size());
    }

    @Test
    public void leerArchivoTest2() {
        Decodificador deco = new Decodificador();
        List<String> lista = deco.leerArchivo("coded.txt");
        Assert.assertEquals("2aVjg\"itqwr\"swkemn{\"wpfgtuvqqf\"vjcv\"vqzke\"ycuvg\"ycu\"vjg\"oquv\"ghhgevkxg\"dcttkgt\"vq\"wug\"cickpuv\"vjg\"|qodkgu0", lista.get(0));
    }

    @Test
    public void leerArchivoTest3() {
        Decodificador deco = new Decodificador();
        List<String> lista = deco.leerArchivo("coded.txt");
        Assert.assertEquals("72aCu\"jg\"yckvgf\"hqt\"vjg\"ujqygt\"vq\"ycto.\"jg\"pqvkegf\"vjcv\"jg\"eqwnf\"jgct\"ycvgt\"ejcpig\"vgorgtcvwtg0", lista.get(50));
    }

    @Test
    public void leerArchivoTest4() {
        Decodificador deco = new Decodificador();
        List<String> lista = deco.leerArchivo("coded.txt");
        String decoded = deco.decodificar(lista.get(60));
        Assert.assertEquals("60_He would only survive if he kept the fire going and he could hear thunder in the distance.", decoded);
    }

    @Test
    public void leerArchivoTest5() {
        Decodificador deco = new Decodificador();
        List<String> lista = deco.leerArchivo("bad_file.txt");
        Assert.assertNotNull(lista.get(0));
    }

    @Test
    public void leerArchivoTest6() {
        Decodificador deco = new Decodificador();
        List<String> lista = deco.leerArchivo("bad_file.txt");
        Assert.assertEquals("error", lista.get(0));
    }

    @Test
    public void leerArchivoConDNItest0() {
        Decodificador deco = new Decodificador();
        Assert.assertNotNull(deco.getDni());
        List<String> lista = deco.leerArchivo("coded.txt");
        int dni = Integer.parseInt(String.valueOf(deco.getDni()).substring(6,8));
        String actual = deco.decodificar(lista.get(dni));
        System.out.println("Expected: ");
        System.out.println(deco.decodificar(lista.get(dni)));
        Assert.assertEquals("78_He ran out of money, so he had to stop playing poker.",actual);
    }

}
