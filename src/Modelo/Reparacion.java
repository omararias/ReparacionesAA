/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author omararias
 */
public class Reparacion extends Registro {
    private int costo;
    private String metodoPago;
    private Reparable reparable;
    private Fecha fechaReparacion;

    public Reparacion(int costo, String metodoPago, Reparable reparable, Fecha fechaReparacion, String tipo) {
        super(tipo);
        this.costo = costo;
        this.metodoPago = metodoPago;
        this.reparable = reparable;
        this.fechaReparacion = fechaReparacion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Reparable getReparable() {
        return reparable;
    }

    public void setReparable(Reparable reparable) {
        this.reparable = reparable;
    }

    public Fecha getFechaReparacion() {
        return fechaReparacion;
    }

    public void setFechaReparacion(Fecha fechaReparacion) {
        this.fechaReparacion = fechaReparacion;
    }

    @Override
    public String toString() {
        return super.toString()+"Reparacion " + "costo=" + costo + ", metodoPago=" + metodoPago + ", reparable=" + reparable + ", fechaReparacion=" + fechaReparacion;
    }
    
    
    
    
    
    
    
    
}
