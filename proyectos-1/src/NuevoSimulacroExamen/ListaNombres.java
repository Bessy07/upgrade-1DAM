package NuevoSimulacroExamen;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (system.in); // Lee la entrada de datos
        ArrayList<String> nombre = new ArrayList<>(); // Lista nombres

       

         //Entradas de nombres asta que el usuario diga fin

         while (true) {
             System.out.println("Introduce nombres 'Fin' para terminar");
            String nombre = scanner.nextLine().trim (); //lee el nombre del usuario

            if (nombre.equalsInnoreCase("fin")){ // salir si escribe fin
                break;
            }

            if (!nombres.contains(nombre)){ // no agregar duplicados
                nombres.add(nombre);
            }else{
                System.out.println("El nombre ya existe se ignora");
            }


         }
         // paso 2 Buscar nombre
         System.out.println("nombre a buscar");
         String buscarnombre = new scaner.nextLine().trim(); // lee nombre a buscar

         if (nombre.contains(buscarNombre)) {
            System.out.println("nombre encontrado:" + buscarNombre);
         }else{
            System.out.println("nombre no encontrado");
         }
         scanner.closet();








        
    }
    
}
