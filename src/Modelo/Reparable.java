/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author omararias
 */
public class Reparable extends Registro {
    private String color;
    private String modelo;
    private String detalle;
    private String estado;

    public Reparable(String color, String modelo, String detalle, String estado, String tipo) {
        super(tipo);
        this.color = color;
        this.modelo = modelo;
        this.detalle = detalle;
        this.estado = estado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "color=" + color + ", modelo=" + modelo + ", detalle=" + detalle + ", estado=" + estado;
    }
    
    
    
    


    
}
