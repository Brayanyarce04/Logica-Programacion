import java.util.Scanner; // Importa la herramienta para leer datos del teclado

public class Sistema_Banco { // Define el nombre de la clase principal

    public static void main (String[] args) { // Punto de inicio donde arranca el programa

        Scanner teclado = new Scanner(System.in); // Crea el lector de teclado en consola
        
        double monto; // Variable para guardar dinero (acepta decimales)
        int compras; // Variable para contar la cantidad de compras (enteros)
        String estado; // Variable para guardar el texto del estado ("APROBADA", etc.)

        System.out.println("===== SISTEMA BANCCARIO ===== "); // Imprime el título en pantalla

        System.out.print("Ingrese el monto de la transacción: "); // Pide el dinero al usuario
        monto = teclado.nextDouble(); // Lee el número decimal que puso el usuario

        System.out.print("Ingrese el número de compras realizadas: "); // Pide la cantidad de compras
        compras = teclado.nextInt(); // Lee el número entero que puso el usuario

        if (monto > 10000000) { // Si el monto es mayor a 10 millones...
            estado = "BLOQUEDADA"; // ...el estado pasa a bloqueado
        } else if (monto > 5000000 && compras > 5) { // Si es mayor a 5 millones Y van más de 5 compras...
            estado = "REVISAR"; // ...el estado pasa a revisión
        } else { // Si no cumple ninguna de las condiciones anteriores...
            estado = "APROBADA"; // ...la transacción se aprueba automáticamente
        }
        System.out.println("\n===== RESULTADO ====="); // Imprime separador de resultados
        System.out.println("Monto ingresado  : $" + monto); // Muestra el dinero guardado
        System.out.println("Compras realizadas: " + compras); // Muestra las compras guardadas
        System.out.println("Estado final: " + estado); // Muestra la decisión del sistema (el estado)
        System.out.println("====================="); // Imprime línea de cierre visual

        teclado.close(); // Cierra el lector de teclado para liberar memoria
    }
}
