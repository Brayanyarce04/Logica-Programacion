import java.util.Scanner;

public class ArregloEdades {

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {

            // 1. Crear un arreglo de 5 edades
            int[] edades = new int[5];

            // 2. Solicitar las edades
            System.out.println("=== REGISTRO DE EDADES ===");

            for (int i = 0; i < edades.length; i++) {

                System.out.print("Ingrese la edad " + (i + 1) + ": ");

                edades[i] = teclado.nextInt();
            }

            // 3. Mostrar las edades
            System.out.println("\n=== ARREGLO DE EDADES ===");

            for (int i = 0; i < edades.length; i++) {

                System.out.println(
                    "Posicion [" + i + "] = " + edades[i]
                );
            }

            // 4. Mostrar cantidad de elementos
            System.out.println(
                "\nTotal de edades: " + edades.length
            );
        }
    }
}