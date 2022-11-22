package Rp2;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DisplayTest {

    @Test
    public void DisplayTestGeneral0() {
        Display display = new Display(202, 303);
        Assert.assertEquals(display.jf.getWidth(), 202);
        Assert.assertEquals(display.jf.getHeight(), 303);
    }

    @Test
    public void DisplayTestGeneral1() {
        Display display = new Display(202, 303);
        display.mostrar("test999");
        Assert.assertEquals(display.text.getText(), "test999");
    }

    @Test
    public void DisplayTest0() {
        Display display = new Display(200, 300);
    }

    @Test
    public void DisplayTest1() {
        Display display = new Display(200, 300);
        display.mostrar("Hola Mundo!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void DisplayMainTest() {
        Display.main(new String[]{});
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void DisplayTest2() {
        Display display = new Display(600, 100);
        Decodificador deco = new Decodificador();
        List<String> lista = deco.leerArchivo("C:\\Projects\\alumnos-java\\2022_1\\coded.txt");
        String decoded = deco.decodificar(lista.get(55));
        display.mostrar(decoded);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
