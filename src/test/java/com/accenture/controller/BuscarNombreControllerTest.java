/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accenture.controller;

import com.accenture.model.HotelesModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Administrator
 */
public class BuscarNombreControllerTest {
    
    public BuscarNombreControllerTest() {
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
     * Test of form method, of class BuscarNombreController.
     */
    @Test
    public void testForm() {
        System.out.println("form");
        BuscarNombreController instance = new BuscarNombreController();
        ModelAndView expResult = null;
        ModelAndView result = instance.form();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of form method, of class BuscarNombreController.
     */
    @Test
    public void testForm_3args() {
       
        fail("The test case is a prototype.");
    }
    
}
