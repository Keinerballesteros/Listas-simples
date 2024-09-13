/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.listassimples;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Menú extends javax.swing.JFrame {

    Listassimples objLista = new Listassimples();
    public Menú() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        crearInicio = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        promedio = new javax.swing.JTextField();
        insertarFinal = new javax.swing.JButton();
        obtener = new javax.swing.JButton();
        insertarNodoPorPosicion = new javax.swing.JButton();
        insertarNodoPorDato = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        eliminarPorDato = new javax.swing.JButton();
        ordernarPorNombre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("LISTAS SIMPLES");

        crearInicio.setText("Crear Listo Inicio");
        crearInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearInicioActionPerformed(evt);
            }
        });

        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel3.setText("Edad");

        jLabel4.setText("Promedio");

        nombre.setText("Keiner");

        edad.setText("12");

        promedio.setText("4.7");
        promedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promedioActionPerformed(evt);
            }
        });

        insertarFinal.setText("Insertar Final");
        insertarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarFinalActionPerformed(evt);
            }
        });

        obtener.setText("Obtener");
        obtener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obtenerActionPerformed(evt);
            }
        });

        insertarNodoPorPosicion.setText("Insertar Nodo Por Posición");
        insertarNodoPorPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarNodoPorPosicionActionPerformed(evt);
            }
        });

        insertarNodoPorDato.setText("Insertar Nodo Por Dato");
        insertarNodoPorDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarNodoPorDatoActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar Por Indice");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        eliminarPorDato.setText("Eliminar Por Dato");
        eliminarPorDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPorDatoActionPerformed(evt);
            }
        });

        ordernarPorNombre.setText("Ordenar Por Nombre");
        ordernarPorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordernarPorNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(143, 143, 143)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(insertarFinal)))
                                    .addComponent(crearInicio))
                                .addGap(18, 18, 18)
                                .addComponent(consultar)
                                .addGap(29, 29, 29)
                                .addComponent(obtener))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(94, 94, 94)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(promedio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3))
                                        .addGap(42, 42, 42)
                                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(insertarNodoPorPosicion)
                                        .addGap(25, 25, 25)
                                        .addComponent(insertarNodoPorDato))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ordernarPorNombre)
                                            .addComponent(eliminar))
                                        .addGap(50, 50, 50)
                                        .addComponent(eliminarPorDato)
                                        .addGap(18, 18, 18)))))
                        .addGap(0, 13, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(crearInicio)
                                    .addComponent(consultar)
                                    .addComponent(insertarFinal)
                                    .addComponent(obtener))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(insertarNodoPorPosicion)
                                    .addComponent(insertarNodoPorDato))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(eliminar)
                                    .addComponent(eliminarPorDato))))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(promedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ordernarPorNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel5)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void promedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_promedioActionPerformed

    private void crearInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearInicioActionPerformed
       objLista.insertarInicio(nombre.getText(), Integer.parseInt(edad.getText()), Float.parseFloat(promedio.getText()));
    }//GEN-LAST:event_crearInicioActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        objLista.consultar();
    }//GEN-LAST:event_consultarActionPerformed

    private void insertarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarFinalActionPerformed
        objLista.insertarFinal(nombre.getText(), Integer.parseInt(edad.getText()), Float.parseFloat(promedio.getText()));
    }//GEN-LAST:event_insertarFinalActionPerformed

    private void obtenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obtenerActionPerformed
        objLista.obtener(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que quiere obtener: ")));
    }//GEN-LAST:event_obtenerActionPerformed

    private void insertarNodoPorPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarNodoPorPosicionActionPerformed
        objLista.insertarEnPosicion(nombre.getText(), Integer.parseInt(edad.getText()), Float.parseFloat(promedio.getText()), Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion: ")));
    }//GEN-LAST:event_insertarNodoPorPosicionActionPerformed

    private void insertarNodoPorDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarNodoPorDatoActionPerformed
       objLista.insertarDespuesDeDato(nombre.getText(), Integer.parseInt(edad.getText()), Float.parseFloat(promedio.getText()), JOptionPane.showInputDialog("Ingrese el dato: "));
    }//GEN-LAST:event_insertarNodoPorDatoActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        objLista.eliminar(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion que quiere eliminar")));
    }//GEN-LAST:event_eliminarActionPerformed

    private void eliminarPorDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPorDatoActionPerformed
        objLista.eliminarPorDato(JOptionPane.showInputDialog("Ingrese el nombre"));
    }//GEN-LAST:event_eliminarPorDatoActionPerformed

    private void ordernarPorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordernarPorNombreActionPerformed
        objLista.ordenarPorNombre();
    }//GEN-LAST:event_ordernarPorNombreActionPerformed

    
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
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menú().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultar;
    private javax.swing.JButton crearInicio;
    private javax.swing.JTextField edad;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton eliminarPorDato;
    private javax.swing.JButton insertarFinal;
    private javax.swing.JButton insertarNodoPorDato;
    private javax.swing.JButton insertarNodoPorPosicion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton obtener;
    private javax.swing.JButton ordernarPorNombre;
    private javax.swing.JTextField promedio;
    // End of variables declaration//GEN-END:variables
}
