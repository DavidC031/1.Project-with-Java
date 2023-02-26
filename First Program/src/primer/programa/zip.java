/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer.programa;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.util.Formatter;

public class zip extends javax.swing.JFrame {

    String barra = File.separator;
    String ubicacion = System.getProperty("user.dir") + barra + "Registros" + barra;

    public zip() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    public Image getIconImage() {
        Image retValue;
        retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/internet.png"));
        return retValue;
    }

    private void crear() {
        // definir el tipo deldocumento , la ubucacion y el archivo
        String archivo = id.getText() + ".txt";
        File crea_ubicacion = new File(ubicacion);
        File crea_archivo = new File(ubicacion + archivo);
        // realizar condicion para crear el archivo 
        if (id.getText().equals("")) {
            javax.swing.JOptionPane.showMessageDialog(rootPane, "ID NO ENCONTRADO", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);

        } else {
            //
            try {
                if (crea_archivo.exists()) {
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "EL ARCHIVO YA EXISTE", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);

                } else {
                    crea_ubicacion.mkdirs();
                    Formatter crea = new Formatter(ubicacion + archivo);
                    crea.format("%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n", "ID=" + id.getText(), "Nombre=" + nombretext1.getText(), "Apellido=" + apellidotext1.getText(), "Edad=" + edadtext.getText(), "Direccion=" + Direcciontxt1.getText(), "Sexo=" + sexoopt1.getSelectedItem(), "Ciudad=" + citypot.getSelectedItem(), "Correo=" + email1.getText(), "Usuario=" + usertxt11.getText(), "Password=" + passwordtext1.getText());
                    crea.close();
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "EL ARCHIVO HA SIDO CREADO", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    //limpiar los campos para la siguiente persona
                    id.setText(null);
                    nombretext1.setText(null);
                    apellidotext1.setText(null);
                    edadtext.setText(null);
                    Direcciontxt1.setText(null);
                    sexoopt1.setSelectedItem(null);
                    citypot.setSelectedItem(null);
                    email1.setText(null);
                    usertxt11.setText(null);
                     passwordtext1.setText(null);
                }

            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(rootPane, "EL ARCHIVO NO HA SIDO CREADO", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre = new javax.swing.JLabel();
        direccion = new javax.swing.JLabel();
        sexo1 = new javax.swing.JLabel();
        edadtext = new javax.swing.JTextField();
        usertxt11 = new javax.swing.JTextField();
        edad = new javax.swing.JLabel();
        apellido1 = new javax.swing.JLabel();
        citypot = new javax.swing.JComboBox<>();
        apellidotext1 = new javax.swing.JTextField();
        guardareg = new javax.swing.JButton();
        usertxt = new javax.swing.JLabel();
        regin = new javax.swing.JButton();
        Direcciontxt1 = new javax.swing.JTextField();
        sexoopt1 = new javax.swing.JComboBox<>();
        nombretext1 = new javax.swing.JTextField();
        Direccion1 = new javax.swing.JLabel();
        emailtxt1 = new javax.swing.JLabel();
        email1 = new javax.swing.JTextField();
        passwordtext1 = new javax.swing.JTextField();
        passwordtext = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        registrotitle = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("Nombre  :");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 90, 30));

        direccion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        direccion.setForeground(new java.awt.Color(255, 255, 255));
        direccion.setText("Dirección :");
        getContentPane().add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, 30));

        sexo1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sexo1.setForeground(new java.awt.Color(255, 255, 255));
        sexo1.setText("Sexo   :");
        getContentPane().add(sexo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 70, 70));

        edadtext.setBackground(new java.awt.Color(153, 0, 0));
        edadtext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        edadtext.setForeground(new java.awt.Color(255, 255, 255));
        edadtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadtextActionPerformed(evt);
            }
        });
        edadtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edadtextKeyTyped(evt);
            }
        });
        getContentPane().add(edadtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 160, 20));

        usertxt11.setBackground(new java.awt.Color(153, 0, 0));
        usertxt11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usertxt11.setForeground(new java.awt.Color(255, 255, 255));
        usertxt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertxt11ActionPerformed(evt);
            }
        });
        usertxt11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usertxt11KeyTyped(evt);
            }
        });
        getContentPane().add(usertxt11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 160, 20));

        edad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        edad.setForeground(new java.awt.Color(255, 255, 255));
        edad.setText("Edad   : ");
        getContentPane().add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 80, 50));

        apellido1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        apellido1.setForeground(new java.awt.Color(255, 255, 255));
        apellido1.setText("Apellido  :");
        getContentPane().add(apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, 30));

        citypot.setBackground(new java.awt.Color(153, 0, 0));
        citypot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        citypot.setForeground(new java.awt.Color(255, 255, 255));
        citypot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Amazonas", "Antioquia", "Arauca", "Archipiélago de San Andrés", "Atlántico", "Bogotá D.C.", "Bolívar", "Boyacá", "Caldas", "Caquetá", "Casanare", "Cauca", "Cesar", "Chocó", "Córdoba", "Cundinamarca", "Guainía", "Guaviare", "Huila", "La Guajira", "Magdalena", "Meta", "Nariño", "Norte de Santander", "Putumayo", "Quindío", "Risaralda", "Santander", "Sucre", "Tolima", "Valle del Cauca", "Vaupés", "Vichada" }));
        citypot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citypotActionPerformed(evt);
            }
        });
        getContentPane().add(citypot, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 160, 20));

        apellidotext1.setBackground(new java.awt.Color(153, 0, 0));
        apellidotext1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        apellidotext1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(apellidotext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 160, 20));

        guardareg.setBackground(new java.awt.Color(153, 0, 0));
        guardareg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        guardareg.setForeground(new java.awt.Color(255, 255, 255));
        guardareg.setText("Registrar");
        guardareg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardaregActionPerformed(evt);
            }
        });
        getContentPane().add(guardareg, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, 30));

        usertxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        usertxt.setForeground(new java.awt.Color(255, 255, 255));
        usertxt.setText("Usuario   :");
        getContentPane().add(usertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 110, 30));

        regin.setBackground(new java.awt.Color(153, 0, 0));
        regin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        regin.setForeground(new java.awt.Color(255, 255, 255));
        regin.setText("Inicio");
        regin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reginActionPerformed(evt);
            }
        });
        getContentPane().add(regin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        Direcciontxt1.setBackground(new java.awt.Color(153, 0, 0));
        Direcciontxt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Direcciontxt1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Direcciontxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 160, 20));

        sexoopt1.setBackground(new java.awt.Color(153, 0, 0));
        sexoopt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sexoopt1.setForeground(new java.awt.Color(255, 255, 255));
        sexoopt1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Masculino", "Femenino" }));
        getContentPane().add(sexoopt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 160, 20));

        nombretext1.setBackground(new java.awt.Color(153, 0, 0));
        nombretext1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombretext1.setForeground(new java.awt.Color(255, 255, 255));
        nombretext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretext1ActionPerformed(evt);
            }
        });
        nombretext1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombretext1KeyTyped(evt);
            }
        });
        getContentPane().add(nombretext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 160, 20));

        Direccion1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Direccion1.setForeground(new java.awt.Color(255, 255, 255));
        Direccion1.setText("Ciudad   :");
        getContentPane().add(Direccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 110, -1));

        emailtxt1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        emailtxt1.setForeground(new java.awt.Color(255, 255, 255));
        emailtxt1.setText(" Correo    :");
        getContentPane().add(emailtxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 100, 30));

        email1.setBackground(new java.awt.Color(153, 0, 0));
        email1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        email1.setForeground(new java.awt.Color(255, 255, 255));
        email1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email1ActionPerformed(evt);
            }
        });
        getContentPane().add(email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 160, 20));

        passwordtext1.setBackground(new java.awt.Color(153, 0, 0));
        passwordtext1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordtext1.setForeground(new java.awt.Color(255, 255, 255));
        passwordtext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtext1ActionPerformed(evt);
            }
        });
        passwordtext1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordtext1KeyTyped(evt);
            }
        });
        getContentPane().add(passwordtext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 160, 20));

        passwordtext.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        passwordtext.setForeground(new java.awt.Color(255, 255, 255));
        passwordtext.setText("Password:");
        getContentPane().add(passwordtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 100, 30));

        id.setBackground(new java.awt.Color(153, 0, 0));
        id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setAutoscrolls(false);
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 40, -1));

        registrotitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        registrotitle.setForeground(new java.awt.Color(255, 255, 255));
        registrotitle.setText("      User  Registro ");
        getContentPane().add(registrotitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 260, 60));

        id1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id1.setForeground(new java.awt.Color(255, 255, 255));
        id1.setText("Id :");
        getContentPane().add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 40, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WHDQ-513996549.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usertxt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertxt11ActionPerformed

    }//GEN-LAST:event_usertxt11ActionPerformed

    private void edadtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadtextActionPerformed

    private void nombretext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretext1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombretext1ActionPerformed

    private void email1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email1ActionPerformed

    private void reginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reginActionPerformed
        felix yet = new felix();
        yet.setTitle("inicio");
        yet.setVisible(true);
        dispose();

    }//GEN-LAST:event_reginActionPerformed

    private void nombretext1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombretext1KeyTyped
        // realizar validacion del campo numerico o caracter
        char s = evt.getKeyChar();
        if ((s < 'a' || s > 'z') && (s < 'A' || s > 'Z') && (s < ' ' || s > ' ')) {
            evt.consume();
        }


    }//GEN-LAST:event_nombretext1KeyTyped

    private void edadtextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edadtextKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_edadtextKeyTyped

    private void usertxt11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usertxt11KeyTyped
        char s = evt.getKeyChar();
        if ((s < 'a' || s > 'z') && (s < 'A' || s > 'Z') && (s < ' ' || s > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_usertxt11KeyTyped

    private void guardaregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardaregActionPerformed
        //llamar a la clase crear
        crear();
    }//GEN-LAST:event_guardaregActionPerformed

    private void passwordtext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtext1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtext1ActionPerformed

    private void passwordtext1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordtext1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtext1KeyTyped

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void citypotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citypotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_citypotActionPerformed

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
            java.util.logging.Logger.getLogger(zip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(zip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(zip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(zip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            //correr ventana de registro
            public void run() {
                new zip().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Direccion1;
    private javax.swing.JTextField Direcciontxt1;
    private javax.swing.JLabel apellido1;
    private javax.swing.JTextField apellidotext1;
    private javax.swing.JComboBox<String> citypot;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel edad;
    private javax.swing.JTextField edadtext;
    private javax.swing.JTextField email1;
    private javax.swing.JLabel emailtxt1;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton guardareg;
    private javax.swing.JTextField id;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombretext1;
    private javax.swing.JLabel passwordtext;
    private javax.swing.JTextField passwordtext1;
    private javax.swing.JButton regin;
    private javax.swing.JLabel registrotitle;
    private javax.swing.JLabel sexo1;
    private javax.swing.JComboBox<String> sexoopt1;
    private javax.swing.JLabel usertxt;
    private javax.swing.JTextField usertxt11;
    // End of variables declaration//GEN-END:variables
}
