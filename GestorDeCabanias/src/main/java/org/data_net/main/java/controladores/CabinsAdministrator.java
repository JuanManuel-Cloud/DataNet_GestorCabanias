package org.data_net.main.java.controladores;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.data_net.main.java.interfaces.Administrator;
import org.data_net.main.java.modelos.Cabin;
import org.data_net.main.java.vistas.MainWindow;

public class CabinsAdministrator implements Administrator {
    private MainWindow mainWindow;
    private DefaultTableModel modelo = new DefaultTableModel();

    public CabinsAdministrator(MainWindow mainWindow){
        this.mainWindow=mainWindow;
        modelo = (DefaultTableModel) mainWindow.getTablaCabana().getModel();
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
        limpiarTabla();
        List<Cabin> listaCabins;
        listaCabins=(ArrayList<Cabin>) lista;
        Object[] objeto = new Object[3];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = listaCabins.get(i).getId();
            objeto[1] = listaCabins.get(i).getEtiqueta();
            objeto[2] = listaCabins.get(i).getCapacidad();
            modelo.addRow(objeto);
        }
        mainWindow.getTablaCabana().setModel(modelo);
    }
    

    @Override
    public String delete() {
        int fila = mainWindow.getTablaCabana().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(mainWindow, "Debe Seleccionar una Fila");
            return "";
        } else {
            String id = mainWindow.getTablaCabana().getValueAt(fila, 0).toString();
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
    
    @Override
    public void limpiarTabla() {
        for (int i = 0; i < mainWindow.getTablaCabana().getRowCount(); i++) {
                modelo.removeRow(i);
                i = i - 1;
            }

    }
}
