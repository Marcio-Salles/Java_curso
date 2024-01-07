package controle;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe sua média: ");
        double media= entrada.nextDouble();

        if (media <= 10 && media >= 7.0) {
            System.out.println("Você foi aprovado!");
            System.out.println("Parabens!");
        }

        if (media <= 6.9 && media >= 4.0) {
            System.out.println("Você esta de recuperação.");
        }

        if (media <= 3.9 && media >= 0) {
            System.out.println("Você esta de reprovado.");
        }

            entrada.close();
    }
}
