package controle;

import javax.swing.*;

public class IfElse {

    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe um numero: "); // Caixa de diálogo
        int numero = Integer.parseInt(valor); // transformar o número em inteiro

//  Exemplo com dois IF

        if (numero % 2==0) {
            System.out.println("O número é par.");
        }

        if (numero % 2==1) {
            System.out.println("O número é ímpar.");
        }

//        Exemplo com IF ELSE

        if (numero % 2==0) {
            System.out.println("O número é par.");
        }

        else {
            System.out.println("O número é ímpar.");
        }

    }
}
