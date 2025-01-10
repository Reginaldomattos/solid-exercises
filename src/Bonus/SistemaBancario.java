public class SistemaBancario {
    public static void main(String[] args) {
        // Criando Contas
        Conta contaCorrente = new ContaCorrente();
        Conta contaPoupanca = new ContaPoupanca();

        // Criando serviço de notificação
        Notificacao notificacaoEmail = new NotificacaoEmail();
        ServicoTransacao servicoTransacao = new ServicoTransacao(notificacaoEmail);

        // Realizando transações
        servicoTransacao.realizarTransacao(contaCorrente, 1000, true); // Depósito
        servicoTransacao.realizarTransacao(contaCorrente, 200, false); // Saque

        servicoTransacao.realizarTransacao(contaPoupanca, 500, true); //Depósito
        servicoTransacao.realizarTransacao(contaPoupanca, 100, false); // Saque

        // Exibindo saldos
        System.out.println("Saldo Conta Corrente: R$" + contaCorrente.getSaldo());
        System.out.println("Saldo Conta Poupança: R$" + contaPoupanca.getSaldo());


    }
}
