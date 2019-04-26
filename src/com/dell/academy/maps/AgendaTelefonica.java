package com.dell.academy.maps;

import java.util.HashMap;
import java.util.Map;

public class AgendaTelefonica {

    // == fields ==
    private Map<String, String> colection;

    // == constructors ==
    public AgendaTelefonica() {
        colection = new HashMap<>();
    }

    // == public methods ==
    public void inserir(String nome, String numero) {
        if (nome != null && !nome.isBlank()) {
            if (numero.length() == 8 || numero.length() == 9) {
                colection.put(nome, numero);
            }
        }
    }

    public String buscar(String nome) {
        if (nome != null && !nome.isBlank()) {
            return colection.get(nome);
        }
        return null;
    }

    public void remover(String nome) {
        if (nome != null && !nome.isBlank()) {
            colection.remove(nome);
        }
    }

    public int tamanho() {
        return colection.size();
    }

    public void show() {
        colection.forEach( (k, v) -> System.out.println("Nome: " + k + "\n" + "Telefone: " + v + "\n") );
    }
}
