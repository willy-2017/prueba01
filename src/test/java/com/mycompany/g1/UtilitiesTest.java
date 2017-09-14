/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.g1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author william
 */
public class UtilitiesTest {
    
    public UtilitiesTest() {
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
     * Test of getResume method, of class Utilities.
     */
    @org.junit.Test
    public void testGetResume() {
        System.out.println("getResume");
        String texto = "ahora deseo caminar en una montaña no muy lejana";
        Utilities instance = new Utilities();
        String expResult = "ahora deseo caminar en una mon";
        String result = instance.getResume(texto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of Capitalizar method, of class Utilities.
     */
    @org.junit.Test
    public void testCapitalizar() {
        System.out.println("Capitalizar");
        String texto = "camiNar eN la CalLe";
        Utilities instance = new Utilities();
        String expResult = "Caminar En La Calle";
        String result = instance.Capitalizar(texto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of contarCoincidencias method, of class Utilities.
     */
    @org.junit.Test
    public void testContarCoincidencias() {
        System.out.println("contarCoincidencias");
        String frase = "El perro se encontro con otro Perro para platicar";
        String texto = "perro";
        Utilities instance = new Utilities();
        int expResult = 2;
        int result = instance.contarCoincidencias(frase, texto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
