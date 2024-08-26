package Atividades;

import javax.swing.*;

public class Ex3 {

    public static void main (String args []){

        int x = 0;
        int res = 0;

        x = Integer.parseInt(JOptionPane.showInputDialog("Informe o número que deseja obter a tabuada da divisão: "));

        JOptionPane.showMessageDialog(null,"TABUADA DO "+x);

        for(int i = x;i<=10*x;i+=x){
            res = i * x;
            System.out.println( i+" /  "+x+" = "+res+"\n");//fiz com sout pq se n ia ficar aparecendo varias telas, teria como arrumar isso fazendo uma lista, porem preguiça d+
        }
    }
}
