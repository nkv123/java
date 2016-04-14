/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.metropolitan.data_changer.lists;

import java.util.ArrayList;
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
public class ToListIT {

    ArrayList<String> expResult = new ArrayList<String>();

    public ToListIT() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        expResult.add("1");
        expResult.add("2");
        expResult.add("3");
    }

    @After
    public void tearDown() {
        expResult.clear();
    }

    /**
     * Test of changeString method, of class ToList.
     */
    @Test
    public void testChangeString0() {
        System.out.println("changeString");
        ToList instance = new ToList();

        Object result = instance.changeString("{1,2,3}");
        assertEquals(expResult, result);

    }

}
