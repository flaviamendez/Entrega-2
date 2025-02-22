package mates;

import java.util.ArrayList;
import java.util.Arrays;

public class Mates {
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


}