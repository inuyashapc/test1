/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package test;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author inuya
 */
public class TestIT {
    test.Test test = new test.Test();
    public TestIT() {
    }

    @Test
    public void testAdd() {
        int rs = test.add(2, 4);
        int expected = 6;
        assertEquals(expected, rs);
    }

    @Test
    public void testSub() {
        int rs = test.sub(2, 4);
        int expected = -2;
        assertEquals(expected, rs);
    }

    @Test
    public void testMul() {
        int rs = test.mul(2, 4);
        int expected = 8;
        assertEquals(expected, rs);
    }

    @Test
    public void testDiv() {
        int rs = test.div(4, 4);
        int expected = 1;
        assertEquals(expected, rs);
    }

    @Test
    public void testMain() {
    }
    
}
