/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class upstatusTest {
    
    public upstatusTest() {
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
     * Test of nam method, of class upstatus.
     */
    @Test
    public void testNam() {
        System.out.println("nam");
        String id = "10";
        upstatus instance = new upstatus();
        String expResult = "10";
        String result = instance.nam(id);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of up method, of class upstatus.
     */
    @Test
    public void testUp() {
        System.out.println("up");
        String sta = "Picked up for delivery";
        String id = "20";
        upstatus instance = new upstatus();
        boolean expResult = false;
        boolean result = instance.up(sta, id);
        assertEquals(expResult, result);
        
    }
    
}
