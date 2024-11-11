package Taller8.Ejercicio3;

public class Gerente extends Empleado {
// Atributo adicional 
private String departamento; 

// Constructor 
public Gerente(String nombre, double salario, String departamento) {
     super(nombre, salario); this.departamento = departamento; 
} 

// Método sobrescrito para mostrar los detalles del gerente 
@Override public void mostrarDetalles() { 
    super.mostrarDetalles(); System.out.println("Departamento: " + departamento); 
} 
// Método getter 
public String getDepartamento() {
     return departamento; 
    }
 }
