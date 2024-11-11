package Taller10.Ejercicio3;

public class Derivada extends Base { 
    // Sobrescritura del método con @Override 
    @Override 
    public void mostrarMensaje() { 
        System.out.println("Mensaje desde la clase derivada."); 
    } public static void main(String[] args) {
         Derivada derivada = new Derivada();
         derivada.mostrarMensaje(); 
        } 
    }
