package pkg20250402;
import java.util.*;

public class CompararCostesListMap {
    //Aqui creare los difrerentes metodos.
    public static void analizarInsercionList(int elementos)
{
    System.out.println("\n--- Análisis de inserción en List ---");

    List<Integer> arrayList = new ArrayList<>();
    long tiempoInicial = System.currentTimeMillis();
    for (int i = 0; i < elementos; i++) {
        arrayList.add(i);
    }
    long tiempoFinal = System.currentTimeMillis();
    System.out.println("Tiempo empleado por ArrayList: " + (tiempoFinal - tiempoInicial) + " ms");

    List<Integer> linkedList = new LinkedList<>();
    tiempoInicial = System.currentTimeMillis();
    for (int i = 0; i < elementos; i++) {
        linkedList.add(i);
    }
    tiempoFinal = System.currentTimeMillis();
    System.out.println("Tiempo empleado por LinkedList: " + (tiempoFinal - tiempoInicial) + " ms");


}

// Metodo para comprobar el coste de insercion en un diccionario(Map)
public static void analizarInsercionMap(int elementos) {
   
    System.out.println("\n--- Análisis de inserción en Map ---");

    Map<Integer, Integer> hashMap = new HashMap<>();
    long tiempoInicial = System.currentTimeMillis();
    for (int i = 0; i < elementos; i++) {
        hashMap.put(i, i);
    }
    long tiempoFinal = System.currentTimeMillis();
    System.out.println("Tiempo empleado por HashMap: " + (tiempoFinal - tiempoInicial) + " ms");

    Map<Integer, Integer> treeMap = new TreeMap<>();
    tiempoInicial = System.currentTimeMillis();
    for (int i = 0; i < elementos; i++) {
        treeMap.put(i, i);
    }
    tiempoFinal = System.currentTimeMillis();
    System.out.println("Tiempo empleado por TreeMap: " + (tiempoFinal - tiempoInicial) + " ms");

    Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
    tiempoInicial = System.currentTimeMillis();
    for (int i = 0; i < elementos; i++) {
        linkedHashMap.put(i, i);
    }
    tiempoFinal = System.currentTimeMillis();
    System.out.println("Tiempo empleado por LinkedHashMap: " + (tiempoFinal - tiempoInicial) + " ms");
}

    
public static void main(String[] args) {
    int elementos = 1_000_000; // Número de elementos a insertar
    System.out.println("...Analizando inserción en set...");
    Set<Integer> hashSet = new HashSet<Integer>();
    long tiempoInicial = System.currentTimeMillis();
    for (int i = 0; i < 1_000_000; i++) {
        hashSet.add(i);
    }
    long tiempoFinal = System.currentTimeMillis();
    System.out.println("Tiempo empleado por HashSet: " + (tiempoFinal - tiempoInicial) + " ms");

    Set<Integer> treeSet = new TreeSet<Integer>();
    tiempoInicial = System.currentTimeMillis();
    for (int i = 0; i < 1_000_000; i++) {
        treeSet.add(i);
    }
    tiempoFinal = System.currentTimeMillis();
    System.out.println("Tiempo empleado por TreeSet: " + (tiempoFinal - tiempoInicial) + " ms");

    Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
    tiempoInicial = System.currentTimeMillis();
    for (int i = 0; i < 1_000_000; i++) {
        linkedHashSet.add(i);
    }
    tiempoFinal = System.currentTimeMillis();
    System.out.println("Tiempo empleado por LinkedHashSet: " + (tiempoFinal - tiempoInicial) + " ms");
}

    //Llamamos a los 2 metodos de clase
    analizarInsercionList(elementos);
    analizarInsercionMap(elementos);
}
}




