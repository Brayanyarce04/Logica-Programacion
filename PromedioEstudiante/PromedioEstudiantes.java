import java.util.Scanner; //Importa la clase Scanner para leer datos del teclado.

public class PromedioEstudiantes {

    public static void main(String[] args) { // Metodo principal donde inicia el programa.

        // Crea el Scanner y lo cierra automaticamente al finalizar
        // (try-with-resources).
        try (Scanner teclado = new Scanner(System.in)) {

            // Declaración de variables (todas en minúsculas)
            double nota1, nota2, nota3, promedio;

            // Titulo del Programa
            System.out.println("==================================");
            System.out.println(" PROMEDIO DE UN ESTUDIANTE");
            System.out.println("==================================");

            // Entrada de Datos
            System.out.print("Ingrese la Nota 1: ");
            nota1 = teclado.nextDouble();

            System.out.print("Ingrese la Nota 2: ");
            nota2 = teclado.nextDouble();

            System.out.print("Ingrese la Nota 3: ");
            nota3 = teclado.nextDouble();

            // Calcula el promedio de las tres notas.
            promedio = (nota1 + nota2 + nota3) / 3;

            // Muestra de los resultados
            System.out.println("\n========== RESULTADO ==========");
            System.out.println("Nota 1: " + nota1);
            System.out.println("Nota 2: " + nota2);
            System.out.println("Nota 3: " + nota3);
            System.out.println("---------------------------------");
            System.out.printf("El promedio del estudiante es: %.2f%n", promedio);

        }
    }
}