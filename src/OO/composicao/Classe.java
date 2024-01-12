package OO.composicao;

public class Classe {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Marcio");
        Aluno aluno2 = new Aluno("Melissa");
        Aluno aluno3 = new Aluno("Janaína");

        Curso curso1 = new Curso("ADS");
        Curso curso2 = new Curso("CSS3");
        Curso curso3 = new Curso("HTML5");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        curso3.adicionarAluno(aluno3);
        curso3.adicionarAluno(aluno2);

        for (Aluno aluno: curso1.alunos) {
            System.out.println(" Olá sou " + aluno.nome + " e estou matriculado(a) no curso de ADS ");
        }
    }
}
