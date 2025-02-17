package sesion20250109.sesion20250212;

public class empleado {
//quiero que todos los empleados tengan un nombre,un salaraio y un metdo que resume esta informacion
    protected String nombre;
    protected double salario;

    public empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    public void resumen(){
        System.out.println("El empleado: "+nombre+"tiene un Salario: "+salario+"€");
    }
}

class Gerente extends empleado{
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }
    @Override
    public void resumen(){
        System.out.println("El gerente: "+nombre+"del departamento: "+departamento+"tiete un salario de: "+departamento);
    }
}
class programador extends empleado{
    private String lenguaje;

    public programador(String nombre, double salario, String lenguaje) {
        super(nombre, salario);
        this.lenguaje = lenguaje;
    }
    @Override
    public void resumen(){
        System.out.println("El programador: "+nombre+"lenguaje: "+lenguaje+"y tiene un salario de: "+salario);
    }

    
}

public class Ejemplo1 {
    public static void main(String[] args) {
        Gerente Ana = new Gerente("Ana", 3000, "RRHH");
        programador Luis = new programador("Luis", 2000, "Java");
        Ana.resumen();
        Luis.resumen();
    }
}



