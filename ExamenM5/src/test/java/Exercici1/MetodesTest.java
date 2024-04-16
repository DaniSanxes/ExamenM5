/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Exercici1;

import exercici1.Metodes;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Daniel Sánchez
 */
public class MetodesTest {
    
   
    @Test
    public void testCanviarMoneda() {
        System.out.println("canviarMoneda");
        String moneda = "lliures";
        double euros = 5;
        double expResult = 4.195;
        double result = Metodes.canviarMoneda(moneda, euros);
        assertEquals(expResult, result, 0);
        
        moneda = "dolars";
        expResult = 5.6899999999999995;
        result = Metodes.canviarMoneda(moneda, euros);
        assertEquals(expResult, result, 0);
        
        moneda = "iens";
        expResult = 658.075;
        result = Metodes.canviarMoneda(moneda, euros);
        assertEquals(expResult, result, 0);
        
    }

    /**
     * Test of imprimir method, of class Metodes.
     */
    @Test
    public void testImprimir() {
        System.out.println("imprimir");
        double canvi = 658.075;
        Metodes.imprimir(canvi);
        
    }
    
}
