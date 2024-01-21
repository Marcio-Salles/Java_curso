package streams.desafio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class compras {

    public static void main(String[] args) {

      Cliente c1= new Cliente("Marcio", 22.50);
      Cliente c2= new Cliente("Sergio", 19.50);
      Cliente c3= new Cliente("Jenifer", 15.50);
      Cliente c4= new Cliente("Sandro", 14.36);
      Cliente c5= new Cliente("Suzana", 21.50);
      Cliente c6= new Cliente("Reginaldo", 16.74);

      List<Cliente> clienteCompra = Arrays.asList(c1,c2,c3,c4,c5,c6);

        clienteCompra.stream()
                .filter(c-> c.preco >= 17.0)
                .map(c -> c.cliente + " o valor da sua compra é  " + c.preco + " reais.")
                .forEach(System.out::println);

    }
}
