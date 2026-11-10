public class Carro {
    private String marca;
    private int velocidad;

    public Carro(String marca) {
        this.marca = marca;
        this.velocidad = 0;
    }

    public void encender() {
        System.out.println("El carro " + this.marca + " se ha encendido.");
    }

    public void acelerar(int incremento) {
        this.velocidad += incremento;
        System.out.println("El carro " + this.marca + " aceleró a " + this.velocidad + " km/h.");
    }

    public int consultarVelocidad() {
        return this.velocidad;
    }

    public String getMarca() {
        return this.marca;
    }
}