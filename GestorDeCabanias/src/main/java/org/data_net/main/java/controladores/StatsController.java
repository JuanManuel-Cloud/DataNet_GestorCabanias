package org.data_net.main.java.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.data_net.main.java.modelos.StatsModel;
import org.data_net.main.java.vistas.MainWindow ;


public class StatsController implements ActionListener {
    
    private MainWindow vista;
    private StatsModel statsModel;
    
    public StatsController(MainWindow v,StatsModel statsModel){
        this.vista=v;
        this.statsModel=statsModel;
        this.vista.verTxtButton.addActionListener(this);
        this.vista.verGraphButton.addActionListener(this);
        NumRep numRep=new NumRep(statsModel,vista);
        GraphRep graphRep=new GraphRep(statsModel,vista);       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == vista.verTxtButton) {
            vista.StatsPanel.removeAll();
            vista.StatsPanel.add(vista.NumRep);
            vista.StatsPanel.repaint();
            vista.StatsPanel.revalidate();
            vista.verGraphButton.setSelected(false);
         }
         
         if (e.getSource() == vista.verGraphButton) {
            vista.StatsPanel.removeAll();
            vista.StatsPanel.add(vista.GraphRep);
            vista.StatsPanel.repaint();
            vista.StatsPanel.revalidate();
            vista.verTxtButton.setSelected(false);
         }
    }
}
