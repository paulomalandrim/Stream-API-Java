package develop.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
Desafio 17 - Filtrar os números primos da lista:
Com a ajuda da Stream API, filtre os números primos
da lista e exiba o resultado no console.
 */
public class Desafio17NumerosPrimos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos = numeros.stream().sorted()
                .filter(n -> {
                    for (int i = 2; i < n; i++) {
                        if (n % i == 0) {
                            return false;
                        }
                    }
                    return true;
                }).toList();

        System.out.println("Numeros primos: " + numerosPrimos);
    }
}
