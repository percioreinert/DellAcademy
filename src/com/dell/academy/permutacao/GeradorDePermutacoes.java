package com.dell.academy.permutacao;

import java.util.Random;

public class GeradorDePermutacoes {

    private static Random random = new Random();
    public static int[] proxPermutacao(int[] list) {
        int i = random.nextInt(9);
        int j = random.nextInt(9);
        int aux;
        aux = list[i];
        list[i] = list[j];
        list[j] = aux;
        return list;
    }
}
