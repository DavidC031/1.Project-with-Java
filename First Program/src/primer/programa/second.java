/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer.programa;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class second extends javax.swing.JFrame {

    public second() {
        String User = "ADMIN";

        initComponents();
        this.setLocationRelativeTo(null);
        JOptionPane.showMessageDialog(this, "Bienvenido" + User);

    }

    public Image getIconImage() {
        Image retValue;
        retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/internet.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        triqui = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        iconwhite = new javax.swing.JLabel();
        calcelect = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        calc = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jLabel5.setText("jLabel5");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WHDQ-513996549.png"))); // NOI18N

        jButton9.setBackground(new java.awt.Color(102, 0, 0));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("MAGIA");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        triqui.setBackground(new java.awt.Color(102, 0, 0));
        triqui.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        triqui.setForeground(new java.awt.Color(255, 255, 255));
        triqui.setText("TRIQUI");
        triqui.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        triqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triquiActionPerformed(evt);
            }
        });
        getContentPane().add(triqui, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 130, 40));

        jButton6.setBackground(new java.awt.Color(102, 0, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("MAGIA");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 111, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("         Bienvenido  ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 200, 20));

        iconwhite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icon-user.png"))); // NOI18N
        getContentPane().add(iconwhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 260, 280));

        calcelect.setBackground(new java.awt.Color(102, 0, 0));
        calcelect.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        calcelect.setForeground(new java.awt.Color(255, 255, 255));
        calcelect.setText("CAL PROM");
        calcelect.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        calcelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcelectActionPerformed(evt);
            }
        });
        getContentPane().add(calcelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 205, 111, 40));

        jButton11.setBackground(new java.awt.Color(102, 0, 0));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("MAGIA");
        jButton11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 111, 40));

        calc.setBackground(new java.awt.Color(102, 0, 0));
        calc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        calc.setForeground(new java.awt.Color(255, 255, 255));
        calc.setText("CALCULADORA");
        calc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcActionPerformed(evt);
            }
        });
        getContentPane().add(calc, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 140, 120, 40));

        jButton12.setBackground(new java.awt.Color(102, 0, 0));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("MAGIA");
        jButton12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 206, 111, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WHDQ-513996549.png"))); // NOI18N
        jLabel2.setIconTextGap(1);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void triquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triquiActionPerformed
        opcion ger = new opcion();
        ger.setTitle("game");
        ger.setVisible(true);
        dispose();
    }//GEN-LAST:event_triquiActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code hergoe:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void calcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcActionPerformed
        calc go = new calc();
        go.setTitle("Calculadora 2.0");
        go.setVisible(true);
        dispose();
    }//GEN-LAST:event_calcActionPerformed

    private void calcelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcelectActionPerformed
        pant go = new pant();
        go.setTitle("calculadora");
        go.setVisible(true);
        dispose();
    }//GEN-LAST:event_calcelectActionPerformed

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
            java.util.logging.Logger.getLogger(second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new second().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calc;
    private javax.swing.JButton calcelect;
    private javax.swing.JLabel iconwhite;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton triqui;
    // End of variables declaration//GEN-END:variables
}
