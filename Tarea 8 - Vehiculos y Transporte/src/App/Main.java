package App;

import Transporte.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Vehiculo coche = new Coche (180);
        coche.arrancar(); 
        coche.encenderMotor(); 
        coche.describir();
        
        Bicicleta bicicleta = new Bicicleta(30); 
        bicicleta.arrancar(); 
        bicicleta.usarFuerzaHumana();
        bicicleta.describir();

        Barco barco = new Barco(50); 
        barco.arrancar();
        barco.encenderMotor();
        barco.describir();

        Avion avion = new Avion(900);
        avion.arrancar();
        avion.encenderMotor();
        avion.describir();

        
    }
}
