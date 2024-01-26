package padroes.observer;

import java.util.Date;

public class ChegadaAniversariante {

    private final Date momento;

    public ChegadaAniversariante(Date momento) {
        this.momento = momento;
    }

    public Date getMomento() {
        return momento;
    }
}
