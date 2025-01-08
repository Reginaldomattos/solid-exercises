public class RelatorioFinanceiro {
    public static void main(String[] args) {
        GeradorRelatorioFinanceiro gerador = new GeradorRelatorioFinanceiro();
        EnviadorEmail enviador = new EnviadorEmail();


        gerador.gerarRelatorio();


        enviador.enviarPorEmail();

    }

}
