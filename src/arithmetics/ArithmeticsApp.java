/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Nguyen Hai Anh aka HAD all right reserved
 */
package arithmetics;

import java.awt.Color;

/**
 *
 * @author Nhokxayda
 */
public class ArithmeticsApp extends javax.swing.JFrame {

    int num1, num2, r;

    public ArithmeticsApp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        firstNum = new javax.swing.JTextField();
        secondNum = new javax.swing.JTextField();
        labelr = new javax.swing.JLabel();
        result = new javax.swing.JLabel();
        plus = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        multiplier = new javax.swing.JButton();
        mod = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arithmetics");
        setLocation(new java.awt.Point(750, 250));

        label1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        label1.setText("First Number");

        label2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        label2.setText("Second Number");

        firstNum.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        firstNum.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        secondNum.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        secondNum.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        labelr.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        labelr.setText("Result");

        result.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        result.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        plus.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        minus.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        multiplier.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        multiplier.setText("*");
        multiplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplierActionPerformed(evt);
            }
        });

        mod.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        mod.setText("%");
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });

        divide.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        divide.setText("/");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstNum)
                            .addComponent(secondNum, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(multiplier, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelr))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(minus, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(firstNum, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secondNum, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelr, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multiplier, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try{
        num1 = Integer.parseInt(firstNum.getText());
        num2 = Integer.parseInt(secondNum.getText());
        r = num1 / num2;
        result.setText("" + r);
        } catch (NumberFormatException e){
            result.setForeground(Color.red);
            result.setText("Your input is incorrect!");
        }
    }

    private void multiplierActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try{
        num1 = Integer.parseInt(firstNum.getText());
        num2 = Integer.parseInt(secondNum.getText());
        r = num1 * num2;
        result.setText("" + r);
        } catch (NumberFormatException e){
            result.setForeground(Color.red);
            result.setText("Your input is incorrect!");
        }
    }

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {                                     
        try{
        num1 = Integer.parseInt(firstNum.getText());
        num2 = Integer.parseInt(secondNum.getText());
        r = num1 + num2;
        result.setText("" + r);
        } catch (NumberFormatException e){
            result.setForeground(Color.red);
            result.setText("Your input is incorrect!");
        }
    }

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {
        try{
        num1 = Integer.parseInt(firstNum.getText());
        num2 = Integer.parseInt(secondNum.getText());
        r = num1 - num2;
        result.setText("" + r);
        } catch (NumberFormatException e){
            result.setForeground(Color.red);
            result.setText("Your input is incorrect!");
        }
    }

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {
        firstNum.setText(null);
        secondNum.setText(null);
        result.setText(null);
    }

    private void modActionPerformed(java.awt.event.ActionEvent evt) {
        try{
        num1 = Integer.parseInt(firstNum.getText());
        num2 = Integer.parseInt(secondNum.getText());
        r = num1 % num2;
        result.setText("" + r);
        } catch (NumberFormatException e){
            result.setForeground(Color.red);
            result.setText("Your input is incorrect!");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ArithmeticsApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArithmeticsApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArithmeticsApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArithmeticsApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArithmeticsApp().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton clear;
    private javax.swing.JButton divide;
    private javax.swing.JTextField firstNum;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel labelr;
    private javax.swing.JButton minus;
    private javax.swing.JButton mod;
    private javax.swing.JButton multiplier;
    private javax.swing.JButton plus;
    private javax.swing.JLabel result;
    private javax.swing.JTextField secondNum;
    
}
