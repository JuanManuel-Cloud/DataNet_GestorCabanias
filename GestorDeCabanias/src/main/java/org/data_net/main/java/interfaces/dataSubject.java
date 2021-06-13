package org.data_net.main.java.interfaces;

import java.util.List;

public interface DataSubject {
    
    void registerObserver(DataObserver o);
    void removeObserver(DataObserver o);
    void notifyObservers(List lista);
    
}
