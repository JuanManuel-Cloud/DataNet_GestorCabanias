package org.data_net.main.java.interfaces;

import java.util.List;
//Interfaz que deben implementar todos las clases que sean observadas
public interface DataSubject {
    
    void registerObserver(DataObserver o);
    void removeObserver(DataObserver o);
    void notifyObservers(List lista);
    
}
