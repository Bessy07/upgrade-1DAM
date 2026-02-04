package EjercicioExamen;

import java.util.ArrayList;
import java.util.Scanner;

public class SimulacroExamen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Abrimos scanner aquí
        ArrayList<String> nombres = new ArrayList<>();
        String nombre = "";

        // Paso 1: Introducción de nombres
        while (true) {
            System.out.print("Introduce un nombre (o 'fin' para terminar): ");
            nombre = scanner.nextLine().trim();  // Leer nombre del usuario

            if (nombre.equalsIgnoreCase("fin")) {  // Salir si escribe "fin"
                break;
            }

            if (!nombres.contains(nombre)) {  // No agregar duplicados
                nombres.add(nombre);
            } else {
                System.out.println("El nombre ya existe, se ignora.");
            }
        }

        // Paso 2: Buscar nombre
        System.out.print("Indique un nombre a buscar: ");
        String buscarNombre = scanner.nextLine().trim();  // Leer nombre a buscar

        if (nombres.contains(buscarNombre)) {
            System.out.println("Nombre encontrado: " + buscarNombre);
        } else {
            System.out.println("Nombre no encontrado.");
        }

        // Cerrar el scanner solo después de usarlo completamente
        scanner.close();  
    }
}
