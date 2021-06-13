package org.data_net.main.java.interfaces;

import java.util.List;

public interface DataObserver <T> {
    
    void update(List<T> lista);
}
