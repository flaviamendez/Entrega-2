package mates;

import java.util.ArrayList;
import java.util.Arrays;

public class Mates {

    //Ejercicio 1
    /*
    *   La recursividad consiste en que una función se llame a sí misma.
    *   Tiene dos partes: el caso base y el caso recursivo.
    *   El caso base es la condición que detiene la recursividad.
    *   El caso recursivo es la llamada a la función dentro de la función.
    *   La recursividad es útil para resolver problemas que se pueden dividir en subproblemas más pequeños.
    *   La recursividad puede ser menos eficiente que un enfoque iterativo en algunos casos.
     */


    //Ejercici 2 
    // 1. La suma 0 + 1 + 2 + ... + n.
    public static int suma(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + suma(n - 1);
        }
    }

    // 2. El factorial de un número.
    public static int calcularFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }

    // 3. La potencia n-ésima de un número natural.
    public static int calcularPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * calcularPotencia(base, exponente - 1);
        }
    }

    // 4. La suma de los elementos de una lista de números.
    public static int calcularSumaElementosLista(ArrayList<Integer> lista, int indice) {
        if (indice == lista.size()) {
            return 0;
        } else {
            return lista.get(indice) + calcularSumaElementosLista(lista, indice + 1);
        }
    }

    // 5. La media aritmética de una lista de números.
    public static double calcularMediaAritmetica(ArrayList<Integer> lista) {
        if (lista.isEmpty()) {
            return 0;  // Caso base: Si la lista está vacía, retornamos 0.
        } else {
            int suma = calcularSumaElementosLista(lista, 0);  // Obtenemos la suma de los elementos.
            return (double) suma / lista.size();  // Calculamos y retornamos la media.
        }
    }

    // 6. La desviación típica de una lista de números.
    public static double calcularDesviacionTipica(int[] lista, int indice, double suma, double sumaCuadrados) {
        if (indice == lista.length) {
            double media = suma / lista.length;
            double varianza = (sumaCuadrados / lista.length) - Math.pow(media, 2);
            return Math.sqrt(varianza);
        } else {
            suma += lista[indice];
            sumaCuadrados += Math.pow(lista[indice], 2);
            return calcularDesviacionTipica(lista, indice + 1, suma, sumaCuadrados);
        }
    }

    // 7. La suma de los primeros números pares hasta n.
    public static int calcularSumaPares(int n) {
        if (n < 2) {
            return 0;
        } else if (n % 2 == 0) {
            return n + calcularSumaPares(n - 2);
        } else {
            return calcularSumaPares(n - 1);
        }
    }

    // 8. La suma de los elementos pares de una lista de enteros.
    public static int calcularSumaElementosParesLista(ArrayList<Integer> lista, int indice) {
        if (indice == lista.size()) {
            return 0;
        } else {
            int num = lista.get(indice);
            int sumaResto = calcularSumaElementosParesLista(lista, indice + 1);
            if (num % 2 == 0) {
                return num + sumaResto;
            } else {
                return sumaResto;
            }
        }
    }

    // 9. Dada una lista de números naturales mayores o iguales que 2, obtiene otra lista con los números pares de la lista inicial.
    public static ArrayList<Integer> obtenerListaPares(int[] lista, int index) {
        ArrayList<Integer> listaPares = new ArrayList<>();
        if (index == lista.length) {
            return listaPares;
        }
        if (lista[index] % 2 == 0) {
            listaPares.add(lista[index]);
        }
        listaPares.addAll(obtenerListaPares(lista, index + 1));
        return listaPares;
    }

    // 10. La lista de los primeros números pares hasta n asumiendo n ≥ 2.
    public static ArrayList<Integer> obtenerListaParesHastaN(int n) {
        ArrayList<Integer> lista = new ArrayList<>();
        
        // Si n es menor que 2, retornamos la lista vacía
        if (n < 2) {
            return lista;
        }
        
        // Si n es par, lo agregamos a la lista
        if (n % 2 == 0) {
            lista.add(n);
        } else {
            // Si n es impar, agregamos el número par más cercano que es n-1
            lista.add(n - 1);
        }
        
        // Llamamos recursivamente para añadir los siguientes números pares
        lista.addAll(obtenerListaParesHastaN(n - 2));
        
        return lista;
    }
    

    // 11. Producto escalar de dos listas de números no vacías y del mismo tamaño.
    public static int calcularProductoEscalar(int[] lista1, int[] lista2, int n) {
        if (n == 0) {
            return lista1[0] * lista2[0];
        }
        return lista1[n] * lista2[n] + calcularProductoEscalar(lista1, lista2, n - 1);
    }

    // 12. El elemento n-ésimo de la sucesión de Fibonacci.
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // 13. Calcule el cociente entre el decimo tercer y el decimo segundo elemento de la sucesión de Fibonacci.
    public static double cocienteFibonacci(int n1, int n2) {
        int fibN1 = fibonacci(n1);
        int fibN2 = fibonacci(n2);
        return (double) fibN1 / fibN2;
    }

    // 14. Relación entre la sucesión de Fibonacci y la razón áurea.
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

    //Ejercicio 3 
    /*
    *El problema de las Torres de Hanoi consiste en mover una torre de discos de un poste a otro, respetando las siguientes reglas:
    *   1. Solo se puede mover un disco a la vez.
    *   2. Un disco nunca puede estar sobre otro disco de menor tamaño.
    *   3. Solo se pueden mover los discos de la parte superior de una torre.
    *   Para resolver el problema de las Torres de Hanoi, se puede utilizar un algoritmo recursivo que consiste en mover n-1 discos 
    *   de la torre de origen a la torre auxiliar, luego mover el disco n de la torre de origen a la torre de destino, y finalmente mover
    *   los n-1 discos de la torre auxiliar a la torre de destino. Este proceso se repite recursivamente hasta que todos los discos estén en la torre de destino.
    */


    //Ejercicio 4
    // Método recursivo para calcular la integral de e^(x^2)
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

    //Ejericcio 6
    // Método recursivo para sumar los códigos ASCII de una cadena
    public static int sumaCodigos(String str) {
        // Caso base: si la cadena está vacía, retornamos 0
        if (str.isEmpty()) {
            return 0;
        }
        // Llamada recursiva: sumamos el valor ASCII del primer carácter y el resto de la cadena
        return str.charAt(0) + sumaCodigos(str.substring(1));
    }

    //Ejercicio 7
    // Método recursivo para cifrar una cadena con el cifrado de César
    public static String cifrarCadena(String str, int desplazamiento) {
        // Caso base: si la cadena está vacía, devolvemos la cadena vacía
        if (str.isEmpty()) {
            return "";
        }

        // Obtenemos el primer carácter
        char c = str.charAt(0);

        // Si el carácter es una letra minúscula
        if (Character.isLowerCase(c)) {
            c = (char) ((c - 'a' + desplazamiento) % 26 + 'a');
        }
        // Si el carácter es una letra mayúscula
        else if (Character.isUpperCase(c)) {
            c = (char) ((c - 'A' + desplazamiento) % 26 + 'A');
        }

        // Llamada recursiva: ciframos el resto de la cadena
        return c + cifrarCadena(str.substring(1), desplazamiento);
    }

    //Ejercicio 8
    public static String conCodigoPar(String str) {
        // Caso base: si la cadena está vacía, terminamos
        if (str.isEmpty()) {
            return "";
        }

        // Cogemos el primer caracter de la cadena
        char firstChar = str.charAt(0);

        // Comprobamos si el código ASCII de ese primer caracter es par
        if (firstChar % 2 == 0) {
            return firstChar + conCodigoPar(str.substring(1));
        } else {
            return conCodigoPar(str.substring(1));
        }
    }

    



}