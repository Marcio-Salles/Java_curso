package colecoes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<Integer, String>();
        usuarios.put(1, "Roberto");
        usuarios.put(2, "Isabella");
        usuarios.put(3, "Aléx");
        usuarios.put(4, "Maria");

        System.out.println(usuarios.size()); // Conta os elementos
        System.out.println(usuarios.keySet()); // Apresenta as chaves dos elementos
        System.out.println(usuarios.values()); // Imprime valores dos elementos
        System.out.println(usuarios.entrySet()); // Imprime valores dos elementos e chaves
    }
}
