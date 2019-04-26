package com.dell.academy.contacorrente;

public class ContaCorrente {

    // == fields ==
    private double balance;
    private int accountNumber;

    // == constructors ==
    public ContaCorrente(int numeroConta) throws RuntimeException {
        if (numeroConta < 100000 || numeroConta > 999999) {
            throw new RuntimeException("Invalid account number.");
        }
        this.accountNumber = numeroConta;
        this.balance = 0;
    }

    public ContaCorrente(int numeroConta, double valor) throws RuntimeException {
        if (numeroConta < 100000 || numeroConta > 999999) {
            throw new RuntimeException("Invalid account number.");
        }
        this.accountNumber = numeroConta;
        this.balance = 0;
        deposit(valor);
    }

    // == public methods ==
    public void deposit(double valor) throws RuntimeException {
        if (valor > 0) {
            this.balance += valor;
        } else {
            throw new RuntimeException("Invalid value.");
        }
    }

    public double cashOut(double saque) throws RuntimeException {
        if (saque > 0 ) {
            if (saque <= this.balance) {
                this.balance -= saque;
                return this.balance;
            } else {
                throw new RuntimeException("Saldo insuficiente.");
            }
        } else {
            throw new RuntimeException("Invalid value");
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
}
