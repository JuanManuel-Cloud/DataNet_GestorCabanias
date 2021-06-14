package org.data_net.main.java.modelos;


import java.util.ArrayList;
import java.util.List;
import org.data_net.main.java.controladores.GraphRep;
import org.data_net.main.java.controladores.NumRep;
import org.data_net.main.java.interfaces.DataSubjects;
import org.data_net.main.java.interfaces.DataObservers;
import org.data_net.main.java.interfaces.StatsObserver;
import org.data_net.main.java.interfaces.StatsSubject;


public class StatsModel implements DataObservers,StatsSubject {

    private ArrayList observers;
    private DataSubjects mainController;
    private int capMaxima;
    private int capActual;
    private int cantCabanas;
    
    public StatsModel(DataSubjects mainController){
        observers = new ArrayList();
        this.mainController = mainController;
        mainController.registerObserver(this);
        
        capMaxima=0;
        capActual=0;
        cantCabanas=0;
    };
    
    @Override
    public void update(List lista) {
        int temp=0;
        if(lista.get(0) instanceof Cabin){
            List<Cabin> listaCabins=new ArrayList<Cabin>();
            listaCabins=(ArrayList<Cabin>) lista;
            System.out.println("Son cabanas");
            for(int i=0;i<listaCabins.size();i++){
                temp+=listaCabins.get(i).getCapacidad();
            }
            capMaxima=temp;
            cantCabanas=listaCabins.size();
            
        }
        else{
            List<Reserve> listaReserves=new ArrayList<Reserve>();
            listaReserves=(ArrayList<Reserve>) lista;
            System.out.println("Son reservas");
            for(int i=0;i<listaReserves.size();i++){
                temp+=listaReserves.get(i).getCantidadInq();
            }
            capActual=temp;
        }
        notifyObservers();
    }

    @Override
    public void registerObserver(StatsObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(StatsObserver o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            StatsObserver observer = (StatsObserver) observers.get(i);
            observer.update(capMaxima,capActual,cantCabanas);
        }
    }
    
}
