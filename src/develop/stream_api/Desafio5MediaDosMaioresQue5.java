package develop.stream_api;

import java.util.Arrays;
import java.util.List;

/*
Desafio 5 - Calcule a média dos números maiores que 5:
Com a Stream API, calcule a média dos números maiores
que 5 e exiba o resultado no console.
 */
public class Desafio5MediaDosMaioresQue5 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        long somaDosMaioresQue5 = numeros.stream()
                .filter(n -> n > 5)
                .reduce(0, Integer::sum);

        long qtdeDosMaioresQue5 = numeros.stream()
                .filter(n -> n > 5)
                .count();

        System.out.println("Media dos numeros maiores que 5: " +
                somaDosMaioresQue5 / qtdeDosMaioresQue5);

    }

}
