package Rp1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OperacionesTest {

    Operaciones op;

    @Before
    public void instantiate() {
        op = new Operaciones();
    }

    @Test
    public void mayorTest0() {
        double mayor = op.mayor(3D, 6D, 9D);
        Assert.assertEquals(9.0, mayor, 1e-10);
    }

    @Test
    public void esDivisorTest0() {
        assertTrue(op.esDivisor(10, 2));
        assertTrue(op.esDivisor(10, 1));
        assertTrue(op.esDivisor(4444, 4));
    }

    @Test
    public void esDivisorTest1() {
        assertFalse(op.esDivisor(10, 3));
        assertFalse(op.esDivisor(15, 2));
    }

    @Test
    public void buscarMenorTest0() {
        assertEquals(0, op.buscarMenor(new int[]{0, 3, 9}));
    }

    @Test
    public void buscarMenorTest1() {
        assertEquals(-999, op.buscarMenor(new int[]{-999, -888, -777}));
    }

    @Test
    public void buscarMenorTest2() {
        assertEquals(999, op.buscarMenor(new int[]{999, 2000, 99999}));
    }

    @Test
    public void sumarElementosTest0() {
        int[][] mat = new int[][]{{1, 2, 3}, {0, 0, 0}, {1, 2, 3}};
        assertEquals(12, op.sumarElementos(mat));
    }

    @Test
    public void sumarElementosTest1() {
        int[][] mat = new int[][]{{1, 2, 4}, {0, 0, 0}, {2, 2, 3}};
        assertEquals(14, op.sumarElementos(mat));
    }

    @Test
    public void sumarElementosTest2() {
        int[][] mat = new int[][]{{1, 2, 4}, {0, 0, 0}, {2, 2, -3}};
        assertEquals(8, op.sumarElementos(mat));
    }

    @Test
    public void buscarMayorTest0() {
        List<Double> numList = new ArrayList<>();
        numList.add(13.0);
        numList.add(-14.1);
        numList.add(99999D);
        assertEquals(99999D, op.buscarMayor(numList), 1E-6);
    }

    @Test
    public void buscarMayorTest1() {
        List<Double> numList = new ArrayList<>();
        numList.add(13.0);
        numList.add(-1444.1);
        numList.add(0D);
        assertEquals(13.0, op.buscarMayor(numList), 1E-6);
    }

    @Test
    public void buscarMayorTest2() {
        List<Double> numList = new ArrayList<>();
        numList.add(0.0);
        numList.add(0.0);
        numList.add(0.0);
        assertEquals(0, op.buscarMayor(numList), 1E-6);
    }

}
