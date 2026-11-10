import java.util.Scanner;

public class Main {
    // ARREGLO UNIDIMENSIONAL 1 (Arreglo de Objetos)
    private static final Motocicleta[] inventario = new Motocicleta[14];
    private static int cantidadMotos = 0;
   //ARREGLO UNIDIMENSIONAL 2 (Arreglo de Cadenas String)
    private static final String[] marcasDisponibles = {"Yamaha", "Suzuki", "Honda", "Ducati"};

    public static void main(String[] args) {
        cargarInventarioInicial();
        Scanner teclado = new Scanner(System.in);
        Cotizacion cotizador = new Cotizacion();
        int opcion;
        // CICLO REPETITIVO DO-WHILE
        // Mantiene el programa activo repitiendo el menú hasta seleccionar 6
        do {
            mostrarMenu();
            System.out.print(" Seleccione una opción [1-6]: ");
            //CICLO WHILE para validar entradas no numéricas
            while (!teclado.hasNextInt()) {
                System.out.print(" ⚠️ Opción no válida. Ingrese un número [1-6]: ");
                teclado.next();
            }
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1 -> mostrarCatalogoCompleto();
                case 2 -> filtrarPorMarca(teclado);
                case 3 -> realizarCotizacionInteractiva(teclado, cotizador);
                case 4 -> registrarNuevaMoto(teclado);
                case 5 -> mostrarEstadisticas();
                case 6 -> System.out.println("\n ¡Gracias por utilizar el sistema AF MOTORS! 🏍️💨\n");
                default -> System.out.println(" ⚠️ Opción fuera de rango.");
            }
        } while (opcion != 6);

