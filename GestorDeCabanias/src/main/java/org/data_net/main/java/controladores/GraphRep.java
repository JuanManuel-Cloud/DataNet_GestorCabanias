package org.data_net.main.java.controladores;

import org.data_net.main.java.interfaces.StatsObserver;
import org.data_net.main.java.interfaces.StatsSubject;
import org.data_net.main.java.vistas.MainWindow;

public class GraphRep implements StatsObserver {

    private StatsSubject statsModel;
    private MainWindow vista;
    
    public GraphRep(StatsSubject statsModel,MainWindow vista){
        this.statsModel=statsModel;
        this.vista=vista;
        statsModel.registerObserver(this);
    }
    
    @Override
    public void update(int capMaxima, int capActual, int cantCabanas) {
        vista.porcOcBar.setValue(capActual*100/capMaxima);
    }
    
}
