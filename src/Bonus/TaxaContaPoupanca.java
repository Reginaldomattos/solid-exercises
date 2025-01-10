public class TaxaContaPoupanca implements Taxa {
    @Override
    public double calcularTaxa(double valor) {
        return valor * 0.01; // 1% de taxa
    }
}
