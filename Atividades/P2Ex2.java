package Atividades;

import javax.swing.*;

public class P2Ex2 {

    public static void main(String args []){

        double valor [] = new double [5];
        double valor_estoque = 0;

        for(int i =0; i<5;i++){
            valor[i] = Double.parseDouble(JOptionPane.showInputDialog("informe o "+(i+1)+"° valor: "));

            valor_estoque+=valor[i];
        }
        JOptionPane.showMessageDialog(null,"O Valor do estoque é de R$"+valor_estoque);
    }
}
