class Carro {
    String marca;
    int velocidad;

    Carro(String marca) {
        this.marca = marca;
        this.velocidad = 0;
    }

    void encender() {
        System.out.println("El carro " + marca + " está encendido.");
    }

    void acelerar(int incremento) {
        velocidad = velocidad + incremento;
        System.out.println("Velocidad actual: " + velocidad + " km/h");
    }

    int consultarVelocidad() {
        return velocidad;
    }
}

public class main {
    public static void main(String[] args) {
        Carro miCarro = new Carro("Toyota");

        miCarro.encender();
        miCarro.acelerar(50);

        int velocidadActual = miCarro.consultarVelocidad();

        System.out.println("El carro va a " + velocidadActual + " km/h");
    }
}