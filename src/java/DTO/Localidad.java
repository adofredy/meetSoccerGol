
package DTO;

public class Localidad {
    private int id;	
    private int cantidadCanchas;	
    private String distrito;	
    private String direccion;	
    private String nombre;	
    private String telefono;

    public Localidad(int id) {
        this.id = id;
    }

    public Localidad(int id, int cantidadCanchas, String distrito, String direccion, String nombre, String telefono) {
        this.id = id;
        this.cantidadCanchas = cantidadCanchas;
        this.distrito = distrito;
        this.direccion = direccion;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidadCanchas() {
        return cantidadCanchas;
    }

    public void setCantidadCanchas(int cantidadCanchas) {
        this.cantidadCanchas = cantidadCanchas;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
