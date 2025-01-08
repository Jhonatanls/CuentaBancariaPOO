public class Retirar implements Transaccion {


    @Override
    public void ejecutar(CuentaBancaria cuenta, double montoARetirar) {
        if(montoARetirar > 0 && montoARetirar <= cuenta.getSaldo()){
            cuenta.setSaldo(cuenta.getSaldo()-montoARetirar);
            System.out.println("Transacción No. "+": Retiro de $"+ montoARetirar + " de tu cuenta"
                    + " .Saldo restante: $" + cuenta.getSaldo());
        } else {
            System.out.println("Fondos insuficientes. El monto a retirar debe ser menor o igual" +
                                " al saldo de su cuenta");
        }
    }

}
