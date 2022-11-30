package rextp2;

import org.junit.Assert;
import org.junit.Test;

public class DisplayTest {

    @Test
    public void DisplayTestGeneral0() {
        rextp2.Display display = new rextp2.Display(202, 303);
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


}


