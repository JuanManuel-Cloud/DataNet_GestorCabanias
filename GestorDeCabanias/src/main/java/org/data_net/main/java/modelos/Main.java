package org.data_net.main.java.modelos;

import java.util.*;
import org.data_net.main.java.modelos.base_de_datos.dao.CabinsDAO;

/**
 * 
 */
public class Main {

    /**
     * Default constructor
     * @param args
     */
    public static void main(String args[]){
        CabinsDAO a=new CabinsDAO();
        //Cabin cabin=new Cabin("Bordo",15);
        //a.add(cabin);
        //cabin.setId("dC6NqXh0");
        //a.update(cabin);
        //a.delete(cabin);
        if(a.get("Bordo").isPresent()){
            System.out.println("hay algo");
    }
        else{
            System.out.println("no hay nada");
        }
    }

}