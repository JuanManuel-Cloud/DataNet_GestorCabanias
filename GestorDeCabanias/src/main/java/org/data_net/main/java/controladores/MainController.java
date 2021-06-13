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
import org.data_net.main.java.interfaces.DataSubject;
import org.data_net.main.java.interfaces.DataObserver;

public class MainController implements ActionListener, DataSubject {

    private ArrayList observers;
    MainWindow vista = new MainWindow();
    DefaultTableModel modeloCabin = new DefaultTableModel();
    DefaultTableModel modeloReserve = new DefaultTableModel();

    DAO dao;
    Administrator administrator;

    public MainController(MainWindow v) {
        observers = new ArrayList();
        this.vista = v;
        this.vista.listarButton.addActionListener(this);
        this.vista.agregarButton.addActionListener(this);
        this.vista.editarButton.addActionListener(this);
        this.vista.borrarButton.addActionListener(this);
        this.vista.actualizarButton.addActionListener(this);
        this.vista.nuevoButton.addActionListener(this);
        this.vista.cabanasButton.addActionListener(this);
        this.vista.reservasButton.addActionListener(this);

        dao = new CabinsDAO();
        administrator = new CabinsAdministrator(vista);
    }

    ;
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.reservasButton) {
            limpiarPanelReservas();

            //Seleccion de Strategy
            setTipoDAO(new ReservesDAO());
            setAdministrator(new ReservesAdministrator(vista));

            //Muestra todas las cabanas
            getAll();
        }
        if (e.getSource() == vista.cabanasButton) {
            limpiarPanelCabanas();

            //Seleccion de Strategy(DAO)
            setTipoDAO(new CabinsDAO());
            setAdministrator(new CabinsAdministrator(vista));

            //Muestra todas las reservas
            getAll();
        }
        if (e.getSource() == vista.agregarButton) {
            System.out.println("Se apreto boton Agregar");

            dao.add(administrator.insert());
            administrator.limpiar();

        }

        if (e.getSource() == vista.borrarButton) {
            String id = administrator.delete();
            if (!id.equals("")) {
                dao.delete(id);
                JOptionPane.showMessageDialog(vista, "Se ha eliminado correctamente");
            }
        }
    }

    //Metodo para mostrar en tabla  //todo revisar no funciona la parte grafica, dao  trae la lista con los objetos correctamente
    private void getAll() {
        List<Object> lista;
        lista = dao.getAll();
        administrator.getAll(lista);
        notifyObservers(lista);
    }

    //Seleccion de strategy DAO
    private void setTipoDAO(DAO dao) {
        this.dao = dao;
    }

    //Seleccion de strategy Administrator
    private void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }

    private void limpiarPanelReservas() {
        //Panel de Seleccion
        vista.InputPanel.removeAll();
        vista.InputPanel.add(vista.ReserveInput);
        vista.InputPanel.repaint();
        vista.InputPanel.revalidate();

        //Panel de la Tabla
        vista.ListPanel.removeAll();
        vista.ListPanel.add(vista.getListReserva());
        vista.ListPanel.repaint();
        vista.ListPanel.revalidate();
        getAll();
    }

    private void limpiarPanelCabanas() {
        //Panel de Seleccion
        vista.InputPanel.removeAll();
        vista.InputPanel.add(vista.CabinInput);
        vista.InputPanel.repaint();
        vista.InputPanel.revalidate();

        //Panel de la Tabla
        vista.ListPanel.removeAll();
        vista.ListPanel.add(vista.getListCabana());
        vista.ListPanel.repaint();
        vista.ListPanel.revalidate();
        getAll();
    }

    @Override
    public void registerObserver(DataObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(DataObserver o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers(List lista) {
        for (int i = 0; i < observers.size(); i++) {
            DataObserver observer = (DataObserver) observers.get(i);
            observer.update(lista);
        }
    }
}
