package Taller5.Ejercicio1;

public class Empleado {
    public String nombre;
    protected double salario;

    public Empleado(String nombre, double salario){
        this.nombre=nombre;
        this.salario=salario;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario=salario;
    }
}
