/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab
 */
public class cal_GUI extends javax.swing.JFrame {

    private static String getText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Creates new form cal_GUI
     */
    public cal_GUI() {
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

        jPanel1 = new javax.swing.JPanel();
        valor_txt = new javax.swing.JTextField();
        valor2_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        divisão = new javax.swing.JButton();
        soma = new javax.swing.JButton();
        menos_btn = new javax.swing.JButton();
        multi_btn = new javax.swing.JButton();
        mensagem_txt = new javax.swing.JLabel();
        fechar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 255, 0));
        jPanel1.setLayout(null);

        valor_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor_txtActionPerformed(evt);
            }
        });
        jPanel1.add(valor_txt);
        valor_txt.setBounds(100, 70, 220, 20);

        valor2_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor2_txtActionPerformed(evt);
            }
        });
        jPanel1.add(valor2_txt);
        valor2_txt.setBounds(100, 100, 220, 20);

        jLabel1.setText("Valor1:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 70, 34, 14);

        jLabel3.setText("Valor2:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 100, 60, 20);

        divisão.setText("DIVISÃO");
        divisão.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisãoActionPerformed(evt);
            }
        });
        jPanel1.add(divisão);
        divisão.setBounds(130, 180, 90, 23);

        soma.setText("SOMA");
        soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somaActionPerformed(evt);
            }
        });
        jPanel1.add(soma);
        soma.setBounds(20, 180, 70, 23);

        menos_btn.setText("SUBTRAÇÃO");
        menos_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menos_btnActionPerformed(evt);
            }
        });
        jPanel1.add(menos_btn);
        menos_btn.setBounds(410, 180, 110, 23);

        multi_btn.setText("MULTIPLICAÇÃO");
        multi_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multi_btnActionPerformed(evt);
            }
        });
        jPanel1.add(multi_btn);
        multi_btn.setBounds(260, 180, 120, 23);
        jPanel1.add(mensagem_txt);
        mensagem_txt.setBounds(340, 30, 180, 90);

        fechar.setText("Fechar");
        fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharActionPerformed(evt);
            }
        });
        jPanel1.add(fechar);
        fechar.setBounds(210, 260, 80, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("CALCULADORA");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 20, 190, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 550, 340);

        setBounds(0, 0, 544, 342);
    }// </editor-fold>//GEN-END:initComponents

    private void somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somaActionPerformed
  Model.operacoes_DAO.soma();
    }//GEN-LAST:event_somaActionPerformed

    private void valor_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor_txtActionPerformed
         String v1 = View.cal_GUI.valor_txt.getText();
        double val1 = Double.parseDouble(v1);


    }//GEN-LAST:event_valor_txtActionPerformed

    private void valor2_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor2_txtActionPerformed
         String v2 = View.cal_GUI.valor2_txt.getText();
        double val2 = Double.parseDouble(v2);
    }//GEN-LAST:event_valor2_txtActionPerformed

    private void menos_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menos_btnActionPerformed
        String v1 = View.cal_GUI.valor_txt.getText();
        double val1 = Double.parseDouble(v1);
        String v2 = View.cal_GUI.valor2_txt.getText();
        double val2 = Double.parseDouble(v2);
        
        View.cal_GUI.mensagem_txt.setText("O resultado da subtração é "+(val1-val2));
        JOptionPane.showMessageDialog(null, "O resultado da subtração é "+(val1-val2));

    }//GEN-LAST:event_menos_btnActionPerformed

    private void fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_fecharActionPerformed

    private void multi_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multi_btnActionPerformed
        String v1 = View.cal_GUI.valor_txt.getText();
        double val1 = Double.parseDouble(v1);
        String v2 = View.cal_GUI.valor2_txt.getText();
        double val2 = Double.parseDouble(v2);
        
        View.cal_GUI.mensagem_txt.setText("O resultado da multiplicação é "+(val1*val2));
        JOptionPane.showMessageDialog(null, "O resultado da multiplicação é "+(val1*val2));    }//GEN-LAST:event_multi_btnActionPerformed

    private void divisãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisãoActionPerformed
       
        String v1 = View.cal_GUI.valor_txt.getText();
        double val1 = Double.parseDouble(v1);
        String v2 = View.cal_GUI.valor2_txt.getText();
        double val2 = Double.parseDouble(v2);
 
        View.cal_GUI.mensagem_txt.setText("O resultado da divisão é "+(val1/val2));
        JOptionPane.showMessageDialog(null, "O resultado da divisão é "+(val1/val2)); 


    }//GEN-LAST:event_divisãoActionPerformed

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
            java.util.logging.Logger.getLogger(cal_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cal_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cal_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cal_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cal_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton divisão;
    private javax.swing.JButton fechar;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JButton menos_btn;
    public static javax.swing.JLabel mensagem_txt;
    public static javax.swing.JButton multi_btn;
    public static javax.swing.JButton soma;
    public static javax.swing.JTextField valor2_txt;
    public static javax.swing.JTextField valor_txt;
    // End of variables declaration//GEN-END:variables
}
