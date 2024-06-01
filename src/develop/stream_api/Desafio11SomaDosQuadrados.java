package develop.stream_api;

import java.util.Arrays;
import java.util.List;

/*
Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
Utilizando a Stream API, encontre a soma dos quadrados de todos os
números da lista e exiba o resultado no console.
 */
public class Desafio11SomaDosQuadrados {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosQuadrados = numeros.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println("Soma dos quadrados da lista: " + somaDosQuadrados);
    }
}
