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
public class AddControllerTest {
    
    public AddControllerTest() {
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
     * Test of form method, of class AddController.
     */
    @Test
    public void testForm() {
        System.out.println("form");
        AddController instance = new AddController();
        ModelAndView expResult = null;
        ModelAndView result = instance.form();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of form method, of class AddController.
     */
    @Test
    public void testForm_3args() {
        System.out.println("form");
        HotelesModel h = null;
        BindingResult result_2 = null;
        SessionStatus status = null;
        AddController instance = new AddController();
        ModelAndView expResult = null;
        ModelAndView result = instance.form(h, result_2, status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
