package com.dell.academy;

public class App {

    public static void main(String[] args) {
        ListaArray<Pessoa> lista = new ListaArray<>();

        Pessoa p1 = new Pessoa("João");
        Pessoa p2 = new Pessoa("Maria");
        Pessoa p3 = new Pessoa("José");
        Pessoa p4 = new Pessoa("Carlos");
        Pessoa p5 = new Pessoa("Adriane");
        Pessoa p6 = new Pessoa("Matheus");
        Pessoa p7 = new Pessoa("Maurício");
        Pessoa p8 = new Pessoa("Victória");
        Pessoa p9 = new Pessoa("Cláudio");
        Pessoa p10 = new Pessoa("Pércio");

        System.out.println(lista.add(p1));
        lista.show();
        System.out.println(lista.add(p2));
        lista.show();
        System.out.println(lista.add(p3));
        lista.show();
        System.out.println(lista.add(p4));
        lista.show();
        System.out.println(lista.add(p5));
        lista.show();
        System.out.println(lista.add(p6));
        lista.show();
        System.out.println(lista.add(p7));
        lista.show();
        System.out.println(lista.add(p8));
        lista.show();
        System.out.println(lista.add(p9));
        lista.show();
        System.out.println(lista.add(p10, 3));
        lista.show();

        System.out.println("Remove");
        System.out.println(lista.remove(3));
        lista.show();

        System.out.println(lista.size());
        System.out.println("Get");
        System.out.println(lista.get(9));

    }
}
