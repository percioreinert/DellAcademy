package com.dell.academy;

public class AppPermutacoes {
    public static void main(String[] args) {
        int[] aux = new int[10];
        for (int i = 1; i <= aux.length; i++) {
            aux[i - 1] = i;
        }
        for (int i = 0; i < aux.length; i++) {
            System.out.println(aux[i]);
        }

        int[] lista = null;
        for (int i = 0; i < aux.length; i++) {
            lista = GeradorDePermutacoes.proxPermutacao(aux);
        }

        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }
}
