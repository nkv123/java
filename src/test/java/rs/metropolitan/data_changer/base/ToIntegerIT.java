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
public class ToIntegerIT {

    public ToIntegerIT() {
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
     * Test of changeString method, of class ToInteger. test should pass. return
     * null for empty string
     */
    @Test
    public void testChangeString0() {
        System.out.println("changeString0");
        String data = "";
        ToInteger instance = new ToInteger();
        Object expResult = null;
        Object result = instance.changeString(data);
        assertEquals(expResult, result);
    }

    /**
     * Test of changeString method, of class ToInteger. test should pass. return
     * integer for
     */
    @Test
    public void testChangeString1() {
        System.out.println("changeString1");
        String data = "a";
        ToInteger instance = new ToInteger();
        Object expResult = null;
        Object result = instance.changeString(data);
        assertEquals(expResult, result);
    }

    /**
     * Test of changeString method, of class ToInteger.
     */
    @Test
    public void testChangeString2() {
        System.out.println("changeString2");
        String data = "1";
        ToInteger instance = new ToInteger();
        Object expResult = new Integer("1");
        Object result = instance.changeString(data);
        assertEquals(expResult, result);
    }

    @Test
    public void testChangeString3() {
        System.out.println("changeString3");
        String data = "1.";
        ToInteger instance = new ToInteger();
        Object expResult = null;
        Object result = instance.changeString(data);
        assertEquals(expResult, result);
    }

    @Test
    public void testChangeString4() {
        System.out.println("changeString4");
        String data = ".23";
        ToInteger instance = new ToInteger();
        Object expResult = null;
        Object result = instance.changeString(data);
        assertEquals(expResult, result);
    }
}
