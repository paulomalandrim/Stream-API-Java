package develop.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Desafio 12 - Encontre o produto de todos os números da lista:
Com a ajuda da Stream API, encontre o produto de todos os
números da lista e exiba o resultado no console.
 */
public class Desafio12ProdutoDosNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int produtoDosNumeros = numeros.stream()
                .reduce(1, (ac, num) -> ac * num);

        System.out.println("Produto da lista de numeros: " + produtoDosNumeros);
    }
}
