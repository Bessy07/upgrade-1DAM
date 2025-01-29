package sesion20250109;

public class InvertirPalabras {
   // nvertir una cadena
   // Escribe una función recursiva que invierta una cadena de texto.
   // Ejemplo: invertir("recursivo") → "ovisrucer".
}
public static void main(String[] args) {
    System.out.println(invertir("roca"));
   
    public static String invertir(String palabra){
        if (palabra.isEmpty()) return palabra;
        system.out.println(" por ahora tengo esto: " +palabra.substring(1)+"/"+palabra.charAt(0));
        return invertir(palabra.substring(1)) + palabra.charAt(0);
    }


}
