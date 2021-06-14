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
    
     @org.junit.Test
    public void testInsert_posit() {
     
        cargar_Datos_positivos();
        System.out.println("testInsert_posit");
        
        Reserve result=((Reserve)instance.insert());
        //assertNotNull(result);//pasa la prueba si crea una reserva
        //assertEquals(result.getCabana(),"CasaAzul");//cambiar al tipo cabaña ver DAO y model
        assertEquals(result.getTelefono(),"3513194002");
        assertEquals(result.getInquilino(),"Julieta");
        assertEquals(result.getCantidadInq(),5);
        assertEquals(result.getFechaDesde(),"06-12-2021");
        assertEquals(result.getFechaHasta(),"07-12-2021");
        assertEquals(result.getCosto(),3600);
        assertEquals(result.getMail(),"julieta@yahoo.com");
    }
    /**
     * Test of insert method, of class ReservesAdministrator.
     */
      @org.junit.Test
    public void test_telefono() {
         System.out.println("test_telefono"); 
        
        cargar_Datos_positivos(); 
        mainWindow.txtTelefono.setText((Math.random()*1099999999)+"");//numero menor al MIN
        Reserve result=((Reserve)instance.insert());
         assertNull(result);//NO se deberia poder agregar, pasa el test si retorna null
        
      
        cargar_Datos_positivos();
        mainWindow.txtTelefono.setText(Math.floor(Math.random()*(Math.pow(1.0,20.0))+9999999999.0)+"");//nummayor al MAX
        result=((Reserve)instance.insert());
         assertNull(result);//NO se deberia poder agregar, pasa el test si retorna null
         //assertFalse(Integer.parseInt(result.getTelefono())>=2966999999.0);
        //se testea un numero aleatorio mayor a 29669999, hasta 1*10^20
        
        cargar_Datos_positivos();
        mainWindow.txtTelefono.setText("%$@dasd");
        result=((Reserve)instance.insert());
        assertNull(result);//NO se deberia poder agregar, pasa el test si retorna null        

       
        
        //Testea caracteres especiales
    }
    /**
     * Test of insert method, of class ReservesAdministrator.
     */
       @org.junit.Test
    public void test_fechas_neg() {
        System.out.println("test_fechas");
        cargar_Datos_positivos();
        mainWindow.txtDesde.setText("11-10-2021");
        mainWindow.txtHasta.setText("06-10-2021");
        Reserve result=((Reserve)instance.insert());
        assertEquals(result,null); //assertNull(result);
        //test numero menor a 1100000000
        
     
    }

    private void cargar_Datos_positivos() {
        mainWindow.txtTelefono.setText("3513194002");
        mainWindow.txtInquilino.setText("Julieta");
        mainWindow.txtCantInq.setText("5");
        mainWindow.txtCabana.setText("CasaAzul");
        mainWindow.txtDesde.setText("06-12-2021");
        mainWindow.txtHasta.setText("07-12-2021");
        mainWindow.txtCosto.setText("3600");
        mainWindow.txtMail.setText("julieta@yahoo.com"); 

    }
}
