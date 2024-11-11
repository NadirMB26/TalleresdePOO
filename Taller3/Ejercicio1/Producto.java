package Taller3.Ejercicio1;

class Producto {
  String nombre;
  double precio;
  int stock;  

  Producto(String nombre, double precio, int stock){
    this.nombre=nombre;
    this.precio=precio;
    this.stock=stock;
  }

  void mostrarInfo(){
    System.out.println("Nombre: "+nombre+"precio: "+precio+"Stock: "+stock);
  }
}
