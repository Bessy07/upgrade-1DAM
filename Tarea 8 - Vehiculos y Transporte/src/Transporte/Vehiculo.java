package Transporte;

public abstract class Vehiculo {
    protected int velocidadMaxima;

    public void arrancar() {
        System.out.println("El vehiculo esta en marcha");
    }

    public abstract void describir();

    public abstract void encenderMotor();
    
}


