package colecoes;

import java.util.HashSet;

public class Hashcode {

    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<Usuario>();

        usuarios.add(new Usuario("Marcio"));
        usuarios.add(new Usuario("José"));
        usuarios.add(new Usuario("Salles"));

        boolean resultado = usuarios.contains(new Usuario("Marcio"));
        System.out.println(resultado);
    }
}
