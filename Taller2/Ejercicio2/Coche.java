package Taller2;

public class Coche {
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public Coche(){
        this.marca="nula";
        this.modelo="nulo";
        this.velocidadMaxima=0;
        }

    public Coche(String marca, String modelo, int velocidadMaxima){
        this.marca=marca;
        this.modelo=modelo;
        this.velocidadMaxima=velocidadMaxima;
    }

    public void acelerar(int velocidad){
        if(velocidad>=0){
            this.velocidadMaxima+=velocidad;
        }else{
            System.out.println("La velocidad debe ser positiva");
        }
        
    }
    @Override 
    public String toString() {
         return "Coche [Marca=" + marca + ", Modelo=" + modelo + ", Velocidad Máxima=" + velocidadMaxima + "]"; }
}
