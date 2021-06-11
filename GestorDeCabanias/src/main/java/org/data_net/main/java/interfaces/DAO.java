package org.data_net.main.java.interfaces;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Luca
 * @param <T>
 */
public interface DAO <T> {
    
    Optional<T> get(String etiqueta);
    
    List<T> getAll();
    
    void add(T t);
    
    void update(T t);
    
    void delete(T t);
}
