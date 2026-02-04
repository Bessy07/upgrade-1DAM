package Simulacro_examen;

public class DescuentoSobrePrecio {
    //Atributos de la clase

    private String nombreProducto;
    private double precioOrigina;
    private double descuento;

    //Constructor de la clase
    public DescuentoSobrePrecio(String nombreProductoIntroducido, double precioOriginaIntroducido, double descuentoIntroducido) {
         this.nombreProducto =  nombreProductoIntroducido;
         this.precioOriginal = precioOriginaIntroducido;
         this.descuento = descuentoIntroducido;
    }
         //Metodo
         
         public double precioFinalConDescuento(){
            double precioFinal = precioOriginal - (precioOriginal * descuento / 100);
         }

            public void mostrarDetalles(){
                System.out.println("Producto:" + nombreProducto);
                System.out.println("Precio Originla:" + precioOriginal + "€");
                System.out.println("Descuento:" + descuento + "%");
                System.out.println("Precio con descuento:" + precioFinalConDescuento() + "€");
            }

            //Metrodo Principal

            public static void main(String [] args) {
                DescuentoSobrePrecio producto = new DescuentoSobrePrecio("Portatil", 1500,20);
                producto.mostrarDetalles();
                
            }
         }



    

   

    

