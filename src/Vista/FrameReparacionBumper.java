/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.Cliente;
import Modelo.Control;
import Modelo.Fecha;
import Modelo.ReparacionBumper;

/**
 *
 * @author omararias
 */
public class FrameReparacionBumper extends javax.swing.JFrame {

    /**
     * Creates new form FrameReparacionBumper
     */
    public FrameReparacionBumper() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTipo = new javax.swing.ButtonGroup();
        buttonGeneracion = new javax.swing.ButtonGroup();
        labelTipo = new javax.swing.JLabel();
        botonMicroswitch = new javax.swing.JRadioButton();
        botonTira = new javax.swing.JRadioButton();
        labelGeneracion = new javax.swing.JLabel();
        botonPrimeraGen = new javax.swing.JRadioButton();
        botonTerceraGen = new javax.swing.JRadioButton();
        botonSegundaGen = new javax.swing.JRadioButton();
        botonSeries = new javax.swing.JRadioButton();
        botonEliteDos = new javax.swing.JRadioButton();
        botonElite = new javax.swing.JRadioButton();
        labelColor = new javax.swing.JLabel();
        textFieldColor = new javax.swing.JTextField();
        labelTelefono = new javax.swing.JLabel();
        textFieldTelefono = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTipo.setText("Tipo de reparacion");

        buttonGroupTipo.add(botonMicroswitch);
        botonMicroswitch.setText("Microswitch");
        botonMicroswitch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMicroswitchActionPerformed(evt);
            }
        });

        buttonGroupTipo.add(botonTira);
        botonTira.setText("Tira de plastico");

        labelGeneracion.setText("Generacion de control");

        buttonGeneracion.add(botonPrimeraGen);
        botonPrimeraGen.setText("Primera Gen");
        botonPrimeraGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPrimeraGenActionPerformed(evt);
            }
        });

        buttonGeneracion.add(botonTerceraGen);
        botonTerceraGen.setText("Tercera Gen");
        botonTerceraGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTerceraGenActionPerformed(evt);
            }
        });

        buttonGeneracion.add(botonSegundaGen);
        botonSegundaGen.setText("Segunda Gen");
        botonSegundaGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSegundaGenActionPerformed(evt);
            }
        });

        buttonGeneracion.add(botonSeries);
        botonSeries.setText("Series");

        buttonGeneracion.add(botonEliteDos);
        botonEliteDos.setText("ELITE 2");
        botonEliteDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliteDosActionPerformed(evt);
            }
        });

        buttonGeneracion.add(botonElite);
        botonElite.setText("ELITE 1");
        botonElite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliteActionPerformed(evt);
            }
        });

        labelColor.setText("Color/diseño");

        labelTelefono.setText("Telefono cliente");

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonAtras.setText("Atrás");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelTipo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonMicroswitch)
                                .addGap(31, 31, 31)
                                .addComponent(botonTira)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonSegundaGen)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelTelefono)
                                            .addComponent(labelColor)
                                            .addComponent(botonAtras))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(botonTerceraGen)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                        .addComponent(botonEliteDos))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(textFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(textFieldTelefono)
                                                .addGap(26, 26, 26)
                                                .addComponent(botonGuardar))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonPrimeraGen)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(labelGeneracion))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(botonSeries)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botonElite)))))
                        .addGap(75, 75, 75)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(labelTipo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonMicroswitch)
                    .addComponent(botonTira))
                .addGap(18, 18, 18)
                .addComponent(labelGeneracion)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonPrimeraGen)
                    .addComponent(botonSeries)
                    .addComponent(botonElite))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSegundaGen)
                    .addComponent(botonEliteDos)
                    .addComponent(botonTerceraGen))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelColor)
                    .addComponent(textFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelTelefono)
                            .addComponent(textFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonAtras)
                        .addContainerGap(8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonGuardar)
                        .addGap(17, 17, 17))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMicroswitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMicroswitchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonMicroswitchActionPerformed

    private void botonPrimeraGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPrimeraGenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonPrimeraGenActionPerformed

    private void botonTerceraGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTerceraGenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonTerceraGenActionPerformed

    private void botonSegundaGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSegundaGenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSegundaGenActionPerformed

    private void botonEliteDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliteDosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliteDosActionPerformed

    private void botonEliteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliteActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        // TODO add your handling code here:
        String color= this.textFieldColor.getText();
        String modelo="";
        if (botonPrimeraGen.isSelected()){
            modelo="primera";
            
        } else if (botonSegundaGen.isSelected()){
            modelo="segunda";
            
        } else if (botonTerceraGen.isSelected()){
            modelo="tercera";
            
        }else if (botonSeries.isSelected()){
            modelo="primera";
            
        } else if (botonElite.isSelected()){
            modelo="elite";
            
        } else if (botonEliteDos.isSelected()){
            modelo="elite 2";
            
        }
        String detalle="";
        if(botonMicroswitch.isSelected()){
            detalle="Cambio de microswitch";
        } else if(botonTira.isSelected()){
            detalle="Tira de plastico quebrada";
        }
        Control control= new Control(color,modelo,detalle,"pendiente","control");
        System.out.println(control);
        String telefono=(this.textFieldTelefono.getText());
        Cliente cliente= new Cliente(telefono,false,control,"cliente");
        System.out.println(cliente);
        //int costo, String metodoPago, Reparable reparable, Fecha fechaReparacion, String tipo
        Fecha fecha = new Fecha(0,0,0,"fecha");
        System.out.println(fecha);
        ReparacionBumper reparacion= new ReparacionBumper(0,"pendiente",control,fecha,"pendiente");
        System.out.println(reparacion);
        Main.Main.registrosLista.add(reparacion);
        Main.Main.escribirRegistros(Main.Main.registrosLista,"registros.txt");
        this.dispose();
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameReparacionBumper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameReparacionBumper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameReparacionBumper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameReparacionBumper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameReparacionBumper().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JRadioButton botonElite;
    private javax.swing.JRadioButton botonEliteDos;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JRadioButton botonMicroswitch;
    private javax.swing.JRadioButton botonPrimeraGen;
    private javax.swing.JRadioButton botonSegundaGen;
    private javax.swing.JRadioButton botonSeries;
    private javax.swing.JRadioButton botonTerceraGen;
    private javax.swing.JRadioButton botonTira;
    private javax.swing.ButtonGroup buttonGeneracion;
    private javax.swing.ButtonGroup buttonGroupTipo;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelGeneracion;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JTextField textFieldColor;
    private javax.swing.JTextField textFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
