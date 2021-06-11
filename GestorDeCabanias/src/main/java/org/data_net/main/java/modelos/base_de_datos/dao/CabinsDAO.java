package org.data_net.main.java.modelos.base_de_datos.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.data_net.main.java.interfaces.DAO;
import org.data_net.main.java.modelos.Cabin;

public class CabinsDAO implements DAO {
    private Connection  connection;
    private ResultSet rs;
    private PreparedStatement ps;
    
    private static final String INSERT_SQL = "INSERT INTO cabanas ( id, etiqueta, capacidad) VALUES( ?, ?, ?)";
    private static final String DELETE_SQL = "DELETE FROM cabanas WHERE id=? ";
    private static final String GET_ALL_SQL = "SELECT * FROM cabanas ORDER BY ASC etiqueta";
    private static final String CHECK_SQL = "SELECT * FROM cabanas WHERE etiqueta=? ";
    private static final String UPDATE_SQL = "UPDATE cabanas SET etiqueta=? ,capacidad=?  WHERE id=?";
    
    
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
    public Optional check(String etiqueta) {
        Optional<String> opt = Optional.empty();
        
        try{
            connection=this.connect();
            
            ps = this.connection.prepareStatement(CHECK_SQL);
            ps.setString(1,etiqueta);
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
        Cabin cabinLoc = (Cabin)cabin;
           
        try{
            connection=this.connect();
            
            ps = this.connection.prepareStatement(UPDATE_SQL);
            ps.setString(1,cabinLoc.getEtiqueta());
            ps.setInt(2,cabinLoc.getCapacidad());
            ps.setString(3,cabinLoc.getId());
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
        Cabin cabinLoc = (Cabin)cabin;
           
        try{
            connection=this.connect();
            ps = this.connection.prepareStatement(DELETE_SQL);
            ps.setString(1,cabinLoc.getId());
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

