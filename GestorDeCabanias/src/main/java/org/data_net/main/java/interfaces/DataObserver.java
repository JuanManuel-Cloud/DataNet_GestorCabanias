package org.data_net.main.java.interfaces;

import java.util.List;
//Interfaz que deben implementar todos las clases observadoras
public interface DataObserver <T> {
    
    void update(List<T> lista);
}
