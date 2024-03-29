package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        BinaryOperator<Integer> soma = ( ac, n) -> ac + n;

        nums.stream()
                .filter(n-> n > 7)
                .reduce(soma)
                .ifPresent(System.out::println);


    }
}
