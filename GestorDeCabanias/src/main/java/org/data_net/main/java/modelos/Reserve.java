/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.data_net.main.java.modelos;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author Luca
 */
public class Reserve {
    private String id;
    private String inquilino;
    private String telefono;
    private String mail;
    private int cantidad_inq;
    private String cabana;
    private String fecha_desde;
    private String fecha_hasta;
    private int costo;
    
    
    public Reserve(){
    }
    
    public Reserve(String inquilino,String telefono,String mail, int cantidad_inq,String cabana,String fecha_desde,String fecha_hasta,int costo){
        id = RandomStringUtils.randomAlphanumeric(8);
        this.inquilino=inquilino;
        this.telefono=telefono;
        this.mail=mail;
        this.cantidad_inq=cantidad_inq;
        this.cabana=cabana;
        this.fecha_desde=fecha_desde;
        this.fecha_hasta=fecha_hasta;
        this.costo=costo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInquilino() {
        return inquilino;
    }

    public void setInquilino(String inquilino) {
        this.inquilino = inquilino;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getCantidad_inq() {
        return cantidad_inq;
    }

    public void setCantidad_inq(int cantidad_inq) {
        this.cantidad_inq = cantidad_inq;
    }

    public String getCabana() {
        return cabana;
    }

    public void setCabana(String cabana) {
        this.cabana = cabana;
    }

    public String getFecha_desde() {
        return fecha_desde;
    }

    public void setFecha_desde(String fecha_desde) {
        this.fecha_desde = fecha_desde;
    }

    public String getFecha_hasta() {
        return fecha_hasta;
    }

    public void setFecha_hasta(String fecha_hasta) {
        this.fecha_hasta = fecha_hasta;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    
}
