package org.data_net.main.java.interfaces;

import java.util.List;
import org.data_net.main.java.vistas.MainWindow;

public interface Administrator {
    
    
    Object insert();
    List<Object> getAll();
    void delete();
    void update();
    Object check();
}
