package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);// .add -> adiciona elementos
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');
        conjunto.add("Marcio");

        System.out.println(conjunto.remove("Marcio")); // .remove  ->  remove elementos

        System.out.println("O tamanho é " + conjunto.size()); // .size  -> conta os elemntos do conjunto

        System.out.println(conjunto.contains("Marcio")); // .contains  -> verifica se o conjunto contem o elemento

    }
}
