package controle;

import java.util.Arrays;
import java.util.Scanner;

public class WhileIndeterminado {

    public static void main(String[] args) {

        Scanner entrada= new Scanner(System.in);
        String valor = "" ;

        while (!valor.equalsIgnoreCase("sair")) {

            System.out.print("O que você quer ? ");
            valor = entrada.nextLine();
        }
            entrada.close();
    }
}
