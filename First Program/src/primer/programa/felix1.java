
package primer.programa;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Scanner;
import javax.swing.JOptionPane;



public class felix1 extends javax.swing.JFrame {

   
    public felix1() {
        initComponents();
        this.setLocationRelativeTo(null);
        

        
    }
     public Image getIconImage() {
        Image retValue;
        retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/internet.png"));
        return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFileChooser1 = new javax.swing.JFileChooser();
        jDialog1 = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jTextFielduser = new javax.swing.JTextField();
        iniciar = new javax.swing.JButton();
        registro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jFrame1.setIconImage(getIconImage());

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setBackground(new java.awt.Color(51, 0, 0));
        salir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("   salir  ");
        salir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        salir.setBorderPainted(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 60, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 230, -1));

        user.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setText("Usuario :");
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 30));

        contraseña.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        contraseña.setForeground(new java.awt.Color(255, 255, 255));
        contraseña.setText("Password :");
        getContentPane().add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, 40));

        jPassword.setBackground(new java.awt.Color(102, 0, 0));
        jPassword.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPassword.setForeground(new java.awt.Color(255, 255, 255));
        jPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 140, 20));

        jTextFielduser.setBackground(new java.awt.Color(102, 0, 0));
        jTextFielduser.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextFielduser.setForeground(new java.awt.Color(255, 255, 255));
        jTextFielduser.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextFielduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielduserActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFielduser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 140, 20));

        iniciar.setBackground(new java.awt.Color(102, 0, 0));
        iniciar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        iniciar.setForeground(new java.awt.Color(255, 255, 255));
        iniciar.setText("Iniciar sesión");
        iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciarMouseClicked(evt);
            }
        });
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });
        getContentPane().add(iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 140, -1));

        registro.setBackground(new java.awt.Color(102, 0, 0));
        registro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        registro.setForeground(new java.awt.Color(255, 255, 255));
        registro.setText("Registro");
        registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registroMouseClicked(evt);
            }
        });
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });
        getContentPane().add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 100, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icon-user.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WHDQ-513996549.png"))); // NOI18N
        jLabel2.setIconTextGap(1);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void jTextFielduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielduserActionPerformed
    
    }//GEN-LAST:event_jTextFielduserActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed

    }//GEN-LAST:event_iniciarActionPerformed

    private void iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarMouseClicked
        String Usuario= "admin";
        String Contraseña="david1232";
        String Pass =new String(jPassword.getPassword());
        try{
        if(jTextFielduser.getText().equals(Usuario)&& Pass.equals(Contraseña)){
           second go=new second();
            go.setTitle("biblio.tic");
            go.setVisible(true);
            dispose();
           }else{
            if(jTextFielduser.getText().equals(" ")&& Pass.equals(" "))
            JOptionPane.showMessageDialog(this,"debe llenar los campos");      
        }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(this,"User / Password incorrecta");     
            }
    }//GEN-LAST:event_iniciarMouseClicked

    private void registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_registroMouseClicked

    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
        zip reg=new zip();
        reg.setTitle("Registro");
        reg.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_registroActionPerformed


         
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contraseña;
    private javax.swing.JButton iniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTextFielduser;
    private javax.swing.JButton registro;
    private javax.swing.JButton salir;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
