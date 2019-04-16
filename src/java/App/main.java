/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import DAO.CanchaDao;
import DTO.Cancha;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author QfloresRA
 */
public class main {
    
    public static void main(String arg[]){
        
        CanchaDao canchad = new CanchaDao();
       
        // insertando cancha
        /*Cancha cancha = new Cancha(0, "cancha nueva1", "descripcion 1", "gigante", 1);
        
        if (canchad.InsertT(cancha)) {
            
            System.out.println("Cancha nueva se insertó");
        }else{
            System.out.println("No se inserto la cancha nueva");
        }*/
        
        
        //----lista de canchas
        System.out.println("Imprimiendo cancha");
        List<Cancha> lista = canchad.ListAll();
        Iterator<Cancha> citer = lista.iterator();
        
        Cancha c = null;
        
            
        while (citer.hasNext()) {            
            
            c = citer.next();
            
            System.out.println("Cancha: "+c.getId());
            System.out.println("Cancha: "+c.getNombre());
            System.out.println("Cancha: "+c.getDescripcion());
            System.out.println("Cancha: "+c.getTipoCancha());
            System.out.println("Cancha: "+c.getIdLocalidad());
            System.out.println("---");
        }
        
        
        
    }
}
