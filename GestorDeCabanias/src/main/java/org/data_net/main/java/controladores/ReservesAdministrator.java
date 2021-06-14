package org.data_net.main.java.controladores;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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
        try{
        String cabana = mainWindow.txtCabana.getText();
        String desde = mainWindow.txtDesde.getText();
        String hasta = mainWindow.txtHasta.getText();
        String inquilino = mainWindow.txtInquilino.getText();
        String cantInq = mainWindow.txtCantInq.getText();
        String costo = mainWindow.txtCosto.getText();
        String telefono = mainWindow.txtTelefono.getText();
        String mail = mainWindow.txtMail.getText();
        
       //chequeo posibles nulls 
        checkNull(inquilino,telefono,mail,cantInq,cabana,desde,hasta,costo);

        //chequeo posibles NumberFormatException
        int tel=Integer.parseInt(telefono);
        int cant_inq=Integer.parseInt(cantInq);
        int cost=Integer.parseInt(costo);
        
        //chequeos de telefono
        checkTel(tel);
        
        //chequea intiquilinos
        checkCantInq(cant_inq);
        
        
        Reserve reserve= new Reserve(inquilino,telefono,mail,cant_inq,cabana,desde,hasta,cost);
        
        return reserve;
        
        }catch(NumberFormatException e ){ 
          JOptionPane.showMessageDialog(mainWindow,"Formato Invalido" );
            return null;
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(mainWindow,e.getMessage());
            return null;
        }catch(IllegalArgumentException e){
        JOptionPane.showMessageDialog(mainWindow,e.getMessage() );
            return null;
        }
        
   }

    
    @Override
    public void getAll(List lista) {
        DefaultTableModel modelo = new DefaultTableModel();
        List<Reserve> listaReserves=new ArrayList<Reserve>();
        listaReserves=(ArrayList<Reserve>) lista;
        
        modelo = (DefaultTableModel) mainWindow.tablaCabanas.getModel();
        
        Object[] objeto = new Object[9];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = listaReserves.get(i).getId();
            objeto[1] = listaReserves.get(i).getInquilino();
            objeto[2] = listaReserves.get(i).getTelefono();
            objeto[3] = listaReserves.get(i).getMail();
            objeto[4] = listaReserves.get(i).getCantidadInq();
            objeto[5] = listaReserves.get(i).getCabana();
            objeto[6] = listaReserves.get(i).getFechaDesde();
            objeto[7] = listaReserves.get(i).getFechaHasta();
            objeto[8] = listaReserves.get(i).getCosto();
            modelo.addRow(objeto);
        }
        mainWindow.tablaCabanas.setModel(modelo);
    }

    @Override
    public String delete() {
        int fila = mainWindow.tablaReservas.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(mainWindow, "Debe Seleccionar una Fila");
            return "";
        } else {
            String id = mainWindow.tablaReservas.getValueAt(fila, 0).toString();
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
        mainWindow.txtInquilino.setText("");
        mainWindow.txtTelefono.setText("");
        mainWindow.txtMail.setText("");
        mainWindow.txtCantInq.setText("");
        mainWindow.txtCabana.setText("");
        mainWindow.txtDesde.setText("");
        mainWindow.txtHasta.setText("");
        mainWindow.txtCosto.setText("");
        mainWindow.txtEtiqueta.requestFocus();
    }

    private boolean checkTel(int tel) {
        if(tel>=1100000000){
             return true;}
        else{
            throw new IllegalArgumentException("Campos invalidos");}
    }

    private void checkNull(String inquilino,String telefono,String mail,String cantInq,String cabana,String desde,String hasta,String costo) {
      if( cabana.isEmpty() 
       || desde.isEmpty() 
       || hasta.isEmpty()
       || inquilino.isEmpty() 
       || cantInq.isEmpty() 
       || costo.isEmpty() 
       || telefono.isEmpty()
       || mail.isEmpty()){
          throw new NullPointerException("Campos Vacios" );
      } 
      
        
   }

    private void checkCantInq(int cant_inq, Cabin cabin) {

    }
    
}
