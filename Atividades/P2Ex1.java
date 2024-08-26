package Atividades;

import javax.swing.*;

public class P2Ex1 {

    public static void main(String args []){

        double nro [] = new double [10];
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        for(int i=0;i<10;i++){

            nro[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o "+ (i+1) +"° Número: "));

                if(nro[i] < menor){
                    menor = nro[i];

                }
                if(nro[i] > maior){
                    maior = nro[i];
                }
        }
        JOptionPane.showMessageDialog(null,"Maior valor é: "+maior+"\nMenor valor é: "+menor);
    }
}
