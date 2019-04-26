package com.dell.academy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CadastroDeContas {

    // == fields ==
    private List<ContaCorrente> list;

    // == constructors ==
    public CadastroDeContas() {
        list = new ArrayList<>();
    }

    public CadastroDeContas(int initialCapacity) {
        list = new ArrayList<>(initialCapacity);
    }

    // == public methods ==
    public List<ContaCorrente> printList() {
        return Collections.unmodifiableList(list);
    }

    public List<ContaCorrente> getList() {
        return this.list;
    }

    public List<ContaCorrente> copyList() {
        return new ArrayList<>(list);
    }

    public boolean addConta(ContaCorrente c) {
        if (c != null) {
            list.add(c);
            return true;
        }
        return false;
    }

    public ContaCorrente getConta(int accountNumber) {
        ContaCorrente aux = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAccountNumber() == accountNumber) {
                aux = list.get(i);
                if (i > 0) {
                    list.set(i, list.get(i - 1));
                    list.set(i - 1, aux);
                }
                break;
            }
        }
        return aux;
    }

    public double getSaldoTotal() {
        double total = 0;
        for (ContaCorrente c : list) {
            total += c.getBalance();
        }
        return total;
    }

    public int conta(double noMinimo) {
        int count = 0;
        for (ContaCorrente c : list) {
            if (c.getBalance() >= noMinimo) {
                count++;
            }
        }
         return count;
    }

    public int maiorSaldo() {
        ContaCorrente maior = list.get(0);
        for (ContaCorrente c : list) {
            if (c.getBalance() > maior.getBalance()) {
                maior = c;
            }
        }
        return maior.getAccountNumber();
    }

    public boolean remove(int nroConta) {
        Iterator<ContaCorrente> iterator = list.iterator();
        ContaCorrente c;

        while (iterator.hasNext()) {
            c = iterator.next();

            if (c.getAccountNumber() == nroConta) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
