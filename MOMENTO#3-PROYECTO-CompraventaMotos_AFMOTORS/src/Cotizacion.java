public class Cotizacion {
    
    public static final double TECNOMECANICA = 232650;
    public static final double SEGURO_TODO_RIESGO = 1500000;
    public static final String WHATSAPP_NUMBER = "573043909319";
// FUNCIÓN CON RETORNO 1 (Retorna un tipo double)
    // Calcula el SOAT usando condicionales según el cilindraje
    public double obtenerSOAT(int cilindraje) {
        if (cilindraje < 100) {
            return 256200;
        } else if (cilindraje <= 200) {
            return 343300;
        } else {
            return 820000;
        }
    }
// FUNCIÓN CON RETORNO 2 
    // Calcula la suma total acumulada aplicando SOAT, Tecno y Seguro
    public double calcularTotalCotizacion(Motocicleta moto, boolean incluirSeguro) {
        double total = moto.getPrecio();

        if (moto.getCondicion().equalsIgnoreCase("Nueva")) {
            total += obtenerSOAT(moto.getCilindraje());
            total += TECNOMECANICA;
        }

        if (incluirSeguro) {
            total += SEGURO_TODO_RIESGO;
        }

        return total;
    }
// MÉTODO DE ACCIÓN 
    // Imprime la cotización
    public void generarDesglose(Motocicleta moto, boolean incluirSeguro) {
        double soat = obtenerSOAT(moto.getCilindraje());
        double total = calcularTotalCotizacion(moto, incluirSeguro);

        System.out.println("\n============================================================");
        System.out.println("           AF MOTORS - DESGLOSE DE COTIZACIÓN               ");
        System.out.println("============================================================");
        System.out.println(" Motocicleta     : " + moto.getNombre());
        System.out.println(" Especificación  : Modelo " + moto.getModelo() + " | " + moto.getKilometraje() + " km | " + moto.getCilindraje() + " cc");
        System.out.println("------------------------------------------------------------");
        System.out.printf(" Precio base        : $%,14.0f COP\n", moto.getPrecio());

        if (moto.getCondicion().equalsIgnoreCase("Nueva")) {
            System.out.printf(" SOAT (Estimado)    : $%,14.0f COP\n", soat);
            System.out.printf(" Tecnomecánica      : $%,14.0f COP\n", TECNOMECANICA);
        } else {
            System.out.println(" SOAT / Tecno       : [No sumados - Confirmar vigencia]");
        }

        if (incluirSeguro) {
            System.out.printf(" Seguro Todo Riesgo : $%,14.0f COP\n", SEGURO_TODO_RIESGO);
        } else {
            System.out.println(" Seguro Todo Riesgo : [No Incluido]");
        }

        System.out.println("============================================================");
        System.out.printf(" TOTAL ESTIMADO     : $%,14.0f COP\n", total);
        System.out.println("============================================================");
        System.out.println(" 📲 Link Asesor WhatsApp: https://wa.me/" + WHATSAPP_NUMBER);
        System.out.println(" (Nota: Valores de referencia para confirmación en sede)\n");
    }
}