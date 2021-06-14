/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.data_net.main.java.controladores;

import java.util.List;
import org.apache.commons.lang3.RandomStringUtils;
import org.data_net.main.java.modelos.Cabin;
import org.data_net.main.java.modelos.Reserve;
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
public class ReservesAdministratorTest {
     private MainWindow mainWindow;
     ReservesAdministrator instance;
    
    public ReservesAdministratorTest() {
        mainWindow= new MainWindow();
        instance= new  ReservesAdministrator(mainWindow);
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
     * Test of insert method, of class ReservesAdministrator.
     */
    

   @Test
    public void Reservas_telefono() {
        mainWindow.txtTelefono.setText((Math.random()*1099999999)+"");
        Reserve result=((Reserve)instance.insert());
        // assertNull(result);//no se deberia poder agregar, pasa el test si retorna null
       assertFalse(Integer.parseInt(result.getTelefono())<=1100000000);
        //test numero menor a 1100000000
       
        mainWindow.txtTelefono.setText(Math.floor(Math.random()*(Math.pow(1.0,20.0))+2966999999.0)+"");
        result=((Reserve)instance.insert());
        
         assertFalse(Integer.parseInt(result.getTelefono())>=2966999999.0);
        //se testea un numero aleatorio mayor a 29669999, hasta 1*10^20
        
        mainWindow.txtTelefono.setText(RandomStringUtils.random(10)+"");
        result=((Reserve)instance.insert());
        String telefono=result.getTelefono();
        for(int i=0; i<=telefono.length();i++){
         assertFalse(telefono.charAt(i)>58); //Pasa si solo haya numeros 
        }
        //Testea caracteres especiales
    }
    
    @Test
    public void Reservas_fechas() {
        mainWindow.txtDesde.setText("11-10-2021");
        mainWindow.txtHasta.setText("06-10-2021");
        Reserve result=((Reserve)instance.insert());
        assertNull(result);
        //test numero menor a 1100000000
        
     String cabana = mainWindow.txtCabana.getText();
         mainWindow.txtDesde.getText();
        mainWindow.txtHasta.getText();
         mainWindow.txtInquilino.getText();
       mainWindow.txtCantInq.getText();
        mainWindow.txtCosto.getText();
         mainWindow.txtTelefono.getText();
       mainWindow.txtMail.getText();
    }
    
}
