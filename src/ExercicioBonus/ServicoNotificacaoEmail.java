import java.io.Console;

public class ServicoNotificacaoEmail : IservicoNotificacao {

    public void EnviarNotificacao(string mensagem) {

        Console.WriteLine($"E-mail enviado: {mensagem}");
    }

}
