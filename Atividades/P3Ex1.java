package Atividades;

import javax.swing.*;

public class P3Ex1 {

    public static void main (String args []){

        double area = 0;
        double raio = 0;

        raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o raio da circunferência (cm): "));

        area = Math.PI * Math.pow(raio, 2);

        area = Math.ceil(area);

        JOptionPane.showMessageDialog(null, "A aréa da circunferência é "+ area + " cm²");
    }
}
