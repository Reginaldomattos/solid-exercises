public class NotificacaoEmail implements Notificacao {

    @Override
    public void enviar(String menssagem) {
        System.out.println("Enviando e-mail: " + mensagem);
    }
}
