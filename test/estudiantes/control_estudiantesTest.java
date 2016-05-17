/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pablo
 */
public class control_estudiantesTest {
    
    public control_estudiantesTest() {
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
     * Test of ingresar_estudiante method, of class control_estudiantes.
     */
    @Test
    public void testIngresar_estudiante() {
        System.out.println("ingresar_estudiante");
        String id_carnet = "";
        String documento = "";
        String Tipo_doc = "";
        String nombre = "";
        String apellido = "";
        String sexo = "";
        control_estudiantes instance = new control_estudiantes();
        boolean expResult = false;
        boolean result = instance.ingresar_estudiante(id_carnet, documento, Tipo_doc, nombre, apellido, sexo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
