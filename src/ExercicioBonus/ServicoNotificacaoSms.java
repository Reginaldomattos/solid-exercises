public class ServicoNotificacaoSms : IservicoNotificacao {

    public void EnviarNotificacao(string mensagem) {

        Console.WriteLine($"SMS enviado: {mensagem}");

    }
}
