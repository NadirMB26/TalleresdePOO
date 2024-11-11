package Taller8.Ejercicio1;

public class Vehiculo {
    private String marca;
    private double velocidadMax;

    public Vehiculo(String marca, double velocidadMax){
        this.marca=marca;
        this.velocidadMax=velocidadMax;
    }

    // Método para mostrar la información del vehículo 
    public void mostrarInformacion() { 
        System.out.println("Marca: " + marca); 
        System.out.println("Velocidad Máxima: " + velocidadMax+ " km/h"); 
    }
    
    // Métodos getters 
    public String getMarca() { 
        return marca;
     } 
     public double getVelocidadMaxima() {
         return velocidadMax; 
        }

}
