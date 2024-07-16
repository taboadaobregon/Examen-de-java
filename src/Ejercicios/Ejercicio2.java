package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();


        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo[i] = random.nextInt(100) + 1;
        }


        System.out.print("Arreglo: ");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();


        int suma = 0;
        for (int num : arreglo) {
            if (num % 3 != 0 && num % 5 != 0) {
                suma += num;
            }
        }


        System.out.println("La suma de los elementos del arreglo, excluyendo múltiplos de 3 y 5, es: " + suma);

    }
}
