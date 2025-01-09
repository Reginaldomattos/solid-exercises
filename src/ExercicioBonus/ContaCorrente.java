public class ContaCorrente : ContaBancaria {
    public ContaCorrente(string numeroConta, decimal saldoInicial) : base(numeroConta, saldoInicial) {

    public override decimal CalcularTaxa(decimal valor) {
        return valor * 0.01m; //taxa de 1%
        }
    }
}