        teclado.close();
    }

    private static void cargarInventarioInicial() {
        inventario[cantidadMotos++] = new Motocicleta("dr650", "Suzuki DR 650", "Suzuki", 2026, 500, 644, 56000000, "Usada");
        inventario[cantidadMotos++] = new Motocicleta("nmaxv3nueva", "Yamaha NMAX V3", "Yamaha", 2027, 0, 155, 22100000, "Nueva");
        inventario[cantidadMotos++] = new Motocicleta("szr1", "Yamaha SZ R 150", "Yamaha", 2024, 35000, 149, 8200000, "Usada");
        inventario[cantidadMotos++] = new Motocicleta("tornado300", "Honda XR 300 Tornado", "Honda", 2026, 7000, 249, 38500000, "Usada");
        inventario[cantidadMotos++] = new Motocicleta("xtz250", "Yamaha XTZ 250 Lander", "Yamaha", 2025, 7000, 249, 26900000, "Usada");
        inventario[cantidadMotos++] = new Motocicleta("nmaxv2", "Yamaha NMAX V2 Connected", "Yamaha", 2026, 9500, 155, 17800000, "Usada");
        inventario[cantidadMotos++] = new Motocicleta("ducati698", "Ducati Hypermotard 698", "Ducati", 2024, 9000, 659, 59000000, "Usada");
        inventario[cantidadMotos++] = new Motocicleta("ax4", "Suzuki AX4 115", "Suzuki", 2026, 0, 113, 6800000, "Nueva");
        inventario[cantidadMotos++] = new Motocicleta("xadv750", "Honda X-ADV 750", "Honda", 2024, 7000, 745, 66000000, "Usada");
    }
    // ARREGLO CON CICLO FOR
    private static void mostrarCatalogoCompleto() {
        System.out.println("\n============================================================");
        System.out.println("            INVENTARIO DE MOTOCICLETAS AF MOTORS            ");
        System.out.println("============================================================");
        for (int i = 0; i < cantidadMotos; i++) {
            inventario[i].mostrarFicha();
        }
        System.out.println(" Total en stock: " + cantidadMotos + " unidades.");
    }

    private static void filtrarPorMarca(Scanner teclado) {
        System.out.println("\nMarcas disponibles: ");
        for (int i = 0; i < marcasDisponibles.length; i++) {
            System.out.println(" [" + (i + 1) + "] " + marcasDisponibles[i]);
        }
        System.out.print("Ingrese el nombre o número de la marca a buscar: ");
        String busqueda = teclado.nextLine().toLowerCase();

        System.out.println("\n--- RESULTADOS DE BÚSQUEDA ---");
        int encontradas = 0;
       // Ciclo FOR recorre el segundo arreglo unidimensional 
        for (int i = 0; i < cantidadMotos; i++) {
            if (inventario[i].getMarca().toLowerCase().contains(busqueda)) {
                inventario[i].mostrarFicha();
                encontradas++;
            }
        }
        if (encontradas == 0) {
            System.out.println("No se encontraron motocicletas para la marca ingresada.");
        }
    }
    // MÉTODO INTERACTIVO
    private static void realizarCotizacionInteractiva(Scanner teclado, Cotizacion cotizador) {
        System.out.println("\n=== SELECCIONAR MOTOCICLETA PARA COTIZAR ===");
        for (int i = 0; i < cantidadMotos; i++) {
            System.out.printf("[%d] %s ($%,.0f COP)\n", (i + 1), inventario[i].getNombre(), inventario[i].getPrecio());
        }
        System.out.print("Seleccione la opción de la motocicleta: ");
        int seleccion = teclado.nextInt() - 1;

        if (seleccion >= 0 && seleccion < cantidadMotos) {
            System.out.print("¿Desea incluir Seguro Todo Riesgo por 1 año ($1.500.000 COP)? (si/no): ");
            String resSeguro = teclado.next();
            boolean incluirSeguro = resSeguro.equalsIgnoreCase("si") || resSeguro.equalsIgnoreCase("s");
        // Invoca el método generarDesglose pasando la moto seleccionada 
            cotizador.generarDesglose(inventario[seleccion], incluirSeguro);
        } else {
            System.out.println(" ⚠️ Selección de motocicleta inválida.");
        }
    }

    private static void registrarNuevaMoto(Scanner teclado) {
        if (cantidadMotos >= inventario.length) {
            System.out.println(" ⚠️ El inventario está lleno. No es posible registrar más motocicletas.");
            return;
        }

        System.out.println("\n=== REGISTRO DE NUEVA MOTOCICLETA (AF MOTORS) ===");
        System.out.print(" ID único (ej. nmaxv4): ");
        String id = teclado.nextLine();
        System.out.print(" Nombre comercial (ej. Yamaha NMAX V4): ");
        String nombre = teclado.nextLine();
        System.out.print(" Marca: ");
        String marca = teclado.nextLine();
        System.out.print(" Modelo (Año): ");
        int modelo = teclado.nextInt();
        System.out.print(" Kilometraje: ");
        int km = teclado.nextInt();
        System.out.print(" Cilindraje (cc): ");
        int cc = teclado.nextInt();
        System.out.print(" Precio venta (COP): ");
        double precio = teclado.nextDouble();
        System.out.print(" Condición (Nueva/Usada): ");
        String condicion = teclado.next();
        // Almacena el objeto creado directamente en la posición libre del arreglo
        inventario[cantidadMotos++] = new Motocicleta(id, nombre, marca, modelo, km, cc, precio, condicion);
        System.out.println(" ✅ ¡Motocicleta registrada exitosamente en el inventario!\n");
    }

    private static void mostrarEstadisticas() {
        double valorTotalInventario = 0;
        int motosNuevas = 0;
        // Ciclo FOR que acumula los precios de cada objeto
        for (int i = 0; i < cantidadMotos; i++) {
            valorTotalInventario += inventario[i].getPrecio();
            if (inventario[i].getCondicion().equalsIgnoreCase("Nueva")) {
                motosNuevas++;
            }
        }

        System.out.println("\n╔════════════════════════════════════════════════════════════╗");
        System.out.println("║            PANEL DE CONTROL - AF MOTORS METRICS            ║");
        System.out.println("╠════════════════════════════════════════════════════════════╣");
        System.out.printf("║  Total Motocicletas en Stock : %-27d ║\n", cantidadMotos);
        System.out.printf("║  Motocicletas Nuevas        : %-27d ║\n", motosNuevas);
        System.out.printf("║  Motocicletas Usadas        : %-27d ║\n", (cantidadMotos - motosNuevas));
        System.out.printf("║  Valor Total del Inventario : $%,-24.0f COP ║\n", valorTotalInventario);
        System.out.println("╚════════════════════════════════════════════════════════════╝\n");
    }

    private static void mostrarMenu() {
        System.out.println("\n╔═══════════════════════════════════════════════════════════╗");
        System.out.println("║              SISTEMA COMPRAVENTA AF MOTORS                 ║");
        System.out.println("╠════════════════════════════════════════════════════════════╣");
        System.out.println("║  [1] 📋 Ver catálogo completo de motocicletas              ║");
        System.out.println("║  [2] 🔍 Filtrar motocicletas por marca                     ║");
        System.out.println("║  [3] 🧮 Simular cotización detallada (SOAT/Seguro)         ║");
        System.out.println("║  [4] ➕ Registrar nueva motocicleta al inventario          ║");
        System.out.println("║  [5] 📊 Ver estadísticas del negocio / inventario          ║");
        System.out.println("║  [6] 🚪 Salir del programa                                 ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
    }
}