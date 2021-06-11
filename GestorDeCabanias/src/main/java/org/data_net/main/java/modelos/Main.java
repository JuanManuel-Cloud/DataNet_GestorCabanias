package org.data_net.main.java.modelos;

import java.util.*;
import org.data_net.main.java.modelos.base_de_datos.dao.CabinsDAO;
import org.data_net.main.java.modelos.base_de_datos.dao.ReservesDAO;


public class Main {

    
    public static void main(String args[]){
        //CabinsDAO a=new CabinsDAO();
        //Cabin cabin=new Cabin("Violeta",6);
        //a.add(cabin);
        ReservesDAO b=new ReservesDAO();
        Reserve reserve=new Reserve("Carlos","4515266","carlosperez@gmail.com",5,"Amarillo","11062021","18072021",15000);
        //b.add(reserve);
        reserve.setId("abtqRSON");
        //reserve.setCantidad_inq(8);
        //b.update(reserve);
        b.delete(reserve);
        //cabin.setId("zhd6PkHz");
        //a.update(cabin);
        //a.update(cabin);
        //a.delete(cabin);
        /*if(a.get("Magenta").isPresent()){
            System.out.println("hay algo");
        }
        else{
            System.out.println("no hay nada");
        }*/
    }

}