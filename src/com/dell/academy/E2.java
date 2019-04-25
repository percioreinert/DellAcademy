package com.dell.academy;

public class E2 {
	
	public static void main(String [] args0 ) {
		int[] lista1 = {1, 2, 3, 4, 5, 2, 1, 1, 1};
		int[] lista2 = {4, 6, 8, 2, 1, 3, 2};
		
		int[] teste = union(lista1, lista2);
		for (int i = 0; i < teste.length; i++) {
			System.out.println(teste[i]);		
		}
		
	}
	
	// A
	public static int nOcorrencias(int[] lista, Integer element) {
		int count = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == element) {
				count++;
			}
		}
		return count;
	}
	
	//B
	public static boolean hasRepeat(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			for (int j = i + 1; j < lista.length; j++) {
				if (lista[i] == lista[j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	//C
	public static int nroRepeat(int[] lista) {
		int count = 0, k = 0;
		int[] aux = new int[lista.length];
		for (int i = 0; i < lista.length; i++) {
			for (int j = i + 1; j < lista.length; j++) {
				if (lista[i] == lista[j]) {	
					if (!contains(aux, lista[i])) {
						aux[k] = lista[i];
						k++;	
						count++;
					}
				}
			}
		}
		return count;
	}
	
	//D
	 public static int[] listRepeat(int[] lista) {
		 int[] repeat = new int[lista.length / 2];
		 int k = 0;
		 for (int i = 0; i < lista.length; i++) {
			 for (int j = i + 1; j < lista.length; j++) {
				 if (lista[i] == lista[j]) {
					 if (!contains(repeat, lista[i])) {
						 repeat[k] = lista[i];
						 k++;	 
					 }
					 
				 }
			 }
		 }
		 int[] ret = new int[k];
		 for (int i = 0; i < ret.length; i++) {
			 ret[i] = repeat[i];
		 }
		 return ret;
	 }
	 
	 // E
	 public static int[] union(int[] lista1, int[] lista2) {
		 int[] union = new int[lista1.length + lista2.length];
		 int k = 0;
		 for (int i = 0; i < lista1.length; i++) {
			 if (!contains(union, lista1[i])) {
				 union[k] = lista1[i];
				 k++;	 
			 }
		 }
		 for (int i = 0; i < lista2.length; i++) {
		 	 if (!contains(union, lista2[i])) {
				 union[k] = lista2[i];
				 k++;
			 }
		 }

		 int[] ret = new int[k];
		 for (int i = 0; i < ret.length; i++) {
			 ret[i] = union[i];
		 }
		 return ret;
	 }
	 
	 public static int[] intersect(int[] lista1, int[] lista2) {
		 int[] intersect;
		 int k = 0;
		 if (lista1.length > lista2.length) {
			 intersect = new int[lista2.length];
		 } else {
			 intersect = new int[lista1.length];
		 }
		 for (int i = 0; i < lista1.length; i++) {
			 for (int j = 0; j < lista2.length; j++) {
				 if (lista1[i] == lista2[j]) {
					 if (!contains(intersect, lista1[i])) {
						 intersect[k] = lista1[i];
						 k++;
						 break;	 
					 } 
				 }
			 }
		 }

		 int[] ret = new int[k];
		 for (int i = 0; i < ret.length; i++) {
			 ret[i] = intersect[i];
		 }
		 return ret;
	 }
	 
	 private static boolean contains(int[] lista, int element) {
			for (int i = 0; i < lista.length; i++) {
				if (lista[i] == element) {
					return true;
				}
			}
			return false;
		}
}
