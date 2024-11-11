package Taller2;

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

    public void setNombre(){
        this.nombre=nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        if(edad>=0){
            this.edad=edad;
        }
    }
}