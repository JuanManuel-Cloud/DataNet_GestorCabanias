package org.data_net.main.java.controladores;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
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
        try{
            String e=mainWindow.txtEtiqueta.getText();
            String c=  mainWindow.txtCapacidad.getText();
            String etiqueta = e;
            int capacidad =Integer.parseInt(c);
            if(!e.isEmpty() && !c.isEmpty()){
                return new Cabin(etiqueta,capacidad); 
            }
            else{ 
               JOptionPane.showMessageDialog(mainWindow,"Complete los campos requeridos" );
                return null;}
       
        }catch(NumberFormatException nfe){ 
          JOptionPane.showMessageDialog(mainWindow,"Ingrese un valor válido" );
            return null;}
    }

    @Override
    public void getAll(List lista) {
        DefaultTableModel modelo = new DefaultTableModel();
        List<Cabin> listaCabins=new ArrayList<Cabin>();
        listaCabins=(ArrayList<Cabin>) lista;
        modelo = (DefaultTableModel) mainWindow.tablaCabanas.getModel();
        //mainWindow.tablaCabanas.setModel(modelo);
        Object[] objeto = new Object[3];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = listaCabins.get(i).getId();
            objeto[1] = listaCabins.get(i).getEtiqueta();
            objeto[2] = listaCabins.get(i).getCapacidad();
            modelo.addRow(objeto);
        }
        mainWindow.tablaCabanas.setModel(modelo);
    }
    

    @Override
    public String delete() {
        int fila = mainWindow.tablaCabanas.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(mainWindow, "Debe Seleccionar una Fila");
            return "";
        } else {
            String id = mainWindow.tablaCabanas.getValueAt(fila, 0).toString();
            return id;
        }
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object check() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void limpiar() {
        mainWindow.txtEtiqueta.setText("");
        mainWindow.txtCapacidad.setText("");
        mainWindow.txtEtiqueta.requestFocus();
    }

    MainWindow getMainWindow() {
    return mainWindow;
    }
}
