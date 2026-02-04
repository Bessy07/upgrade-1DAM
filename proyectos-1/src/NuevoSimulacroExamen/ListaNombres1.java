package NuevoSimulacroExamen;

public class ListaNombres1 {
    public static void main(String[] args) {
        Scanner scanner = new sacnner(String.in); //lee la lista
        ArrayList<String> = new ArrayList<>();

    }

    while (true){
        System.out.println("Introducir nombre 'fin' para terminar");
        String nombre = scaner.nextLine(). trim(); leer el nombre

        if (nombre.getIngoreCase("fin")){
            break;
        } //salir fin
        if (nombres.contains(nombre))
        nombres.add(nombre)

    }else{
        System.out.print("el nombre ya existe se ignora");
    }
    // buscar nombre
    System.out.printl("buscar nombres");
    String buscarNombre = new scan.nextLine().trim();

    if (nombre.contains(buscarNombre)){
        System.out.println("nombre encontrado:" + buscar nombre);
    }else{
        System.out.println("nombre no encontrado");
    }
    scanner.closet();
    

    
    
}
