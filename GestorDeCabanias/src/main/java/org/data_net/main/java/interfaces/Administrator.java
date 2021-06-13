package org.data_net.main.java.interfaces;

import java.util.ArrayList;
import java.util.List;
import org.data_net.main.java.vistas.MainWindow;

public interface Administrator <T> {
    
    
    Object insert();
    void getAll(List<T> lista);
    String delete();
    void update();
    Object check();
    void limpiar();
}
