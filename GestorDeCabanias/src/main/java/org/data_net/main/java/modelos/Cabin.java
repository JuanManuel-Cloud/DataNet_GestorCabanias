package org.data_net.main.java.modelos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author Luca
 */
public class Cabin {
    private String id;
    private String etiqueta;
    private int capacidad;
    
    public Cabin(){
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
