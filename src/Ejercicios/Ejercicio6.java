package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // Solicita al usuario que ingrese el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();


        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese valores del arreglo");
            arreglo[i] = scanner.nextInt();
        }

        // Imprime el arreglo original
        System.out.print("Arreglo original: ");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Ordena el arreglo de menor a mayor
        Arrays.sort(arreglo);

        // Imprime el arreglo ordenado
        System.out.print("Arreglo ordenado: ");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
