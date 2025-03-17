package Transporte;

public class Coche extends Vehiculo implements ConMotor {
    public Coche(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void describir() {
        System.out.println("Soy un coche que puede alcanzar" + this.velocidadMaxima + " Km/h.");
    }

    @Override
    public void encenderMotor() {
        System.out.println("El motor del coche está encendido.");
    }

}
