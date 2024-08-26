package Atividades;

import javax.swing.*;

public class Ex2 {

    public static void main(String args[]) {

        int x = 0;
        int res = 0;

        x = Integer.parseInt(JOptionPane.showInputDialog("Informe o número que deseja obter a tabuada da multiplicação: "));

        JOptionPane.showMessageDialog(null, "TABUADA DO " + x);

        for (int i = 1; i <= 10; i++) {
            res = i * x;
            System.out.println(i + " X " + x + " = " + res + "\n");//fiz com sout pq se n ia ficar aparecendo varias telas, teria como arrumar isso fazendo uma lista, porem preguiça d+
        }
    }
}
