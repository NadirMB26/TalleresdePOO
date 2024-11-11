package Taller14.Ejercicio4;

public class Prueba{
    public static void main(String[] args) {
        // Crear instancias de Coche y Bicicleta
        Vehículo coche = new Coche();
        Vehículo bicicleta = new Bicicleta();

        // Usar polimorfismo para invocar el método mover
        coche.mover();
        bicicleta.mover();
    }
}

