package lambdas;

public class CalculoLambda {

    public static void main(String[] args) {

      Calculo soma = (a, b) -> { return a + b; };   ///Lambda
        System.out.println(soma.executar(2,3));

        Calculo multiplicacao = ( a, b ) ->  a * b ;    // Lambda diferente
        System.out.println(multiplicacao.executar(2,3));
    }
}
