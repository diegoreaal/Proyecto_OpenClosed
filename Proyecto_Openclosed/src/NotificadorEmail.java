public class NotificadorEmail implements Notificador {
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Enviando correo a " + destinatario + ": " + mensaje);
    }
}
