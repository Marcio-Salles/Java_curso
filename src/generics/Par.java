package generics;

import java.util.Objects;

public class Par<CHAVE, VALOR> {

    private CHAVE chave;
    private VALOR valor;

    public Par(CHAVE chave, VALOR valor) {
        super();
        this.chave = chave;
        this.valor = valor;
    }

    public CHAVE getChave() {
        return chave;
    }

    public void setChave (CHAVE chave) {
        this.chave = chave;
    }

    public VALOR getValor() {
        return valor;
    }

    public void getValor (VALOR valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Par)) return false;
        Par<?, ?> par = (Par<?, ?>) o;
        return Objects.equals(getChave(), par.getChave()) && Objects.equals(getValor(), par.getValor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getChave());
    }
}
