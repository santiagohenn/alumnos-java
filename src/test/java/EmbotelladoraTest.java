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

}
