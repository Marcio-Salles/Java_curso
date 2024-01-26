package generics;

public class CaixaIntTeste {

    public static void main(String[] args) {

        CaixaInt<String> caixaA = new CaixaInt<>();
        caixaA.aguardar("Teste");

        String coisaA= caixaA.abrir();
        System.out.println(coisaA);
    }
}
