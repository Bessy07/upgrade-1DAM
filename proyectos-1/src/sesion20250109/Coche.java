package sesion20250109;

public class Coche {
    //Lo primero que solemos hacer es declarar los atributos de la clase.
    private String marca;
    private String modelo;
    private int velocidad;

    //Ahora vamos a crear el constructor de la clase. Esto es lo que de verdad nos va a permitir crear objetos de esta objetos.
    public Coche(String marca, String modelo) {// vamos a suponer que el coche siempre empieza a velocidad 0.
    this.marca = marca;
    this.modelo = modelo;
    this.velocidad = 0;
    }

    //Los getters nos permiten obtener el valor de un atributo de la clase.
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getVelocidad() {
        return velocidad;
    }
    
        //Los setters nos permiten modificar el valor en memoria de un atributo de un objeto.
        public void setMarca(String marca) {
            this.marca = marca;
        }
        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
        public void setVelocidad(int velocidad) {
            if (velocidad < 0) {
                System.out.println("La velocidad no puede ser negativa");
            } else {
                this.velocidad = velocidad;
            }
        }
    
        //Ahora vamos a crear un método que nos permita acelerar el coche.
        public void acelerar(int incemento) {
            if (incemento > 0) {
                velocidad += incemento;
                System.out.println("El coche ha acelerado a " + velocidad + " km/h");
            } else {
                System.out.println("El incremento de velocidad debe ser mayor que 0");
            }
        } // close the acelerar method
    
        /* reduce la velocidad del coche en una cantidad determinada
        * " bessy " es el nombre de la persona que hizo el cambio
         * @param decremento la cantidad de km/h a reducir (debe ser un número positivo)
         */
        public void frenar(int decremento) {
            if (decremento > 0 && velocidad - decremento >= 0) {
                velocidad -= decremento;
                System.out.println("El coche ahora va mas lento su velocidad actual es de  " + velocidad + " km/h");
            } else if (decremento > 0 && velocidad - decremento < 0) {
                System.out.println("El decremento de velocidad no puede ser mayor que la velocidad actual");
            } else {
                System.out.println("El decremento de velocidad debe ser un número positivo porque no puedo cambiar la velocidad ");
            }
        }

       public static void main(String[] args) {

            //Creamos un objeto de la clase Coche
            Coche coche1 = new Coche("Toyota", "Corolla");
    
            Object system;
            //Mostramos la información del coche
    
            System.out.println("El coche es un " + coche1.getMarca() + " " + coche1.getModelo() + " y va a " + coche1.getVelocidad() + " km/h");
            coche1.acelerar(50);
            System.out.println("El coche es un " + coche1.getMarca() + " " + coche1.getModelo() + " y va a " + coche1.getVelocidad() + " km/h");
        
    }
}
        