package Ejercicios;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Ejercicio01 {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    System.out.print("Ingrese un valor para n: ");
    int n = scanner.nextInt();

    int suma = 0;


    for (int i = 1; i <= n; i++) {

        if (i % 3 != 0 && i % 5 != 0) {
            suma += i;
        }
    }

    // Imprime la suma resultante
    System.out.println("La suma de los primeros " + n + " números naturales, excluyendo múltiplos de 3 y 5, es: " + suma);

}

}