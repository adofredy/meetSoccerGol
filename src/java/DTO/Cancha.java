package DTO;

public class Cancha {
    
        private int id 	;
        private String nombre;
        private String descripcion; 	
        private String tipoCancha;
        private int idLocalidad;
        private Localidad localidad;

    public Cancha() {
    }

    public Cancha(int id) {
        this.id = id;
    }

     public Cancha(String nombre, String descripcion, String tipoCancha, int idLocalidad) {
        
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoCancha = tipoCancha;
        this.idLocalidad = idLocalidad;
    }
    
    
    public Cancha(int id, String nombre, String descripcion, String tipoCancha, int idLocalidad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoCancha = tipoCancha;
        this.idLocalidad = idLocalidad;
    }

    public Cancha(int id, String nombre, String descripcion, String tipoCancha, int idLocalidad, Localidad localidad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoCancha = tipoCancha;
        this.idLocalidad = idLocalidad;
        this.localidad = localidad;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoCancha() {
        return tipoCancha;
    }

    public void setTipoCancha(String tipoCancha) {
        this.tipoCancha = tipoCancha;
    }

    public int getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(int idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }
          
}
