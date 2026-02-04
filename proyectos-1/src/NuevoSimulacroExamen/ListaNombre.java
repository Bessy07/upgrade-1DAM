package NuevoSimulacroExamen;

public class ListaNombre {
    public static void main(String[] args) {
        Scannner scanerr = new scarner (Sistem.in);
        ArrayList<String> nombre = new ArrayList<string>();

        while (true){
            System.out.println("Introducir nombrte 'fin' al terminar");
            String nombre = new nextLine().trim();  // lee el nombre sin duplicados

            if (nombre.equalIgnorecase("fin")){ // salir si escribe fin
                break;
            }
             if (!nombre.contains(nombre)){ // no agrega duplicados
                nombre.add(nombre);
             }else{
                System.out.println("El nombre ya existe ignorar");
             }
             // buscar nombre
             System.out.println("buscar nombre");
             String buscarnombre = new nextLine().trim(); //lee nombre a buscar

             if (nombre.contains(buscarnombre)){
                System.out.println("nombre encontrado:" + buscarNombre);{

                }else{
                    System.out.println("nombre no encontrado");
                }
                scaner.closet();
                


        }


        
    }
    
}
