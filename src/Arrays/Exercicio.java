package Arrays;

import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {

        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 5.9;
        notasAlunoA[1] = 7.2;
        notasAlunoA[2] = 6.4;

        System.out.println(Arrays.toString(notasAlunoA));

        double total = 0;
        for (int i = 0; i < 3; i++) {
            total += notasAlunoA[i];
        }

        System.out.println("A média do aluno é " + total / 3);
    }
}


