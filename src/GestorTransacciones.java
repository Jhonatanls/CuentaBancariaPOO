import java.util.ArrayList;

public class GestorTransacciones {

    public void ejecutar(Transaccion transaccion, CuentaBancaria cuenta, double monto){
        transaccion.ejecutar(cuenta, monto);

    }

}
