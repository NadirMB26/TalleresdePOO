package Taller2.Ejemplos;

public class Estudiante {
    private String nombre;
    private int edad;
    private int nota;

    public Estudiante(){
        this.nombre="vacio";
        this.edad=0;
        this.nota=0;
    }

    public Estudiante(String nombre, int edad, int nota){
        this.nombre=nombre;
        this.edad=edad;
        this.nota=nota;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        if (edad > 0) {
             this.edad = edad; 
            } else {
         System.out.println("Edad debe ser mayor que 0."); }
    }

    public int getNota(){
        return nota;
    }

    public void setNota(int nota){
        if (nota >= 0 && nota <= 10) { 
            this.nota = nota;
         } else { 
            System.out.println("Nota Promedio debe estar entre 0 y 10.");
         }
    }
}
