package Taller2;
public class MainC {
    public static void main(String[] args) {
        // Crear un objeto de la clase Coche usando el constructor parametrizado
        Coche coche = new Coche("Toyota", "Corolla", 180);
        System.out.println("Detalles del coche: " + coche);

        // Intentar acceder directamente a las propiedades privadas
        // Estas líneas provocarán errores de compilación
        // coche.marca = "Honda";
        // coche.modelo = "Civic";
        // coche.velocidadMaxima = 200;

        // Utilizar el método acelerar para incrementar la velocidad máxima
        coche.acelerar(20);
        System.out.println("Detalles del coche después de acelerar: " + coche);

        // Intentar acceder directamente a las propiedades privadas
        // coche.marca; // Provocará error de compilación
        // coche.modelo; // Provocará error de compilación
        // coche.velocidadMaxima; // Provocará error de compilación
    }
}
