public class AplicacionBancaria {
    public static void main(String[] args) {
        Notificador notificador = new NotificadorEmail();
        CuentaBancaria cuenta = new CuentaBancaria("Pepe", "12345678", 1000, notificador);

        cuenta.depositar(500);
        cuenta.retirar(200);
        cuenta.imprimirDetallesCuenta();
        cuenta.enviarNotificacion("Notificación exitosa! \n \n");

        Notificador notificador2 = new NotificadorSMS();
        CuentaBancaria cuenta2 = new CuentaBancaria("Cris", "34567890", 10, notificador2);

        cuenta2.depositar(20);
        cuenta2.retirar(9);
        cuenta2.imprimirDetallesCuenta();
        cuenta2.enviarNotificacion("Notificación exitosa!");
    }
}
