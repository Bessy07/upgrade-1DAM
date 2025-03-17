package Transporte;

public class Barco extends Vehiculo implements ConMotor {
    
     public Barco(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
    @Override
    public void encenderMotor() {
        System.out.println("El motor del barco está encendido.");
    }
    @Override
    public void describir() {
        System.out.println("Soy un barco que navega a " + this.velocidadMaxima + " Km/h.");
    }

}
