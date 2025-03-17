package Transporte;

public class Bicicleta extends Vehiculo implements SinMotor {

    public Bicicleta(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void usarFuerzaHumana() {
        System.out.println("Usando fuerza humana para moverse.");
    }

    @Override
    public void describir() {
        System.out.println("Soy una bicicleta que puede alcanzar" + this.velocidadMaxima + " Km/h.");
    }    

}
