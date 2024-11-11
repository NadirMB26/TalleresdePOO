package Taller4.Ejercicio3;

public class Banco {
    protected double saldo;

    public Banco(double saldoInicial) {
         this.saldo = saldoInicial;
         } 

    public double getSaldo() { 
        return saldo;
     } 

    public void depositar(double cantidad) {
         if (cantidad > 0) { 
            saldo += cantidad; 
        } else { 
        System.out.println("Cantidad debe ser positiva para depositar.");
     } 
    } 
    
    public void retirar(double cantidad) { 
        if (cantidad > 0 && cantidad <= saldo) {
             saldo -= cantidad;
             } else { 
            System.out.println("Cantidad inválida para retirar.");
         } 
        }

    public void mostrarSaldo() { 
        System.out.println("Saldo: " + saldo);
    }
}
