import java.awt.event.ActionEvent;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JTextField;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author autumncapasso
 */
public class ATM extends javax.swing.JFrame {
    //Variables
    private double withdrawAmount;
    private double depositAmount;
    private double transferAmount;
    private double balanceAmount;
    private String insuffientFundsAmount;

    public int count = 1;


    //Making 2 new Account Objects for Checking and Savings
    Account checkingAccount = new Account();
    Account savingAccount = new Account();

    //Number format
    NumberFormat nf = NumberFormat.getInstance(Locale.US);
    private Object amountEntered;

    /**
     * Creates new form ATM
     */
    public ATM() {
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

        jButton1 = new javax.swing.JButton();
        Deposit = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Withdrawl");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawlAction(evt);
            }
        });

        Deposit.setText("Deposit");
        Deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositActionPerformed(evt);
            }
        });

        jButton3.setText("Transfer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferAction(evt);
            }
        });

        jButton4.setText("Balance");

        jRadioButton1.setText("Checking");
        jRadioButton1.setActionCommand("CheckingRadioButton");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckingRadioButton(evt);
            }
        });

        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Savings");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavingRadioButton(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("ATM Machnie");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(50, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(80, 80, 80)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jRadioButton1)
                                                                .addGap(33, 33, 33))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton1))
                                                                .addGap(18, 18, 18)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(Deposit)
                                                        .addComponent(jButton4)
                                                        .addComponent(jRadioButton2)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(148, 148, 148)
                                                .addComponent(jLabel1)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(Deposit))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton4)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jRadioButton1)
                                        .addComponent(jRadioButton2))
                                .addGap(26, 26, 26)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(67, Short.MAX_VALUE))
        );

        jRadioButton2.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        JTextField amountEntered = new JTextField();
        JTextField textAmount = new JTextField();
    }
    //Method that Returns the text from the textfeild
    private void getAmount() {
        try {
            String text;
        } catch (NumberFormatException e) {
            System.out.println("Error in Text feild Value ");
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void WithdrawlAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawlAction

            private static  actionPerformed(ActionEvent e) {
            withdrawAmount = parseDouble(amountEntered.getText());
            //Check for intervals of 20 and for negative numbers
            if (withdrawAmount % 20 == 0 && withdrawAmount > 0) {
                if (checkingRadiobutton.isSelected()) {
                    try {
                        checkingAccount.Withdraw(getAmount());
                    } catch (InsufficientFunds insufficientFunds) {
                        insufficientFunds.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(frame, nf.format(withdrawAmount) + "%,.2f has been withdrawn from your chekcing account \n");
                    count++;

                } else if (savingsRadiobutton.isSelected()) {
                    try {
                        savingAccount.Withdraw(getAmount());
                    } catch (InsufficientFunds insufficientFunds) {
                        insufficientFunds.printStackTrace();
                    }
                    JOptionPane(frame, nf.format(withdrawAmount) + "%,.2f has been withdrawn from your checking account \n");
                    count++;
                }
            }
        }
    }//GEN-LAST:event_WithdrawlAction

    private void DepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositActionPerformed
        @Override
        public void actionPerformed(ActionEvent e) {
            //Checking for a negative number
            if (depositAmount > 0) {
                if (checkingRadiobutton.isSelected()) {
                    checkingAccount.deposit(getAmount());
                }
                JOptionPane.showMessageDialog(frame, nf.format(getAmount()) + "%,.2f  Has been deposited into your checking \n");
                count++;

            } else if (savingsRadiobutton.isSelected()) {
                savingAccount.deposit(getAmount());
                JOptionPane.showMessageDialog(frame, nf.format(getAmount()) + "%,.2f Has been deposited into your savings account \n");

            }

        }//GEN-LAST:event_DepositActionPerformed

        private void TransferAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferAction
        }//GEN-LAST:event_TransferAction

        private void CheckingRadioButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckingRadioButton
            // TODO add your handling code here:
        }//GEN-LAST:event_CheckingRadioButton

        private void SavingRadioButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavingRadioButton
            // TODO add your handling code here:
        }//GEN-LAST:event_SavingRadioButton

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
                java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new ATM().setVisible(true);
                }
            });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton Deposit;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JRadioButton jRadioButton1;
        private javax.swing.JRadioButton jRadioButton2;
        private javax.swing.JTextField jTextField1;
        // End of variables declaration//GEN-END:variables
    }
