package OO.composicao;

public class CompraTeste {

    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.cliente = "Melissa Salles";
        compra1.intens.add(new Item("Caneta", 20, 7.45));
        compra1.intens.add(new Item("Borracha", 21, 3.45));
        compra1.intens.add(new Item("Caderno", 10, 2.5));

        System.out.println(compra1.intens.size());

    }

}
