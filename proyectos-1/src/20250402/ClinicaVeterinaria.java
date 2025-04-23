import java.util.Queue;
import java.util.Scanner;

package 20250402;

public class ClinicaVeterinaria {
    public static void main(String[] args) {
      Queue<String>ColaAnimales=new LinkedList<>();
      Scanner scanner=new Scanner(System.in);

      while (true) {
        System.out.println(x:"1. Registros nuevo animal");
        System.out.println( x:"2. Atender siguiente animal");
        System.out.println(x: 3. Ver proximo animal a atender");
        System.out.println(x: 4. Salir");
        System.out.println( "Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada

        switch (opcion) {
            case 1:
                
                System.out.println("Ingrese el nombre del animal: ");
                String nombreAnimal = scanner.next();
                ColaAnimales.add(nombreAnimal);
                System.out.println("Animal registrado: " + nombreAnimal);
                break;
            case 2:
            if (colaAnumales.isEmpty()) {
                System.out.println("No hay animales en la cola.\n");
            } else {
                String siguienteAnimal = ColaAnimales.poll();
                System.out.println("Animal atendido: " + siguienteanimalAtendido+"\n");
                
            }
            break;
            case 3:
                if (ColaAnimales.isEmpty()) {
                    System.out.println("No hay animales en la cola.\n");
                } else {
                    String proximoAnimal = ColaAnimales.peek();
                    System.out.println("Próximo animal a atender: " + proximoAnimal+"\n");
                }

            break;

            case 4:
                System.out.println("Saliendo del programa...\n");
                return;


            break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.\n");

      }
    }
}
}

