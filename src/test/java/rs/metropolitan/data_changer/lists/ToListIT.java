/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.metropolitan.data_changer.lists;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nikola
 */
public class ToListIT {

    List<String> expResultList0;
    List<String> expResultList1;

    public ToListIT() {

        this.expResultList0 = new ArrayList<String>();
        this.expResultList1 = new ArrayList<String>();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        expResultList0.add("abc");
        expResultList0.add("efg");
        expResultList1.add("1");
        expResultList1.add("2");
        expResultList1.add("3");
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of changeString method, of class ToList.
     */
    @Test
    public void testChangeString0() {
        System.out.println("changeString0");
        ToList instance = new ToList();
        List<String> result = instance.changeString("");
        assertEquals(new ArrayList<String>(), result);
    }

    /**
     * Test of changeString method, of class ToList.
     */
    @Test
    public void testChangeString1() {
        System.out.println("changeString1");
        ToList instance = new ToList();
        List<String> result = instance.changeString("{abc,efg}");
        assertEquals(expResultList0, result);
    }

    /**
     * Test of changeString method, of class ToList.
     */
    @Test
    public void testChangeString2() {
        System.out.println("changeString0");
        ToList instance = new ToList();
        List<String> result = instance.changeString("{1,2,3}");
        assertEquals(expResultList1, result);
    }

}
