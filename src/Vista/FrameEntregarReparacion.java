/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.Fecha;
import Modelo.Registro;
import Modelo.Reparacion;
import java.time.LocalDate;
import java.util.ArrayList;
import static java.util.Arrays.equals;
import javax.swing.JOptionPane;

/**
 *
 * @author omararias
 */
public class FrameEntregarReparacion extends javax.swing.JFrame {

    /**
     * Creates new form FrameEntregarReparacion
     * 
     * 
     */
    public FrameEntregarReparacion() {
        initComponents();
        //ArrayList<Registro>reparacionesPendientes=Main.Main.obtenerReparacionesPendientes();
        mostrarMenu();

    }

        
    
    private void mostrarMenu() {
        StringBuilder menu = new StringBuilder();
        for (int i = 0; i < Main.Main.registrosLista.size(); i++) {
            if ((Main.Main.registrosLista.get(i) instanceof Reparacion )&& (Main.Main.registrosLista.get(i).getTipo().equals("pendiente")) ){
            menu.append(i).append(": ").append(Main.Main.registrosLista.get(i)).append("\n");    
            }
            
        }
        textAreaPendientes.setText(menu.toString());
    }
    private void actualizarControlEntregado() {
        try {
            int index = Integer.parseInt(textFieldIndice.getText());
            if (((index >= 0 && index < Main.Main.registrosLista.size())& Main.Main.registrosLista.get(index)instanceof Reparacion )&&(botonEfectivo.isSelected()||botonTransferencia.isSelected()) ) {
                if (Main.Main.registrosLista.get(index).getTipo().equals("pendiente")    ){
                    LocalDate fechaActual = LocalDate.now();
                    int dia = fechaActual.getDayOfMonth();
                    int mes = fechaActual.getMonthValue();
                    int anio = fechaActual.getYear();
                    Fecha fecha = new Fecha(dia,mes,anio,"");
                    ((Reparacion)Main.Main.registrosLista.get(index)).setFechaReparacion(fecha);
                    if(botonEfectivo.isSelected()){
                        ((Reparacion)Main.Main.registrosLista.get(index)).setMetodoPago("EFECTIVO");
                        
                    }else if (botonTransferencia.isSelected()){
                        ((Reparacion)Main.Main.registrosLista.get(index)).setMetodoPago("TRANSFERENCIA");
                    }
                    

                    Main.Main.registrosLista.get(index).setTipo("entregado");
                    ((Reparacion) Main.Main.registrosLista.get(index)).setCosto(Integer.parseInt(textFieldCobro.getText()));
                    ((Reparacion)Main.Main.registrosLista.get(index)).getReparable().setEstado("entregado");
                
                    Main.Main.escribirRegistros(Main.Main.registrosLista,"registros.txt");
                    mostrarMenu();
                    textFieldIndice.setText("");
                    textFieldCobro.setText("");
                    JOptionPane.showMessageDialog(this,"Estado actualizado con exito");
                    this.dispose();
                    
                }else{
                    JOptionPane.showMessageDialog(this, "error", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    
                }
            }else{
                JOptionPane.showMessageDialog(this, "error", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        catch (IndexOutOfBoundsException ee){
            JOptionPane.showMessageDialog(this, "Índice inválido", "Error", JOptionPane.ERROR_MESSAGE);
            
            
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoMetodosPago = new javax.swing.ButtonGroup();
        labelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaPendientes = new javax.swing.JTextArea();
        textFieldIndice = new javax.swing.JTextField();
        botonAtras = new javax.swing.JButton();
        botonConfirmar = new javax.swing.JButton();
        labelIndice = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textFieldCobro = new javax.swing.JTextField();
        labelMetodoDePago = new javax.swing.JLabel();
        botonEfectivo = new javax.swing.JRadioButton();
        botonTransferencia = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setText("Ingrese el indice de la reparacion que quiere entregar");

        textAreaPendientes.setColumns(20);
        textAreaPendientes.setRows(5);
        jScrollPane1.setViewportView(textAreaPendientes);

        botonAtras.setText("Atrás");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        botonConfirmar.setText("Confirmar entrega");
        botonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfirmarActionPerformed(evt);
            }
        });

        labelIndice.setText("Indice de la reparacion a entregar");

        jLabel1.setText("Dinero cobrado al cliente");

        labelMetodoDePago.setText("MÉTODO DE PAGO");

        grupoMetodosPago.add(botonEfectivo);
        botonEfectivo.setText("Efectivo");

        grupoMetodosPago.add(botonTransferencia);
        botonTransferencia.setText("Transferencia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonAtras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonConfirmar)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(botonEfectivo)
                .addGap(49, 49, 49)
                .addComponent(botonTransferencia)
                .addContainerGap(151, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textFieldIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldCobro, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(labelIndice))
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelMetodoDePago)
                        .addGap(199, 199, 199))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(botonAtras)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldIndice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelIndice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(textFieldCobro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(labelMetodoDePago)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonTransferencia)
                            .addComponent(botonEfectivo))
                        .addGap(39, 39, 39)
                        .addComponent(botonConfirmar)
                        .addGap(39, 39, 39))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmarActionPerformed
        // TODO add your handling code here:
        actualizarControlEntregado();
        
    }//GEN-LAST:event_botonConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(FrameEntregarReparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameEntregarReparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameEntregarReparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameEntregarReparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameEntregarReparacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonConfirmar;
    private javax.swing.JRadioButton botonEfectivo;
    private javax.swing.JRadioButton botonTransferencia;
    private javax.swing.ButtonGroup grupoMetodosPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelIndice;
    private javax.swing.JLabel labelMetodoDePago;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextArea textAreaPendientes;
    private javax.swing.JTextField textFieldCobro;
    private javax.swing.JTextField textFieldIndice;
    // End of variables declaration//GEN-END:variables
}
