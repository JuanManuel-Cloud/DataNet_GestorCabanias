package org.data_net.main.java.modelos.base_de_datos.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.data_net.main.java.interfaces.DAO;
import org.data_net.main.java.modelos.Cabin;
import org.data_net.main.java.modelos.Reserve;




/**
 *
 * @author Luca
 */
public class ReservesDAO implements DAO {
    private Connection  connection;
    private Statement statement;
    private ResultSet rs;
    private Cabin cabin;
    private static final String INSERT_SQL = "INSERT INTO reservas( id, inquilino, telefono, mail, cantidad_inq, cabana, fecha_desde, fecha_hasta, costo) VALUES( ?, ?, ?, ?, ?, ?,?, ?, ?)";
    private static final String DELETE_SQL = "DELETE FROM reservas WHERE id= ";
    private static final String GET_ALL_SQL = "SELECT * FROM reservas ORDER BY ASC fecha_desde";
    private static final String GET_SQL = "SELECT * FROM reservas WHERE inquilino= ";
    //private static final String UPDATE_SQL = "UPDATE cabanas SET etiqueta= ,capacidad=  WHERE id=?"; //todo Revisar VALUES ?
    
    public ReservesDAO(){
        connection = null;
        statement = null;
    }
    
    private Connection connect(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection("jdbc:sqlite:./src/main/java/org/data_net/main/java/modelos/base_de_datos/dao/gestorcabanias.db");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }

    @Override
    public Optional get(String etiqueta) {
        PreparedStatement ps = null;
        Optional<String> opt = Optional.empty();
        try{
            connection=this.connect();
            ps = this.connection.prepareStatement(GET_SQL.concat("'"+etiqueta+"'"));
            rs=ps.executeQuery();
            opt=Optional.ofNullable(rs.getString(1));
        
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }finally{
            try{
                if(connection!=null){
                    connection.close();
                }
            }catch(SQLException e){
                System.err.println(e);
            }
        }
        return opt;
    }
    
    @Override
    public List getAll() {
        PreparedStatement ps = null;
        List<Reserve> reserveList=new ArrayList<>();
        try{
            connection=this.connect();
            ps = this.connection.prepareStatement(GET_ALL_SQL);
            rs=ps.executeQuery();
            while(rs.next()){
               Reserve reserveLoc = new Reserve(); 
               reserveLoc.setId(rs.getString(1));
               reserveLoc.setInquilino(rs.getString(2));
               reserveLoc.setTelefono(rs.getString(3));
               reserveLoc.setMail(rs.getString(4));
               reserveLoc.setCantidad_inq(rs.getInt(5));
               reserveLoc.setCabana(rs.getString(6));
               reserveLoc.setFecha_desde(rs.getString(7));
               reserveLoc.setFecha_hasta(rs.getString(8));
               reserveLoc.setCosto(rs.getInt(9));
               
               reserveList.add(reserveLoc);
            }
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }finally{
            try{
                if(connection!=null){
                    connection.close();
                }
            }catch(SQLException e){
                System.err.println(e);
            }
            
        }
        return reserveList;
    }

    @Override
    public void add(Object reserve) {
        
        PreparedStatement ps = null;
        Reserve reserveLoc = (Reserve)reserve;
           
        try{
            connection=this.connect();
            ps = this.connection.prepareStatement(INSERT_SQL);
            ps.setString(1,reserveLoc.getId());
            ps.setString(2,reserveLoc.getInquilino());
            ps.setString(3,reserveLoc.getTelefono());
            ps.setString(4,reserveLoc.getMail());
            ps.setInt(5,reserveLoc.getCantidad_inq());
            ps.setString(6,reserveLoc.getCabana());
            ps.setString(7,reserveLoc.getFecha_desde());
            ps.setString(8,reserveLoc.getFecha_hasta());
            ps.setInt(9,reserveLoc.getCosto());
            
            ps.executeUpdate();
             
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }finally{
            try{
                if(connection!=null){
                    connection.close();
                }
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }

    @Override
    public void update(Object reserve) {
        PreparedStatement ps = null;
        Reserve reserveLoc = (Reserve)reserve;
           
        try{
            connection=this.connect();
            
            ps = this.connection.prepareStatement("UPDATE cabanas SET " //todo Revisar VALUES ?
                    + "inquilino= "+"'"+reserveLoc.getInquilino()+"'" 
                    +" ,telefono= "+"'"+reserveLoc.getTelefono()+"'"
                    +" ,mail= "+"'"+reserveLoc.getMail()+"'"
                    +" ,cantidad_inq= "+"'"+reserveLoc.getCantidad_inq()+"'"
                    +" ,cabana= "+"'"+reserveLoc.getCabana()+"'"
                    +" ,fecha_desde= "+"'"+reserveLoc.getFecha_desde()+"'"
                    +" ,fecha_hasta= "+"'"+reserveLoc.getFecha_hasta()+"'"
                    +" ,costo= "+"'"+reserveLoc.getCosto()+"'"
                    +" WHERE id= "+"'"+reserveLoc.getId()+"'");
           
            ps.executeUpdate();
             
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }finally{
            try{
                if(connection!=null){
                    connection.close();
                }
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }

    @Override
    public void delete(Object reserve) {
     
        PreparedStatement ps = null;
        Reserve reserveLoc = (Reserve)reserve;
           
        try{
            connection=this.connect();
            ps = this.connection.prepareStatement(DELETE_SQL.concat("'"+reserveLoc.getId()+"'"));
            ps.executeUpdate();
        
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }finally{
            try{
                if(connection!=null){
                    connection.close();
                }
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
}