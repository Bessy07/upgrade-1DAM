package 20252304;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscribirNumerosBinario {
    public static void main(String[] args) {
        String fichero = "src\\20252304\\numeros.dat";

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fichero))) {
            for (int i = 1; i < 1000; i
            ++) {
                out.writeInt(i);
            }
        } catch (IOException e) {
            System.err.println("Problemas con el fichero." + e.getMessage());
        }
    }
}
