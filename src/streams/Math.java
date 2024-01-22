package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Math {

    public static void main(String[] args) {

        Aluno a1= new Aluno("Marcia", 7.8);
        Aluno a2= new Aluno("João", 6.8);
        Aluno a3= new Aluno("Bárbara", 7.2);
        Aluno a4= new Aluno("Ariane", 5.8);
        Aluno a5= new Aluno("Everton", 7.4);
        Aluno a6= new Aluno("Cinthia", 5.5);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;

        System.out.println(alunos.stream().allMatch(aprovado));
        System.out.println(alunos.stream().anyMatch(aprovado));
        System.out.println(alunos.stream().noneMatch(aprovado));
    }
}
