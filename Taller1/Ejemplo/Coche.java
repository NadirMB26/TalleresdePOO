package Taller1.Ejemplo;

public class Coche extends Vehiculo{
    String marca;

    public Coche(String tipo, String marca){
        super(tipo);
        this.marca=marca;
    }
    public static void main(String[] args) { 
     Coche miCoche = new Coche("Sedán", "Toyota");
     System.out.println("Tipo: " + miCoche.tipo);
     System.out.println("Marca: " + miCoche.marca); }
}

