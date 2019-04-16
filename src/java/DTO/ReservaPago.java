package DTO;

public class ReservaPago {
    
    private int idTipoPago;
    private String descripcion;
    private byte vigente; 

    public int getIdTipoPago() {
        return idTipoPago;
    }

    public void setIdTipoPago(int idTipoPago) {
        this.idTipoPago = idTipoPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public byte getVigente() {
        return vigente;
    }

    public void setVigente(byte vigente) {
        this.vigente = vigente;
    }
    
    
    
}
