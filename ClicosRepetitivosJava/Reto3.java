import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double sumaEdades = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Ingrese la edad del animal " + i + ": ");
            double edad = teclado.nextDouble();
            sumaEdades += edad;
        }

        double promedio = sumaEdades / 3;
        System.out.println("La edad promedio de los animales es: " + promedio);

        teclado.close();
    }
}