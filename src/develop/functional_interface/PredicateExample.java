package develop.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
    representa uma função que aceita um argumento do tipo T
    e retorna um valor boolean
    É comumente usada para filtrar os elementos do Stream
    com base em alguma condição.
 */
public class PredicateExample {

    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "C", "Go", "ruby");

        Predicate<String> maisDeCincoCaracteres = p -> p.length() > 5;

        palavras.stream()
                .filter(p -> p.length()>5)
                .forEach(System.out::println);
    }

}
