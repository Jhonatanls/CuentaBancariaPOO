public class Depositar implements Transaccion{

    private int idTransaccion;

    @Override
    public void ejecutar(CuentaBancaria cuenta, double monto) {
        if (monto > 0){
            cuenta.setSaldo(cuenta.getSaldo() + monto);
            System.out.println();
            System.out.println("Transacción No. "+": Depósito exitoso de $"+ monto +  ". Saldo actual: $" + cuenta.getSaldo());
        } else {
            System.out.println("El monto a depositar debe ser positivo");
        }
    }
}
