//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CuentaAhorros cuentaAhorros = new CuentaAhorros("Jhonatan", "3058529126",200000.0);
        cuentaAhorros.depositar(500.0, "Transferencia");
        cuentaAhorros.depositar(300.0, "Cajero");
        cuentaAhorros.depositar(200.0, "Corresponsal");
        cuentaAhorros.retirar(200.0, "Cajero");
        System.out.println();
        CuentaCorriente Corriente = new CuentaCorriente("Jhonatan", "3058529126",200000.0);
        Corriente.depositar(1000.0, "Transferencia");
        Corriente.depositar(400.0, "Cheque");
        Corriente.depositar(600.0, "Cajero");
        Corriente.retirar(2000.0, "Corresponsal");

    }
}