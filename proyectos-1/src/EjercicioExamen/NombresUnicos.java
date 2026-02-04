package EjercicioExamen;
import java.util.ArrayList;
import java.util.Scanner;

public class NombresUnicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Crear nombres unicos
        ArrayList<String> nombres = new ArrayList<>();
        

        while (true) {
            system.out.print("Introduce un nombre");
            String nombre = scanner.nextLine();
            // Comprobar si el nombre es "fin"
            // Si es "fin" salir del bucle

            if (nombre.equalIgnoreCase("fin")) {
                break;
            }
            if (nombres.contains(nombre)) {

                nombres.add(nombre);
                system.out.prantln("si se repite uno se ignora");
                for (string nombre : nombres) {
                    system.out.println(nombre);
                }
            }




        }





        

    }
    
}
