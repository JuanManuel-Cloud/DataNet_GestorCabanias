package org.data_net.main.java.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.data_net.main.java.interfaces.Administrator;
import org.data_net.main.java.interfaces.DAO;
import org.data_net.main.java.modelos.base_de_datos.dao.CabinsDAO;
import org.data_net.main.java.modelos.base_de_datos.dao.ReservesDAO;
import org.data_net.main.java.vistas.MainWindow;

public class MainController implements ActionListener {
    
    MainWindow vista = new MainWindow();
    DefaultTableModel modeloCabin = new DefaultTableModel();
    DefaultTableModel modeloReserve = new DefaultTableModel();
    
    DAO dao;
    Administrator administrator;
    
    public MainController(MainWindow v){
        this.vista = v;
        this.vista.listarButton.addActionListener(this);
        this.vista.agregarButton.addActionListener(this);
        this.vista.editarButton.addActionListener(this);
        this.vista.borrarButton.addActionListener(this);
        this.vista.actualizarButton.addActionListener(this);
        this.vista.nuevoButton.addActionListener(this);
        this.vista.cabanasButton.addActionListener(this);
        this.vista.reservasButton.addActionListener(this);
                
        dao=new CabinsDAO();
        administrator=new CabinsAdministrator(vista);
        
        
    };
    
    @Override
    public void actionPerformed(ActionEvent e) {
      
        if (e.getSource() == vista.reservasButton) {
            System.out.println("Se apreto boton Reservas");
           
            //Panel de Seleccion
            vista.InputPanel.removeAll();
            vista.InputPanel.add(vista.ReserveInput);
            vista.InputPanel.repaint();
            vista.InputPanel.revalidate();
            
            //Panel de la Tabla
            vista.ListPanel.removeAll();
            vista.ListPanel.add(vista.ListReservas);
            vista.ListPanel.repaint();
            vista.ListPanel.revalidate();
            
            //Seleccion de Strategy
            setTipoDAO(new ReservesDAO());
            setAdministrator(new ReservesAdministrator(vista));
            
            //Muestra todas las cabanas
            getAll();
        }
        if (e.getSource() == vista.cabanasButton) {
            System.out.println("Se apreto boton Cabanas");
            //Panel de Seleccion
            vista.InputPanel.removeAll();
            vista.InputPanel.add(vista.CabinInput);
            vista.InputPanel.repaint();
            vista.InputPanel.revalidate();
            
            //Panel de la Tabla
            vista.ListPanel.removeAll();
            vista.ListPanel.add(vista.ListCabanas);
            vista.ListPanel.repaint();
            vista.ListPanel.revalidate();
            
            //Seleccion de Strategy(DAO)
            setTipoDAO(new CabinsDAO());
            setAdministrator(new CabinsAdministrator(vista));
            
            //Muestra todas las reservas
            getAll();
        }
        if (e.getSource() == vista.agregarButton) {
            System.out.println("Se apreto boton Agregar");
            //List<Object> addList=new ArrayList();
            Object obj=administrator.insert();
            if(obj!=null){
                dao.add(obj);
                administrator.limpiar();
            }
        }
        
        if (e.getSource() == vista.borrarButton) {
            String id=administrator.delete();
            if(!id.equals("")){
                dao.delete(id);
                JOptionPane.showMessageDialog(vista, "Se ha eliminado correctamente");
            }  
        } 
    }
    
    //Metodo para mostrar en tabla  //todo revisar no funciona la parte grafica, dao  trae la lista con los objetos correctamente
    private void getAll(){
        List<Object>lista=new ArrayList<>();
        lista=dao.getAll();
        administrator.getAll(lista);
    }
    
    //Seleccion de strategy DAO
    private void setTipoDAO(DAO dao){
        this.dao=dao;
    }
    
    //Seleccion de strategy Administrator
    private void setAdministrator(Administrator administrator){
        this.administrator=administrator;
    }
}
