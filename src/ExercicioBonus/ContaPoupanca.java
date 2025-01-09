// Conta Poupança (OCP)
public class ContaPoupanca : ContaBancaria {
    public ContaPoupanca(string numeroConta, decimal saldoInicial) : base(numeroConta, saldoInicial) {

        public override decimal CalcularTaxa(decimal valor) {
            return valor * 0.005m; // Taxa de 0,5%
        }
    }
}
