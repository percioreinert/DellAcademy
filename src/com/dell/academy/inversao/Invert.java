package com.dell.academy.inversao;

public class Invert {
    public static void main(String[] args) {

    }

    public static int[] invert(int[] list) {
        int aux;
        for (int i = 0, j = list.length; i < list.length / 2; i++, j--) {
            aux = list[i];
            list[i] = list[j];
            list[j] = aux;
        }
        return list;
    }
}
