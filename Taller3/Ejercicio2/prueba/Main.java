package Taller3.Ejercicio2.prueba;
import Vehiculos.Moto;

public class Main {
    public static void main(String[] args) { 
        Moto miMoto = new Moto("Deportiva"); 
        // Intentar acceder directamente a la propiedad 'tipo' desde aquí causará un error de compilación //
         miMoto.tipo = "Nueva Tipo"; 
         // Esto dará un error porque no es accesible fuera del paquete o sin herencia // Pero puedes acceder a través de los métodos públicos
          miMoto.mostrarDetalles(); 
          // También podrías usar los métodos get y set 
          miMoto.setTipo("Nueva Deportiva"); 
          System.out.println("Tipo de vehículo actualizado: " + miMoto.getTipo()); }
}
