package org.data_net.main.java.interfaces;

import java.util.List;

public interface dataSubject {
    
    void registerObserver(dataObserver o);
    void removeObserver(dataObserver o);
    void notifyObservers(List lista);
    
}
