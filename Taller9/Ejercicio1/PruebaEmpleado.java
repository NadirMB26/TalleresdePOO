package Taller9.Ejercicio1;

public class PruebaEmpleado {
    public static void main(String[] args) { 
        // Crear una instancia de Persona 
        Persona persona = new Persona("Laura", 28);
         persona.mostrarDetalles(); System.out.println("-------------------------"); 
         // Crear una instancia de Empleado 
         Empleado empleado = new Empleado("Carlos", 35, "Recursos Humanos");
          empleado.mostrarDetalles(); 
        }  
}
