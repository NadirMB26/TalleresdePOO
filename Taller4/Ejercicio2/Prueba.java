package Taller4.Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        Moto moto= new Moto("deportiva", "pulsar", 125);
        // Intentar acceder directamente a las propiedades 'tipo' y 'marca' desde aquí causará un error de compilación 
        // miMoto.tipo = "Nueva Tipo"; 
        // Error: tipo tiene acceso protegido en Vehiculo 
        // miMoto.marca = "Nueva Marca"; 
        // Error: marca tiene acceso protegido en Vehiculo 
        // Pero puedes acceder a través de los métodos públicos 
        moto.mostrarDetalles();
    }
}
