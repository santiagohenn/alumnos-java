package Rp2;

import org.junit.Test;

import java.util.List;

public class DisplayTest {

    public static void main(String[] args) {
        DisplayTest2();
    }

    @Test
    public static void DisplayTest0() {
        Display display = new Display(200, 300);
    }

    @Test
    public static void DisplayTest1() {
        Display display = new Display(200, 300);
        display.mostrar("Hola Mundo!");
    }

    @Test
    public static void DisplayTest2() {

    }

}
