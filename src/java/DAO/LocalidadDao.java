package DAO;

import DTO.Localidad;
import ICrud.CrudS;
import java.util.List;


public class LocalidadDao implements CrudS<Localidad>{
    
    private static final String  SelectAll = "";
    private static final String  Insert = "";
    private static final String  Update = "";
    private static final String  Delete = "";
    
    
    @Override
    public Localidad ViewDetail(Integer key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Localidad> ListAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Localidad> ListByKey(Object k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean InsertT(Localidad I) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean UpdateT(Localidad U) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean DeleteT(Localidad D) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
