package sesion20250109;

public class ResolverTorre {
    public static void main(String[] args) {
        resolverTorren(n;3, origen:'A', auxiliar: 'B', destino:'C');
    }
    public static void resolverTorre(int n, char origen, char auxiliar, char destino){
        if (n==1){
            System.out.println("Mover disco 1 de torre " + origen + " a torre " + destino);
            return;
        }
        resolverTorre(n-1, origen, destino, auxiliar);
        System.out.println("Mover disco " + n + " de torre " + origen + " a torre " + destino);
        resolverTorre(n-1, auxiliar, origen, destino);
    }

}
