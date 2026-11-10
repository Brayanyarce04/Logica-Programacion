import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String contrasena = "";

        while (!contrasena.equals("JAVA2026")) {
            System.out.print("Ingrese la contraseña: ");
            contrasena = teclado.nextLine();

            if (!contrasena.equals("JAVA2026")) {
                System.out.println("Contraseña incorrecta. Intente otra vez.");
            }
        }

        System.out.println("¡Acceso permitido!");
        teclado.close();
    }
}