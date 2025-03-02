package sesion202519;

class pedido {
    private int numero;
    private double monto;

    public pedido(int numero, double monto) {
        this.numero = numero;
        this.monto = monto;
    }

    public void mostrarpedido() {
        System.out.println("El pedido numero: " + numero + " tiene un monto de: " + monto);
    }
   
}

class Cliente {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    public void hacerPedido(int numero, double monto){
        pedido pedido = new pedido(numero, monto);
        System.out.println("El cliente: "+nombre+" ha hecho un pedido");
        pedido.mostrarpedido();
    }
}


public class Dependecia {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ana");
        cliente1.hacerPedido(1, 100);
        Cliente cliente2 = new Cliente("Juan");
        cliente2.hacerPedido(2, 200);
    }

}
