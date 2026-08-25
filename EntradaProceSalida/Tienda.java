import java.util.Scanner;

public class Tienda {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nombreProducto;
        double precio;
        int cantidad;
        double totalCompra;

        System.out.println("==== SISTEMA DE VENTAS ====");

        System.out.print("Ingrese el nombre del producto: ");
        nombreProducto = teclado.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        precio = teclado.nextDouble();

        System.out.print("Ingrese la cantidad: ");
        cantidad = teclado.nextInt();

        totalCompra = precio * cantidad;

        System.out.println("\n====== FACTURA ======");
        System.out.println("Producto :  " + nombreProducto);
        System.out.println("Precio   : $" + precio);
        System.out.println("Cantidad :  " + cantidad);
        System.out.println("Total    : $" + totalCompra);
        System.out.println("=====================");

        teclado.close();
    }
}