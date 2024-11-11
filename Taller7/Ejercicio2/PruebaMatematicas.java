package Taller7.Ejercicio2;

public class PruebaMatematicas { 
    public static void main(String[] args) {
         // Probar método sumar 
         double suma = Matematicas.sumar(10, 5);
          System.out.println("Suma de 10 y 5: " + suma);
           // Probar método restar 
           double resta = Matematicas.restar(10, 5);
            System.out.println("Resta de 10 y 5: " + resta); 
            // Probar método multiplicar 
            double multiplicacion = Matematicas.multiplicar(10, 5); 
            System.out.println("Multiplicación de 10 y 5: " + multiplicacion); 
            // Probar método dividir 
            double division = Matematicas.dividir(10, 5); 
            System.out.println("División de 10 y 5: " + division);
             // Probar división por cero 
             double divisionPorCero = Matematicas.dividir(10, 0); 
             System.out.println("División de 10 por 0: " + divisionPorCero); } }
