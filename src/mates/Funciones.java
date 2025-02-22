package mates;

import java.util.ArrayList;
import java.util.Arrays;

public class Funciones {
    //Ejercico 1
    //Un método recursivo es aquel que se llama a sí mismo para resolver un problema más pequeño.

    //Ejercicio 2
    //1 Suma
    public static int suma(int n) {
        if (n == 0) {
            return 0;
        } else{
            return n + suma(n - 1);
        }
    }

     //Ejercicio 2
    public static int calcularFactorial(int n) 
    {
        if (n == 0)
        {
            return 1;
        } else{
            return n * calcularFactorial(n-1);
        }
    }

    //Ejercicio 3
    public static int calcularPotencia (int base, int exponente) {
        if (exponente  == 1)
        {
            return 1;
        } else {
            return exponente * calcularPotencia(base, exponente -1);

        }
    }


    //Ejercicio 4
    public static int calcularSumaElementosLista (ArrayList<Integer> lista) {
        if (lista.isEmpty()) {
            return 0;
        } else {
            return lista.get(0) + calcularSumaElementosLista(new ArrayList<>(lista.subList(1, lista.size())));
        }

    }


    //Ejercicio 5
    //Media suma de elementos / cantidad de elementos size()
    public static double calcularMediaAritmetica (ArrayList <Integer> lista) {

        if (lista.isEmpty()) {
            return 0;

        } else {

            return (double) calcularSumaElementosLista(lista) / lista.size();
        }
    }


    //Ejercicio 6 
    
    public static double calcularDesviacionTipica(int[] lista, int index, double suma, double sumaCuadrados) {
        if (index == lista.length) {
            double media = suma / lista.length;
            double varianza = sumaCuadrados / lista.length;
            return Math.sqrt(varianza);
        } else {
            suma += lista[index];
            sumaCuadrados += Math.pow(lista[index], 2);
            return calcularDesviacionTipica(lista, index + 1, suma, sumaCuadrados);
        }
    }

    //Ejercicio 7
    public static int calcularSumaPares (int n) {
        if (n == 2){
            return 2;
        } else if (n % 2 == 0){
            return n + calcularSumaPares(n-2);
        } else{
            return calcularSumaPares(n-1);

        }
    }


    //Ejercicio 8
    public static int calcularSumaElementosParesLista (ArrayList <Integer> lista) {

        if (lista.isEmpty()) {
            return 0;

        } else {
            int num = lista.get(0);
            int sumaResto = calcularSumaElementosParesLista(new ArrayList<>(lista.subList(1, lista.size())));
            if (num % 2 == 0){
                return num + sumaResto;
            } else {
                return sumaResto;
            }
        }
    }

    //Ejercicio 9 
    public static ArrayList<Integer> obtenerListaPares(int[] lista) {
        ArrayList<Integer> listaPares = new ArrayList<>();
        if (lista.length > 0) {
            if (lista[0] % 2 == 0) {
                listaPares.add(lista[0]);
            }
            listaPares.addAll(obtenerListaPares(Arrays.copyOfRange(lista, 1, lista.length)));
        }
        return listaPares;
    }
     

    //Ejercicio 10 La lista de los primeros números pares hasta n asumiendo n ≥ 2
    public static ArrayList<Integer> obtenerListaParesHastaN(int n) {
        ArrayList<Integer> lista = new ArrayList<>();
        if (n >= 2) {
            lista.add(n - 1);
            lista.addAll(obtenerListaParesHastaN(n - 2));
        }
        return lista;
    }
    
    

    //Ejercicio 11 
    public static int calcularProductoEscalar(int[] lista1, int[] lista2, int n) {
        if (n == 0) {
            return lista1[0] * lista2[0];
        }
        return lista1[n] * lista2[n] + calcularProductoEscalar(lista1, lista2, n - 1);
    }
    


