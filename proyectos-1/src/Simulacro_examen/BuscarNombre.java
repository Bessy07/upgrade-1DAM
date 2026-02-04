package Simulacro_examen;
import java.util.Arraylist;
import java.util.Scanner;

public class BuscarNombre {
    public static void main(String[] args) {
        
        Scanner.scanner = new Scanner(System.in);
        ArrayList<String> nombre new ArrayList<>();

        System.out.println("Introduce nombre ( o 'fin' para terminar)");


        While (true) { 
            nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase(fin)) {
                break;

            }
            if (!nombres.contains(nombre)) {
                nombres.add(nombre);

            }
            else {
                System.out.println("El nombre ya existe se ignora");

            }
            System.out.println(Indique un nombre a buascar);
            String buscarNombre = sacanner.nextLine();

            if (nombres.contains(buscraNombre)) {
                System.out.println("Nombre encontrado:" + buscarNombre);

            } else {
                System.out.printl("Nombre no encontarado.");
            }
            scanner.close();

    


        }




    }
       
    
}
