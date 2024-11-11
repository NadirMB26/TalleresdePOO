package Taller8.Ejercicio3;

public class PruebaEmpleado {
     public static void main(String[] args) { 
        // Crear una instancia de Empleado 
        Empleado empleado = new Empleado("Juan Pérez", 2500.00);
         empleado.mostrarDetalles(); System.out.println("-------------------------");
          // Crear una instancia de Gerente
           Gerente gerente = new Gerente("Ana López", 3500.00, "Ventas"); 
           gerente.mostrarDetalles();
        }
    }