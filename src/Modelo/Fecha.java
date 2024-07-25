/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author omararias
 */
public class Fecha extends Registro{
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio, String tipo) {
        super(tipo);
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    

    @Override
    public String toString() {
        return this.dia+"/"+this.mes+"/"+this.anio;
    }
    
    
    
}
