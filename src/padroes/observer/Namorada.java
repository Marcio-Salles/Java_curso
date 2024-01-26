package padroes.observer;

public class Namorada implements  ChegadaAniversarianteObservador {

    public void chegou(ChegadaAniversariante evento){
        System.out.println("Avisar os convidados");
        System.out.println("Apagar as luzes");
        System.out.println("Esperar entrar");
        System.out.println("Surpresa!");
    }
}
