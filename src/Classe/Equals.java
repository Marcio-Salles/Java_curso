package Classe;

public class Equals {

    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Marcio Salles";
        u1.email = "sallesmarcio1978@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Marcio Salles";
        u2.email = "sallesmarcio1978@gmail.com";

        System.out.println(u1 == u2); // Falso porque esta comparando dois espaços de memória
        System.out.println(u1.equals(u2));

    }
}
