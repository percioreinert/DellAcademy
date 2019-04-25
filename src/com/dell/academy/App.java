package com.dell.academy;

public class App {

    public static void main(String[] args) {
        ListaArray<Pessoa> lista = new ListaArray<>();

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        Pessoa p4 = new Pessoa();
        Pessoa p5 = new Pessoa();
        Pessoa p6 = new Pessoa();
        Pessoa p7 = new Pessoa();
        Pessoa p8 = new Pessoa();
        Pessoa p9 = new Pessoa();
        Pessoa p10 = new Pessoa();
        Pessoa p11 = new Pessoa();

        System.out.println(lista.add(p1));
        System.out.println(lista.add(p2));
        System.out.println(lista.add(p3));
        System.out.println(lista.add(p4));
        System.out.println(lista.add(p5));
        System.out.println(lista.add(p6));
        System.out.println(lista.add(p7));
        System.out.println(lista.add(p8));
        System.out.println(lista.add(p9));
        System.out.println(lista.add(p10));
        System.out.println(lista.add(p11));
    }
}
