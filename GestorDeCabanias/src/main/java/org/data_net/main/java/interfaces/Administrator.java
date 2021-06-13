package org.data_net.main.java.interfaces;

import java.util.List;

public interface Administrator <T> {
    Object insert();
    void getAll(List<T> lista);
    String delete();
    void update();
    Object check();
    void limpiar();
    void limpiarTabla();
}
