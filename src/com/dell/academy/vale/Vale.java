package com.dell.academy.vale;

public class Vale {

    public static int nivel(int[][] perfilAltimetrico, int capacidade, int totalChuva) {
        for (int i = 0; i < perfilAltimetrico[i].length; i++) {
            for (int j = 0; j < perfilAltimetrico.length; j++) {
                if (totalChuva <= 0) {
                    return j;
                }
                if (perfilAltimetrico[j][i] == 0) {
                    totalChuva -= capacidade;
                }
            }
        }
        return -1;
    }
}
