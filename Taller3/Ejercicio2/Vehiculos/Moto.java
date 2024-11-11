package Taller3.Ejercicio2.Vehiculos;

class Moto extends Vehiculo {

Moto(String tipo) { 
    super(tipo);
 }

     void mostrarDetalles() {
     System.out.println("Tipo de vehículo: " + getTipo());
     }
}
