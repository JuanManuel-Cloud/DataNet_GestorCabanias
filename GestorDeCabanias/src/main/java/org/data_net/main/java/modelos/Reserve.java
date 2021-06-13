package org.data_net.main.java.modelos;

import org.apache.commons.lang3.RandomStringUtils;

public class Reserve {
    private String id;
    private String inquilino;
    private String telefono;
    private String mail;
    private int cantidadInq;
    private String cabana;
    private String fechaDesde;
    private String fechaHasta;
    private int costo;
    
    
    public Reserve(){
        id = RandomStringUtils.randomAlphanumeric(8);
    }
    
    public Reserve(String inquilino,String telefono,String mail, int cantidad_inq,String cabana,String fecha_desde,String fecha_hasta,int costo){
        id = RandomStringUtils.randomAlphanumeric(8);
        this.inquilino=inquilino;
        this.telefono=telefono;
        this.mail=mail;
        this.cantidadInq=cantidad_inq;
        this.cabana=cabana;
        this.fechaDesde=fecha_desde;
        this.fechaHasta=fecha_hasta;
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

    public int getCantidadInq() {
        return cantidadInq;
    }

    public void setCantidadInq(int cantidadInq) {
        this.cantidadInq = cantidadInq;
    }

    public String getCabana() {
        return cabana;
    }

    public void setCabana(String cabana) {
        this.cabana = cabana;
    }

    public String getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(String fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public String getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(String fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    
}
