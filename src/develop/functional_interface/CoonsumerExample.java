package develop.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CoonsumerExample {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0){
                System.out.print(numero + " ");
            }
        };

        numeros.stream()
                .filter(n -> (n % 2)==0)
                .forEach(System.out::println);


    }
}
