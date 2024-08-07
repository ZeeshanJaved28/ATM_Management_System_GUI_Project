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
public class ATM_Deposit extends javax.swing.JFrame {

    /**
     * Creates new form ATM_Deposit
     */
    public ATM_Deposit() {
        initComponents();
    }
    int MyAccNum;
    public ATM_Deposit(int AccNum) {
        initComponents();
        MyAccNum = AccNum;
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CloseLbl3 = new javax.swing.JLabel();
        MinLbl3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        AmountTb = new javax.swing.JTextField();
        DepositBtn1 = new javax.swing.JButton();
        BackLbl1 = new javax.swing.JLabel();

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
        jLabel6.setText(" HMHZ BANK");

        CloseLbl3.setBackground(new java.awt.Color(255, 153, 51));
        CloseLbl3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CloseLbl3.setForeground(new java.awt.Color(255, 153, 51));
        CloseLbl3.setText("X");
        CloseLbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseLbl3MouseClicked(evt);
            }
        });

        MinLbl3.setBackground(new java.awt.Color(255, 153, 51));
        MinLbl3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        MinLbl3.setForeground(new java.awt.Color(255, 153, 51));
        MinLbl3.setText("-");
        MinLbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinLbl3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(148, 148, 148))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(174, 174, 174)
                        .addComponent(MinLbl3)
                        .addGap(18, 18, 18)
                        .addComponent(CloseLbl3)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MinLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CloseLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        jLabel8.setText("DEPOSIT");

        AmountTb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AmountTb.setForeground(new java.awt.Color(0, 0, 153));

        DepositBtn1.setBackground(new java.awt.Color(0, 0, 0));
        DepositBtn1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        DepositBtn1.setForeground(new java.awt.Color(255, 153, 51));
        DepositBtn1.setText("DEPOSIT");
        DepositBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositBtn1MouseClicked(evt);
            }
        });

        BackLbl1.setBackground(new java.awt.Color(255, 153, 51));
        BackLbl1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        BackLbl1.setForeground(new java.awt.Color(0, 102, 102));
        BackLbl1.setText("Back");
        BackLbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackLbl1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(AmountTb, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(DepositBtn1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(BackLbl1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AmountTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(DepositBtn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BackLbl1)
                .addGap(30, 30, 30)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
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
    private void DepositMoney()
{
    try{
        CountDep();
        GetDate();
               Con = DriverManager.getConnection("jdbc:mysql://localhost:3307/atmdb","root","");
               PreparedStatement Add = Con.prepareStatement("insert into TrasanctionTbl values(?,?,?,?,?)");
               Add.setInt(1, TrId);
               Add.setInt(2, MyAccNum);
               Add.setString(3, "Deposit");
               Add.setString(4,MyDate);
               Add.setString(5, AmountTb.getText());
               int row = Add.executeUpdate();
               //JOptionPane.showMessageDialog(this, "Account Saved");
               Con.close();
               //Clear();
           }catch(Exception e){
               JOptionPane.showMessageDialog(this, e);
           }
}
    private void DepositBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositBtn1MouseClicked
        if(AmountTb.getText().isEmpty() || AmountTb.getText().equals(0))
        {
            JOptionPane.showMessageDialog(this, "Enter Valid Amount");
        }else
        {
            try{
            String Query = "Update AccountTbl set Balance=? where AccNum=?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3307/atmdb","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance+Integer.valueOf(AmountTb.getText()));
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate() == 1)
            {
               JOptionPane.showMessageDialog(this, "Balance Updated"); 
               DepositMoney();
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
    }//GEN-LAST:event_DepositBtn1MouseClicked

    private void BackLbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackLbl1MouseClicked
        new ATM_MainHome(MyAccNum).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackLbl1MouseClicked

    private void CloseLbl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLbl3MouseClicked
        System.exit(1);
    }//GEN-LAST:event_CloseLbl3MouseClicked

    private void MinLbl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinLbl3MouseClicked
        this.setExtendedState(ATM_Deposit.ICONIFIED); 
    }//GEN-LAST:event_MinLbl3MouseClicked

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
            java.util.logging.Logger.getLogger(ATM_Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATM_Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATM_Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATM_Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATM_Deposit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmountTb;
    private javax.swing.JLabel BackLbl1;
    private javax.swing.JLabel CloseLbl3;
    private javax.swing.JButton DepositBtn1;
    private javax.swing.JLabel MinLbl3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
