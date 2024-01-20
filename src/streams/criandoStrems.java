package streams;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class criandoStrems {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print; // Váriavel

        Stream<String> langs = Stream.of("Java ","PHP ", "C#\n");
        langs.forEach(print);

        String[]  maisLangs = { "C ", "javascript ", " Python\n"};
        Stream.of(maisLangs).forEach(print);

        Arrays.stream(maisLangs).forEach(print);

        Arrays.stream(maisLangs).parallel().forEach(print); // imprime em paralelo porém em qualquer ordem

    }
}
