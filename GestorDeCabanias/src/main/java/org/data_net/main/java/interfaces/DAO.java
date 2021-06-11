package org.data_net.main.java.interfaces;

import java.util.List;
import java.util.Optional;

public interface DAO <T> {
    
    Optional<T> check(String etiqueta);
    
    List<T> getAll();
    
    void add(T t);
    
    void update(T t);
    
    void delete(T t);
}
