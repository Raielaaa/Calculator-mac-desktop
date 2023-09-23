package com.mycompany.calculatormac;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Image;
import javax.swing.ImageIcon;

public class MainFrame extends javax.swing.JFrame {

    //Global variables for the operators
    int counterMultiply = 0;
    int counterAdd = 0;
    int counterDivide = 0;
    int counterMinus = 0;
    
    //GLobal variable for solver counter
    int counterSolve = 0;
    //Global variable for the first inputted number
    double temporaryNum = 0;
    //Global variable for the second inputted number
    double temporaryNumber2 = 0;
    //Global variable for the total of first and second inputted number
    double total;
    //Global variable for the power
    int counterPW = 0;

    //Constructor
    public MainFrame() {
        //Auto generated codes
        initComponents();
        ImageIcon icon = new ImageIcon(getClass().getResource("images/171352_calculator_icon.png"));
        Image myImage = icon.getImage();
        this.setIconImage(myImage);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        btnZero = new javax.swing.JButton();
        btnOne = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        btnEquals = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnEight = new javax.swing.JButton();
        btnPW = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblText1 = new javax.swing.JLabel();
        lblText2 = new javax.swing.JLabel();

        jPanel6.setBackground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel14.setBackground(new java.awt.Color(255, 204, 102));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel15.setBackground(new java.awt.Color(153, 0, 204));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel16.setBackground(new java.awt.Color(51, 0, 255));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel17.setBackground(new java.awt.Color(0, 204, 51));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnZero.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnZero.setText("0");
        btnZero.setPreferredSize(new java.awt.Dimension(200, 80));
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });

        btnOne.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnOne.setText("1");
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });

        btnTwo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnTwo.setText("2");
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });

        btnThree.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnThree.setText("3");
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });

        btnPlus.setBackground(new java.awt.Color(233, 129, 55));
        btnPlus.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnDot.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnDot.setText(".");
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });

        btnEquals.setBackground(new java.awt.Color(233, 129, 55));
        btnEquals.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnEquals.setText("=");
        btnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualsActionPerformed(evt);
            }
        });

        btnFour.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnFour.setText("4");
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });

        btnFive.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnFive.setText("5");
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiveActionPerformed(evt);
            }
        });

        btnSix.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnSix.setText("6");
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixActionPerformed(evt);
            }
        });

        btnMinus.setBackground(new java.awt.Color(233, 129, 55));
        btnMinus.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnMinus.setText("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btnCE.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnCE.setText("CE");
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });

        btnSeven.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnSeven.setText("7");
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSevenActionPerformed(evt);
            }
        });

        btnC.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnEight.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnEight.setText("8");
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEightActionPerformed(evt);
            }
        });

        btnPW.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnPW.setText("PW");
        btnPW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPWActionPerformed(evt);
            }
        });

        btnDivide.setBackground(new java.awt.Color(233, 129, 55));
        btnDivide.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnDivide.setText("/");
        btnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivideActionPerformed(evt);
            }
        });

        btnNine.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnNine.setText("9");
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNineActionPerformed(evt);
            }
        });

        btnMultiply.setBackground(new java.awt.Color(233, 129, 55));
        btnMultiply.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnMultiply.setText("x");
        btnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplyActionPerformed(evt);
            }
        });

        lblText1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblText1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblText2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblText2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblText1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblText2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lblText2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblText1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, 0)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(btnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(btnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnPW, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(btnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPW, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Adds number 4 to the screen
    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourActionPerformed
        resetClear();
        lblText1.setText(lblText1.getText() + "4");
    }//GEN-LAST:event_btnFourActionPerformed
    //Adds number 6 to the screen
    private void btnSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSixActionPerformed
        resetClear();
        lblText1.setText(lblText1.getText() + "6");
    }//GEN-LAST:event_btnSixActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        lblText1.setText("");
    }//GEN-LAST:event_btnCEActionPerformed
    //Adds number 1 to the screen
    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneActionPerformed
        resetClear();
        lblText1.setText(lblText1.getText() + "1");
    }//GEN-LAST:event_btnOneActionPerformed
    //Adds number 2 to the screen
    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoActionPerformed
        resetClear();
        lblText1.setText(lblText1.getText() + "2");
    }//GEN-LAST:event_btnTwoActionPerformed
    //Multiply button; increments the "counterPlus" when clicked, this function is for solvinf purposes
    private void btnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplyActionPerformed
        counterMultiply++;
        temporaryNum = Double.parseDouble(lblText1.getText());
        lblText2.setText(lblText1.getText() + " x ");
        lblText1.setText("");
    }//GEN-LAST:event_btnMultiplyActionPerformed
    //Adds number 0 to the screen
    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        resetClear();
        lblText1.setText(lblText1.getText() + "0");
    }//GEN-LAST:event_btnZeroActionPerformed
    //Adds number 3 to the screen
    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreeActionPerformed
        resetClear();
        lblText1.setText(lblText1.getText() + "3");
    }//GEN-LAST:event_btnThreeActionPerformed
    //Adds number 5 to the screen
    private void btnFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiveActionPerformed
        resetClear();
        lblText1.setText(lblText1.getText() + "5");
    }//GEN-LAST:event_btnFiveActionPerformed
    //Adds number 7 to the screen
    private void btnSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSevenActionPerformed
        resetClear();
        lblText1.setText(lblText1.getText() + "7");
    }//GEN-LAST:event_btnSevenActionPerformed
    //Adds number 8 to the screen
    private void btnEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEightActionPerformed
        resetClear();
        lblText1.setText(lblText1.getText() + "8");
    }//GEN-LAST:event_btnEightActionPerformed
    //Adds number 9 to the screen
    private void btnNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNineActionPerformed
        resetClear();
        lblText1.setText(lblText1.getText() + "9");
    }//GEN-LAST:event_btnNineActionPerformed
    //Add button; increments the "counterPlus" when clicked, this function is for solvinf purposes
    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        counterAdd++;
        temporaryNum = Double.parseDouble(lblText1.getText());
        lblText2.setText(lblText1.getText() + " + ");
        lblText1.setText("");
    }//GEN-LAST:event_btnPlusActionPerformed
    //Minus button; increments the "counterMinus" when clicked, this function is for solvinf purposes
    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        counterMinus++;
        temporaryNum = Double.parseDouble(lblText1.getText());
        lblText2.setText(lblText1.getText() + " - ");
        lblText1.setText("");
    }//GEN-LAST:event_btnMinusActionPerformed
    //Divide button; increments the "counterDivide" when clicked, this function is for solvinf purposes
    private void btnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivideActionPerformed
        counterDivide++;
        temporaryNum = Double.parseDouble(lblText1.getText());
        lblText2.setText(lblText1.getText() + " / ");
        lblText1.setText("");
    }//GEN-LAST:event_btnDivideActionPerformed
    //Equals button, this is where the main functionality of  the calculator is stored
    private void btnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualsActionPerformed
        //Executes if the Add button has a counter of one
        temporaryNumber2 = Double.parseDouble(lblText1.getText());
        if (counterAdd == 1) {
            //Adds the two values displayed in the screen
            double totalAdd = temporaryNum + temporaryNumber2;
            solver(totalAdd);
        }
        //Executes if the minus button has a counter of one
        if (counterMinus == 1) {
            //Minus the two values displayed in the screen
            double totalMinus = temporaryNum - temporaryNumber2;
            solver(totalMinus);
        }
        //Executes if the multiply button has a counter of one
        if (counterMultiply == 1) {
            //Multiplies the two values displayed in the screen
            double totalMultiply = temporaryNum * temporaryNumber2;
            solver(totalMultiply);
        }
        //Executes if the divide button has a counter of one
        if (counterDivide == 1) {
            //Divides the two values displayed in the screen
            double totalDivide = temporaryNum / temporaryNumber2;
            solver(totalDivide);
        }
    }//GEN-LAST:event_btnEqualsActionPerformed
    //Method used for solving the arithmetic problem displayed on the screen
    public void solver(double numbersToSolve) {
        
        lblText2.setText(lblText2.getText() + lblText1.getText());
        //If the subtotal of the two inputted numbers is whole number, then it will remove the zero decimal number
        if (numbersToSolve % 1 == 0) lblText1.setText(String.valueOf((int) numbersToSolve));
        //Executes if the subtotal of the two inputted numbers is a decimal number
        else lblText1.setText(String.valueOf(numbersToSolve));
        reset();
        //Disabling the CE key
        btnCE.setEnabled(false);
    }
    //Reseting the value of all the operator counter
    public void reset() {
        counterAdd = 0;
        counterMinus = 0;
        counterMultiply = 0;
        counterDivide = 0;
        counterSolve = 1;
    }
    public void resetClear() {
        btnCE.setEnabled(true);
        if (counterSolve == 1) {
            lblText1.setText("");
            lblText2.setText("");
            counterSolve = 0;
        }
    }
    //Clears the screen
    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        lblText1.setText("");
        lblText2.setText("");
        reset();
        resetClear();
    }//GEN-LAST:event_btnCActionPerformed
    //Adds a dot in the screen
    private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDotActionPerformed
        resetClear();
        lblText1.setText(lblText1.getText() + ".");
    }//GEN-LAST:event_btnDotActionPerformed
    //Functions as on and off of the calculator
    private void btnPWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPWActionPerformed
        counterPW++;
        //Starting from zero, if the "counterPW" is odd, then it will disable all the button except the PW button
        if (counterPW % 2 == 1) {
            btnOne.setEnabled(false);
            btnTwo.setEnabled(false);
            btnThree.setEnabled(false);
            btnFour.setEnabled(false);
            btnFive.setEnabled(false);
            btnSix.setEnabled(false);
            btnSeven.setEnabled(false);
            btnEight.setEnabled(false);
            btnNine.setEnabled(false);
            btnZero.setEnabled(false);
            btnPlus.setEnabled(false);
            btnMinus.setEnabled(false);
            btnMultiply.setEnabled(false);
            btnDivide.setEnabled(false);
            btnDot.setEnabled(false);
            btnCE.setEnabled(false);
            btnC.setEnabled(false);
            btnEquals.setEnabled(false);
            lblText1.setText("");
            lblText2.setText("");
        } 
        //If the counter is even, all the buttons of the calculator will be enabled
        else {
            btnOne.setEnabled(true);
            btnTwo.setEnabled(true);
            btnThree.setEnabled(true);
            btnFour.setEnabled(true);
            btnFive.setEnabled(true);
            btnSix.setEnabled(true);
            btnSeven.setEnabled(true);
            btnEight.setEnabled(true);
            btnNine.setEnabled(true);
            btnZero.setEnabled(true);
            btnPlus.setEnabled(true);
            btnMinus.setEnabled(true);
            btnMultiply.setEnabled(true);
            btnDivide.setEnabled(true);
            btnDot.setEnabled(true);
            btnCE.setEnabled(true);
            btnC.setEnabled(true);
            btnEquals.setEnabled(true);
        }
    }//GEN-LAST:event_btnPWActionPerformed
    //Main method
    public static void main(String args[]) {
        //Setting up the theme
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnEquals;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnPW;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton btnZero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblText1;
    private javax.swing.JLabel lblText2;
    // End of variables declaration//GEN-END:variables
}