package org.data_net.main.java.controladores;

import java.util.List;
import org.data_net.main.java.interfaces.Administrator;
import org.data_net.main.java.modelos.Cabin;
import org.data_net.main.java.vistas.MainWindow;

public class CabinsAdministrator implements Administrator {
    private MainWindow mainWindow;
    
    public CabinsAdministrator(MainWindow mainWindow){
        this.mainWindow=mainWindow;
    }
    
    @Override
    public Object insert() {
        String etiqueta = mainWindow.txtEtiqueta.getText();
        String capacidad = mainWindow.txtCapacidad.getText();
        return new Cabin(etiqueta,Integer.parseInt(capacidad));
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
