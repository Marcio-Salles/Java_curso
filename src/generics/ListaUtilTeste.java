package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

    public static void main(String[] args) {

        List<String> langs = Arrays.asList("C#","Java","PHP","C++");
        List<Integer> nums= Arrays.asList(1,2,3,4,5,6);

        String ultimaLimguagem = (String) ListaUtil.getUltimo1(langs);
        System.out.println(ultimaLimguagem);

        Integer ultimoNumero = (Integer)  ListaUtil.getUltimo1(nums);
        System.out.println(ultimoNumero);

    }
}
