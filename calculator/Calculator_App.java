/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author User
 */
public class Calculator_App extends javax.swing.JFrame {

    
    
    double num, ans;
    int calculation;
    
    public Calculator_App() {
        initComponents();
        
        jRadioButton1.setEnabled(false); 
    }
    
    public void arithmetic_operation()
    {
        switch(calculation)
        {
            case 1: 
                ans= num + Double.parseDouble(jTextField1.getText());
                break;
                
            case 2: 
                ans= num - Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;
                
            case 3: 
                ans= num * Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;
                
            case 4: 
                ans= num / Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;
        }
    }
    
    @Override
    public void enable()
    {
        jTextField1.setEnabled(true);
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(true);
        jButton17.setEnabled(true);
        jButton18.setEnabled(true);
        jButton19.setEnabled(true);
        jButton20.setEnabled(true);
        jButton21.setEnabled(true);
        jButton22.setEnabled(true);
        jButton23.setEnabled(true);
        jButton24.setEnabled(true);
        jButton25.setEnabled(true);
        jButton26.setEnabled(true);
        jButton27.setEnabled(true);
        jButton28.setEnabled(true);
        jButton29.setEnabled(true);
        jButton30.setEnabled(true);
        jButton31.setEnabled(true);
        jButton32.setEnabled(true);
        jButton33.setEnabled(true);
        jButton34.setEnabled(true);
    }
    @Override
    public void disable()
    {
        jTextField1.setEnabled(false);
        jRadioButton1.setEnabled(true);
        jRadioButton2.setEnabled(false);
        jButton17.setEnabled(false);
        jButton18.setEnabled(false);
        jButton19.setEnabled(false);
        jButton20.setEnabled(false);
        jButton21.setEnabled(false);
        jButton22.setEnabled(false);
        jButton23.setEnabled(false);
        jButton24.setEnabled(false);
        jButton25.setEnabled(false);
        jButton26.setEnabled(false);
        jButton27.setEnabled(false);
        jButton28.setEnabled(false);
        jButton29.setEnabled(false);
        jButton30.setEnabled(false);
        jButton31.setEnabled(false);
        jButton32.setEnabled(false);
        jButton33.setEnabled(false);
        jButton34.setEnabled(false);
    }
    
    

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "3");
    }

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "5");
    }

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "0");
    }

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {

        calculation= 1;
    }

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "1");
    }

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {
       jTextField1.setText(jTextField1.getText() + "2");
    }

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "4");
    }

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "6");
    }

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "7");
    }

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "8");
    }
    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "9");
    }

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + ".");
    }

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {

        arithmetic_operation();
        jTextField1.setText(Double.toString(ans));
    }

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "/");
    }

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "*");
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "-");
    }

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText("");
    }

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        enable();
    }

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        disable();
    }

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {
        int length= jTextField1.getText().length();
        int number= jTextField1.getText().length() - 1;
        String store;
        
        if (length>0)
        {
            StringBuilder back=new StringBuilder(jTextField1.getText());
            back.deleteCharAt(number);
            store=back.toString();
            jTextField1.setText(store);
        }
    }

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator_App().setVisible(true);
            }
        });
    }

    
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
