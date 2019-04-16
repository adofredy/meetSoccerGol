
package DTO;


import java.sql.Date;

public class Reserva {
    
    private int idReserva;
    private byte estado;
    private int minjugador;
    private int maxjugador;
    private int confirmados;
    private Date fechaReserva;
    private int horaReserva;
    private Cancha cancha;
    private Usuario usuario;
    private Turno turno;
    private ReservaPago reservapago;

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public byte getEstado() {
        return estado;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }

    public int getMinjugador() {
        return minjugador;
    }

    public void setMinjugador(int minjugador) {
        this.minjugador = minjugador;
    }

    public int getMaxjugador() {
        return maxjugador;
    }

    public void setMaxjugador(int maxjugador) {
        this.maxjugador = maxjugador;
    }

    public int getConfirmados() {
        return confirmados;
    }

    public void setConfirmados(int confirmados) {
        this.confirmados = confirmados;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public int getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(int horaReserva) {
        this.horaReserva = horaReserva;
    }

    public Cancha getCancha() {
        return cancha;
    }

    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public ReservaPago getReservapago() {
        return reservapago;
    }

    public void setReservapago(ReservaPago reservapago) {
        this.reservapago = reservapago;
    }

   
    
    
    
}
