package Taller9.Ejercicio1;

public class Empleado extends Persona {
    // Atributo adicional 
    private String departamento; 

    // Constructor 
    public Empleado(String nombre, int edad, String departamento) { 
        super(nombre, edad); this.departamento = departamento;
     } 
     // Método para obtener el departamento 

     public String getDepartamento() { 
        return departamento; 
    } 
    // Método para establecer el departamento 

    public void setDepartamento(String departamento) {
    this.departamento = departamento; } 
    // Método sobrescrito para mostrar los detalles del empleado 

    @Override
    public void mostrarDetalles() { 
    super.mostrarDetalles(); 
    System.out.println("Departamento: " + departamento); 
    }
}
