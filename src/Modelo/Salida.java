/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author omararias
 */
public class Salida extends Registro{
    private int montoSalida;
    private String descripcion;
    private Fecha fechaSalida;

    public Salida(int montoSalida, String descripcion, Fecha fechaSalida, String tipo) {
        super(tipo);
        this.montoSalida = montoSalida;
        this.descripcion = descripcion;
        this.fechaSalida = fechaSalida;
    }

    public int getMontoSalida() {
        return montoSalida;
    }

    public void setMontoSalida(int montoSalida) {
        this.montoSalida = montoSalida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Fecha getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Fecha fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return super.toString()+"Monto salida:"+getMontoSalida()+" Descripcion: "+getDescripcion()+"  Fecha: "+fechaSalida;
    }
    
    
    
}
