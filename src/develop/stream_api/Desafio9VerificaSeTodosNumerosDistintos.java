package develop.stream_api;

import java.util.Arrays;
import java.util.List;

/*
Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
Com a Stream API, verifique se todos os números da lista são distintos
(não se repetem) e exiba o resultado no console.
 */
public class Desafio9VerificaSeTodosNumerosDistintos {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosDistintos = numeros.stream()
                .distinct()
                .toList();

        if (numeros.size() == numerosDistintos.size()){
            System.out.println("Todos números são distintos");
        } else {
            System.out.println("Existem números repetidos");
        }


    }
}
