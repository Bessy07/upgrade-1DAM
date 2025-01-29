package sesion20250109;

public class Factorial {
    /*
     * Factorial
     * Escribe una funcion recursiva que calcule el factorial de un numero ( n )((n!)).
     * Ejemplo:(5!= 5*4*3*2*1 = 120)
     * 
     */
public static void main(String[] args) {
    int numero = 5;
    System.out.println("El factorial de "+numero+" es: "+factorial(numero));
    
}
public static int factorial(int n){
    if (n==0) {
        return 1;
    }
    return n*factorial(n-1);
    
}
}
