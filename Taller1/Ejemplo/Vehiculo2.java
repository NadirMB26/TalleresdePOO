package Taller1;

public class Vehiculo {
    String tipo;

    public Vehiculo(String tipo){
        this.tipo=tipo;
    }
}

public class Coche extends Vehiculo{
    String marca;

    public Coche(String tipo, String marca){
        super(tipo);
        this.marca=marca;
    }
}
