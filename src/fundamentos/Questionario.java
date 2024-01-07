package fundamentos;

import java.util.Scanner;

public class Questionario {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        int idade = teclado.nextInt();
        teclado.nextLine(); // nextLine() depois do nextInt() para resolver o problema de buffer

        System.out.println("Qual o seu nome?");
        String nome = teclado.nextLine();

        System.out.println("Qual o seu sobrenome?");
        String sobrenome = teclado.nextLine();

        System.out.println("Onde você mora?");
        String endereco = teclado.nextLine();

        teclado.close();
    }
}
