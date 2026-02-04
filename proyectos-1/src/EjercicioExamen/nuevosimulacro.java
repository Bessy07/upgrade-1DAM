package EjercicioExamen;
import java.util.ArrayList;
import java.util.Scanner;

public class nuevosimulacro {
public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    ArrayList<String> nombres = new ArrayList<>();
    boolean flag = true;
    while (flag==true) {    
        System.out.print("Introduce un nombre (o fin para terminarlo):");
        String nombre = scanner.nextLine();            
            if(!nombre.equals("fin")) {  
                nombres.add(nombre); 
                flag = true;
            } else {
                flag = false;
            }                   
    }
    System.out.print("Introduce un nombre a buscar:");
    String nombreBuscar = scanner.nextLine();           
    if(nombres.contains(nombreBuscar)) {
        System.out.println("Nombre encontrado: " + nombreBuscar);
    } else {
        System.out.println("Nombre no encontrado.");
    }
    scanner.close(); 
}    
}
