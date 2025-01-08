interface Transaccion {
    void depositar(double monto, String tipoDeposito);
    void retirar(double monto, String tipoRetiro);
}

interface MostrarInfo {
    void mostrarTiposDeposito();
    void mostrarTiposRetiro();
}