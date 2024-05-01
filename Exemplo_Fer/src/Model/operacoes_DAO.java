/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab
 */
public class operacoes_DAO {
    public static String x="";
    public static double v1=0, v2=0, res=0;
    public static void soma () {
    
        String v1 = View.cal_GUI.valor_txt.getText();
        double val1 = Double.parseDouble(v1);
        String v2 = View.cal_GUI.valor2_txt.getText();
        double val2 = Double.parseDouble(v2);
        
        View.cal_GUI.mensagem_txt.setText("O resultado da soma é "+(val1+val2));
        JOptionPane.showMessageDialog(null, "O resultado da soma é "+(val1+val2));
    }
    public static void menos_bnt () {
    
        String v1 = View.cal_GUI.valor_txt.getText();
        double val1 = Double.parseDouble(v1);
        String v2 = View.cal_GUI.valor2_txt.getText();
        double val2 = Double.parseDouble(v2);
 
        View.cal_GUI.mensagem_txt.setText("O resultado da divisão é "+(val1-val2));
        JOptionPane.showMessageDialog(null, "O resultado da divisão é "+(val1-val2)); 
    }
    public static void multi_btn () {
    
        String v1 = View.cal_GUI.valor_txt.getText();
        double val1 = Double.parseDouble(v1);
        String v2 = View.cal_GUI.valor2_txt.getText();
        double val2 = Double.parseDouble(v2);
 
        View.cal_GUI.mensagem_txt.setText("O resultado da divisão é "+(val1*val2));
        JOptionPane.showMessageDialog(null, "O resultado da divisão é "+(val1*val2)); 
    }
    public static void divisão () {
    
        String v1 = View.cal_GUI.valor_txt.getText();
        double val1 = Double.parseDouble(v1);
        String v2 = View.cal_GUI.valor2_txt.getText();
        double val2 = Double.parseDouble(v2);
 
        View.cal_GUI.mensagem_txt.setText("O resultado da divisão é "+(val1/val2));
        JOptionPane.showMessageDialog(null, "O resultado da divisão é "+(val1/val2)); 
    }
    
    
}
