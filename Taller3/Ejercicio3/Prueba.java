package Taller3.Ejercicio3;

public class Prueba {
    public class prueba { public static void main(String[] args) { 
        Persona persona = new Persona("Ana", 25); 
        // Accediendo a la propiedad privada 'nombre' usando métodos get y set
         System.out.println("Nombre: " + persona.getNombre()); 
         persona.setNombre("Maria"); 
         System.out.println("Nombre actualizado: " + persona.getNombre());
          // Accediendo a la propiedad 'edad' (de paquete) directamente 
          System.out.println("Edad: " + persona.edad); 
          // Mostrando detalles completos 
          System.out.println(persona); }
}
}