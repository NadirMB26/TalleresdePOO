package Taller8.Ejercicio3;

public class Empleado { 
// Atributos 
private String nombre; 
private double salario;

// Constructor 
public Empleado(String nombre, double salario) { 
    this.nombre = nombre; this.salario = salario; 
} 
// Método para mostrar los detalles del empleado 
public void mostrarDetalles() {
     System.out.println("Nombre: " + nombre); 
     System.out.println("Salario: " + salario);
} 

// Métodos getters 
public String getNombre() { 
    return nombre; 
} 
    
public double getSalario() {
     return salario; 

    } 
}
