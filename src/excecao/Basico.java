package excecao;

import org.jetbrains.annotations.NotNull;

public class Basico {

    public static void main(String[] args) {

        Aluno a1= null;

        try {
            imprimirNomeDoAluno(a1);
        } catch (Exception excecao) {
            System.out.println("Erro no nome do usuário");
        }

        try {
            System.out.println(7/0);
        } catch (ArithmeticException e) {
           e.printStackTrace();
        }

        System.out.println("fim do programa");
    }
        public static void imprimirNomeDoAluno(@NotNull Aluno aluno){
                            System.out.println(aluno.nome);
    }
}
