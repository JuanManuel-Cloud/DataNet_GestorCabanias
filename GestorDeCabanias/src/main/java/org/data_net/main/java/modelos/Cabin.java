package org.data_net.main.java.modelos;

import org.apache.commons.lang3.RandomStringUtils;

public class Cabin {
    private String id;
    private String etiqueta;
    private int capacidad;
    
    public Cabin(){
        id = RandomStringUtils.randomAlphanumeric(8);
    }

    public Cabin(String etiqueta,int capacidad){
        id = RandomStringUtils.randomAlphanumeric(8);
        this.etiqueta=etiqueta;
        this.capacidad=capacidad;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id=id;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
}
