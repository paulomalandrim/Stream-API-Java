package develop.stream_api;

import java.util.Arrays;
import java.util.List;

/*
Desafio 8 - Somar os dígitos de todos os números da lista:
Utilizando a Stream API, realize a soma dos dígitos de todos os
números da lista e exiba o resultado no console.
 */
public class Desafio8SomarDigitosDosNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaTodosDigitos = numeros.stream()
                // os parametros do reduce N1(acumulador) e N2(numero)
                .reduce(0, (acum,n) -> (acum + ((n-n%10)/10)+(n%10)) );

        System.out.println("A soma dos digitos é: " + somaTodosDigitos );
    }
}
