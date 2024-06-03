package develop.stream_api;

import java.util.Arrays;
import java.util.List;

/*
Desafio 14 - Encontre o maior número primo da lista:
Com a Stream API, encontre o maior número primo da
lista e exiba o resultado no console.
 */
public class Desafio14MarioPrimo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos = numeros.stream()
                .sorted()
                .distinct()
                .filter((n) -> {
                    // verificar se o número é primo
                    for (int i = 2; i < n; i++) {
                        if (n % i == 0) {
                            return false;
                        }
                    }
                    return true;
                })
                .toList();


        System.out.println(String.format("O maior numero primo e o %d",numerosPrimos.get(numerosPrimos.size()-1)));

    }
}
