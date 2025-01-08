import java.util.ArrayList;
import java.util.List;

public class CuentaAhorros extends CuentaBancaria{

    private List<String> tiposRetiro;
    private List<String> tiposDeposito;


    public CuentaAhorros(String titular, String numeroCuenta, double saldo) {
        super(titular, numeroCuenta, saldo);
        this.tiposRetiro = new ArrayList<>();
        this.tiposDeposito = new ArrayList<>();

    }

    @Override
    public void depositar(double monto, String tipoDeposito) {
        if (monto > 0){
            setSaldo(getSaldo() + monto);
            tiposDeposito.add(tipoDeposito);
            System.out.println("Depósito exitoso de $"+ monto +  " en tu cuenta de ahorros mediante "+tipoDeposito+". Saldo actual: $" + getSaldo());
        } else {
            System.out.println("El monto a depositar debe ser positivo");
        }
    }

    @Override
    public void retirar(double montoARetirar, String tipoRetiro) {
        if(montoARetirar > 0 && montoARetirar <= getSaldo()){
            tiposRetiro.add(tipoRetiro);
            setSaldo(getSaldo()-montoARetirar);
            System.out.println("Hiciste un retiro de $"+ montoARetirar + " de tu cuenta de ahorros mediante "
                                + tipoRetiro+" .Saldo restante: $" + getSaldo());
        } else {
            System.out.println("Fondos insuficientes. El monto a retirar debe ser menor o igual al saldo de su cuenta");
        }
    }





}



