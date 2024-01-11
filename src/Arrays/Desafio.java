package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas quer digitar? ");

        int qtdNotas = entrada.nextInt();
        System.out.println("Didite as " + qtdNotas + " notas: ");

        double[] notas = new double[qtdNotas];

        for (int i = 0; i < notas.length; i++){
            System.out.println(" Digite suas notas " + (i + 1) + ": "); // Informar as notas com (,)
            notas[i] = entrada.nextDouble();
        }

        System.out.println(Arrays.toString(notas)); // Imprime a array

        double total = 0;
        for (double nota: notas) {
            total+= nota;

        }
        System.out.println("A sua média é " + (total / notas.length));
        entrada.close();
    }
}
