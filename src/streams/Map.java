package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Map {

    public static void main(String[] args) {

        Consumer<String> print= System.out::print;

        List<String> marcas= Arrays.asList("Ford\n","Fiat\n","Renaut");
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

    }
}
