package org.data_net.main.java.controladores;

import java.util.List;
import org.data_net.main.java.interfaces.Administrator;
import org.data_net.main.java.modelos.Reserve;
import org.data_net.main.java.vistas.MainWindow;

public class ReservesAdministrator implements Administrator  {
    private MainWindow mainWindow;
    public ReservesAdministrator(MainWindow mainWindow){
        this.mainWindow=mainWindow;
    }
    
    @Override
    public Object insert() {
        String inquilino = mainWindow.txtInquilino.getText();
        String telefono = mainWindow.txtTelefono.getText();
        String mail = mainWindow.txtMail.getText();
        String cantInq = mainWindow.txtCantInq.getText();
        String cabana = mainWindow.txtCabana.getText();
        String desde = mainWindow.txtDesde.getText();
        String hasta = mainWindow.txtHasta.getText();
        String costo = mainWindow.txtCosto.getText();
    
        return new Reserve(inquilino,telefono,mail,Integer.parseInt(cantInq),cabana,desde,hasta,Integer.parseInt(costo));
    }

    @Override
    public List<Object> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object check() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
