package sesion20250109;
/*
 * # Ejercicio: Clase Webcam📸
## Objetivo
Crear una clase `Webcam` que represente una cámara web con diversas propiedades y
comportamientos.
## Requisitos📄
### Atributos
La clase debe incluir los siguientes atributos:
1. **Resolución** (en píxeles, representada como una cadena en el formato "ancho👉
x alto", por ejemplo, "1920x1080").
2. **Frecuencia de cuadros por segundo (FPS)** (número entero).👉
3. **Estado de encendido/apagado** (booleano).👉
4. **Tamaño estimado del archivo de imagen generado (en MB, tipo `double`).**👉
### Métodos
1. Implementa un **constructor** que inicialice la resolución, FPS y establezca la
cámara como apagada por defecto.
2. Implementa los **métodos getters y setters** necesarios.
3. Implementa un método `encender()` que active la cámara.
4. Implementa un método `apagar()` que la desactive.
5. Implementa un método `tomarFoto()` que:
- Solo funcione si la cámara está encendida.
- Devuelva un mensaje indicando que la foto fue tomada con la resolución y el
tamaño estimado del archivo.
- Calcule el tamaño estimado del archivo de imagen usando la siguiente fórmula:
```
tamaño = (ancho * alto * FPS) / 1000000.0
```
Donde `ancho` y `alto` se obtienen de la resolución proporcionada en el
formato "ancho x alto".
### Prueba en el `main`📚
1. Crea una instancia de `Webcam` con una resolución de "1920x1080" y 30 FPS.
2. Intenta tomar una foto con la cámara apagada.
3. Enciende la cámara y toma una foto.
4. Apaga la cámara.
---
### Extras (Opcionales)✨
Si quieres practicar aún más, podrías agregar (aunque no cuente para nota):
- Un método para cambiar la resolución en tiempo de ejecución y recalcular el
tamaño de la foto.
- Un método para calcular el consumo de datos en una videollamada según la
resolución, tiempo en segundos y FPS.
¡Mucho ánimo! 🚀

 */

public class Webcam {
    private String resolucion;
    private Boolean encendido;
    private int fps;
    private double tamanio;

    //Ahora vamos a crear el constructor de la clase. Esto es lo que de verdad nos va a permitir crear objetos de esta objetos.
    public Webcam(String resolucion, int fps) {// vamos a suponer que el coche siempre empieza a velocidad 0.
    this.resolucion = resolucion;
    this.encendido = true;
    this.fps = fps;    
    }

    //Los getters nos permiten obtener el valor de un atributo de la clase.
    public String getResolucion() {
        return resolucion;
    }
    public Boolean getEncendido() {
        return encendido;
    }
    public int getFps() {
        return fps;
    }
    
    
        //Los setters nos permiten modificar el valor en memoria de un atributo de un objeto.
        public void setMarca(String resolucion) {
            this.resolucion = resolucion;
        }
        public void setModelo(Boolean encendido) {
            this.encendido = encendido;
        }
        public void setFps(int fps) {
            this.fps = fps;
        }
        
    
        //Implementación de métodos.
        // Método para encender la cámara
        public void encender() {
            this.encendido = true;
            System.out.println("La cámara está encendida");
        } 
        // Método para apagar la cámara
        public void apagar() {
            this.encendido = false;
            System.out.println("La cámara está apagada");
        } 
        // Método para tomar una foto. Si está encendida, calcula el tamaño de la foto y muestra un mensaje de lo contrario muestra un mensaje de que la cámara está apagada.
        //Para calcular el tamaño de la foto se utiliza la fórmula: tamaño = (ancho * alto * FPS) / 1000000.0. Donde ancho y alto los obtenemos de splittear la cadena resolución y pasar cada uno de los valores del array de String a Int con el método parseInt de la clase Integer.
        public void tomarFoto() {
            if (encendido) {
              tamanio = ((Integer.parseInt(resolucion.split("x")[0])) * (Integer.parseInt(resolucion.split("x")[1])) * fps) / 1000000.0;
              System.out.println("La foto fue tomada con una resolución de " + resolucion + " píxeles y un tamaño estimado de " + tamanio + " MB");
              
            } else {
                System.out.println("La cámara está apagada, no se puede tomar la foto");
            }
        }
        //Instanciamos la clase y probamos los métodos creados.
       public static void main(String[] args) {

            //Creamos un objeto de la clase Webcam con resolución 1920x1080 y 30 FPS
            Webcam camara = new Webcam("1920x1080", 30);  

            //Intentamos tomar una foto con la cámara apagada            
            camara.apagar();
            camara.tomarFoto();

            //Encendemos la cámara y tomamos una foto
            camara.encender();
            camara.tomarFoto();
            
            
            

            
        
    }
}
        


