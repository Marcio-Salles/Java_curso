package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Joaquim"); // .add() lançará uma exceção caso a fila esteja cheia.
        fila.offer("Jesus"); // .offer() retorna falso caso a fila esteja cheia.
        fila.add("Silvana");
        fila.offer("Erick");
        fila.add("Melissa");
        fila.offer("Jaques");

        System.out.println(fila.peek()); // peek remove elemento da fila sem remover

        System.out.println(fila.poll()); // imprime elemento da fila e pula para o próximo
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

    }
}
