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
        System.out.println(lista.size());
        System.out.println(lista.get(0));
        System.out.println(lista.get(50));
    }

    @Test
    public void leerArchivoTest1() {
        Decodificador deco = new Decodificador();
        List<String> lista = deco.leerArchivo("coded.txt");
        System.out.println(deco.decodificar(lista.get(99)));
    }

}
