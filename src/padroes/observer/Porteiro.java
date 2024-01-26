package padroes.observer;

import observer.ChegadaAniversarianteEvent;
import observer.ChegadaAniversarianteObserver;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

    private List<ChegadaAniversarianteObservador> observadores=
            new ArrayList<>();

    public void  registraObservador(ChegadaAniversarianteObservador observador){
        observadores.add(observador);
    }

    public void monitorar(){
        Scanner entrada = new Scanner(System.in);

        while (true) {
            int valor = entrada.nextInt();

            if (valor == 1) {
                ChegadaAniversarianteEvent event = new ChegadaAniversarianteEvent(new Date());



}
