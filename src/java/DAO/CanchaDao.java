package DAO;

import App.Conexion;
import DTO.Cancha;
import ICrud.CrudS;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * author 
 */
public class CanchaDao implements CrudS<Cancha>{
    
    private static final String  SelectAll = "SELECT * FROM cancha;";
    private static final String  Insert = "INSERT INTO cancha(nombre, descripcion, tipoCancha, idLocalidad) VALUES (?,?,?,?);";
    private static final String  Update = "UPDATE cancha SET nombre=?,descripcion=?,tipoCancha=?,idLocalidad=? WHERE id=?;";
    private static final String  Delete = "DELETE FROM cancha WHERE id = ?;";
    
    Conexion con = null;    
    PreparedStatement ps = null;    
    ResultSet rs = null;
    
    Cancha cancha = null;
    
    @Override
    public Cancha ViewDetail(Integer key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public List<Cancha> ListAll() {
        
        ArrayList<Cancha> list= new ArrayList<>();
        
        try {
            ps = con.conectar().prepareStatement(SelectAll);
            
            rs = ps.executeQuery();
            
            while (rs.next()) {                
                cancha = new Cancha(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
                list.add(cancha);
            }
            
            return list;
            
        } catch (Exception e) {
            
            e.printStackTrace(System.out);
        }finally{
             
             Conexion.close(ps);
             Conexion.close(rs);
             Conexion.close((Connection) con);   
         }
        return list;
    }
    @Override
    public List<Cancha> ListByKey(Object k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public boolean InsertT(Cancha I) {        
        
        try {
            ps = con.conectar().prepareStatement(Insert);
            ps.setString(1, I.getNombre());
            ps.setString(2, I.getDescripcion());
            ps.setString(3, I.getTipoCancha());
            ps.setInt(4, I.getIdLocalidad());       
            
            if (ps.executeUpdate() > 0) {
                
                return true;
            }
            
        } catch (Exception e) {
            
            e.printStackTrace(System.out);
        }finally{
             
             Conexion.close(ps);
             Conexion.close(rs);
             Conexion.close((Connection) con);
         }
        return false;
    }
    @Override
    public boolean UpdateT(Cancha U) {
        
         try {
            ps = con.conectar().prepareStatement(Update);
            
            ps.setString(1, U.getNombre());
            ps.setString(2, U.getDescripcion());
            ps.setString(3, U.getTipoCancha());
            ps.setInt(4, U.getIdLocalidad()); 
            
            ps.setInt(5, U.getId());
            
            if (ps.executeUpdate() > 0) {
                
                return true;
            }
            
        } catch (Exception e) {
            
            e.printStackTrace(System.out);
        }finally{
             
             Conexion.close(ps);
             Conexion.close(rs);
             Conexion.close((Connection) con);
             
         }
        
        return false;
    }

    @Override
    public boolean DeleteT(Cancha D) {
       
         try {
            
            ps = con.conectar().prepareStatement(Delete);
            
            ps.setInt(1, D.getId());
            
             if (ps.executeUpdate() > 0) {
                 return true;
             }
                        
        } catch (Exception e) {
            
            e.printStackTrace(System.out);
        }finally{
             
             Conexion.close(ps);
             Conexion.close(rs);
             Conexion.close((Connection) con);
             
         }
        
        return false;
    }
    
}
