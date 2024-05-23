/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package core.views;

import core.controllers.Calculator;
import core.models.History;
import core.models.Operation;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author edangulo
 */
public class CalculatorFrame extends javax.swing.JFrame {
    
    private History history;

    /**
     * Creates new form Calculator
     */
    public CalculatorFrame() {
        this.history = new History();
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

        titleLabel = new javax.swing.JLabel();
        sumNumbers = new javax.swing.JButton();
        substractNumbers = new javax.swing.JButton();
        multiplyNumbers = new javax.swing.JButton();
        divideNumbers = new javax.swing.JButton();
        potencyNumbers = new javax.swing.JButton();
        clearNumbers = new javax.swing.JButton();
        updateOperationHistory = new javax.swing.JButton();
        fieldNumber1 = new javax.swing.JTextField();
        fieldNumber2 = new javax.swing.JTextField();
        number1Label = new javax.swing.JLabel();
        number2Label = new javax.swing.JLabel();
        resultLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        fieldResult = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLabel.setText("Calculator");

        sumNumbers.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sumNumbers.setText("Add");
        sumNumbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumNumbersActionPerformed(evt);
            }
        });

        substractNumbers.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        substractNumbers.setText("Subtract");
        substractNumbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                substractNumbersActionPerformed(evt);
            }
        });

        multiplyNumbers.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        multiplyNumbers.setText("Multiply");
        multiplyNumbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyNumbersActionPerformed(evt);
            }
        });

        divideNumbers.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        divideNumbers.setText("Divide");
        divideNumbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideNumbersActionPerformed(evt);
            }
        });

        potencyNumbers.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        potencyNumbers.setText("Potency");
        potencyNumbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potencyNumbersActionPerformed(evt);
            }
        });

        clearNumbers.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        clearNumbers.setText("Clear numbers");
        clearNumbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearNumbersActionPerformed(evt);
            }
        });

        updateOperationHistory.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        updateOperationHistory.setText("Update history");
        updateOperationHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateOperationHistoryActionPerformed(evt);
            }
        });

        fieldNumber1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fieldNumber2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        number1Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        number1Label.setText("Number 1");

        number2Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        number2Label.setText("Number 2");

        resultLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        resultLabel.setText("Result");

        jList1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jList1.setEnabled(false);
        jScrollPane1.setViewportView(jList1);

        fieldResult.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fieldResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldResult.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(resultLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(number1Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(number2Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldNumber1)
                            .addComponent(fieldNumber2)
                            .addComponent(fieldResult, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(potencyNumbers, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(multiplyNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(sumNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(substractNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(divideNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateOperationHistory, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(titleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number1Label)
                    .addComponent(fieldNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateOperationHistory))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(number2Label)
                            .addComponent(fieldNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resultLabel)
                            .addComponent(fieldResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sumNumbers)
                            .addComponent(substractNumbers))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(divideNumbers)
                            .addComponent(multiplyNumbers))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(potencyNumbers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearNumbers))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sumNumbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumNumbersActionPerformed
        // TODO add your handling code here:
        try {
            Calculator calculator = new Calculator();
            
            double number1 = Double.parseDouble(fieldNumber1.getText());
            double number2 = Double.parseDouble(fieldNumber2.getText());
            double result = calculator.add(number1, number2);
            
            this.history.addOperation(new Operation(number1, number2, "+", result));
            
            fieldResult.setText("" + result);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_sumNumbersActionPerformed

    private void substractNumbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_substractNumbersActionPerformed
        // TODO add your handling code here:
        try {
            Calculator calculator = new Calculator();
            
            double number1 = Double.parseDouble(fieldNumber1.getText());
            double number2 = Double.parseDouble(fieldNumber2.getText());
            double result = calculator.subtract(number1, number2);
            
            this.history.addOperation(new Operation(number1, number2, "-", result));
            
            fieldResult.setText("" + result);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_substractNumbersActionPerformed

    private void multiplyNumbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyNumbersActionPerformed
        // TODO add your handling code here:
        try {
            Calculator calculator = new Calculator();
            
            double number1 = Double.parseDouble(fieldNumber1.getText());
            double number2 = Double.parseDouble(fieldNumber2.getText());
            double result = calculator.multiply(number1, number2);
            
            this.history.addOperation(new Operation(number1, number2, "*", result));
            
            fieldResult.setText("" + result);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_multiplyNumbersActionPerformed

    private void divideNumbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideNumbersActionPerformed
        // TODO add your handling code here:
        try {
            Calculator calculator = new Calculator();
            
            double number1 = Double.parseDouble(fieldNumber1.getText());
            double number2 = Double.parseDouble(fieldNumber2.getText());
            double result = calculator.divide(number1, number2);
            
            this.history.addOperation(new Operation(number1, number2, "/", result));
            
            fieldResult.setText("" + result);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_divideNumbersActionPerformed

    private void potencyNumbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potencyNumbersActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Not Implemented", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_potencyNumbersActionPerformed

    private void clearNumbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearNumbersActionPerformed
        // TODO add your handling code here:
        fieldNumber1.setText("");
        fieldNumber2.setText("");
        fieldResult.setText("");
    }//GEN-LAST:event_clearNumbersActionPerformed

    private void updateOperationHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateOperationHistoryActionPerformed
        // TODO add your handling code here:
        ArrayList<Operation> operationHistory = this.history.getOperations();
        Collections.reverse(this.history.getOperations());
        
        DefaultListModel model = new DefaultListModel();
        model.addAll(operationHistory);
        jList1.setModel(model);
    }//GEN-LAST:event_updateOperationHistoryActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearNumbers;
    private javax.swing.JButton divideNumbers;
    private javax.swing.JTextField fieldNumber1;
    private javax.swing.JTextField fieldNumber2;
    private javax.swing.JTextField fieldResult;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton multiplyNumbers;
    private javax.swing.JLabel number1Label;
    private javax.swing.JLabel number2Label;
    private javax.swing.JButton potencyNumbers;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JButton substractNumbers;
    private javax.swing.JButton sumNumbers;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateOperationHistory;
    // End of variables declaration//GEN-END:variables
}
