package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lee el número de días
        System.out.print("Ingrese el número de días (n): ");
        int n = scanner.nextInt();

        // Lee el número máximo de deseos que una página puede soportar
        System.out.print("Ingrese el número máximo de deseos por página (m): ");
        int m = scanner.nextInt();

        // Lee el número de deseos por día
        int[] deseos = new int[n];
        System.out.println("Ingrese el número de deseos para cada día:");
        for (int i = 0; i < n; i++) {
            deseos[i] = scanner.nextInt();
        }

        // Inicializa las variables
        int paginasUsadas = 0;
        int espacioDisponible = m;

        // Procesa cada día
        for (int i = 0; i < n; i++) {
            int deseosHoy = deseos[i];

            // Cuenta las veces que se pasa de página durante el día
            int paginasPasadasHoy = 0;

            while (deseosHoy > 0) {
                if (deseosHoy <= espacioDisponible) {
                    // Si los deseos caben en la página actual
                    espacioDisponible -= deseosHoy;
                    deseosHoy = 0;
                } else {
                    // Si los deseos no caben en la página actual
                    deseosHoy -= espacioDisponible;
                    paginasPasadasHoy++;
                    espacioDisponible = m;
                }
            }

            // Imprime el resultado del día
            System.out.println("Día " + (i + 1) + ": Se pasaron de página " + paginasPasadasHoy + " veces.");
        }
    }
    }

