package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        // last in is first out

        Deque<String> livros = new ArrayDeque<String>();
        livros.add("Dom Quixote");
        livros.push("Bíblia");
        livros.push("Pequeno príncipe");
        livros.push("Operação cavalo de tróia");

        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.pop());
    }
}
