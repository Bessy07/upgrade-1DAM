package EjercicioExamen;

public class DescuentoSobrePrecio {
    //Atributos o variables de la clase
 private String nombreProducto;
 private double precioOriginal;
 private double descuento;
 
 //Constructor que inicialice los productos
 public Descuento sobrePrecio(String nombreProducto, double precioOriginal, double descuento);
 this.nombreProducto= nombreProducto;  
 this.precioOriginal= precioOriginal;
 this.decuento= descuento;

 //Metodo para calculcar el precio con el descuento
 public double precioFinalconDescuento() {
    double precioFinal = precioOriginal - (precioOriginal * descuento /100);
    return preciofinal;
     
 }

}

//Metrodo para mostrar detalles
public void mostrarDetalles() {
    System.out.println("Nombre del producto: " + nombreProducto);
    System.out.println("Precio original: $" + precioOriginal);
    System.out.println("Descuento:" +descuento +"%");
    System.out.println("Precio final con descuento:$" + precioFinalconDescuento());
}

//Metodo main
public static void main(String[] args) {
    DescuentoSobrePrecio producto = new DescuentoSobrePrecio("Ordenador Portatil", 1500, 10);
    producto.mostrarDetalles();

}
