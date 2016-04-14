/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.metropolitan.data_changer.base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ladmin
 */
public class ToFloatIT {

    public ToFloatIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of changeString method, of class ToFloat.
     */
    @Test
    public void testChangeString0() {
        System.out.println("changeString0");
        String data = "";
        ToFloat instance = new ToFloat();
        Object expResult = new Float("");
        Object result = instance.changeString(data);
        assertEquals(expResult, result);
    }

    @Test
    public void testChangeString1() {
        System.out.println("changeString1");
        String data = "1.23";
        ToFloat instance = new ToFloat();
        Object expResult = new Float("1.23");
        Object result = instance.changeString(data);
        assertEquals(expResult, result);
    }

    @Test
    public void testChangeString2() {
        System.out.println("changeString2");
        String data = "1.23,1.23";
        ToFloat instance = new ToFloat();
        Object expResult = new Float("1.23");
        Object result = instance.changeString(data);
        assertNotEquals(expResult, result);
    }

}
