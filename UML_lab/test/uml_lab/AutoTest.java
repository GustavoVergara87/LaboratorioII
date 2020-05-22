/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml_lab;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gustavo
 */
public class AutoTest {

    Auto instance = new Auto(130, 0, 1);

    public AutoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance.setVelocidadActual(5);
    }

    @After
    public void tearDown() {
    }

//    @Test
//    public void testGetVelocidadActual() {
//        System.out.println("getVelocidadActual");
//        int expResult = 0;
//        int result = instance.getVelocidadActual();
//        assertEquals(expResult, result);
//    }

//    @Test
//    public void testSetVelocidadActual() {
//        System.out.println("setVelocidadActual");
//        int velocidadActual = 0;
//        instance.setVelocidadActual(velocidadActual);
//    }
//
//    @Test
//    public void testGetVelocidadPermitida() {
//        System.out.println("getVelocidadPermitida");
//        int expResult = 0;
//        int result = instance.getVelocidadPermitida();
//        assertEquals(expResult, result);
//    }

//    @Test
//    public void testSetVelocidadPermitida() {
//        System.out.println("setVelocidadPermitida");
//        int velocidadPermitida = 0;
//        Auto instance = null;
//    }
//
//    @Test
//    public void testGetRuedas() {
//        System.out.println("getRuedas");
//        ArrayList<Rueda> expResult = null;
//        ArrayList<Rueda> result = instance.getRuedas();
//        assertEquals(expResult, result);
//
//    }

//    @Test
//    public void testSetRuedas() {
//        System.out.println("setRuedas");
//        ArrayList<Rueda> Ruedas = null;
//
//        instance.setRuedas(Ruedas);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    @Test
    public void testFabricar() {
        System.out.println("Fabricar");
        //tengo que probar que en instance hay un arreglo con 4 ruedas
        instance.Fabricar();
        int valorEsperado = 4;
        assertEquals(valorEsperado, instance.Ruedas.size());

        for (int i = 0; i < instance.Ruedas.size(); i++) {
            assertTrue(instance.Ruedas.get(i) instanceof Rueda);

        }
    }

    @Test
    public void testAcelerar() {
        System.out.println("acelerar");

        int valorViejo = instance.getVelocidadActual();
        instance.acelerar();
        int valorEsperado = valorViejo + 1;
        assertEquals(valorEsperado, instance.getVelocidadActual());
    }

    @Test
    public void testFrenar() {
        System.out.println("acelerar");

        int valorViejo = instance.getVelocidadActual();
        instance.frenar();
        int valorEsperado = valorViejo-1;
        assertEquals(valorEsperado, instance.getVelocidadActual());
    }

}
