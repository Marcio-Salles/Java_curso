package OO.heranca;

public class Jogador {

      int x;
      int y;

      boolean movimentar(Direcao direcao) {
         switch(direcao) {
             case NORTE:
                     y++;
                     break;

             case SUL:
                     y--;
                     break;

             case LESTE:
                     x--;
                     break;

             case OESTE:
                     x++;
                     break;
          }
          return true;
      }
    }

