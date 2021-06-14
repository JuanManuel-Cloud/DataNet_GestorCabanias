package org.data_net.main.java.controladores;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.data_net.main.java.interfaces.Administrator;
import org.data_net.main.java.modelos.Cabin;
import org.data_net.main.java.modelos.Reserve;
import org.data_net.main.java.vistas.MainWindow;

public class ReservesAdministrator implements Administrator  {
    private MainWindow mainWindow;
    private DefaultTableModel modelo = new DefaultTableModel();

    public ReservesAdministrator(MainWindow mainWindow){
        this.mainWindow=mainWindow;
        modelo = (DefaultTableModel) mainWindow.getTablaReserva().getModel();

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
        String telefono = mainWindow.txtTelefono.getText().replaceAll("[\\-\\+]", "");
        String mail = mainWindow.txtMail.getText();
        
       //chequeo posibles nulls 
        checkNull(inquilino,telefono,mail,cantInq,cabana,desde,hasta,costo);

        //chequeo posibles NumberFormatException
        long tel=java.lang.Long.parseLong(telefono);
        int cant_inq=Integer.parseInt(cantInq);
        int cost=Integer.parseInt(costo);
        int desde_val=Integer.parseInt(desde.replaceAll("[\\-\\+]", ""));
        int hasta_val=Integer.parseInt(hasta.replaceAll("[\\-\\+]", ""));
        
        //chequeos de telefono
        checkTel(tel);
        
        //chequea intiquilinos
        //checkCantInq(cant_inq);
        
        //chequeo las fechas
         checkFecha(desde_val,hasta_val);
        
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
        limpiarTabla();
        List<Reserve> listaReserves;
        listaReserves=(ArrayList<Reserve>) lista;
                
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
        mainWindow.getTablaReserva().setModel(modelo);
    }

    @Override
    public String getFila() {
        int fila = mainWindow.getTablaReserva().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(mainWindow, "Debe Seleccionar una Fila");
            return "";
        } else {
            String id = mainWindow.getTablaReserva().getValueAt(fila, 0).toString();
            return id;
        }
    }

    @Override
    public Object update() {    
        ArrayList<String> valor = obtenerValores();
        Reserve reserve = new Reserve (valor.get(1),valor.get(2),valor.get(3),Integer.parseInt(valor.get(4)),valor.get(5),valor.get(6),valor.get(7),Integer.parseInt(valor.get(1)));
        reserve.setId(valor.get(0));
        return reserve; 
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

    private boolean checkTel(long tel) {
      
        if(tel>=1100000000){
          if(tel<= 9999999999.0){
          return true;}}
       throw new IllegalArgumentException("Campo: TELEFONO invalido. Ingrese un nuemero sin 15 y sin +54");
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
     if(cabin.getCapacidad()<cant_inq){
        throw new IllegalArgumentException("La cantidad de Inquilinos Supera la Capacidad de la Cabaña");
     }
    }
    
    private boolean checkFecha(int desde, int hasta) {
       if(desde<=hasta){
           return true;
           //falta chequear que la cabaña no este reservada, ver DAO!!!
      }
      throw new IllegalArgumentException("La fecha Ingresada no es correcta");
      
    }
    
    
    @Override
    public void limpiarTabla() {
        for (int i = 0; i < mainWindow.getTablaReserva().getRowCount(); i++) {
                modelo.removeRow(i);
                i = i - 1;
            }
    }

    @Override
    public void cargarCampos() {
        int fila = mainWindow.getTablaReserva().getSelectedRow();
    
        mainWindow.txtInquilino.setText(mainWindow.getTablaReserva().getValueAt(fila, 1).toString());
        mainWindow.txtTelefono.setText(mainWindow.getTablaReserva().getValueAt(fila, 2).toString());
        mainWindow.txtMail.setText(mainWindow.getTablaReserva().getValueAt(fila, 3).toString());
        mainWindow.txtCantInq.setText(mainWindow.getTablaReserva().getValueAt(fila, 4).toString());
        mainWindow.txtCabana.setText(mainWindow.getTablaReserva().getValueAt(fila, 5).toString());
        mainWindow.txtDesde.setText(mainWindow.getTablaReserva().getValueAt(fila, 6).toString());
        mainWindow.txtHasta.setText(mainWindow.getTablaReserva().getValueAt(fila, 7).toString());
        mainWindow.txtCosto.setText(mainWindow.getTablaReserva().getValueAt(fila, 8).toString());
    }
    
    public ArrayList<String> obtenerValores() {
            ArrayList<String> valores = new ArrayList();
            int fila = mainWindow.getTablaReserva().getSelectedRow();
            if (fila == -1) {
            JOptionPane.showMessageDialog(mainWindow, "Debe Seleccionar una Fila");
            return new ArrayList<String>();
            } else {
                valores.add(mainWindow.getTablaReserva().getValueAt(fila, 0).toString());
                valores.add(mainWindow.txtInquilino.getText());
                valores.add(mainWindow.txtTelefono.getText());
                valores.add(mainWindow.txtMail.getText());
                valores.add(mainWindow.txtCantInq.getText());
                valores.add(mainWindow.txtCabana.getText());
                valores.add(mainWindow.txtDesde.getText());
                valores.add(mainWindow.txtHasta.getText());
                valores.add(mainWindow.txtCosto.getText());
                return valores;
            }
    }
}
