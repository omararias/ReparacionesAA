/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.Cliente;
import Modelo.Control;
import Modelo.Fecha;
import Modelo.ReparacionOtra;

/**
 *
 * @author omararias
 */
public class FrameReparacionOtra extends javax.swing.JFrame {

    /**
     * Creates new form FrameReparacionBumper
     */
    public FrameReparacionOtra() {
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

        buttonGeneracion = new javax.swing.ButtonGroup();
        labelGeneracionControl = new javax.swing.JLabel();
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
        labelTipoReparacion = new javax.swing.JLabel();
        labelDescripcion = new javax.swing.JLabel();
        textFieldDescripcion = new javax.swing.JTextField();
        botonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelGeneracionControl.setText("Generacion de control");

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

        labelTipoReparacion.setText("Reparacion otra");

        labelDescripcion.setText("Descripcion");

        textFieldDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDescripcionActionPerformed(evt);
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
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTelefono)
                                    .addComponent(labelColor))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(labelDescripcion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonGuardar)
                                .addGap(34, 34, 34)
                                .addComponent(botonAtras))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonPrimeraGen)
                            .addComponent(botonSegundaGen))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldTelefono)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(botonTerceraGen)
                                                .addGap(58, 58, 58)
                                                .addComponent(botonEliteDos))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(botonSeries)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(botonElite))))
                                    .addComponent(textFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelGeneracionControl)
                                    .addComponent(labelTipoReparacion))
                                .addGap(0, 197, Short.MAX_VALUE)))))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labelTipoReparacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelGeneracionControl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSeries)
                    .addComponent(botonPrimeraGen)
                    .addComponent(botonElite))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonTerceraGen)
                    .addComponent(botonSegundaGen)
                    .addComponent(botonEliteDos))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelColor)
                    .addComponent(textFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTelefono)
                            .addComponent(textFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDescripcion)
                            .addComponent(textFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonGuardar)
                            .addComponent(botonAtras))
                        .addGap(17, 17, 17))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        String detalle=this.textFieldDescripcion.getText();
        
        Control control= new Control(color,modelo,detalle,"pendiente","control");
        System.out.println(control);
        String telefono=(this.textFieldTelefono.getText());
        Cliente cliente= new Cliente(telefono,false,control,"cliente");
        System.out.println(cliente);
        //int costo, String metodoPago, Reparable reparable, Fecha fechaReparacion, String tipo
        Fecha fecha = new Fecha(0,0,0,"fecha");
        System.out.println(fecha);
        ReparacionOtra reparacion= new ReparacionOtra(0,"pendiente",control,fecha,"pendiente");
        System.out.println(reparacion);
        Main.Main.registrosLista.add(reparacion);
        Main.Main.escribirRegistros(Main.Main.registrosLista,"registros.txt");
        this.dispose();
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void textFieldDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDescripcionActionPerformed

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
            java.util.logging.Logger.getLogger(FrameReparacionOtra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameReparacionOtra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameReparacionOtra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameReparacionOtra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameReparacionOtra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JRadioButton botonElite;
    private javax.swing.JRadioButton botonEliteDos;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JRadioButton botonPrimeraGen;
    private javax.swing.JRadioButton botonSegundaGen;
    private javax.swing.JRadioButton botonSeries;
    private javax.swing.JRadioButton botonTerceraGen;
    private javax.swing.ButtonGroup buttonGeneracion;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelGeneracionControl;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTipoReparacion;
    private javax.swing.JTextField textFieldColor;
    private javax.swing.JTextField textFieldDescripcion;
    private javax.swing.JTextField textFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
