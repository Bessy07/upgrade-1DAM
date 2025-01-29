package sesion20250109;

public class Inverso {
    //Imprimir números en orden inverso
 //Escribe una función recursiva que reciba un número ( n ) y lo imprima en orden descendente.
   // Ejemplo: Para ( n = 5 ), salida: 5, 4, 3, 2, 1.
    public static void main(String[] args) {
        imprimirInverso(5);
    }
    public static void imprimirInverso(int n){
        if (n<0) return;
        System.out.println(n);
        imprimirInverso(n-1);
    }.0
}
