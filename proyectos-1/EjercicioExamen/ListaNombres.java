package EjercicioExamen;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ArrayList<String> nombres = new ArrayList<>();

        while (true) {
            System.out.print("Introduce un nombre (o fin para terminarlo):");
            String nombre = scanner.nextLine();

            if (nombre.equalsIgnoreCase(fin)) {
                break;

                if (nombres.contains(nombre)) {
                    nombres.add(nombre);
                    else {
                        System.out.println("El nombre ya existe, se ignora.");
                    }
                   
                }
                System.out.println("Lista de nombres sin duplicados:");
                for (String nombre : nombres) {
                    System.out.println(nombre);
                }

                scanner.close();

            }
        }


    }
    
}
