package p1;

import org.junit.Test;
import p1.Embotelladora;

import static org.junit.Assert.*;

public class EmbotelladoraTest {

    /**
     * Acciones:
     * Instanciar una nueva embotelladora y verificar que los niveles iniciales
     * de los tanques estan en 0
     * */
    @Test
    public void EmbotelladoraTest0() {
        Embotelladora e = new Embotelladora();
        assertEquals(0, e.getAlcohol(), 1E-16);
        assertEquals(0, e.getGel(), 1E-16);
    }

    /**
     * Acciones:
     * Cargar 100 litros de alcohol y gel > embotellar
     * Los niveles medidos no corresponden con lo esperados
     * */
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

    /** Intentar llenar 500 botellas con tanques de 10 litros
     * no resulta en un estado de error
     */
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
    /** Intentar embotellar 500 botellas con tanques con 10 litros c/u
     * resulta en niveles inesperados en los tanques
     */
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

    /** Intentar llenar 10 botellas con tanques con 10 litros c/u
     * resulta en niveles inesperados en los tanques
     */
    @Test
    public void EmbotelladoraTest4() {
        Embotelladora e = new Embotelladora();
        e.cargarAlcohol(10);
        e.cargarGel(10);
        for (int i = 0; i < 10; i++) {
            e.embotellar();
        }
        assertEquals(6.999, e.getGel(), 1e-1);
        assertEquals(3.0, e.getAlcohol(), 1e-1);
    }

}
