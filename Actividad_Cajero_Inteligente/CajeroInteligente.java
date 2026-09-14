public class CajeroInteligente {

    public static void main(String[] args) {

        int[] compras = {12000, 25000, 8000, 35000, 15000,45000,20000,8500};

        int cantidadCompras = 0;
        int totalVentas = 0;
        int comprasGrandes = 0;      
        int comprasPequenas = 0;     

        int limiteCompraGrande = 30000;

        for (int i = 0; i < compras.length; i++) {

            totalVentas = totalVentas + compras[i]; 
            cantidadCompras++;                      

            if (compras[i] > limiteCompraGrande) {
                comprasGrandes++;                   
            } else {
                comprasPequenas++;
            }
        }

        double promedio = (double) totalVentas / cantidadCompras;

        String mensajeDia;
        if (promedio > 25000) {
            mensajeDia = "Día excelente";
        } else {
            mensajeDia = "Día normal";
        }

        int mayor = compras[0];
        for (int i = 1; i < compras.length; i++) {
            if (compras[i] > mayor) {
                mayor = compras[i];
            }
        }

        System.out.println("===== RESUMEN DE VENTAS =====");
        System.out.println("Cantidad de compras: " + cantidadCompras);
        System.out.println("Dinero recaudado: $" + totalVentas);
        System.out.printf("Promedio por compra: $%.2f%n", promedio);
        System.out.println("Compras superiores a $" + limiteCompraGrande + ": " + comprasGrandes);
        System.out.println("Compras menores o iguales a $" + limiteCompraGrande + ": " + comprasPequenas);
        System.out.println("Mensaje: " + mensajeDia);
        System.out.println("La compra más alta fue: $" + mayor);
    }
}
