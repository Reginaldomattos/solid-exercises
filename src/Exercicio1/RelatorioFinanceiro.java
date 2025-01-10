public class RelatorioFinanceiro {
    public static void main(String[] args) {
        GeradorRelatorioFinanceiro gerador = new GeradorRelatorioFinanceiro();
        EnviadorEmail enviador = new EnviadorEmail();

        //Gerar o relatório
        gerador.gerarRelatorio();

        // Enviar o relatório por e-mail
        enviador.enviarPorEmail();

    }

}
