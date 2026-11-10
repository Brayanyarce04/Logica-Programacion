public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota");
        Carro carro2 = new Carro("Mazda");

        carro1.encender();
        carro1.acelerar(50);
        System.out.println("Velocidad Toyota: " + carro1.consultarVelocidad() + " km/h\n");

        carro2.encender();
        carro2.acelerar(70);
        System.out.println("Velocidad Mazda: " + carro2.consultarVelocidad() + " km/h");
    }
}