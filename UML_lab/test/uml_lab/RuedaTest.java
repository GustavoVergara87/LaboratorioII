/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml_lab;

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
public class RuedaTest {

    Auto auto = new Auto(30, 40, 8);
    Rueda instance = new Rueda(20, 2680.1, 2680.1, auto);

    public RuedaTest() {

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

    @Test
    public void testGetRodado() {
        System.out.println("getRodado");
        int result = instance.getRodado();
        assertEquals(20, result);

        instance.setRodado(80);
        result = instance.getRodado();
        assertEquals(80, result);
    }

    @Test
    public void testSetRodado() {
        System.out.println("setRodado");
        int Rodado = 0;
        Rueda instance = null;
        instance.setRodado(Rodado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNivelAireActual() {
        double result = instance.getNivelAireActual();
        assertEquals(2680.1, result, 0.005);

        instance.setNivelAireActual(80.1);
        result = instance.getNivelAireActual();
        assertEquals(80.1, result, 0.005);
    }

    @Test
    public void testSetNivelAireActual() {
        System.out.println("setNivelAireActual");
        double nivelAireActual = 0.0;
        Rueda instance = null;
        instance.setNivelAireActual(nivelAireActual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNivelAireCorrecto() {
        System.out.println("getNivelAireCorrecto");
        double result = instance.getNivelAireCorrecto();
        assertEquals(2680.1, result, 0.005);

        instance.setNivelAireCorrecto(80.1);
        result = instance.getNivelAireCorrecto();
        assertEquals(80.1, result, 0.005);
    }

    @Test
    public void testSetNivelAireCorrecto() {
        System.out.println("setNivelAireCorrecto");
        float nivelAireCorrecto = 0.0F;
        Rueda instance = null;
        instance.setNivelAireCorrecto(nivelAireCorrecto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testInflar() {
        System.out.println("inflar");
        Rueda instance = null;
        instance.inflar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testMiVehiculo() {
        System.out.println("miVehiculo");
        Rueda instance = null;
        int expResult = 0;
        int result = instance.miVehiculo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetVehiculo() {
        System.out.println("getVehiculo");
        assertTrue(instance.getVehiculo().equals(auto));
    }
    
        @Test
        public void testSetVehiculo() {
        System.out.println("setVehiculo");
            Vehiculo vehiculo = null;
            Rueda instance = null;
            instance.setVehiculo(vehiculo);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }

    }
