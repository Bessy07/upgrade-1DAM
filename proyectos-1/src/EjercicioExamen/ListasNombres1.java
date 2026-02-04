package EjercicioExamen;

import java.util.ArrayList;
import java.util.Scanner;

public class ListasNombres1 {
    public static void main(String[]args) {
        Scanner scanner = new Scanerr (System.in);
        ArrayList<String> nombres = new ArrayList<>();
        String nombre= "";
        /*
        While (true) {
            System.out.println("Introduce nombres unicos ('fin' para salir):");
            String nombre = scanner.nextLine();


            if (nombre.equalsIgnoreCase(Fin)) {
                break;

            }
            if (nombres.contains)
              } */
        while (nombre!= "fin") { 
            String nombre = scanner.nextLine();
            System.out.println("Introduce nombres unicos ('fin' para salir):");      

            }
            if (!nombres.contains(nombre)) {
                nombres.add(nombre);
              }else{
                System.out.println("El nombre ya existe. Por favor, introduce un nombre diferente.");
              }
    }
    
}
