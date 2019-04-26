package com.dell.academy.exercicios;

public class E1 {
	public static void main(String[] args) {
		int[] vet = new int[20];
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = i * 10;
		}
		
		System.out.println("\nExibição");
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
		
		System.out.println("\nExibição invertida");
		int aux = 0, j = vet.length - 1;
		for (int i = 0; i < vet.length / 2; i++) {
			aux = vet[i];
			vet[i] = vet[j];
			vet[j] = aux;
			j--;
		}
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
	}
}
