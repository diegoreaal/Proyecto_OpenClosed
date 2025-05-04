public class AplicacionBancaria {
    public static void main(String[] args) {
        Notificador notificador = new NotificadorEmail();
        CuentaBancaria cuenta = new CuentaBancaria("Pepe", "12345678", 1000, notificador);

        cuenta.depositar(500);
        cuenta.retirar(200);
        cuenta.imprimirDetallesCuenta();
        cuenta.enviarNotificacion("Notificación exitosa!");
    }
}
