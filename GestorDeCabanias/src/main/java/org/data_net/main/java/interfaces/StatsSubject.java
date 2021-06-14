package org.data_net.main.java.interfaces;

public interface StatsSubject {
    void registerObserver(StatsObserver o);
    void removeObserver(StatsObserver o);
    void notifyObservers();
}
