import java.util.Scanner;

public class SistemasDescuentos {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

                System.out.print("Ingrese el nombre del cliente: ");
        String nombre = entrada.nextLine();
 
        System.out.print("Ingrese el valor de la compra: ");
        double compra = entrada.nextDouble();
 
        double porcentajeDescuento;
 
        if (compra >= 300000) {
            porcentajeDescuento = 20;
        } else if (compra >= 200000) {
            porcentajeDescuento = 15;
        } else if (compra >= 100000) {
            porcentajeDescuento = 10;
        } else {
            porcentajeDescuento = 0;
        }
 
        double valorDescontado = compra * porcentajeDescuento / 100;
        double totalAPagar = compra - valorDescontado;
 
        System.out.println();
        System.out.println("================================");
        System.out.println("       TIENDA TECNOLÓGICA");
        System.out.println("================================");
        System.out.println();
        System.out.println("Cliente: " + nombre);
        System.out.printf("Compra: $%.0f%n", compra);
        System.out.printf("Descuento aplicado: %.0f%%%n", porcentajeDescuento);
        System.out.printf("Valor descontado: $%.0f%n", valorDescontado);
        System.out.printf("Total a pagar: $%.0f%n", totalAPagar);
        System.out.println();
        System.out.println("¡Gracias por su compra!");
        System.out.println("================================");
 
        entrada.close();
    }    
}