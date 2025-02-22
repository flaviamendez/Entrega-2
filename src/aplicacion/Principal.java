package aplicacion;

import java.util.ArrayList;
import java.util.Arrays;
import mates.Mates;

public class Principal {
    public static void main(String[] args) {

        // Ejercicio 1: Suma de los primeros 5 números naturales
        System.out.println("Suma de los primeros 5 números naturales: " + Mates.suma(5));  // Resultado: 15

        // Ejercicio 2: Factorial de 5
        System.out.println("Factorial de 5: " + Mates.calcularFactorial(5));  // Resultado: 120

        // Ejercicio 3: 2 elevado a 3
        System.out.println("2 elevado a 3: " + Mates.calcularPotencia(2, 3));  // Resultado: 8

        // Ejercicio 4: Suma de elementos de la lista [1, 2, 3, 4]
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("Suma de los elementos de la lista: " + Mates.calcularSumaElementosLista(lista, 0));  // Resultado: 10

        // Ejercicio 5: Media aritmética de la lista [1, 2, 3, 4]
        System.out.println("Media aritmética de la lista: " + Mates.calcularMediaAritmetica(lista));  // Resultado: 2.5

        // Ejercicio 6: Desviación típica de la lista {1, 2, 3, 4}
        int[] listaNumeros = {1, 2, 3, 4};
        System.out.println("Desviación típica de la lista: " + Mates.calcularDesviacionTipica(listaNumeros, 0, 0, 0));  // Resultado: 1.118

        // Ejercicio 7: Suma de los números pares hasta 9
        System.out.println("Suma de los números pares hasta 9: " + Mates.calcularSumaPares(9));  // Resultado: 20

        // Ejercicio 8: Suma de los elementos pares de la lista [1, 2, 3, 4]
        System.out.println("Suma de los elementos pares de la lista: " + Mates.calcularSumaElementosParesLista(lista, 0));  // Resultado: 6

        // Ejercicio 9: Obtener lista de pares de [1, 2, 3, 4, 6]
        int[] listaPares = {1, 2, 3, 4, 6};
        ArrayList<Integer> listaDePares = Mates.obtenerListaPares(listaPares, 0);
        System.out.println("Lista de números pares: " + listaDePares);  // Resultado: [2, 4, 6]

        // Ejercicio 10: Lista de números pares hasta 9
        ArrayList<Integer> listaParesHasta9 = Mates.obtenerListaParesHastaN(9);
        System.out.println("Lista de números pares hasta 9: " + listaParesHasta9);  // Resultado: [8, 6, 4, 2]

        // Ejercicio 11: Producto escalar de dos listas
        int[] lista1 = {1, 2, 3};
        int[] lista2 = {2, 4, 6};
        System.out.println("Producto escalar de las listas: " + Mates.calcularProductoEscalar(lista1, lista2, 2));  // Resultado: 28

        // Ejercicio 12: Fibonacci de 5
        System.out.println("Fibonacci de 5: " + Mates.fibonacci(5));  // Resultado: 5

        // Ejercicio 13: Cociente Fibonacci(13) / Fibonacci(12)
        System.out.println("Cociente Fibonacci(13) / Fibonacci(12): " + Mates.cocienteFibonacci(13, 12));  // Resultado: Aproximadamente 1.618

        // Ejercicio 14: Relación entre Fibonacci y la razón áurea
        Mates.relacionFibonacci(10);  // Resultado: Imprime los cocientes y la diferencia con la razón áurea
    }
}