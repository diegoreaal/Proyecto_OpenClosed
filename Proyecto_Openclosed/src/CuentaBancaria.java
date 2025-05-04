public class CuentaBancaria {
    private String titular;
    private String idCuenta;
    private double saldo;
    private Notificador notificador;

    public CuentaBancaria(String titular, String idCuenta, double saldo, Notificador notificador) {
        this.titular = titular;
        this.idCuenta = idCuenta;
        this.saldo = saldo;
        this.notificador = notificador;
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depositado: $" + monto);
    }

    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Retirado: $" + monto);
        } else {
            System.out.println("¡Saldo insuficiente!");
        }
    }

    public void imprimirDetallesCuenta() {
        System.out.println("Titular de la cuenta: " + titular);
        System.out.println("ID de la cuenta: " + idCuenta);
        System.out.println("Saldo actual: $" + saldo);
    }

    public void enviarNotificacion(String mensaje) {
        notificador.enviar(titular, mensaje);
    }
}
