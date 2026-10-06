import java.util.Scanner;

    public class ResumenCompra {
    
        public static void main(String[] args) {
            
            Scanner teclado = new Scanner(System.in);

            System.out.print("Ingrese el nombre del producto: ");
            String producto = teclado.nextLine();
 
        System.out.print("Ingrese el precio: $");
        double precio = teclado.nextDouble();
 
        double descuento;
        double iva = 19;
 
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
 
        System.out.println();
        System.out.println("========== RESUMEN DE COMPRA ==========");
        System.out.println();
        System.out.println("Producto: " + producto);
        System.out.printf("Precio: $%.0f%n", precio);
        System.out.printf("Descuento aplicado: %.0f%%%n", descuento);
        System.out.printf("Valor descuento: $%.0f%n", valorDescuento);
        System.out.printf("Subtotal: $%.0f%n", subtotal);
        System.out.printf("IVA: $%.0f%n", valorIva);
        System.out.printf("TOTAL: $%.0f%n", total);
 
        teclado.close();
        }
    }
