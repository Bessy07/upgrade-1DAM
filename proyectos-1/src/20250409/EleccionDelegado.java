import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

package 20250409;

public class EleccionDelegado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Decalramos las variables que usaremos en el diccionario
        String nombre:"";
        int votos = 0;
        //Diccionario para almacenar los votos
        TreeMap<String, Integer> votaciones = new TreeMap<String, Integer>();
        //Bucle infinito para introducir datos
        while(true){
            //Pedimos el nombre del estudiantes
            System.out.print("Introduce voto (o 'fin' para terminar): ");
            nombre = scanner.nextLine();
            //Si hemos introducido "fin" salimos del bucle while (el programa sigue en ejecicion)
            if (nombre.equals(anObjeto:"fin")){
                break;

            }
            else{
                //Si el estudiante ya habia sido votado antes, lo añadimos con 1 voto
                if (!votaciones.containsKey(nombre)){
                    votos = votaciones.get(nombre);
                    votaciones.put(nombre, votos + 1);
                }else{
                    votos = 1;
                    votaciones.put(nombre, votos);
                    
                }
            }

        }
        //Imprimimos los resultados recorriendo el diccionario con un bucle for-each(con entrySet())
        System.err.println(x:"\nResultado con bucle for-each:");
        for (Map.Entry<String,Integer> tupla : votaciones.entrySet()){
            
            nombre = tupla.getKey();
            votos = tupla.getValue();
            System.out.println("Nombre: +":" + votos + "votos.);
        }
    
    //Imprimimos los resultados recorriendo el diccionario con un Iterator (y entrySet)
    System.err.println(x:"\nResultado con Iterator:");
    set Map.Entry<String,Integer>> set = votaciones.entryse();
    Iterator<Map.Entry<String,Integer>> iterator = set.iterator();
        nombre = tupla2.getKey();
        votos = tupla2.getValue();
        System.out.println("Nombre: +":" + votos + "votos.);

        //cerramos el scanner
        scanner.close();
    }
    }
    

