/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.el_corte_ingles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.Timer;

/**
 *
 * @author Usuario
 */
public class Pantalla extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
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

        jDialog1 = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jDialog3 = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jDialog4 = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jDialog5 = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jDialog6 = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jDialog7 = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jDialog1.setMaximumSize(new java.awt.Dimension(650, 450));
        jDialog1.setMinimumSize(new java.awt.Dimension(650, 450));
        jDialog1.setPreferredSize(new java.awt.Dimension(650, 450));
        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 36)); // NOI18N
        jLabel3.setText("PLANTA 0");
        jDialog1.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        jButton5.setText("ALIMENTACIÓN");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        jButton6.setText("MAQUILLAJE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));

        jButton19.setText("Volver atrás");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        jButton20.setText("Salir");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        jDialog2.setMaximumSize(new java.awt.Dimension(650, 450));
        jDialog2.setMinimumSize(new java.awt.Dimension(650, 450));
        jDialog2.setPreferredSize(new java.awt.Dimension(650, 450));
        jDialog2.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 36)); // NOI18N
        jLabel6.setText("PLANTA 1");
        jDialog2.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        jButton23.setText("ROPA");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jDialog2.getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        jButton24.setText("CALZADO");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jDialog2.getContentPane().add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));

        jButton25.setText("Volver atrás");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jDialog2.getContentPane().add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        jButton26.setText("Salir");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jDialog2.getContentPane().add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        jDialog3.setMaximumSize(new java.awt.Dimension(650, 450));
        jDialog3.setMinimumSize(new java.awt.Dimension(650, 450));
        jDialog3.setPreferredSize(new java.awt.Dimension(650, 450));
        jDialog3.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel9.setText("INFORMÁTICA");
        jDialog3.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jButton41.setText("COMPRAR PRODUCTO");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        jDialog3.getContentPane().add(jButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        jButton42.setText("ELIMINAR PRODUCTO");
        jDialog3.getContentPane().add(jButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 150, -1));

        jButton43.setText("AÑADIR PRODUCTO");
        jDialog3.getContentPane().add(jButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        jButton44.setText("Volver atrás");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        jDialog3.getContentPane().add(jButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        jButton46.setText("Salir");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        jDialog3.getContentPane().add(jButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));

        jButton47.setText("MOSTRAR PRODUCTOS");
        jDialog3.getContentPane().add(jButton47, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        jDialog4.setMaximumSize(new java.awt.Dimension(650, 450));
        jDialog4.setMinimumSize(new java.awt.Dimension(650, 450));
        jDialog4.setPreferredSize(new java.awt.Dimension(650, 450));
        jDialog4.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel4.setText("ALIMENTACIÓN");
        jDialog4.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jButton7.setText("COMPRAR PRODUCTO");
        jDialog4.getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        jButton8.setText("ELIMINAR PRODUCTO");
        jDialog4.getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 150, -1));

        jButton9.setText("AÑADIR PRODUCTO");
        jDialog4.getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        jButton10.setText("Volver atrás");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jDialog4.getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jButton11.setText("Volver al inicio");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jDialog4.getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        jButton12.setText("Salir");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jDialog4.getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, -1, -1));

        jButton21.setText("MOSTRAR PRODUCTOS");
        jDialog4.getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        jDialog5.setMaximumSize(new java.awt.Dimension(650, 450));
        jDialog5.setMinimumSize(new java.awt.Dimension(650, 450));
        jDialog5.setPreferredSize(new java.awt.Dimension(650, 450));
        jDialog5.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel5.setText("MAQUILLAJE");
        jDialog5.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jButton13.setText("COMPRAR PRODUCTO");
        jDialog5.getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        jButton14.setText("AÑADIR PRODUCTO");
        jDialog5.getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        jButton15.setText("ELIMINAR PRODUCTO");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jDialog5.getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jButton16.setText("Volver atrás");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jDialog5.getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jButton17.setText("Volver al inicio");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jDialog5.getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        jButton18.setText("Salir");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jDialog5.getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));

        jButton22.setText("MOSTRAR PRODUCTOS");
        jDialog5.getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        jDialog6.setMaximumSize(new java.awt.Dimension(650, 450));
        jDialog6.setMinimumSize(new java.awt.Dimension(650, 450));
        jDialog6.setPreferredSize(new java.awt.Dimension(650, 450));
        jDialog6.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel7.setText("ROPA");
        jDialog6.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jButton27.setText("COMPRAR PRODUCTO");
        jDialog6.getContentPane().add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        jButton28.setText("ELIMINAR PRODUCTO");
        jDialog6.getContentPane().add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 150, -1));

        jButton29.setText("AÑADIR PRODUCTO");
        jDialog6.getContentPane().add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        jButton30.setText("Volver atrás");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jDialog6.getContentPane().add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jButton31.setText("Volver al inicio");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jDialog6.getContentPane().add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        jButton32.setText("Salir");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jDialog6.getContentPane().add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, -1, -1));

        jButton33.setText("MOSTRAR PRODUCTOS");
        jDialog6.getContentPane().add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        jDialog7.setMaximumSize(new java.awt.Dimension(650, 450));
        jDialog7.setMinimumSize(new java.awt.Dimension(650, 450));
        jDialog7.setPreferredSize(new java.awt.Dimension(650, 450));
        jDialog7.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel8.setText("CALZADO");
        jDialog7.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jButton34.setText("COMPRAR PRODUCTO");
        jDialog7.getContentPane().add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        jButton35.setText("ELIMINAR PRODUCTO");
        jDialog7.getContentPane().add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 150, -1));

        jButton36.setText("AÑADIR PRODUCTO");
        jDialog7.getContentPane().add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        jButton37.setText("Volver atrás");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jDialog7.getContentPane().add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jButton38.setText("Volver al inicio");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jDialog7.getContentPane().add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        jButton39.setText("Salir");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jDialog7.getContentPane().add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, -1, -1));

        jButton40.setText("MOSTRAR PRODUCTOS");
        jDialog7.getContentPane().add(jButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/el_corte_ingles/salida.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 90, 100));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FECHA Y HORA A TIEMPO REAL");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        jButton2.setText("PLANTA 0");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jButton3.setText("PLANTA 1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        jButton4.setText("PLANTA 2");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/el_corte_ingles/Fondo_Progrmación.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 810, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jDialog2.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jDialog3.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jDialog4.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jDialog5.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jDialog4.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jDialog1.setVisible(false);
        jDialog4.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        jDialog5.setVisible(false);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        jDialog1.setVisible(false);
        jDialog5.setVisible(false);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        jDialog2.setVisible(false);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        jDialog6.setVisible(false);
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        jDialog2.setVisible(false);
        jDialog6.setVisible(false);
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        jDialog7.setVisible(false);
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        jDialog2.setVisible(false);
        jDialog7.setVisible(false);
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        jDialog3.setVisible(false);
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton41ActionPerformed
    //empieza el tiempo
    Timer timer = new Timer (100, new ActionListener (){

    @Override
    public void actionPerformed(ActionEvent e)
    {
       //mostrar hora en un label
        jLabel2.setText(String.valueOf(LocalTime.now()));
        jLabel2.setText(String.valueOf(LocalDate.now()));
    }
    });
  

    
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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JDialog jDialog5;
    private javax.swing.JDialog jDialog6;
    private javax.swing.JDialog jDialog7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}