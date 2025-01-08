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

}



