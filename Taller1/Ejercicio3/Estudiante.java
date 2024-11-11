package Taller1;

public class Estudiante {
    String nombre;
    int edad;
    String curso;

//Un constructor por defecto que asigne valores genéricos.
    public Estudiante() { 
    this("Nombre Desconocido", 0);
    this.curso = "Curso Desconocido"; 
    }

//Un constructor que acepte como parámetros el nombre y la edad.
    public Estudiante(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
        this.curso="Matematicas";
        
    }

    //Un constructor que acepte todos los parámetros y utilice this() para llamar a otro constructor.
    public Estudiante(String nombre,int edad,String curso){
        this(nombre,edad);
        this.curso=curso;
    }

    @Override 
    public String toString() {
     return "Estudiante [Nombre=" + nombre + ", Edad=" + edad + ", Curso=" + curso + "]";
    }
}
