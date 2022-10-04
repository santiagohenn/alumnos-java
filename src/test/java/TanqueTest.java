import org.junit.Test;

import static org.junit.Assert.*;

public class TanqueTest {

    @Test
    public void TanqueTest1() {
        Tanque t = new Tanque(100);
    }

    @Test
    public void TanqueTest2() {
        Tanque t = new Tanque(100);
        t.cargar(50);
        assertEquals(50, t.getNivel(), 1e-16);
    }

    @Test
    public void TanqueTest3() {
        Tanque t = new Tanque(100);
        t.cargar(50);
        t.vaciar(20);
        assertEquals(30, t.getNivel(), 1e-16);
    }

    @Test
    public void TanqueTest4() {
        Tanque t = new Tanque(100);
        t.cargar(50);
        assertFalse(t.getAlarma());
    }

    @Test
    public void TanqueTest5() {
        Tanque t = new Tanque(100);
        t.cargar(500);
        assertTrue(t.getAlarma());
    }

    @Test
    public void TanqueTest6() {
        Tanque t = new Tanque(100);
        t.cargar(500);
        assertTrue(t.getAlarma());
        t.vaciar(500);
        assertFalse(t.getAlarma());
    }

}
