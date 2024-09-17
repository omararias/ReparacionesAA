/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author omararias
 */
public class Inventario implements Serializable{
    private int bumperOneS;
    private int bumperOne;
    private int bumperSeries;
    private int potenciometro;
    private int palanca;
    private int gomaPrimera;
    private int gomaTercera;
    private int gomaSeries;
    private int microswitch;

    public Inventario(int bumperOneS, int bumperOne, int bumperSeries, int potenciometro, int palanca, int gomaPrimera, int gomaTercera, int gomaSeries, int microswitch) {
        this.bumperOneS = bumperOneS;
        this.bumperOne = bumperOne;
        this.bumperSeries = bumperSeries;
        this.potenciometro = potenciometro;
        this.palanca = palanca;
        this.gomaPrimera = gomaPrimera;
        this.gomaTercera = gomaTercera;
        this.gomaSeries = gomaSeries;
        this.microswitch = microswitch;
    }
    
    public void actualizarPieza(String pieza,int restock){
        switch (pieza){
            
            
        }
        
    }

    public int getBumperOneS() {
        return bumperOneS;
    }

    public void setBumperOneS(int bumperOneS) {
        this.bumperOneS = bumperOneS;
    }

    public int getBumperOne() {
        return bumperOne;
    }

    public void setBumperOne(int bumperOne) {
        this.bumperOne = bumperOne;
    }

    public int getBumperSeries() {
        return bumperSeries;
    }

    public void setBumperSeries(int bumperSeries) {
        this.bumperSeries = bumperSeries;
    }

    public int getPotenciometro() {
        return potenciometro;
    }

    public void setPotenciometro(int potenciometro) {
        this.potenciometro = potenciometro;
    }

    public int getPalanca() {
        return palanca;
    }

    public void setPalanca(int palanca) {
        this.palanca = palanca;
    }

    public int getGomaPrimera() {
        return gomaPrimera;
    }

    public void setGomaPrimera(int gomaPrimera) {
        this.gomaPrimera = gomaPrimera;
    }

    public int getGomaTercera() {
        return gomaTercera;
    }

    public void setGomaTercera(int gomaTercera) {
        this.gomaTercera = gomaTercera;
    }

    public int getGomaSeries() {
        return gomaSeries;
    }

    public void setGomaSeries(int gomaSeries) {
        this.gomaSeries = gomaSeries;
    }

    public int getMicroswitch() {
        return microswitch;
    }

    public void setMicroswitch(int microswitch) {
        this.microswitch = microswitch;
    }

    @Override
    public String toString() {
        return "Inventario:\n" +"Potenciometros: " + potenciometro  +"\nBumper One S: " + bumperOneS + "\nBumperOne: " + bumperOne + "\nBumper Series=" + bumperSeries + "\nPalancas: " + palanca + "\nGomas primera generacion: " + gomaPrimera + "\nGomas tercera generacion: " + gomaTercera + "\n Gomas Xbox Series: " + gomaSeries + "\n Microswitch BUMPER: " + microswitch ;
    }
    
    
    
  
    
    
    
    
}
