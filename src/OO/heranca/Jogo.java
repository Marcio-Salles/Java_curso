package OO.heranca;

public class Jogo {

    public static void main(String[] args) {

    Jogador j1 = new Jogador();
    j1.x = 10;
    j1.y = 20;

    j1.movimentar(Direcao.NORTE);
    j1.movimentar(Direcao.SUL);
    j1.movimentar(Direcao.LESTE);
    j1.movimentar(Direcao.OESTE);

        System.out.println(j1.y);
        System.out.println(j1.x);

    }
}
