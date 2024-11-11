package Taller8.Ejercicio1;

public class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(int numeroPuertas,String marca, double velocidadMax){
        super(marca, velocidadMax);
        this.numeroPuertas=numeroPuertas;
    }

    // Método para mostrar la información del coche 
    @Override 
    public void mostrarInformacion() { 
        super.mostrarInformacion(); 
        System.out.println("Número de Puertas: " + numeroPuertas); 
    } 
    // Método getter 
    public int getNumeroDePuertas() {
         return numeroPuertas; 
        }
}
