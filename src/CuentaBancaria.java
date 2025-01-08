import java.util.ArrayList;
import java.util.List;

abstract class CuentaBancaria{

    private String numeroCuenta;
    private String titular;
    private double saldo;
    private int contadorTransacciones;

    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    protected void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}



