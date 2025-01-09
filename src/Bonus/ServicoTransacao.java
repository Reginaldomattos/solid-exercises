// Serviço de transações (DIP: Depende de abstrações, não de implementações concretas)

class ServicoTransacao {

    private final Notificacao notificacao;

    public ServicoTransacao(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    public void realizarTransacao(Conta conta, double valor, boolean isDeposito) {
        if (isDeposito) {
            conta.depositar(valor);
            notificacao.enviar("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            conta.sacar(valor);
            notificacao.enviar("Saque de R$" + valor + " realizado com sucesso.");
        }
    }
}


