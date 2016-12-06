package healthcaresystemapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DanielMedina
 */
public class HealthcareSystemPaymentGUI extends javax.swing.JFrame {

    /**
     * Creates new form HealthcareSystemPaymentGUI
     */
    
    private String selected = "Cash";
    
    public HealthcareSystemPaymentGUI() {
        initComponents();
        Address_2_lbl.setVisible(false);
        address_1_lbl.setVisible(false);
        address_1_txt.setVisible(false);
        address_2_txt.setVisible(false);
        amount_lbl.setVisible(true);
        amount_txt.setVisible(true);
        billing_address_lbl.setVisible(false);
        cancel_btn.setVisible(true);
        card_num_lbl.setVisible(false);
        card_num_txt.setVisible(false);
        cash_btn.setVisible(true);
        check_btn.setVisible(true);
        city_lbl.setVisible(false);
        city_txt.setVisible(false);
        cvv_lbl.setVisible(false);
        cvv_txt.setVisible(false);
        debit_credit_btn.setVisible(true);
        exp_date_lbl.setVisible(false);
        exp_date_txt.setVisible(false);
        payment_btn.setVisible(true);
        state_lbl.setVisible(false);
        state_txt.setVisible(false);
        zipcode_lbl.setVisible(false);
        zipcode_txt.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        cash_btn = new javax.swing.JButton();
        debit_credit_btn = new javax.swing.JButton();
        check_btn = new javax.swing.JButton();
        card_num_lbl = new javax.swing.JLabel();
        amount_lbl = new javax.swing.JLabel();
        amount_txt = new javax.swing.JTextField();
        card_num_txt = new javax.swing.JTextField();
        exp_date_lbl = new javax.swing.JLabel();
        exp_date_txt = new javax.swing.JTextField();
        cvv_lbl = new javax.swing.JLabel();
        cvv_txt = new javax.swing.JTextField();
        billing_address_lbl = new javax.swing.JLabel();
        address_1_lbl = new javax.swing.JLabel();
        address_1_txt = new javax.swing.JTextField();
        Address_2_lbl = new javax.swing.JLabel();
        address_2_txt = new javax.swing.JTextField();
        city_lbl = new javax.swing.JLabel();
        city_txt = new javax.swing.JTextField();
        state_txt = new javax.swing.JTextField();
        state_lbl = new javax.swing.JLabel();
        zipcode_lbl = new javax.swing.JLabel();
        zipcode_txt = new javax.swing.JTextField();
        payment_btn = new javax.swing.JButton();
        cancel_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cash_btn.setText("Cash");
        cash_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cash_btnActionPerformed(evt);
            }
        });

        debit_credit_btn.setText("Credit/Debit");
        debit_credit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debit_credit_btnActionPerformed(evt);
            }
        });

        check_btn.setText("Check");
        check_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_btnActionPerformed(evt);
            }
        });

        card_num_lbl.setText("Card Number:");

        amount_lbl.setText("Amount: $");

        amount_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amount_txtActionPerformed(evt);
            }
        });

        exp_date_lbl.setText("Exp. Date:");

        exp_date_txt.setToolTipText("");

        cvv_lbl.setText("CVV:");

        billing_address_lbl.setText("Billing Address:");

        address_1_lbl.setText("Address 1:");

        Address_2_lbl.setText("Address 2:");

        city_lbl.setText("City:");

        state_lbl.setText("State:");

        zipcode_lbl.setText("Zipcode:");

        payment_btn.setText("Make Payment");
        payment_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payment_btnActionPerformed(evt);
            }
        });

        cancel_btn.setText("Cancel");
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(amount_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amount_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(card_num_lbl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(card_num_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(exp_date_lbl)
                                .addGap(27, 27, 27)
                                .addComponent(cvv_lbl)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(exp_date_txt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cvv_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(address_1_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(state_lbl)
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(zipcode_lbl)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(zipcode_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cancel_btn))))
                            .addComponent(address_2_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(city_txt)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(state_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(payment_btn))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cash_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(debit_credit_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(billing_address_lbl)
                            .addComponent(address_1_lbl)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Address_2_lbl)
                                .addGap(133, 133, 133)
                                .addComponent(city_lbl)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cash_btn)
                    .addComponent(debit_credit_btn)
                    .addComponent(check_btn))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amount_lbl)
                    .addComponent(amount_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(card_num_lbl)
                    .addComponent(exp_date_lbl)
                    .addComponent(cvv_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(card_num_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exp_date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cvv_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(billing_address_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(address_1_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(address_1_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Address_2_lbl)
                    .addComponent(city_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address_2_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(city_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(state_lbl)
                    .addComponent(zipcode_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(state_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipcode_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payment_btn)
                    .addComponent(cancel_btn))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void amount_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amount_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amount_txtActionPerformed

    private void payment_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payment_btnActionPerformed
        // TODO add your handling code here:
        
        Session session = Session.getInstance();
        String username = session.getUsername();
        
        Security sec = new Security();
        switch(selected){
            case "Card":
                if(card_num_txt.getText().length() > 0 || exp_date_txt.getText().length() > 0 || cvv_txt.getText().length() > 0){
                    String card_num_enc = sec.encrypt(card_num_txt.getText());
                    String exp_date_enc = sec.encrypt(exp_date_txt.getText());
                    String cvv_enc = sec.encrypt(cvv_txt.getText());
                    Boolean valid = validateCard(card_num_enc,exp_date_enc,cvv_enc);
                    if(valid == true){

                        String repudiationUID = sec.genUniqueID(username);
                        //TODO send compare
                        String repudiation = sec.checkRepudiation(username, repudiationUID);
                        System.out.println(repudiation);
                        if(repudiation.equals("Payment Succeeded")){
                            new cardPopup("Are you sure you want to pay: $" + amount_txt.getText()).setVisible(true);

                        }else{
                            new cardPopup(repudiation).setVisible(true);
                        }               

                    }else{
                        new cardPopup("Card Declined!").setVisible(true);
                    }
                }else{
                    new cardPopup("Missing Card info").setVisible(true);
                }
                break;
                
            case "Cash":
                new cardPopup("Invoice Has Been Sent to your Address.").setVisible(true);
                break;
                
            case "Check":
                new cardPopup("Invoice Has Been Sent to your Address.").setVisible(true);
                break;
        }
        
        
        
        
        
    }//GEN-LAST:event_payment_btnActionPerformed

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void cash_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cash_btnActionPerformed
        // TODO add your handling code here:
        Address_2_lbl.setVisible(false);
        address_1_lbl.setVisible(false);
        address_1_txt.setVisible(false);
        address_2_txt.setVisible(false);
        amount_lbl.setVisible(true);
        amount_txt.setVisible(true);
        billing_address_lbl.setVisible(false);
        cancel_btn.setVisible(true);
        card_num_lbl.setVisible(false);
        card_num_txt.setVisible(false);
        cash_btn.setVisible(true);
        check_btn.setVisible(true);
        city_lbl.setVisible(false);
        city_txt.setVisible(false);
        cvv_lbl.setVisible(false);
        cvv_txt.setVisible(false);
        debit_credit_btn.setVisible(true);
        exp_date_lbl.setVisible(false);
        exp_date_txt.setVisible(false);
        payment_btn.setVisible(true);
        state_lbl.setVisible(false);
        state_txt.setVisible(false);
        zipcode_lbl.setVisible(false);
        zipcode_txt.setVisible(false);
        
        selected = "Cash";
    }//GEN-LAST:event_cash_btnActionPerformed

    private void check_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_btnActionPerformed
        // TODO add your handling code here:
    Address_2_lbl.setVisible(false);
    address_1_lbl.setVisible(false);
    address_1_txt.setVisible(false);
    address_2_txt.setVisible(false);
    amount_lbl.setVisible(true);
    amount_txt.setVisible(true);
    billing_address_lbl.setVisible(false);
    cancel_btn.setVisible(true);
    card_num_lbl.setVisible(false);
    card_num_txt.setVisible(false);
    cash_btn.setVisible(true);
    check_btn.setVisible(true);
    city_lbl.setVisible(false);
    city_txt.setVisible(false);
    cvv_lbl.setVisible(false);
    cvv_txt.setVisible(false);
    debit_credit_btn.setVisible(true);
    exp_date_lbl.setVisible(false);
    exp_date_txt.setVisible(false);
    payment_btn.setVisible(true);
    state_lbl.setVisible(false);
    state_txt.setVisible(false);
    zipcode_lbl.setVisible(false);
    zipcode_txt.setVisible(false);
        selected = "Check";
    }//GEN-LAST:event_check_btnActionPerformed

    private void debit_credit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debit_credit_btnActionPerformed
        // TODO add your handling code here:
    Address_2_lbl.setVisible(true);
    address_1_lbl.setVisible(true);
    address_1_txt.setVisible(true);
    address_2_txt.setVisible(true);
    amount_lbl.setVisible(true);
    amount_txt.setVisible(true);
    billing_address_lbl.setVisible(true);
    cancel_btn.setVisible(true);
    card_num_lbl.setVisible(true);
    card_num_txt.setVisible(true);
    cash_btn.setVisible(true);
    check_btn.setVisible(true);
    city_lbl.setVisible(true);
    city_txt.setVisible(true);
    cvv_lbl.setVisible(true);
    cvv_txt.setVisible(true);
    debit_credit_btn.setVisible(true);
    exp_date_lbl.setVisible(true);
    exp_date_txt.setVisible(true);
    payment_btn.setVisible(true);
    state_lbl.setVisible(true);
    state_txt.setVisible(true);
    zipcode_lbl.setVisible(true);
    zipcode_txt.setVisible(true);
    selected = "Card";
    }//GEN-LAST:event_debit_credit_btnActionPerformed

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
            java.util.logging.Logger.getLogger(HealthcareSystemPaymentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HealthcareSystemPaymentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HealthcareSystemPaymentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HealthcareSystemPaymentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HealthcareSystemPaymentGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address_2_lbl;
    private javax.swing.JLabel address_1_lbl;
    private javax.swing.JTextField address_1_txt;
    private javax.swing.JTextField address_2_txt;
    private javax.swing.JLabel amount_lbl;
    private javax.swing.JTextField amount_txt;
    private javax.swing.JLabel billing_address_lbl;
    private javax.swing.JButton cancel_btn;
    private javax.swing.JLabel card_num_lbl;
    private javax.swing.JTextField card_num_txt;
    private javax.swing.JButton cash_btn;
    private javax.swing.JButton check_btn;
    private javax.swing.JLabel city_lbl;
    private javax.swing.JTextField city_txt;
    private javax.swing.JLabel cvv_lbl;
    private javax.swing.JTextField cvv_txt;
    private javax.swing.JButton debit_credit_btn;
    private javax.swing.JLabel exp_date_lbl;
    private javax.swing.JTextField exp_date_txt;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton payment_btn;
    private javax.swing.JLabel state_lbl;
    private javax.swing.JTextField state_txt;
    private javax.swing.JLabel zipcode_lbl;
    private javax.swing.JTextField zipcode_txt;
    // End of variables declaration//GEN-END:variables

    private static Boolean validateCard(java.lang.String cardNumber, java.lang.String expDate, java.lang.String cvv) {
        org.me.healthcaresystem.HealthcareSystemWS_Service service = new org.me.healthcaresystem.HealthcareSystemWS_Service();
        org.me.healthcaresystem.HealthcareSystemWS port = service.getHealthcareSystemWSPort();
        return port.validateCard(cardNumber, expDate, cvv);
    }
}
