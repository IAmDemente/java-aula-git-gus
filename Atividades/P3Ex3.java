package Atividades;

import javax.swing.*;

public class P3Ex3 {

    public static void main (String args []){

        double A = 0;
        double B = 0;
        double C = 0;

        A = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de A: "));

        B = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de B: "));

        C = Math.abs(A - B);

        JOptionPane.showMessageDialog(null,"O Resultado absoluto é: "+C);
    }
}
