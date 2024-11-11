package Taller3.Ejemplos;
class Producto {  
String nombre;
double precio;


    Producto(String nombre, double precio){
        this.nombre=nombre;
        this.precio=precio;
    }

    void mostrarInfo(){
        System.out.println("Nombre: "+nombre+", precio: "+precio);
    }
}
