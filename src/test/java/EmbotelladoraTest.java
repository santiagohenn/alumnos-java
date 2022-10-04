import org.junit.Test;
import static org.junit.Assert.*;

public class EmbotelladoraTest {

    @Test
    public void EmbotelladoraTest1() {
        Embotelladora e = new Embotelladora();
        assertEquals(0, e.getAlcohol(), 1E-16);
        assertEquals(0, e.getGel(), 1E-16);
        e.cargarAlcohol(100);
        e.cargarGel(100);
        assertEquals(100, e.getAlcohol(), 1E-16);
        assertEquals(100, e.getGel(), 1E-16);
        e.embotellar();
        assertEquals(99.3, e.getAlcohol(), 1E-16);
        assertEquals(99.7, e.getGel(), 1E-16);
    }

    @Test
    public void EmbotelladoraTest2() {
        Embotelladora e = new Embotelladora();
        e.cargarAlcohol(10);
        e.cargarGel(10);
        for (int i = 0; i < 500; i++) {
            e.embotellar();
        }
        assertTrue(e.getError());

    }

    @Test
    public void EmbotelladoraTest3() {
        Embotelladora e = new Embotelladora();
        e.cargarAlcohol(10);
        e.cargarGel(10);
        for (int i = 0; i < 500; i++) {
            e.embotellar();
        }
        assertEquals(5.7999, e.getGel(), 1e-1);
        assertEquals(0.1999, e.getAlcohol(), 1e-1);

    }

}
