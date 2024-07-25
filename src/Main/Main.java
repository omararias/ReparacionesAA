/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Modelo.Inventario;
import Modelo.Registro;
import Modelo.Reparacion;
import Vista.FramePrincipal;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author omararias
 */
public class Main {
    
    //public static ArrayList<Registro> registrosLista = new ArrayList<Registro>();
    //ArrayList<> registrosLista=leerRegistros("registros.txt");
    public static ArrayList<Registro> registrosLista =leerRegistros("registros.txt");
    public static Inventario inventario= new Inventario(0,0,0,0,0,0,0,0,0);
    
    
    
    public static String convertirArrayListAString(ArrayList<Registro> lista) {
        StringBuilder sb = new StringBuilder();
        for (Registro registro : lista) {
            sb.append(registro.toString()).append("\n");
        }
        return sb.toString();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        FramePrincipal framePrincipal= new FramePrincipal();
        
        
        framePrincipal.setVisible(true);
    }
    
    public static ArrayList<Registro> obtenerReparacionesPendientes(){
        ArrayList<Registro>reparacionesPendientes=new ArrayList<Registro>(); 
        
        for (Registro registro : registrosLista) {
            if(registro instanceof Reparacion){
                if (registro.getTipo().equals("pendiente")){
                    reparacionesPendientes.add(registro);
                }
                
            }
            
            
        }
        
        return reparacionesPendientes;
    }
    
    public static void escribirRegistros(ArrayList<Registro> registros, String nombreArchivo) {
        try (FileOutputStream fos = new FileOutputStream(nombreArchivo);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(registros);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static ArrayList<Registro> leerRegistros(String nombreArchivo) {
        ArrayList<Registro> registros = null;
        try (FileInputStream fis = new FileInputStream(nombreArchivo);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            registros = (ArrayList<Registro>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return registros;
    }
    
    public static void verificarOCrearArchivo(String nombreArchivo) {
        try {
            File archivo = new File(nombreArchivo);
            if (!archivo.exists()) {
                archivo.createNewFile();
                // Escribimos un ArrayList vacío en el archivo
                try (FileOutputStream fos = new FileOutputStream(nombreArchivo);
                     ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                    oos.writeObject(new ArrayList<Registro>());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
    
    
    
    /*
    public static void escrituraBD() {
        String nombreArchivo = "registros.txt";
        try {
            FileOutputStream archivo = new FileOutputStream(nombreArchivo);
            ObjectOutputStream salida = new ObjectOutputStream(archivo); //1.Abrir flujo de datos
            salida.writeObject(registrosLista);

            salida.close(); //3.Cerrando flujo de datos
        } catch (IOException excep1) {
            System.out.println("Imposible abrir el archivo para escribir");
        }
    }

    
    public static void lecturaBD() {
        String nombreArchivo = "registros.txt";
        try {
            FileInputStream archivo2 = new FileInputStream(nombreArchivo);
            ObjectInputStream entrada = new ObjectInputStream(archivo2); //1.Abriendo flujo de datos

            registrosLista = (ArrayList<Registro>) entrada.readObject();
            
            entrada.close(); //3.Cerrar el flujo de datos
        } catch (IOException excep2) {
            System.out.println("Imposible abrir el archivo para leer");
        } catch (ClassNotFoundException excep3) {
            System.out.println("El tipo de dato a convertir no es el correspondiente");
        }
    }*/
    
}
