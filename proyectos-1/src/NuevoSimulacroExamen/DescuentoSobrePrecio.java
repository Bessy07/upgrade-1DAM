package NuevoSimulacroExamen;

public class DescuentoSobrePrecio {
    //Atributos
    private String nombreProducto;
    private double precioOriginal;
    private double descuento;

    //Construsctor
    public DescuentoSobrePrecio (String nombreproductoNuevo, double precioOriginalNuevo, doble descuentoNuevo){
        this.nombreProducto =  nombreproductoNuevo;
        this.precioOriginal =  precioOriginalNuevo;
        this.descuento = descuentoNuevo;

    }

    // nuevo metodo
    public double precioFinalConDescuento() {; //que calcule y devuelva el precio con el descuento aplicado.
     double precioFinal = precioOriginal - (precioOriginal * descuento / 100);
     return preciofinal;
    }

    //mostrar detalles

    public void mostrarDetalles() {
        Sistem.out.printl("Nombre Producto:" + nombreProducto);
        Sistem.out.printl("Precio Orininal:" + precioOriginal + "€");
        Sistem.out.printl("Porcentaje de descuento:" + descuento + "%");
        Sistem.out,printl("Precio final con descuento:" + precioFinalConDescuento + "%");

    }
     // Main
     public static void main(String[] args) {
        DescuentSobrePrecio coche = new DescuentoSobrePrecio("Rojo",1500,20)
        coche.mostrarDeatlle();
        
     }
}


    
}
