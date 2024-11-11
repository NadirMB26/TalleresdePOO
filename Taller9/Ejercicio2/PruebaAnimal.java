package Taller9.Ejercicio2;

public class PruebaAnimal { 
    public static void main(String[] args) { 
        // Crear una instancia de Animal 
        Animal animal = new Animal("Mamífero"); 
        animal.mostrarEspecie(); System.out.println("-------------------------"); 
        // Crear una instancia de Pez 
        Pez pez = new Pez("Tiburón", "Agua Salada"); 
        pez.mostrarEspecie(); 
    }
}
