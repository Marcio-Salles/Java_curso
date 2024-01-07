package Classe;

public class DataTeste {

    public static void main(String[] args) {

        Data p1 = new Data();
        p1.dia = 12;
        p1.mes = "Julho";
        p1.ano = 1984;

        var p2 = new Data();
        p2.dia = 22;
        p2.mes = "Março";
        p2.ano = 2013;

        System.out.println(p1.dia + " de " + p1.mes + " de " + p1.ano);
        System.out.println(p2.dia + " de " + p2.mes + " de " + p2.ano);
    }
}