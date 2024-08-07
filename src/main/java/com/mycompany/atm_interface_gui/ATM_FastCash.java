/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.atm_interface_gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Welcome ZeeshanJaved
 */
public class ATM_FastCash extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public ATM_FastCash() {
        initComponents();
    }
    int MyAccNum;
    public ATM_FastCash(int AccNum) {
        initComponents();
        MyAccNum = AccNum;
        BallLbl.setText("Rs"+OldBalance);
        GetBalance();
    }
        Connection Con = null;
        PreparedStatement pst = null,pst1=null;
        ResultSet Rs = null,Rs1=null;
        Statement St = null,St1=null;
        int OldBalance;
   private void GetBalance()
   {
     String Query = "select * from Accounttbl where AccNum='"+MyAccNum+"'";
       try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3307/atmdb","root","");
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery(Query);
            if(Rs1.next()){
            OldBalance = Rs1.getInt(9);
            BallLbl.setText("Rs"+OldBalance);
            }else
            {
                
            }
       }catch (Exception e){
           JOptionPane.showMessageDialog(this, e);
       }  
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        CloseLbl5 = new javax.swing.JLabel();
        MinLbl5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Rs100Btn = new javax.swing.JButton();
        Rs500Btn = new javax.swing.JButton();
        Rs1000Btn = new javax.swing.JButton();
        Rs2000Btn = new javax.swing.JButton();
        Rs5000Btn = new javax.swing.JButton();
        Rs10000Btn = new javax.swing.JButton();
        BackLbl3 = new javax.swing.JLabel();
        BallLbl = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel9.setBackground(new java.awt.Color(255, 153, 51));

        jPanel10.setBackground(new java.awt.Color(30, 29, 29));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 153, 51));
        jLabel13.setText("ATM MANAGEMENT SYSTEM");

        CloseLbl5.setBackground(new java.awt.Color(255, 153, 51));
        CloseLbl5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CloseLbl5.setForeground(new java.awt.Color(255, 153, 51));
        CloseLbl5.setText("X");
        CloseLbl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseLbl5MouseClicked(evt);
            }
        });

        MinLbl5.setBackground(new java.awt.Color(255, 153, 51));
        MinLbl5.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        MinLbl5.setForeground(new java.awt.Color(255, 153, 51));
        MinLbl5.setText("-");
        MinLbl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinLbl5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(MinLbl5)
                        .addGap(18, 18, 18)
                        .addComponent(CloseLbl5)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(134, 134, 134))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CloseLbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MinLbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 22)); // NOI18N
        jLabel15.setText("FAST CASH");

        Rs100Btn.setBackground(new java.awt.Color(0, 0, 0));
        Rs100Btn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Rs100Btn.setForeground(new java.awt.Color(255, 153, 51));
        Rs100Btn.setText("Rs 100");
        Rs100Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rs100BtnMouseClicked(evt);
            }
        });

        Rs500Btn.setBackground(new java.awt.Color(0, 0, 0));
        Rs500Btn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Rs500Btn.setForeground(new java.awt.Color(255, 153, 51));
        Rs500Btn.setText("Rs 500");
        Rs500Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rs500BtnMouseClicked(evt);
            }
        });

        Rs1000Btn.setBackground(new java.awt.Color(0, 0, 0));
        Rs1000Btn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Rs1000Btn.setForeground(new java.awt.Color(255, 153, 51));
        Rs1000Btn.setText("Rs 1000");
        Rs1000Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rs1000BtnMouseClicked(evt);
            }
        });

        Rs2000Btn.setBackground(new java.awt.Color(0, 0, 0));
        Rs2000Btn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Rs2000Btn.setForeground(new java.awt.Color(255, 153, 51));
        Rs2000Btn.setText("Rs 2000");
        Rs2000Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rs2000BtnMouseClicked(evt);
            }
        });

        Rs5000Btn.setBackground(new java.awt.Color(0, 0, 0));
        Rs5000Btn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Rs5000Btn.setForeground(new java.awt.Color(255, 153, 51));
        Rs5000Btn.setText("Rs 5000");
        Rs5000Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rs5000BtnMouseClicked(evt);
            }
        });

        Rs10000Btn.setBackground(new java.awt.Color(0, 0, 0));
        Rs10000Btn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Rs10000Btn.setForeground(new java.awt.Color(255, 153, 51));
        Rs10000Btn.setText("Rs 10000");
        Rs10000Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rs10000BtnMouseClicked(evt);
            }
        });

        BackLbl3.setBackground(new java.awt.Color(255, 153, 51));
        BackLbl3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        BackLbl3.setText("Back");
        BackLbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackLbl3MouseClicked(evt);
            }
        });

        BallLbl.setBackground(new java.awt.Color(255, 153, 51));
        BallLbl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BallLbl.setForeground(new java.awt.Color(0, 0, 150));
        BallLbl.setText("Balance");

        jLabel18.setBackground(new java.awt.Color(255, 153, 51));
        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 102));
        jLabel18.setText(" HMHZ BANK");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Rs5000Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Rs1000Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Rs100Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(BallLbl)
                .addGap(61, 61, 61)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Rs500Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Rs10000Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Rs2000Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel15))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(BackLbl3))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel18)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rs500Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rs100Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rs2000Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rs1000Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BallLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rs10000Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rs5000Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(BackLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Rs100BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rs100BtnMouseClicked
        if(OldBalance < 100)
        {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        }else
        {
            try{
            String Query = "Update AccountTbl set Balance=? where AccNum=?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3307/atmdb","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-100);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate() == 1)
            {
               JOptionPane.showMessageDialog(this, "Balance Updated");
               new ATM_MainHome(MyAccNum).setVisible(true);
               this.dispose();
            }else 
            {
                JOptionPane.showMessageDialog(this, "Missing Information");
            }
            } catch (Exception e) {
               JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_Rs100BtnMouseClicked

    private void Rs500BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rs500BtnMouseClicked
       if(OldBalance < 500)
        {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        }else
        {
            try{
            String Query = "Update AccountTbl set Balance=? where AccNum=?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3307/atmdb","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-500);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate() == 1)
            {
               JOptionPane.showMessageDialog(this, "Balance Updated");
               new ATM_MainHome(MyAccNum).setVisible(true);
               this.dispose();
            }else 
            {
                JOptionPane.showMessageDialog(this, "Missing Information");
            }
            } catch (Exception e) {
               JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_Rs500BtnMouseClicked

    private void Rs1000BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rs1000BtnMouseClicked
        if(OldBalance < 1000)
        {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        }else
        {
            try{
            String Query = "Update AccountTbl set Balance=? where AccNum=?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3307/atmdb","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-1000);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate() == 1)
            {
               JOptionPane.showMessageDialog(this, "Balance Updated");
               new ATM_MainHome(MyAccNum).setVisible(true);
               this.dispose();
            }else 
            {
                JOptionPane.showMessageDialog(this, "Missing Information");
            }
            } catch (Exception e) {
               JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_Rs1000BtnMouseClicked

    private void Rs2000BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rs2000BtnMouseClicked
        if(OldBalance < 2000)
        {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        }else
        {
            try{
            String Query = "Update AccountTbl set Balance=? where AccNum=?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3307/atmdb","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-2000);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate() == 1)
            {
               JOptionPane.showMessageDialog(this, "Balance Updated");
               new ATM_MainHome(MyAccNum).setVisible(true);
               this.dispose();
            }else 
            {
                JOptionPane.showMessageDialog(this, "Missing Information");
            }
            } catch (Exception e) {
               JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_Rs2000BtnMouseClicked

    private void Rs5000BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rs5000BtnMouseClicked
        if(OldBalance < 5000)
        {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        }else
        {
            try{
            String Query = "Update AccountTbl set Balance=? where AccNum=?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3307/atmdb","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-5000);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate() == 1)
            {
               JOptionPane.showMessageDialog(this, "Balance Updated");         
               new ATM_MainHome(MyAccNum).setVisible(true);
               this.dispose();
            }else 
            {
                JOptionPane.showMessageDialog(this, "Missing Information");
            }
            } catch (Exception e) {
               JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_Rs5000BtnMouseClicked

    private void Rs10000BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rs10000BtnMouseClicked
        if(OldBalance < 10000)
        {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        }else
        {
            try{
            String Query = "Update AccountTbl set Balance=? where AccNum=?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3307/atmdb","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-10000);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate() == 1)
            {
               JOptionPane.showMessageDialog(this, "Balance Updated");
               new ATM_MainHome(MyAccNum).setVisible(true);
               this.dispose();
            }else 
            {
                JOptionPane.showMessageDialog(this, "Missing Information");
            }
            } catch (Exception e) {
               JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_Rs10000BtnMouseClicked

    private void BackLbl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackLbl3MouseClicked
        new ATM_MainHome(MyAccNum).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackLbl3MouseClicked

    private void CloseLbl5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLbl5MouseClicked
        System.exit(1);
    }//GEN-LAST:event_CloseLbl5MouseClicked

    private void MinLbl5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinLbl5MouseClicked
       this.setExtendedState(ATM_FastCash.ICONIFIED);
    }//GEN-LAST:event_MinLbl5MouseClicked

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
            java.util.logging.Logger.getLogger(ATM_FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATM_FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATM_FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATM_FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATM_FastCash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackLbl3;
    private javax.swing.JLabel BallLbl;
    private javax.swing.JLabel CloseLbl5;
    private javax.swing.JLabel MinLbl5;
    private javax.swing.JButton Rs10000Btn;
    private javax.swing.JButton Rs1000Btn;
    private javax.swing.JButton Rs100Btn;
    private javax.swing.JButton Rs2000Btn;
    private javax.swing.JButton Rs5000Btn;
    private javax.swing.JButton Rs500Btn;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
