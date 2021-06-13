package org.data_net.main.java.modelos;


import java.util.ArrayList;
import java.util.List;
import org.data_net.main.java.interfaces.DataSubject;
import org.data_net.main.java.interfaces.DataObserver;


public class StatsModel implements DataObserver {

    private DataSubject mainController;
    private int capMaxima;
    private int capActual;
    
    public StatsModel(DataSubject mainController){
        this.mainController=mainController;
        mainController.registerObserver(this);
        capMaxima=0;
        capActual=0;
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
    }
    
}
