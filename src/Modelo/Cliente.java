/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author omararias
 */
public class Cliente extends Registro {
    private String telefonoCliente;
    private boolean recomendacion;
    private Reparable reparableCliente;

    public Cliente(String telefonoCliente, boolean recomendacion, Reparable reparableCliente, String tipo) {
        super(tipo);
        this.telefonoCliente = telefonoCliente;
        this.recomendacion = recomendacion;
        this.reparableCliente = reparableCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public boolean isRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(boolean recomendacion) {
        this.recomendacion = recomendacion;
    }

    public Reparable getReparableCliente() {
        return reparableCliente;
    }

    public void setReparableCliente(Reparable reparableCliente) {
        this.reparableCliente = reparableCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "telefonoCliente=" + telefonoCliente + ", recomendacion=" + recomendacion + ", reparableCliente=" + reparableCliente + '}';
    }
    
    

    
    
    
    
    
    
    
    
}
