import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        int opcion;

        do {
            mostrarMenu();
            opcion = pedirEntero(teclado, "  ➔ Selecciona una opción [1-7]: ");

            if (opcion >= 1 && opcion <= 6) {
                System.out.println("\n┌──────────────────────────────────────────┐");
                System.out.println("│          INGRESO DE DATOS                │");
                System.out.println("└──────────────────────────────────────────┘");

                double num1 = pedirDouble(teclado, "  • Primer número : ");
                double num2 = pedirDouble(teclado, "  • Segundo número: ");

                procesarOperacion(calculadora, opcion, num1, num2);

                System.out.print("\n Presiona ENTER para continuar...");
                teclado.nextLine();
                teclado.nextLine();
            } else if (opcion != 7) {
                mostrarCajaError("Opción no válida. Elige un número del 1 al 7.");
            }
        } while (opcion != 7);

        mostrarDespedida();
        teclado.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║        🧮 CALCULADORA PRO JAVA          ║");
        System.out.println("╠══════════════════════════════════════════╣");
        System.out.println("║  [1] ➕ Sumar                            ║");
        System.out.println("║  [2] ➖ Restar                           ║");
        System.out.println("║  [3] ✖️  Multiplicar                     ║");
        System.out.println("║  [4] ➗ Dividir                          ║");
        System.out.println("║  [5] 📉 Módulo (Residuo)                 ║");
        System.out.println("║  [6] ⚡ Potencia                         ║");
        System.out.println("║  [7] 🚪 Salir                            ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    private static void procesarOperacion(Calculadora calc, int opcion, double a, double b) {
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║               RESULTADO                  ║");
        System.out.println("╠══════════════════════════════════════════╣");

        try {
            switch (opcion) {
                case 1 -> mostrarResultado(a + " + " + b, calc.sumar(a, b));
                case 2 -> mostrarResultado(a + " - " + b, calc.restar(a, b));
                case 3 -> mostrarResultado(a + " × " + b, calc.multiplicar(a, b));
                case 4 -> mostrarResultado(a + " ÷ " + b, calc.dividir(a, b));
                case 5 -> mostrarResultado(a + " % " + b, calc.modulo(a, b));
                case 6 -> mostrarResultado(a + " ^ " + b, calc.potenciar(a, b));
            }
        } catch (ArithmeticException e) {
            System.out.println("║  ❌ Error: " + e.getMessage());
        }

        System.out.println("╚══════════════════════════════════════════╝");
    }

    private static void mostrarResultado(String operacion, double resultado) {
        // Formato para mostrar enteros sin decimales innecesarios
        String resFormateado = (resultado % 1 == 0) 
                ? String.format("%.0f", resultado) 
                : String.format("%.4f", resultado);

        System.out.println("║  Operación: " + operacion);
        System.out.println("║  Total    : " + resFormateado);
    }

    private static int pedirEntero(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        while (!sc.hasNextInt()) {
            mostrarCajaError("Entrada inválida. Ingresa un número entero.");
            System.out.print(mensaje);
            sc.next();
        }
        return sc.nextInt();
    }

    private static double pedirDouble(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        while (!sc.hasNextDouble()) {
            mostrarCajaError("Entrada inválida. Ingresa un valor numérico.");
            System.out.print(mensaje);
            sc.next();
        }
        return sc.nextDouble();
    }

    private static void mostrarCajaError(String mensaje) {
        System.out.println("\n ⚠️ " + mensaje);
    }

    private static void mostrarDespedida() {
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║   ¡Gracias por usar Calculadora Pro! 👋  ║");
        System.out.println("╚══════════════════════════════════════════╝\n");
    }
}