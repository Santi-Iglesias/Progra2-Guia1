import java.util.Scanner;

public class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private double salario;
    double salarioAnual;
    double salarioAumentado;

    public Empleado(int dni, String nombre, String apellido, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public Empleado() {
    }

    public void calcularSalario() {
        salarioAnual = salario * 12;
        System.out.println("El salario anual es: " + salarioAnual);
    }

    public void aumentarSalario(Scanner scanner){
        System.out.println("Indique el porcentaje a aumentar el salario: ");
        Scanner entrada = new Scanner(System.in);
        salarioAumentado = (salario * entrada.nextInt()) /100;
        System.out.println("El salario aumentado es " + (salarioAumentado + salario));
        System.out.println("Salario anual con aumento: " + (salarioAumentado + salario ) * 12);

    }

    public String toString() {
        return "DNI: " + dni + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Salario: " + salario;
    }

}