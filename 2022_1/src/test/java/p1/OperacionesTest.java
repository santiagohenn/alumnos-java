package p1;

import org.junit.Test;
import p1.Operaciones;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OperacionesTest {

    @Test
    public void OperacionesTest1() {
        Operaciones op = new Operaciones();
        assertEquals(15, op.promedio(10, 20), 1E-16);
        assertEquals(0, op.promedio(-10, 10), 1E-16);
        assertEquals(0, op.promedio(0, 0), 1E-16);
        assertEquals(0.5, op.promedio(0, 1), 1E-16);
    }

    @Test
    public void OperacionesTest2() {
        Operaciones op = new Operaciones();
        assertTrue(op.esDivisor(10, 2));
        assertTrue(op.esDivisor(10, 1));
        assertFalse(op.esDivisor(10, 3));
        assertFalse(op.esDivisor(15, 2));
        assertTrue(op.esDivisor(4444, 4));
    }

    @Test
    public void OperacionesTest3() {
        Operaciones op = new Operaciones();
        assertEquals(999, op.buscarMayor(new int[]{12, 23, -999, 999}));
        assertEquals(3, op.buscarMayor(new int[]{1, 2, 3}));
    }

    /**
     * Fallos en los resultados esperados al sumar elementos de arrays multidimensionales
     * matriz: int[][] mat = new int[][]{{1, 2, 3}, {0, 0, 0}, {1, 2, 3}};
     * Expected :12
     * Obtained   :3
     * */
    @Test
    public void OperacionesTest4() {
        Operaciones op = new Operaciones();
        int[][] mat = new int[][]{{1, 2, 3}, {0, 0, 0}, {1, 2, 3}};
        assertEquals(12, op.sumarElementos(mat));
    }

    @Test
    public void OperacionesTest5() {
        Operaciones op = new Operaciones();
        int[][] mat = new int[][]{{1, 2, 4}, {0, 0, 0}, {2, 2, 3}};
        assertEquals(14, op.sumarElementos(mat));
    }

    @Test
    public void OperacionesTest6() {
        Operaciones op = new Operaciones();
        int[][] mat = new int[][]{{1, 2, 4}, {0, 0, 0}, {2, 2, -3}};
        assertEquals(8, op.sumarElementos(mat));
    }

    @Test
    public void OperacionesTest7() {
        Operaciones op = new Operaciones();
        List<Double> numList = new ArrayList<>();
        numList.add(13.0);
        numList.add(-14.1);
        numList.add(99999D);
        assertEquals(-14.1, op.buscarMenor(numList), 1E-6);
    }

    @Test
    public void OperacionesTest8() {
        Operaciones op = new Operaciones();
        List<Double> numList = new ArrayList<>();
        numList.add(13.0);
        numList.add(-1444.1);
        numList.add(0D);
        assertEquals(-1444.1, op.buscarMenor(numList), 1E-6);
    }

    @Test
    public void OperacionesTest9() {
        Operaciones op = new Operaciones();
        List<Double> numList = new ArrayList<>();
        numList.add(0.0);
        numList.add(0.0);
        numList.add(0.0);
        assertEquals(0, op.buscarMenor(numList), 1E-6);
    }


}
