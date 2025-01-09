using System;

import java.awt.dnd.InvalidDnDOperationException;

public abstract class ContaBancaria {

}

public string NumeroConta {get;set; }
public decimal Saldo {get;protected set; }

public ContaBancaria(string numeroConta, decimal saldoInicial) {
    numeroConta = numeroConta;
    Saldo = saldoInicial;
}

public abstract decimal CalcularTaxa(decimal valor);

public virtual

void Depositar(decimal valor) {
    saldo += valor;
}

public virtual void Sacar(decimal valor) {
    decimal taxa = CalcularTaxa(valor);
    if (saldo >= valor + taxa); {
        saldo -= (valor + taxa);
    }
    else {
        throw new InvalidDnDOperationException("Saldo insuficiente.");
    }
}



