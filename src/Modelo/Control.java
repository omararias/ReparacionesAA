/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author omararias
 */
public class Control extends Reparable{

    public Control(String color, String modelo, String detalle, String estado, String tipo) {
        super(color, modelo, detalle, estado, tipo);
    }

    @Override
    public String toString() {
        return "Control- " + super.toString();
    }
    
    

    
    
    
    
    

}
