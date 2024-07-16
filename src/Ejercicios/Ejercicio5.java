package Ejercicios;

import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();


        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor del arreglo : ");
            arreglo[i] = scanner.nextInt();
        }


        System.out.print("Arreglo original: ");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();


        for (int i = 0; i < n / 2; i++) {
            int temp = arreglo[i];
            //invertimos el arreglo
            arreglo[i] = arreglo[n - 1 - i];
            arreglo[n - 1 - i] = temp;
        }


        System.out.print("Arreglo invertido: ");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    }

