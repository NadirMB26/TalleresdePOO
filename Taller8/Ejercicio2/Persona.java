package Taller8.Ejercicio2;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    } 

    public int getEdad() { 
        return edad; 
    } 
    
    public void setEdad(int edad) {
         this.edad = edad;
    } 

    // Método para mostrar la información de la persona 
    public void mostrarInformacion() { 
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad); 
    }
}