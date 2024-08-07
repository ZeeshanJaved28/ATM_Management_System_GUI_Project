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
public class ATM_Withdraw extends javax.swing.JFrame {

    /**
     * Creates new form ATM_Withdraw
     */
    public ATM_Withdraw() {
        initComponents();
    } 
    Connection Con = null;
    PreparedStatement pst = null,pst1=null;
    ResultSet Rs = null,Rs1=null;
    Statement St = null,St1=null;
    int OldBalance;
    
    int MyAccNum;
    public ATM_Withdraw(int AccNum) {
    initComponents();
    MyAccNum = AccNum;
    GetBalance();
    }
    private void GetBalance()
   {
     String Query = "select * from Accounttbl where AccNum='"+MyAccNum+"'";
       try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3307/atmdb","root","");
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery(Query);
            if(Rs1.next()){
            OldBalance = Rs1.getInt(9);
            BalLbl.setText(""+OldBalance);
            }else
            {
                
            }
       }catch (Exception e){
           JOptionPane.showMessageDialog(this, e);
       }  
   }
    
    int TrId=0;
    private void CountDep(){
        try{
            St1=Con.createStatement();
            Rs1=St1.executeQuery("select MAX(TID) from TrasanctionTbl");
            Rs1.next();
            TrId=Rs1.getInt(1)+1;
        } catch (Exception e){
            
        }
    }
    String MyDate;
    public void GetDate()
{
    Date d = new Date();
    SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
    MyDate =s.format(d);        
}
    private void WithDrawMoney(){
        try{
        GetDate();
        CountDep();
               Con = DriverManager.getConnection("jdbc:mysql://localhost:3307/atmdb","root","");
               PreparedStatement Add = Con.prepareStatement("insert into TrasanctionTbl values(?,?,?,?,?)");
               Add.setInt(1, TrId);
               Add.setInt(2, MyAccNum);
               Add.setString(3, "WithDraw");
               Add.setString(4,MyDate);
               Add.setString(5, AmountTb.getText());
               int row = Add.executeUpdate();
               Con.close();
           }catch(Exception e){
               JOptionPane.showMessageDialog(this, e);
           }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CloseLbl3 = new javax.swing.JLabel();
        MinLbl4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        AmountTb = new javax.swing.JTextField();
        WithDrawBtn1 = new javax.swing.JButton();
        BackLbl2 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        BalLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 51));
        jLabel5.setText(" ATM MANAGEMENT SYSTEM ");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 51));
        jLabel6.setText("  HMHZ BANK");

        CloseLbl3.setBackground(new java.awt.Color(255, 153, 51));
        CloseLbl3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CloseLbl3.setForeground(new java.awt.Color(255, 153, 51));
        CloseLbl3.setText("X");
        CloseLbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseLbl3MouseClicked(evt);
            }
        });

        MinLbl4.setBackground(new java.awt.Color(255, 153, 51));
        MinLbl4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        MinLbl4.setForeground(new java.awt.Color(255, 153, 51));
        MinLbl4.setText("-");
        MinLbl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinLbl4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(176, 176, 176)
                        .addComponent(MinLbl4)
                        .addGap(18, 18, 18)
                        .addComponent(CloseLbl3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(153, 153, 153))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MinLbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CloseLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel7.setText("Amount:");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel8.setText("WITHDRAW");

        AmountTb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AmountTb.setForeground(new java.awt.Color(0, 0, 153));

        WithDrawBtn1.setBackground(new java.awt.Color(0, 0, 0));
        WithDrawBtn1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        WithDrawBtn1.setForeground(new java.awt.Color(255, 153, 51));
        WithDrawBtn1.setText("WITHDRAW");
        WithDrawBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WithDrawBtn1MouseClicked(evt);
            }
        });

        BackLbl2.setBackground(new java.awt.Color(255, 153, 51));
        BackLbl2.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        BackLbl2.setForeground(new java.awt.Color(0, 102, 102));
        BackLbl2.setText("Back");
        BackLbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackLbl2MouseClicked(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setText("Your Balance:");

        BalLbl.setBackground(new java.awt.Color(0, 0, 0));
        BalLbl.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BalLbl.setForeground(new java.awt.Color(0, 0, 150));
        BalLbl.setText("????");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(AmountTb, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(WithDrawBtn1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(BalLbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(BackLbl2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AmountTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(WithDrawBtn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BackLbl2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void WithDrawBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WithDrawBtn1MouseClicked
        if(AmountTb.getText().isEmpty() || AmountTb.getText().equals(0))
        {
            JOptionPane.showMessageDialog(this, "Enter Valid Amount");
        }else if(OldBalance < Integer.valueOf(AmountTb.getText()))
        {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        }else
        {
            try{
            String Query = "Update AccountTbl set Balance=? where AccNum=?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3307/atmdb","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-Integer.valueOf(AmountTb.getText()));
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate() == 1)
            {
               JOptionPane.showMessageDialog(this, "Balance Updated");
               WithDrawMoney();
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
    }//GEN-LAST:event_WithDrawBtn1MouseClicked

    private void BackLbl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackLbl2MouseClicked
       new ATM_MainHome(MyAccNum).setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BackLbl2MouseClicked

    private void CloseLbl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLbl3MouseClicked
       System.exit(1);
    }//GEN-LAST:event_CloseLbl3MouseClicked

    private void MinLbl4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinLbl4MouseClicked
        this.setExtendedState(ATM_Withdraw.ICONIFIED); 
    }//GEN-LAST:event_MinLbl4MouseClicked

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
            java.util.logging.Logger.getLogger(ATM_Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATM_Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATM_Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATM_Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATM_Withdraw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmountTb;
    private javax.swing.JLabel BackLbl2;
    private javax.swing.JLabel BalLbl;
    private javax.swing.JLabel CloseLbl3;
    private javax.swing.JLabel MinLbl4;
    private javax.swing.JButton WithDrawBtn1;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
