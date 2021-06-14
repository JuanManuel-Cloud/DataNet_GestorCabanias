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
import org.data_net.main.java.modelos.Reserve;

public class ReservesDAO implements DAO {
    private Connection  connection;
    private ResultSet rs;
    private PreparedStatement ps;
    
    private static final String INSERT_SQL = "INSERT INTO reservas( id, inquilino, telefono, mail, cantidad_inq, cabana, fecha_desde, fecha_hasta, costo) VALUES( ?, ?, ?, ?, ?, ?,?, ?, ?)";
    private static final String DELETE_SQL = "DELETE FROM reservas WHERE id=? ";
    private static final String GET_ALL_SQL = "SELECT * FROM reservas";
    //"SELECT * FROM reservas ORDER BY ASC fecha_desde";
    private static final String CHECK_SQL = "SELECT * FROM reservas WHERE id=? ";
    private static final String UPDATE_SQL = "UPDATE reservas SET inquilino=?, telefono=?, mail=?, cantidad_inq=?, cabana=?, fecha_desde=?, fecha_hasta=?, costo=?  WHERE id=?";
    
    
    private Connection connect(){
        Connection conn = null;
        
        try{
            conn = DriverManager.getConnection("jdbc:sqlite:./gestorcabanias.db");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    @Override
    public Optional check(String id) {
        Optional<String> opt = Optional.empty();
        
        try{
            connection=this.connect();
            
            ps = this.connection.prepareStatement(CHECK_SQL);
            ps.setString(1,id);
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
               reserveLoc.setCantidadInq(rs.getInt(5));
               reserveLoc.setCabana(rs.getString(6));
               reserveLoc.setFechaDesde(rs.getString(7));
               reserveLoc.setFechaHasta(rs.getString(8));
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
        Reserve reserveLoc = (Reserve)reserve;
           
        try{
            connection=this.connect();
            ps = this.connection.prepareStatement(INSERT_SQL);
            ps.setString(1,reserveLoc.getId());
            ps.setString(2,reserveLoc.getInquilino());
            ps.setString(3,reserveLoc.getTelefono());
            ps.setString(4,reserveLoc.getMail());
            ps.setInt(5,reserveLoc.getCantidadInq());
            ps.setString(6,reserveLoc.getCabana());
            ps.setString(7,reserveLoc.getFechaDesde());
            ps.setString(8,reserveLoc.getFechaHasta());
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
        Reserve reserveLoc = (Reserve)reserve;
           
        try{
            connection=this.connect();
            
            ps = this.connection.prepareStatement(UPDATE_SQL);
            ps.setString(1,reserveLoc.getInquilino());
            ps.setString(2,reserveLoc.getTelefono());
            ps.setString(3,reserveLoc.getMail());
            ps.setInt(4,reserveLoc.getCantidadInq());
            ps.setString(5,reserveLoc.getCabana());
            ps.setString(6,reserveLoc.getFechaDesde());
            ps.setString(7,reserveLoc.getFechaHasta());
            ps.setInt(8,reserveLoc.getCosto());
            ps.setString(9,reserveLoc.getId());
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
    public void delete(String id) {
        
        try{
            connection=this.connect();
            ps = this.connection.prepareStatement(DELETE_SQL);
            ps.setString(1,id);
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