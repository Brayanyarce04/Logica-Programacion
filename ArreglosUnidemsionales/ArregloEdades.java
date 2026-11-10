import java.util.Scanner;

public class ArregloEdades {
    public static void main(String[] args) {
        
        try (Scanner teclado = new Scanner(System.in)) {
            
        
            int[] edades = new int[5];
            int suma = 0;

            System.out.println("=== REGISTRO DE EDADES ===");
        
            for (int i = 0; i < edades.length; i++) {
                System.out.print("Ingrese la edad " + (i + 1) + ": ");
                edades[i] = teclado.nextInt();
                suma += edades[i]; // Acumular la suma
            }

            System.out.println("\n=== ARREGLO DE EDADES ===");
        
            for (int i = 0; i < edades.length; i++) {
                System.out.println("Posicion [" + i + "] = " + edades[i]);
            }

        
            double promedio = (double) suma / edades.length;

            System.out.println("\n-----------------------------");
            System.out.println("La suma total es: " + suma);
            System.out.println("La edad promedio es: " + promedio);
        }
    }
}