package Atividades;

import javax.swing.*;

public class Ex1 {

    public static void main (String args []){

        double x = 0;
        double soma = 0;

        for(int i = 0;i<5; i++){

            x = Double.parseDouble(JOptionPane.showInputDialog("Informe o número você deseja somar: \n"));

            soma+= x;
        }
        JOptionPane.showMessageDialog(null, "O somatório é: "+soma);
    }
}
