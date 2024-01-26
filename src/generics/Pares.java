package generics;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Pares <CHAVE extends Number, VALOR> {

    private final SortedSet<Par<CHAVE,VALOR>> itens = new TreeSet<>() ;

    public void adicionar(CHAVE chave, VALOR valor) {

        if (chave == null) return;

        Par<CHAVE, VALOR> novoPar = new Par<CHAVE, VALOR>(chave, valor);

        if (itens.contains(novoPar)){
            itens.remove(novoPar);
        }
        itens.add(novoPar);
    }

//public VALOR getValor(CHAVE,chave){
//        if (chave ==null) return  null;
}


