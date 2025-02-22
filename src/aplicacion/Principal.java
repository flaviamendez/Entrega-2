package aplicacion;

import java.util.ArrayList;
import java.util.Arrays;

import mates.Funciones;

public class Principal {
    public static void main(String[] args) {
        // Ejercicio 1: Suma de los primeros n números
        int n = 9;
        System.out.println("Suma de los primeros " + n + " números: " + Funciones.suma(n));

        // Ejercicio 2: Cálculo del factorial de un número
        int numero = 5;
        System.out.println("Factorial de " + numero + ": " + Funciones.calcularFactorial(numero));

        // Ejercicio 3: Cálculo de la potencia de un número
        int base = 2;
        int exponente = 3;
        System.out.println("Potencia de " + base + " elevado a " + exponente + ": " + Funciones.calcularPotencia(base, exponente));

        // Ejercicio 4: Suma de los elementos de una lista
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("Suma de los elementos de la lista: " + Funciones.calcularSumaElementosLista(lista));

        // Ejercicio 5: Cálculo de la media aritmética de una lista
        System.out.println("Media aritmética de la lista: " + Funciones.calcularMediaAritmetica(lista));

        // Ejercicio 6: Cálculo de la desviación típica de una lista
        System.out.println("Desviación típica de la lista: " + Funciones.calcularDesviacionTipica(convertirArrayListAArray(lista), exponente, exponente, exponente));

        // Ejercicio 7: Suma de los números pares hasta n
        System.out.println("Suma de los números pares hasta " + n + ": " + Funciones.calcularSumaPares(n));

        // Ejercicio 8: Suma de los elementos pares de una lista
        System.out.println("Suma de los elementos pares de la lista: " + Funciones.calcularSumaElementosParesLista(lista));

        // Ejercicio 9: Obtener lista de números pares de una lista
        System.out.println("Lista de números pares: " + Funciones.obtenerListaPares(convertirArrayListAArray(lista)));

        // Ejercicio 10: Obtener lista de números pares hasta n
        System.out.println("Lista de números pares hasta " + n + ": " + Funciones.obtenerListaParesHastaN(n));

        // Ejercicio 11: Producto escalar de dos listas
        ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
        int scalar = 2; // Example scalar value
        System.out.println("Producto escalar de las listas: " + Funciones.calcularProductoEscalar(convertirArrayListAArray(lista), convertirArrayListAArray(lista2), scalar));

        // Ejercicio 4 -Integral
        double resultadoIntegral = Funciones.integralEXCuadrado(0, 1, 0.1);
        System.out.println("Resultado de la integral: " + resultadoIntegral);

        // Ejercicio 6   Suma códigos
        String cadena = "Hola";
        System.out.println("Suma de códigos de '" + cadena + "': " + Funciones.sumaCodigos(cadena));

        // Ejercicio 7  Cifrado César
        String texto = "Hoy es viernes";
        int desplazamiento = 3;
        System.out.println("Texto cifrado: " + Funciones.cifrarCadena(texto, desplazamiento));

        // Ejercicio 8 - Filtrar códigos pares
        String entrada = "Mañana no hay clases";
        System.out.println("Caracteres con código par: " + Funciones.conCodigoPar(entrada));
    }

    // Método para convertir ArrayList<Integer> a int[]
    public static int[] convertirArrayListAArray(ArrayList<Integer> lista) {
        return lista.stream().mapToInt(i -> i).toArray();
    }
}
