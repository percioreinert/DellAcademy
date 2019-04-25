package com.dell.academy;

public class ContaCorrente {

    // == fields ==
    private double saldo;
    private int numeroConta;

    // == constructors ==
    public ContaCorrente(int numeroConta) {
        // TODO: Validar o número da conta.
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    // == public methods ==
    public void deposito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            throw new RuntimeException("Valor inválido");
        }
    }

    public double retirada(double retirada) {
        if (retirada > 0 && retirada <= saldo) {
            saldo -= retirada;
            return this.saldo;
        } else {
            throw new RuntimeException("Valor inválido");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumeroDaConta() {
        return this.numeroConta;
    }
}
