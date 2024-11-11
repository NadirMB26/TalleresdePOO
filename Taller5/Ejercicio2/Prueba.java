package Taller5.Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
         // Crear una instancia de CuentaBancaria 
         CuentaBancaria cuenta = new CuentaBancaria("123456789", 1000.00, "Ahorros"); 
         // Mostrar detalles de la cuenta 
         cuenta.detallesCuenta(); 
         // Intentar acceder directamente a las propiedades privadas 'numeroCuenta' y 'saldo' 
         // Esto provocará errores de compilación 
         // System.out.println(cuenta.numeroCuenta); 
         // Error: numeroCuenta tiene acceso privado en CuentaBancaria
        // cuenta.numeroCuenta = "987654321"; 
        // Error: numeroCuenta tiene acceso privado en CuentaBancaria 
        // System.out.println(cuenta.saldo); 
        // Error: saldo tiene acceso privado en CuentaBancaria
         // cuenta.saldo = 2000.00; 
         // Error: saldo tiene acceso privado en CuentaBancaria 
         // Acceder a través de los métodos públicos
          System.out.println("Saldo actual: " + cuenta.getSaldo()); 
          // Modificar el saldo usando el método set 
          cuenta.setSaldo(2000.00); 
          System.out.println("Saldo actualizado: " + cuenta.getSaldo()); } 
}
