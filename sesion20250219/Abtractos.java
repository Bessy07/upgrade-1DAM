package sesion20250219;


abstract class empleado {
    //quiero que todos los empleados tengan un nombre,un salaraio y un metdo que resume esta informacion
        protected String nombre;
        protected double salario;
    
        public empleado(String nombre, double salario) {
            this.nombre = nombre;
            this.salario = salario;
        }
        public abstract void resumen();
    }

public class Abtractos {

}
