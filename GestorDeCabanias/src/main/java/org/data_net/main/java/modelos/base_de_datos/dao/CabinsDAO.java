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




/**
 *
 * @author Luca
 */
public class CabinsDAO implements DAO {
    private Connection  connection;
    private Statement statement;
    private ResultSet rs;
    private Cabin cabin;
    private static final String INSERT_SQL = "INSERT INTO cabanas( id, etiqueta, capacidad) VALUES( ?, ?, ?)";
    private static final String DELETE_SQL = "DELETE FROM cabanas WHERE id= ";
    private static final String GET_ALL_SQL = "SELECT * FROM cabanas ORDER BY ASC etiqueta";
    private static final String GET_SQL = "SELECT * FROM cabanas WHERE etiqueta= ";
    //private static final String UPDATE_SQL = "UPDATE cabanas SET etiqueta= ,capacidad=  WHERE id=?"; //todo Revisar VALUES ?
    
    public CabinsDAO(){
        connection = null;
        statement = null;
    }
    
    private Connection connect(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection("jdbc:sqlite:D:/Facultad/IngenieriaDeSoftware/Database/gestorcabanias.db");
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
        List<Cabin> cabinList=new ArrayList<>();
        try{
            connection=this.connect();
            ps = this.connection.prepareStatement(GET_ALL_SQL);
            rs=ps.executeQuery();
            while(rs.next()){
               Cabin cabinLoc = new Cabin(); 
               cabinLoc.setId(rs.getString(1));
               cabinLoc.setEtiqueta(rs.getString(2));
               cabinLoc.setCapacidad(rs.getInt(3));
               cabinList.add(cabinLoc);
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
        return cabinList;
    }

    @Override
    public void add(Object cabin) {
        
        PreparedStatement ps = null;
        Cabin cabinLoc = (Cabin)cabin;
           
        try{
            connection=this.connect();
            ps = this.connection.prepareStatement(INSERT_SQL);
            ps.setString(1,cabinLoc.getId());
            ps.setString(2,cabinLoc.getEtiqueta());
            ps.setInt(3,cabinLoc.getCapacidad());
            
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
    public void update(Object cabin) {
        PreparedStatement ps = null;
        Cabin cabinLoc = (Cabin)cabin;
           
        try{
            connection=this.connect();
            
            ps = this.connection.prepareStatement("UPDATE cabanas SET " //todo Revisar VALUES ?
                    + "etiqueta= "+"'"+cabinLoc.getEtiqueta()+"'" 
                    +" ,capacidad= "+cabinLoc.getCapacidad()
                    +" WHERE id= "+"'"+cabinLoc.getId()+"'");
           
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
    public void delete(Object cabin) {
     
        PreparedStatement ps = null;
        Cabin cabinLoc = (Cabin)cabin;
           
        try{
            connection=this.connect();
            ps = this.connection.prepareStatement(DELETE_SQL.concat("'"+cabinLoc.getId()+"'"));
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

