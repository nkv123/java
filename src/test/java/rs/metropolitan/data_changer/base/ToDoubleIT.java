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
public class ToDoubleIT {

    public ToDoubleIT() {
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
     * Test of changeString method, of class ToDouble. should pass. return null
     * if empty string passed
     */
    @Test
    public void testChangeString0() {
        System.out.println("changeString0");
        String data = "";
        ToDouble instance = new ToDouble();
        Double expResult = null;
        Double result = instance.changeString(data);
        assertEquals(expResult, result);

    }/**
     * Test of changeString method, of class ToDouble. should pass. return null
     * if string containing letter is passed
     */
    @Test
    public void testChangeString1() {
        System.out.println("changeString1");
        String data = "1a2.3";
        ToDouble instance = new ToDouble();
        Double expResult = null;
        Double result = instance.changeString(data);
        assertEquals(expResult, result);

    }

    /**
     * test should pass
     *
     */
    @Test
    public void testChangeString2() {
        System.out.println("changeString2");
        String data = "1.23";
        ToDouble instance = new ToDouble();
        Double expResult = new Double("1.23");
        Double result = instance.changeString(data);
        assertEquals(expResult, result);

    }

    /**
     * test should pass does not work with string array as parameter
     */
    @Test
    public void testChangeString3() {
        System.out.println("changeString3");
        String data = "{1.24,1.23,1558.4}";
        ToDouble instance = new ToDouble();
        Double expResult = new Double("1.24");
        Double result = instance.changeString(data);
        assertNotEquals(expResult, result);
    }

    /**
     * test should pass does not work if there sting has dot following to
     * interpreted double
     */
    @Test
    public void testChangeString4() {
        System.out.println("changeString4");
        String data = "1.23.";
        ToDouble instance = new ToDouble();
        Double expResult = new Double("1.23");
        Double result = instance.changeString(data);
        assertNotEquals(expResult, result);

    }

    /**
     * test should pass does not work if there sting has dot leading to
     * interpreted double
     */
    @Test
    public void testChangeString5() {
        System.out.println("changeString5");
        String data = ".1.23";
        ToDouble instance = new ToDouble();
        Double expResult = new Double("1.23");
        Double result = instance.changeString(data);
        assertNotEquals(expResult, result);

    }

}
