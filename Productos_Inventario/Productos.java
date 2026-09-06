import java.util.Scanner;

public class Productos {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de productos: ");
        int cantidadProductos = entrada.nextInt();

        int atendidos = 0, rechazados = 0;

        for (int i = 1; i <= cantidadProductos; i++) {

            System.out.println("\nProducto " + i);
            
            System.out.print("Ingrese el nombre del producto: ");
            String producto = entrada.next();

            System.out.print("Ingrese la cantidad disponible: ");
            int inventario = entrada.nextInt();

            System.out.print("Ingrese la cantidad solicitada: ");
            int solicitado = entrada.nextInt();

            if (inventario >= solicitado) {
                inventario = inventario - solicitado;
                System.out.println("Pedido atendido.");
                System.out.println("Producto: " + producto);
                System.out.println("Inventario restante: " + inventario);
                atendidos++;
            } else {
                System.out.println("Pedido rechazado.");
                System.out.println("No hay suficiente inventario.");
                rechazados++; 
            }
        }

        System.out.println("\nResumen: " + atendidos + " atendidos, " + rechazados + " rechazados.");

        entrada.close();
    }
}