package Taller3.Ejercicio3;

public class Persona {
    private String nombre;
    int edad;

    public Persona(String nombre, int edad) { 
        this.nombre = nombre; 
        this.edad = edad; 
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    @Override
     public String toString() { 
        return "Persona [Nombre=" + nombre + ", Edad=" + edad + "]";
     }
}
