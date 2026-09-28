public class Main {

    public static void main(String[] args) {
        
        double compra = 180000;

        if (compra >= 300000) {
            System.out.println("Descuento del 20%");

        } else if (compra >= 200000) {
            System.out.println("Descuento del 15%");

        } else if (compra >= 100000) {
            System.out.println("Descuento del 10%");
        
        } else {
            System.out.println("No tiene descuento");
        }
    }
}