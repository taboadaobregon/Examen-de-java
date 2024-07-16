package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int numeroAleatorio = random.nextInt(100) + 1;
        int intentos = 0;
        int numeroUsuario = 0;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("He seleccionado un número entre 1 y 100. Intenta adivinarlo.");


        while (numeroUsuario != numeroAleatorio) {
            System.out.print("Ingresa tu adivinanza: ");
            numeroUsuario = scanner.nextInt();
            intentos++;

            if (numeroUsuario < numeroAleatorio) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
            }
        }


        System.out.println("¡Felicidades! Has adivinado el número " + numeroAleatorio);
        System.out.println("Número de intentos realizados: " + intentos);
    }
}
