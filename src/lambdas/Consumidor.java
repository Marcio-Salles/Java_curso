package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        Consumer<Produto> imprimir = p-> System.out.println(p.nome + "!!!");

        Produto p1 = new Produto("Caneta", 12.34, 0.09);
        imprimir.accept(p1);
        Produto p2 = new Produto("Borracha", 12.34, 0.09);
        imprimir.accept(p2);

        List<Produto> produtos = Arrays.asList(p1,p2);

        produtos.forEach(imprimir);
    }
}
