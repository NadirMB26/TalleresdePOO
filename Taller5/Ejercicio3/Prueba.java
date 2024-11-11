package Taller5.Ejercicio3;

public class Prueba {
    public static void main(String[] args) {
         Utilidades utilidades = new Utilidades();
          // Probar método sumar 
          double suma = utilidades.sumar(5, 3); 
          System.out.println("Suma de 5 y 3: " + suma); 
          // Probar método restar
           double resta = utilidades.restar(5, 3);
            System.out.println("Resta de 5 y 3: " + resta); 
            // Probar método multiplicar
             double multiplicacion = utilidades.multiplicar(5, 3);
              System.out.println("Multiplicación de 5 y 3: " + multiplicacion); 
              // Probar método dividir
               double division = utilidades.dividir(5, 3);
                System.out.println("División de 5 y 3: " + division); 
                // Probar división por cero 
                double divisionPorCero = utilidades.dividir(5, 0);
                 System.out.println("División de 5 por 0: " + divisionPorCero); }   
}
