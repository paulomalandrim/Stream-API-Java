package develop.functional_interface;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/*
    Representa uma funçao que aceita um argumento do tio T
    e retonra um resultado do tipo R.
    é utilizada para transofrmar ou mapear os elementos do Stram
    em outros valores ou tipos.
 */
public class FunctionExample {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4);

        Function<Integer, Integer> dobrar = n -> n * 2;

        List<Integer> numerosDobrados = numeros.stream()
                .map(n -> n * 2)
                .toList();

        numerosDobrados.forEach(System.out::println);

    }
}
