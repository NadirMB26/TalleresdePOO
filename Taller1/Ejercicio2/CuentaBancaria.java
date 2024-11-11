package Taller1;

public class CuentaBancaria {
    String tipoCuenta;
    String numeroCuenta;
    int saldo;

    //constructor por defecto
    public CuentaBancaria(){
        this.tipoCuenta="normal";
        this.numeroCuenta="0000";
        this.saldo=50000;
    }

// constructor con 2 parametros
public CuentaBancaria(String tipoCuenta,String numeroCuenta){
    this.tipoCuenta=tipoCuenta;
    this.numeroCuenta=numeroCuenta;
  
}
// constructor sobrecargado con 3 parametros
    public CuentaBancaria(String tipoCuenta, int saldo, String numeroCuenta){
        this.tipoCuenta=tipoCuenta;
        this.numeroCuenta=numeroCuenta;
        this.saldo=saldo;
    }

 @Override
 public String toString() { 
    return "CuentaBancaria [Número de cuenta=" + numeroCuenta + ", Saldo=" + saldo + "]";
}
}
