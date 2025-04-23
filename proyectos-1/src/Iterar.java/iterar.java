package Iterar.java;

public class iterar 

        public class ListaList {
            public static void main(String[] args) {
                // Crear una lista de alumnos
                ArrayList<String> miListaAlumnos = new ArrayList<>();
        
                // Insertar alumnos
                miListaAlumnos.add("Jose");
                miListaAlumnos.add("Ana");
                miListaAlumnos.add("Lourdes");
                miListaAlumnos.add("Raúl");
                miListaAlumnos.add("Fidel");
                miListaAlumnos.add("Arantxa");
        
                // Eliminar un alumno
                if (miListaAlumnos.remove("Jose")) {
                    System.out.println("Elemento eliminado correctamente");
                } else {
                    System.out.println("NO existe el alumno a eliminar en el ArrayList");
                }
        
                // Comprobar si existe un alumno en la lista
                if (miListaAlumnos.contains("Ana")) {
                    System.out.println("SÍ existe el alumno en el ArrayList");
                } else {
                    System.out.println("NO existe el alumno en el ArrayList");
                }
        
                // Número de alumnos del ArrayList
                System.out.println("Número de alumnos: " + miListaAlumnos.size());
            
    
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class IteratorColeccionSortForeach  {

    public static void main(String[] args) {
        // 1. Crea una lista de números enteros.
        ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
        // Es equivalente a:
        // ArrayList<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(5);
        listaEnteros.add(3);
        listaEnteros.add(9);
        listaEnteros.add(1);

        // 2. Imprime la lista utilizando la clase Iterator.
        System.out.println("Imprimiendo con la clase Iterator");
        Iterator<Integer> miListaIterator = listaEnteros.iterator();
        while (miListaIterator.hasNext()) {
            System.out.println(miListaIterator.next());
        }
        
        // 3. Ordena la lista con el método estático Collections.sort()
        Collections.sort(listaEnteros);

        // 4. Imprime la lista utilizando un bucle foreach.
        System.out.println("\nImprimiendo con el bucle foreach:");
        for (Integer i : listaEnteros) {
            System.out.println(i);
        }
    }
}