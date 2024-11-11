package Taller5.Ejercicio3;

public class Utilidades {
     // Método para sumar
         public double sumar(double a, double b) { return a + b; }
          // Método para restar 
          public double restar(double a, double b) { return a - b; } 
          // Método para multiplicar 
          public double multiplicar(double a, double b) { return a * b; } 
          // Método para dividir 
          public double dividir(double a, double b) {
             if (b != 0) {
                 return a / b; 
                } else { 
                    System.out.println("Error: División por cero."); 
                    return Double.NaN; 
                    // Devuelve NaN (Not a Number) en caso de división por cero 
                    }  
                } 
            
}
