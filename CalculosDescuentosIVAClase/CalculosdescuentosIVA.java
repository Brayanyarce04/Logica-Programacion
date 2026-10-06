import java.util.Scanner;

public class CalculosdescuentosIVA {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String producto;
        double precio;
        double descuento;
        double iva = 19;
 
        System.out.print("Ingrese el nombre del producto: ");
        producto = teclado.nextLine();
 
        System.out.print("Ingrese el precio: $");
        precio = teclado.nextDouble();

        if (precio >= 500000) {
            descuento = 20;
        } else if (precio >= 300000) {
            descuento = 15;
        } else if (precio >= 100000) {
            descuento = 10;
        } else {
            descuento = 0;
        }

        double valorDescuento = precio * descuento / 100;
        double subtotal = precio - valorDescuento;
        double valorIva = subtotal * iva / 100;
        double total = subtotal + valorIva;
 
        System.out.println("\n========== RESUMEN DE COMPRA ==========");
        System.out.println("Producto: " + producto);
        System.out.println("Precio: $" + precio);
        System.out.println("Descuento aplicado: " + descuento + "%");
        System.out.println("Valor descuento: $" + valorDescuento);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA: $" + valorIva);
        System.out.println("TOTAL: $" + total);
        System.out.println("=======================================");
 
        teclado.close();
    }
    
}