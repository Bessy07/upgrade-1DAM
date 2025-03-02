package sesion202519;

class Autor  {
    private String nombre;
    private String nacionalidad;
    
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    public String getnombre(){
        return nombre;
    }
    public String getnacionalidad(){
        return nacionalidad;
    }
    public void resumen(){
        System.out.println("El autor: "+nombre+" es de: "+nacionalidad);
    }
}



class Libro {
    private String titulo;
    private Autor autor;
    private int paginas;
    
    
    public Libro(String titulo, Autor autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    public String gettitulo(){
        return titulo;
    }
    public Autor getautor(){
        return autor;
    }
    public int getpaginas(){
        return paginas;
    }
    public void resumen(){
        System.out.println("El libro: "+titulo+" de "+autor.getnombre()+" tiene"+paginas+ "paginas");
    }

}

public class Asociacion {
    public static void main(String[] args) {
     
        Autor autor1 = new Autor("Gabriel Garcia Marquez", "Colombia");
        Autor autor2 = new Autor("Mario Vargas Llosa", "Peru");

        Libro libro1 = new Libro("Cien años de soledad", autor1, 500);
        Libro libro2 = new Libro("La ciudad y los perros", autor2, 300);

        autor1.resumen();
        autor2.resumen();   
        libro1.resumen();
        libro2.resumen();
    }
}





