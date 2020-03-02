/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import tareacamiseta.Camiseta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author leyle
 */
public class probarCamiseta {
    
    public probarCamiseta() {
        
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void pruebaCalculCamiseta() {
     System.out.println("prueba Calcul Camiseta");
     Camiseta camisetaTest = new Camiseta(1);
     assertEquals(190, (camisetaTest.calculCamiseta(1)),0) ;
     
     Camiseta camisetaTestDos = new Camiseta(2);
     assertEquals(1481.2, (camisetaTestDos.calculCamiseta(7)),0) ;
     
     Camiseta camisetaTestTres = new Camiseta(3);
     assertEquals(1178, (camisetaTestTres.calculCamiseta(4)),0) ;
     
     
     }
}
