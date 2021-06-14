package org.data_net.main.java.interfaces;

import java.util.List;

public interface DataSubjects {
    void registerObserver(DataObservers o);
    void removeObserver(DataObservers o);
    void notifyObservers(List lista);
}
