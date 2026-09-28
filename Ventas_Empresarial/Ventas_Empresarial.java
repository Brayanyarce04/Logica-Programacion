import java.util.Scanner;

    public class Ventas_Empresarial {
        
        public static void main(String[] args) {
            
            Scanner entrada = new Scanner(System.in);

        int cantidadVentas;
        int ventasValidas = 0;
        int ventasRechazadas = 0;
        int ventasSuperiores500 = 0;
        int ventasInferiores100 = 0;
        int clientesVIP = 0;
        int clientesFrecuentes = 0;
        int clientesGenerales = 0;
 
        double totalVentas = 0;
        double ventaMayor = 0;
        double ventaMenor = 0;
 
        System.out.print("Ingrese la cantidad de ventas: ");
        cantidadVentas = entrada.nextInt();
 
        for (int i = 1; i <= cantidadVentas; i++) {
 
            System.out.println("\n===== VENTA #" + i + " =====");
            System.out.print("Ingrese el valor de la venta: ");
            double venta = entrada.nextDouble();

            if (venta <= 0) {
                System.out.println("Venta rechazada: el valor debe ser mayor a 0.");
                ventasRechazadas++;
            } else {
 
                String tipoCliente;
                if (venta > 1000000) {
                    tipoCliente = "CLIENTE VIP";
                    clientesVIP++;
                } else if (venta >= 500000) {
                    tipoCliente = "CLIENTE FRECUENTE";
                    clientesFrecuentes++;
                } else {
                    tipoCliente = "CLIENTE GENERAL";
                    clientesGenerales++;
                }
                System.out.println("Tipo de cliente: " + tipoCliente);
 
                totalVentas += venta;
                ventasValidas++;
 
                if (venta > 500000) {
                    ventasSuperiores500++;
                }
                if (venta < 100000) {
                    ventasInferiores100++;
                }
 
                if (ventasValidas == 1) {
                    ventaMayor = venta;
                    ventaMenor = venta;
                } else {
                    if (venta > ventaMayor) {
                        ventaMayor = venta;
                    }
                    if (venta < ventaMenor) {
                        ventaMenor = venta;
                    }
                }
 
                System.out.println("Venta registrada correctamente.");
            }
        }
 
        System.out.println("\n=========================================");
        System.out.println("            INFORME DE VENTAS");
        System.out.println("=========================================");
 
        if (ventasValidas == 0) {
            System.out.println("No se registraron ventas válidas.");
        } else {
            double promedio = totalVentas / ventasValidas;
 
            System.out.println("Ventas realizadas: " + ventasValidas);
            System.out.println("Ventas rechazadas: " + ventasRechazadas);
            System.out.println("Dinero recaudado: $" + String.format("%,.0f", totalVentas));
            System.out.println("Promedio de ventas: $" + String.format("%,.0f", promedio));
            System.out.println("-----------------------------------------");
            System.out.println("Venta más alta: $" + String.format("%,.0f", ventaMayor));
            System.out.println("Venta más baja: $" + String.format("%,.0f", ventaMenor));
            System.out.println("-----------------------------------------");
            System.out.println("Ventas superiores a $500.000: " + ventasSuperiores500);
            System.out.println("Ventas inferiores a $100.000: " + ventasInferiores100);
            System.out.println("-----------------------------------------");
            System.out.println("Clientes VIP: " + clientesVIP);
            System.out.println("Clientes frecuentes: " + clientesFrecuentes);
            System.out.println("Clientes generales: " + clientesGenerales);
        }
 
        System.out.println("=========================================");
        System.out.println("            FIN DEL INFORME");
        System.out.println("=========================================");
 
        entrada.close();
        }
        
    }
