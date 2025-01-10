public class Conta {
    protected double saldo;
    protected Taxa taxa;

    public Conta(Taxa taxa) {
        this.taxa = taxa;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        double taxaCalculada = taxa.calcularTaxa(valor);
        if (saldo >= (valor + taxaCalculada)) {
            saldo -= (valor + taxaCalculada);
    } else {
        throw new IllegalArgumentException("Saldo insuficiente!");
    }
}

    public double getSaldo() {
        return saldo;
    }
}
