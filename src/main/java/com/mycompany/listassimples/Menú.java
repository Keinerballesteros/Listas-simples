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
    
//   // Llamamos al método que queremos medir
//        long inicioBucle = System.nanoTime();
//         // Aquí reemplaza con el nombre de tu método
//        objLista.insertar();
//        long fin = System.nanoTime();
//        
//        // Calculamos el tiempo en segundos
//        double tiempoEjecucionSegundos;
//        tiempoEjecucionSegundos = (fin - inicioBucle) / 1_000_000_000.0; // Convertimos nanosegundos a segundos
//        
//        JOptionPane.showMessageDialog(this, "Tiempo de ejecución: " + tiempoEjecucionSegundos + " segundos");
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
        ordenarPorEdad = new javax.swing.JButton();

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

        ordenarPorEdad.setText("Ordenar Por Edad");
        ordenarPorEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarPorEdadActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(promedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(crearInicio)
                                    .addComponent(insertarFinal))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(consultar)
                                        .addGap(100, 100, 100)
                                        .addComponent(obtener))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(insertarNodoPorDato)
                                        .addGap(18, 18, 18)
                                        .addComponent(insertarNodoPorPosicion))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(ordernarPorNombre)
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eliminarPorDato)
                                    .addComponent(ordenarPorEdad))))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(269, 269, 269)
                        .addComponent(eliminar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(117, 117, 117)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(promedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(obtener)
                            .addComponent(consultar)
                            .addComponent(crearInicio))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertarNodoPorDato)
                            .addComponent(insertarNodoPorPosicion)
                            .addComponent(insertarFinal))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eliminar)
                            .addComponent(eliminarPorDato)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordernarPorNombre)
                    .addComponent(ordenarPorEdad))
                .addContainerGap(87, Short.MAX_VALUE))
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
        objLista.consultar();
    }//GEN-LAST:event_ordernarPorNombreActionPerformed

    private void ordenarPorEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarPorEdadActionPerformed
        objLista.ordenarPorEdad();
        objLista.consultar();
    }//GEN-LAST:event_ordenarPorEdadActionPerformed

    
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
    private javax.swing.JButton ordenarPorEdad;
    private javax.swing.JButton ordernarPorNombre;
    private javax.swing.JTextField promedio;
    // End of variables declaration//GEN-END:variables
}
