
package ICrud;

import java.util.List;

/**
 *
 * @author RuthAndreaQB
 */
public interface CrudS <Anything>{  
    
    
    public Anything ViewDetail(Integer key);
    
    public List<Anything> ListAll();
    
    public List<Anything> ListByKey(Object k);
    
    public boolean InsertT(Anything I);
    
    public boolean UpdateT(Anything U);
    
    public boolean DeleteT(Anything D);
    
    
}
