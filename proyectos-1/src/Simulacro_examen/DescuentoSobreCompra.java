package Simulacro_examen;

import EjercicioExamen.DescuentoSobrePrecio;

public class DescuentoSobreCompra {
    //Atributos de la clase
    private String nombreproducto;
    private double preciooriginal;
    private String descuento;

    //Constructor de la calse

    public DescuentoSobreCompra(String nombreproductoIntroducido,double precioorininalIntroducido, String descuentoIntroducido) {
        this.nombreproducto = nombreproductoIntroducido;
        this.precioOriginal = precioorininalIntroducido;
        this.descuento =  descuentoIntroducido;
        }

        // resto del metdodo
        public double precioFinalConDescuento() {
            double precioFinal = precioOriginal - (precioOriginal * descuento / 100);
            return precioFinal;

        }

        //mostrar detalles

        public void mostrarDetalles(){
            System.out.println("Producto:" + nombreproducto);
            System.out.println("Precio original:" + precioOriginal + "€");
            System.out.println("Descuento:" + descuento + "%");
            System.out.print("Precio Final con decuento:" + precioFinalConDescuento() + "€");


        }

        //Metodo principal

        public static void main(String[] args) {
            //crear un objeto descuento sobre precio
            DescuentoSobrePrecio producto = new DescuentoSobrePrecio ("Portatil", 1500,20);
            //Metrodo mostrar detalles
            producto.mostrarDetalles();
            
        }




    
}
