public class Motocicleta {
    
    // --- ATRIBUTOS PRIVADOS
    private final String id;
    private final String nombre;
    private final String marca;
    private final int modelo;
    private final int kilometraje;
    private final int cilindraje;
    private final double precio;
    private final String condicion; 

// --- MÉTODOS Para Ingreso de las motos
    public Motocicleta(String id, String nombre, String marca, int modelo, int kilometraje, int cilindraje, double precio, String condicion) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.cilindraje = cilindraje;
        this.precio = precio;
        this.condicion = condicion;
    }
// --- FUNCIONES PARA RETORNO DE INFORMACION DENTRO DE JAVA
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getMarca() { return marca; }
    public int getModelo() { return modelo; }
    public int getKilometraje() { return kilometraje; }
    public int getCilindraje() { return cilindraje; }
    public double getPrecio() { return precio; }
    public String getCondicion() { return condicion; }
//INFO DE LA CONSOLA
    public void mostrarFicha() {
        System.out.println("────────────────────────────────────────────────────────────");
        System.out.printf(" ID: %-12s | %s [%s]\n", id, nombre, condicion.toUpperCase());
        System.out.printf(" Marca: %-9s | Modelo: %d | Cilindraje: %d cc\n", marca, modelo, cilindraje);
        System.out.printf(" Kilometraje: %,d km | Precio Base: $%,.0f COP\n", kilometraje, precio);
        System.out.println("────────────────────────────────────────────────────────────");
    }
}