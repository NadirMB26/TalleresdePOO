package Taller8.Ejercicio4;

public class Derivada extends Base { 
    public void mostrarAtributoPrivado() {
    // Intento de acceso directo al atributo privado 
    // System.out.println(atributoPrivado); 
    // Esto causará un error de compilación 
    // Acceso a través del método getter 
    System.out.println(getAtributoPrivado()); 
     } 
}
