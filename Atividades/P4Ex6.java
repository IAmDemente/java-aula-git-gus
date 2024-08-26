package Atividades;

import javax.swing.*;
import java.nio.DoubleBuffer;

public class P4Ex6 {

    public static void main (String args []){

        String nome[] = new String [10];
        double media[] = new double[10];
        int i = 0;

        for(i = 0; i<10;i++){
            nome[i] = JOptionPane.showInputDialog("Informe o Nome do "+(i+1)+"° aluno: ");
            media[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a Media do Aluno "+nome[i]+": "));
        }
        for(i = 0;i<10;i++){
            if(media[i] < 6){
                JOptionPane.showMessageDialog(null,"Nome: "+nome[i]+" - Media: "+media[i]);
            }
        }
    }
}
