package Taller8.Ejercicio2;

public class Estudiante extends Persona {
    private String matricula;

    public Estudiante(String matricula,String nombre,int edad){
        super(nombre,edad);
        this.matricula=matricula;
    }

    // Método getter y setter para matricula 
    public String getMatricula() { 
        return matricula;
     } 
     
     public void setMatricula(String matricula) { 
        this.matricula = matricula;
     }
      // Método sobrescrito para mostrar la información del estudiante
       @Override 
       public void mostrarInformacion() { 
        super.mostrarInformacion(); 
        System.out.println("Matrícula: " + matricula); 
    }
}
