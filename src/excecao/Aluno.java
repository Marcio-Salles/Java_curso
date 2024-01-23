package excecao;

import java.util.Arrays;
import java.util.List;

public class Aluno {

        final String nome;
        final double nota;

        public Aluno(String nome, double nota) {
            this.nome = nome;
            this.nota = nota;

            streams.Aluno a1 = new streams.Aluno("Marcia", 7.8);
            streams.Aluno a2 = new streams.Aluno("João", 6.8);
            streams.Aluno a3 = new streams.Aluno("Bárbara", 7.2);
            streams.Aluno a4 = new streams.Aluno("Ariane", 5.8);
            streams.Aluno a5 = new streams.Aluno("Everton", 7.4);
            streams.Aluno a6 = new streams.Aluno("Cinthia", 5.5);

            List<streams.Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
        }
    }
