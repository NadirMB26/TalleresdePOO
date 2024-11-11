package Taller7.Ejercicio3;

public class PruebaStatic {
// Atributo no estático 
private int contador; 

// Método estático que intenta acceder al atributo no estático 
public static void incrementarContador() { 
    contador++; 
    // Error de compilación 
    } 
    // Método para mostrar el valor del contador 

    public void mostrarContador() { 
        System.out.println("Contador: " + contador); 
    } 
    public static void main(String[] args) {
         PruebaStatic prueba = new PruebaStatic(); prueba.mostrarContador();
          // Intentar llamar al método estático 
          incrementarContador(); // Error de compilación
     }
}
