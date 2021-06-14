/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.data_net.main.java.controladores;

import java.util.List;
import org.data_net.main.java.modelos.Cabin;
import org.data_net.main.java.vistas.MainWindow;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Familia
 */
public class CabinsAdministratorTest {
     private MainWindow mainWindow;
     CabinsAdministrator instance;
     
    public CabinsAdministratorTest() {
        mainWindow= new MainWindow();
        instance= new CabinsAdministrator(mainWindow);
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
     * Test of insert method, of class CabinsAdministrator.
     */
    @Test
    public void testInsert_null() {
         instance.getMainWindow().txtEtiqueta.setText(null);
        instance.getMainWindow().txtCapacidad.setText(null);
        System.out.println("insert_null");
        Object expResult = null;
        Object result = instance.insert();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
      @Test
    public void testInsert_neg() {
        
        instance.getMainWindow().txtEtiqueta.setText("");
        instance.getMainWindow().txtCapacidad.setText("Dos");
        System.out.println("insert_neg");
        Object expResult = null;
        Object result = instance.insert();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
       @Test
    public void testInsert_pos() {
        
        instance.getMainWindow().txtEtiqueta.setText("Cabaña1");
        instance.getMainWindow().txtCapacidad.setText("2");
        System.out.println("insert_pos");
        Cabin expResult =new Cabin("Cabaña1",2);
        Cabin result=((Cabin)instance.insert());
        assertEquals(expResult.getEtiqueta(), result.getEtiqueta());
        assertEquals(expResult.getCapacidad(), result.getCapacidad());
        // TODO review the generated test code and remove the default call to fail.
       
    }


   

  
}
    