    //Ejercicicio 12 El elemento n-ésimo de la sucesión de Fibonacci. recursivamente
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    //Ejercicio 13 
    public static double cocienteFibonacci(int n1, int n2) {
        int fibN1 = fibonacci(n1);
        int fibN2 = fibonacci(n2);

        return (double) fibN1 / fibN2;
    }

    //Ejercicio 14 Averigüe la relación entre la sucesión de Fibonacci y la razón áurea 
    public static void relacionFibonacci(int n) {
        double numeroAureo = (1 + Math.sqrt(5)) / 2;

        System.out.println("\nRelación entre la sucesión de Fibonacci y la razón áurea:");
        for (int i = 2; i <= n; i++) {
            double cociente = (double) fibonacci(i) / fibonacci(i - 1);
            double diferencia = Math.abs(cociente - numeroAureo);
            System.out.printf("Fib(%d)/Fib(%d) = %.10f | Diferencia con razón áurea: %.10f\n",
                    i, i - 1, cociente, diferencia);
        }
    }
    
    

    
    //Ejercicio 3 ¿En qué consiste el problema de las Torres de Hanoi? ¿Cómopuede resolverse?
    /*
    *El problema de las Torres de Hanoi consiste en mover una torre de discos de un poste a otro, respetando las siguientes reglas:
    *   1. Solo se puede mover un disco a la vez.
    *   2. Un disco nunca puede estar sobre otro disco de menor tamaño.
    *   3. Solo se pueden mover los discos de la parte superior de una torre.
    *   Para resolver el problema de las Torres de Hanoi, se puede utilizar un algoritmo recursivo que consiste en mover n-1 discos 
    *   de la torre de origen a la torre auxiliar, luego mover el disco n de la torre de origen a la torre de destino, y finalmente mover
    *   los n-1 discos de la torre auxiliar a la torre de destino. Este proceso se repite recursivamente hasta que todos los discos estén en la torre de destino.
    */


    //Ejercicio 4 Integral

    public static double integralEXCuadrado(double limInf, double limSup, double h) {
        // Caso base: Si limInf ha alcanzado o sobrepasado limSup, termina la recursión
        if (limInf >= limSup) {
            return 0;
        }
        
        // Calculamos el valor de e^(x^2) para el valor actual de limInf
        double suma = Math.exp(Math.pow(limInf, 2));
        
        // Llamada recursiva con limInf aumentado por el paso h
        return suma * h + integralEXCuadrado(limInf + h, limSup, h);
    }

    //Ejercicio 5
    /*
     * La ejecución de un método recursivo puede provocar una excepción de desbordamiento
     * de pila StackOverflowError si la recursión es demasiado profunda. En un método recursivo,
     * cada llamada se apila en la pila de llamadas, y si el número de llamadas excede el límite
     * de la pila, se produce el error. En cambio, una versión iterativa usa bucles y no acumula
     * llamadas en la pila, por lo que no sufre este problema.
     */


     //Ejercicio 6 Str

     public static int sumaCodigos(String str) {
        // Caso base: si la cadena está vacía, retornamos 0
        if (str.isEmpty()) {
            return 0;
        }
        // Llamada recursiva: sumamos el valor ASCII del primer carácter y el resto de la cadena
        return str.charAt(0) + sumaCodigos(str.substring(1));
        }


    //Ejercicio 7  cifrado César
    public static String cifrarCadena(String str, int desplazamiento) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        char c = str.charAt(0);
        char cifrado;
        if (Character.isLetter(c)) {
            char base = Character.isUpperCase(c) ? 'A' : 'a';
            cifrado = (char) ((c - base + desplazamiento) % 26 + base);
        } else {
            cifrado = c;
        }
        return cifrado + cifrarCadena(str.substring(1), desplazamiento);
    }

    // Ejercicio 8 filtrar caracteres con código par
    public static String conCodigoPar(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        char c = str.charAt(0);
        String resto = conCodigoPar(str.substring(1));
        if ((int) c % 2 == 0) {
            return c + resto;
        } else {
            return resto;
        }
    }


    
}
