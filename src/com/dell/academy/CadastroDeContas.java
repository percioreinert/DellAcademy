package com.dell.academy;

public class CadastroDeContas {

    // == constants ==
    private static final int DEFAULT_CAPACITY = 10;

    // == fields ==
    private ContaCorrente[] list;
    private int size;

    // == constructors ==
    public CadastroDeContas() {
        this.list = new ContaCorrente[DEFAULT_CAPACITY];
        size = 0;
    }

    public CadastroDeContas(int initialCapacity) {
        this.list = new ContaCorrente[initialCapacity];
        size = 0;
    }

    // == public methods ==
    public boolean addConta(ContaCorrente c) {
        if (c != null) {
            if (size == list.length) {
                grow();
            }
            list[size] = c;
            size++;
            return true;
        }
        return false;
    }

    public ContaCorrente getConta(int nroConta) {
        for (int i = 0; i < size; i++) {
            if (list[i].getNumeroDaConta() == nroConta) {
                return list[i];
            }
        }
        return null;
    }

    public double getSaldoTotal() {
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += list[i].getSaldo();
        }
        return total;
    }

    public int conta(double noMinimo) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (list[i].getSaldo() >= noMinimo) {
                count++;
            }
        }
        return count;
    }

    public int maiorSaldo() {
        ContaCorrente maior = list[0];
        for (int i = 1; i < size; i++) {
            if (list[i].getSaldo() > maior.getSaldo()) {
                maior = list[i];
            }
        }
        return maior.getNumeroDaConta();
    }

    public boolean remove(int nroConta) {
        for (int i = 0; i < size; i++) {
            if (list[i].getNumeroDaConta() == nroConta) {
                list[i] = list[i + 1];
            }
        }
        return false;
    }

    // == private methods ==
    private void grow() {
        ContaCorrente[] nova = new ContaCorrente[list.length * 2];
        for (int i = 0; i < size; i++) {
            nova[i] = list[i];
        }
        list = nova;
    }

    private void fix() {

    }

    private void checkIndex(int index, int size) {
        if (index < 0 || index > size) {
            throw new RuntimeException("Índice inválido");
        }
    }
}
