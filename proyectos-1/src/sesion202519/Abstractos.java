package sesion202519;

abstract class empleado {
    
        //quiero que todos los empleados tengan un nombre,un salaraio y un metdo que resume esta informacion
            protected String nombre;
            protected double salario;
        
            public empleado(String nombre, double salario) {
                this.nombre = nombre;
                this.salario = salario;
            }
            public String getnombre(){
                return nombre;
            }
            public double getsalario(){
                return salario;
            }
            public abstract void resumen();

}

class Gerente extends empleado{
    private String departamento;
    
        public Gerente(String nombre, double salario, String departamento) {
            super(nombre, salario);
            this.departamento = departamento;
        }

        public String getdepartamento(){
            return departamento;
        }
        @Override
        public void resumen(){
            System.out.println("El gerente: "+nombre+"cobra: "+salario+"como jefe de departamento: "+departamento);
        }
    }
    class programador extends empleado{
        private String lenguaje;
    
        public programador(String nombre, double salario, String lenguaje) {
            super(nombre, salario);
            this.lenguaje = lenguaje;

        }
        public String getlenguaje(){
            return lenguaje;
        }
        @Override
        public void resumen(){
            System.out.println("El programador: "+nombre+"cobra "+salario+"por programar con "+lenguaje);
        }
    
        
    }

    public class Abstractos {
        public static void main(String[] args) {
            Gerente Ana = new Gerente("Ana", 3000, "RRHH");
            programador Luis = new programador("Luis", 2000, "Java");
            Ana.resumen();
            Luis.resumen();
        }
    }




