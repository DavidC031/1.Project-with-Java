/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer.programa;

/**
 *
 * @author edcalderon
 */
public class calc extends javax.swing.JFrame {
    double sum1,sum2,pot2,pot3,facta,xfc,pr,num;
    double n1, n2, n3;
    boolean suma;
    boolean resta;
    boolean dividir;
    boolean multiplicar;
    boolean porcent;
    boolean pote;
    boolean potenal;
    boolean raizcua;
    boolean raiz;
    boolean mom;
    boolean divivi;
    boolean divi;
    boolean sin;
    boolean cos;
    boolean tan;
    public calc() {
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

        jLabel1 = new javax.swing.JLabel();
        div3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        num8 = new javax.swing.JButton();
        num1 = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        div = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        mult = new javax.swing.JButton();
        rest = new javax.swing.JButton();
        sum = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        display = new javax.swing.JTextField();
        porce = new javax.swing.JButton();
        ser = new javax.swing.JButton();
        rain = new javax.swing.JButton();
        pot = new javax.swing.JButton();
        pot1 = new javax.swing.JButton();
        Mon = new javax.swing.JButton();
        div1 = new javax.swing.JButton();
        div2 = new javax.swing.JButton();
        sine = new javax.swing.JButton();
        cose = new javax.swing.JButton();
        tane = new javax.swing.JButton();
        facto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WHDQ-513996549.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        div3.setBackground(new java.awt.Color(153, 0, 0));
        div3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        div3.setForeground(null);
        div3.setText("/");
        div3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        div3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                div3ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WHDQ-513996549.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 0));
        setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        num8.setBackground(new java.awt.Color(153, 0, 0));
        num8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        num8.setText("8");
        num8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });
        getContentPane().add(num8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 50, 40));

        num1.setBackground(new java.awt.Color(153, 0, 0));
        num1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        num1.setText("1");
        num1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });
        getContentPane().add(num1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 50, 40));

        num2.setBackground(new java.awt.Color(153, 0, 0));
        num2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        num2.setText("2");
        num2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });
        getContentPane().add(num2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 50, 40));

        num5.setBackground(new java.awt.Color(153, 0, 0));
        num5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        num5.setText("5");
        num5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });
        getContentPane().add(num5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 50, 40));

        num6.setBackground(new java.awt.Color(153, 0, 0));
        num6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        num6.setText("6");
        num6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });
        getContentPane().add(num6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 50, 40));

        num7.setBackground(new java.awt.Color(153, 0, 0));
        num7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        num7.setText("7");
        num7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });
        getContentPane().add(num7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 50, 40));

        num3.setBackground(new java.awt.Color(153, 0, 0));
        num3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        num3.setText("3");
        num3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });
        getContentPane().add(num3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 50, 40));

        div.setBackground(new java.awt.Color(153, 0, 0));
        div.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        div.setText("/");
        div.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });
        getContentPane().add(div, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 60, 40));

        num0.setBackground(new java.awt.Color(153, 0, 0));
        num0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        num0.setText("0");
        num0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });
        getContentPane().add(num0, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 50, 40));

        igual.setBackground(new java.awt.Color(153, 0, 0));
        igual.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        igual.setText("=");
        igual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });
        getContentPane().add(igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 50, 40));

        borrar.setBackground(new java.awt.Color(153, 0, 0));
        borrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        borrar.setText("CE");
        borrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        getContentPane().add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 50, 40));

        num4.setBackground(new java.awt.Color(153, 0, 0));
        num4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        num4.setText("4");
        num4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });
        getContentPane().add(num4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 50, 40));

        mult.setBackground(new java.awt.Color(153, 0, 0));
        mult.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mult.setText("*");
        mult.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multActionPerformed(evt);
            }
        });
        getContentPane().add(mult, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 50, 40));

        rest.setBackground(new java.awt.Color(153, 0, 0));
        rest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rest.setText("-");
        rest.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        rest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restActionPerformed(evt);
            }
        });
        getContentPane().add(rest, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 50, 40));

        sum.setBackground(new java.awt.Color(153, 0, 0));
        sum.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sum.setText("+");
        sum.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumActionPerformed(evt);
            }
        });
        getContentPane().add(sum, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 50, 40));

        num9.setBackground(new java.awt.Color(153, 0, 0));
        num9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        num9.setText("9");
        num9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });
        getContentPane().add(num9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 50, 40));

        display.setBackground(new java.awt.Color(255, 255, 255));
        display.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        display.setForeground(new java.awt.Color(0, 0, 0));
        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(153, 0, 0)));
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });
        getContentPane().add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 360, 80));

        porce.setBackground(new java.awt.Color(153, 0, 0));
        porce.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        porce.setText("%");
        porce.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        porce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porceActionPerformed(evt);
            }
        });
        getContentPane().add(porce, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 50, 40));

        ser.setBackground(new java.awt.Color(153, 0, 0));
        ser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ser.setText("√");
        ser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        ser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serActionPerformed(evt);
            }
        });
        getContentPane().add(ser, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 50, 40));

        rain.setBackground(new java.awt.Color(153, 0, 0));
        rain.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rain.setText("x√");
        rain.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        rain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rainActionPerformed(evt);
            }
        });
        getContentPane().add(rain, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 60, 40));

        pot.setBackground(new java.awt.Color(153, 0, 0));
        pot.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pot.setText("^");
        pot.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        pot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potActionPerformed(evt);
            }
        });
        getContentPane().add(pot, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 60, 40));

        pot1.setBackground(new java.awt.Color(153, 0, 0));
        pot1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pot1.setText("a^x");
        pot1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        pot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pot1ActionPerformed(evt);
            }
        });
        getContentPane().add(pot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 60, 40));

        Mon.setBackground(new java.awt.Color(153, 0, 0));
        Mon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Mon.setText("MOD");
        Mon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        Mon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonActionPerformed(evt);
            }
        });
        getContentPane().add(Mon, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 50, 40));

        div1.setBackground(new java.awt.Color(153, 0, 0));
        div1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        div1.setText("1/x");
        div1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        div1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                div1ActionPerformed(evt);
            }
        });
        getContentPane().add(div1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 50, 40));

        div2.setBackground(new java.awt.Color(153, 0, 0));
        div2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        div2.setText("x/x");
        div2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        div2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                div2ActionPerformed(evt);
            }
        });
        getContentPane().add(div2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 50, 40));

        sine.setBackground(new java.awt.Color(153, 0, 0));
        sine.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sine.setText("sin");
        sine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        sine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sineActionPerformed(evt);
            }
        });
        getContentPane().add(sine, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 50, 40));

        cose.setBackground(new java.awt.Color(153, 0, 0));
        cose.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cose.setText("cos");
        cose.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        cose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coseActionPerformed(evt);
            }
        });
        getContentPane().add(cose, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 50, 40));

        tane.setBackground(new java.awt.Color(153, 0, 0));
        tane.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tane.setText("tan");
        tane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        tane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taneActionPerformed(evt);
            }
        });
        getContentPane().add(tane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 50, 40));

        facto.setBackground(new java.awt.Color(153, 0, 0));
        facto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        facto.setText("n!");
        facto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        facto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factoActionPerformed(evt);
            }
        });
        getContentPane().add(facto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 50, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WHDQ-513996549.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
        if (display.getText().equals("0")) {

            display.setText("");

        }

        display.setText(display.getText() + "2");
    }//GEN-LAST:event_num2ActionPerformed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed

        if (display.getText().equals("0")) {

            display.setText("");

        }

        display.setText(display.getText() + "1");
    }//GEN-LAST:event_num1ActionPerformed

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3ActionPerformed

        if (display.getText().equals("0")) {

            display.setText("");

        }

        display.setText(display.getText() + "3");
    }//GEN-LAST:event_num3ActionPerformed

    private void num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num4ActionPerformed
        if (display.getText().equals("0")) {

            display.setText("");

        }

        display.setText(display.getText() + "4");
    }//GEN-LAST:event_num4ActionPerformed

    private void num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num5ActionPerformed

        if (display.getText().equals("0")) {

            display.setText("");

        }
        display.setText(display.getText() + "5");
    }//GEN-LAST:event_num5ActionPerformed

    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6ActionPerformed

        if (display.getText().equals("0")) {

            display.setText("");

        }
        display.setText(display.getText() + "6");
    }//GEN-LAST:event_num6ActionPerformed

    private void num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num9ActionPerformed

        if (display.getText().equals("0")) {

            display.setText("");

        }

        display.setText(display.getText() + "9");
    }//GEN-LAST:event_num9ActionPerformed

    private void num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num8ActionPerformed

        if (display.getText().equals("0")) {
            display.setText("");
        }
        display.setText(display.getText() + "8");
    }//GEN-LAST:event_num8ActionPerformed

    private void num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num7ActionPerformed
        if (display.getText().equals("0")) {

            display.setText("");

        }
        display.setText(display.getText() + "7");
    }//GEN-LAST:event_num7ActionPerformed

    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0ActionPerformed

        if (display.getText().equals("0")) {

            display.setText("");

        }
        display.setText(display.getText() + "0");
    }//GEN-LAST:event_num0ActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        display.setText("0");
    }//GEN-LAST:event_borrarActionPerformed

    private void sumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumActionPerformed
        suma = true;
        n1 = Double.parseDouble(display.getText());
        display.setText("0");
    }//GEN-LAST:event_sumActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        if (suma) {
            n2 = Double.parseDouble(display.getText());
            display.setText(String.valueOf(n1 + n2));
        }
        suma = false;
        if (resta) {
            n2 = Double.parseDouble(display.getText());
            display.setText(String.valueOf(n1 - n2));
        }
        resta = false;
        if (multiplicar) {
            n2 = Double.parseDouble(display.getText());
            display.setText(String.valueOf(n1 * n2));
        }
        multiplicar = false;
        if (dividir) {
            n2 = Double.parseDouble(display.getText());
            display.setText(String.valueOf(n1 / n2));
        }
        dividir = false;
        if (porcent) {
            n2 = Double.parseDouble(display.getText());
            display.setText(String.valueOf((n2 * n1) / 100));
        }
        porcent = false;
        if (pote) {
            double sum = 1;
            for (int i = 0; i < 2; i++) {
                sum = sum * n1;
            }
            n3 = sum;
            display.setText(String.valueOf(n3));
        }
        pote = false;
        if (potenal) {
            n2 = Double.parseDouble(display.getText());
            double sum = 1;
            for (int i = 0; i < n2; i++) {
                sum = sum * n1;
            }
            n3 = sum;
            display.setText(String.valueOf(n3));
        }
        potenal = false;
        if (mom) {
            n2 = Double.parseDouble(display.getText());
            display.setText(String.valueOf(n1 % n2));
        }
        mom = false;
        if (divivi) {
            n2 = Double.parseDouble(display.getText());
            display.setText(n1 + "/" + n2);
        }
        divivi = false;
        if (divi) {
            display.setText("1/" + n1);
        }
        divi = false;
        if (raizcua) {
            display.setText(String.valueOf(Math.sqrt(n1)));
        }
        raizcua = false;
        if (raiz) {
            n2 = Double.parseDouble(display.getText());
            display.setText(String.valueOf(Math.pow(n1, 1/n2)));

        }
        if(sin){
            pr=n1;
            num=3.1416*pr/180;
            System.out.println(""+num);
            sum1=0;
            for (int i = 0; i <= 50; i++) {
                pot2=1;
                for (int j = 0; j <= 50; j++) {
                    pot2=pot2*(-1);
                }
                facta=1;
                xfc=2*num+1;
                for (int j =1; j <= xfc; j++) {
                    facta=facta*j;
                }
                pot3=1;
                for (int j = 0; j <= 2*num+1; j++) {
                    pot3=pot3*num;
                }
                sum1=(pot2*pot3)/facta;
                System.out.println(""+sum1);
            }
            display.setText(String.valueOf(sum1));
        }
        
        if(cos){
            
        }
        
        if(tan){
            
        }
    }//GEN-LAST:event_igualActionPerformed

    private void restActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restActionPerformed
         resta = true;
        n1 = Double.parseDouble(display.getText());
        display.setText("0");
    }//GEN-LAST:event_restActionPerformed

    private void multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multActionPerformed
        multiplicar = true;
        n1 = Double.parseDouble(display.getText());
        display.setText("0");
    }//GEN-LAST:event_multActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        dividir = true;
        n1 = Double.parseDouble(display.getText());
        display.setText("0");
    }//GEN-LAST:event_divActionPerformed

    private void porceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porceActionPerformed
        porcent = true;
        n1 = Double.parseDouble(display.getText());
        display.setText("0");
    }//GEN-LAST:event_porceActionPerformed

    private void serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serActionPerformed
        raizcua = true;
        n1 = Double.parseDouble(display.getText());
        display.setText("0");
    }//GEN-LAST:event_serActionPerformed

    private void rainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rainActionPerformed
        raiz = true;
        n1 = Double.parseDouble(display.getText());
        display.setText("0");
    }//GEN-LAST:event_rainActionPerformed

    private void potActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potActionPerformed
        pote = true;
        n1 = Double.parseDouble(display.getText());
        display.setText("0");
    }//GEN-LAST:event_potActionPerformed

    private void pot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pot1ActionPerformed
        potenal = true;
        n1 = Double.parseDouble(display.getText());
        display.setText("0");
    }//GEN-LAST:event_pot1ActionPerformed

    private void MonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonActionPerformed
        mom = true;
        n1 = Double.parseDouble(display.getText());
        display.setText("0");
    }//GEN-LAST:event_MonActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed

    }//GEN-LAST:event_displayActionPerformed

    private void div1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_div1ActionPerformed
        divi = true;
        n1 = Double.parseDouble(display.getText());
        display.setText("0");
    }//GEN-LAST:event_div1ActionPerformed

    private void div2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_div2ActionPerformed
        divivi = true;
        n1 = Double.parseDouble(display.getText());
        display.setText("0");
    }//GEN-LAST:event_div2ActionPerformed

    private void div3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_div3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_div3ActionPerformed

    private void sineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sineActionPerformed
        sin = true;
        n1 = Double.parseDouble(display.getText());
        display.setText("sin"+"("+n1+")");
    }//GEN-LAST:event_sineActionPerformed

    private void coseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coseActionPerformed

    private void taneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taneActionPerformed

    private void factoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_factoActionPerformed

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
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Mon;
    private javax.swing.JButton borrar;
    private javax.swing.JButton cose;
    private javax.swing.JTextField display;
    private javax.swing.JButton div;
    private javax.swing.JButton div1;
    private javax.swing.JButton div2;
    private javax.swing.JButton div3;
    private javax.swing.JButton facto;
    private javax.swing.JButton igual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton mult;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JButton porce;
    private javax.swing.JButton pot;
    private javax.swing.JButton pot1;
    private javax.swing.JButton rain;
    private javax.swing.JButton rest;
    private javax.swing.JButton ser;
    private javax.swing.JButton sine;
    private javax.swing.JButton sum;
    private javax.swing.JButton tane;
    // End of variables declaration//GEN-END:variables
}
