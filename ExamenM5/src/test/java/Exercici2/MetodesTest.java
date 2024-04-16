/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Exercici2;

import exercici2.Metodes;
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
    
    public MetodesTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of existeixNom method, of class Metodes.
     */
    @Test
    public void testExisteixNom() {
        System.out.println("existeixNom");
        String[] llista = {"luis","iker","dani"};
        String busqueda = "dani";
        assertTrue(Metodes.existeixNom(llista, busqueda));
        
        
            busqueda = "pablo";
            assertFalse(Metodes.existeixNom(llista, busqueda));
        
    
    }

   
    
    
}
