package Simulacro_examen;
import java.util.ArrayList;
import java.util.Scanner;

public class Nombres{
   public static void main(String[] args) {
    Scanner scann = new Scanner(System.in);             //Indicamos al scaner que metemos datos por consola
    ArrayList<String> nombres= new ArrayList<>();       //Lista para almacenar nombres sin duplicar
    

     boolean continuar = true; // Indicamos al booleano para usarlo en la condicion del bucle
    while (continuar){ // bucle indinito
     System.out.println("Introduce nombre (escribe'fin' para terminar):");//
      String nombre= scann.nexLine().trim();      //trim es para eliminar espacio

        if(nombre.equalsIgnoreCase("fin"));{       // si el usuario escribe "fin" sin importar mayusculas se termina el bucle
         continuar = false
    }
     //verificar si el nombre introducido se duplica
    if(!nombres.contains(nombre)){       // Si el nombre no esta dentro de la lista
        nombres.add(nombre);           //Añade el nombre a la lista
    }
    else{
        sistem.out.printl("El nombre ya existese ignora");     // opcional avisar al usuario que el nombre ya esta en la lista
        
    }


//Mostrar al usuario todos los nombres que hay en la lista
  System.out.println("Lista de nombres sin duplicar");
  for (String s:nombres) {
    System.out.printl(" - " + s);
  }

  Scann.close();

    }

   } 
    
}




