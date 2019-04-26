package com.dell.academy.maps;

public class AppAgenda {
    public static void main(String[] args) {
        AgendaTelefonica agenda = new AgendaTelefonica();

        agenda.inserir("Pércio", "997388803");
        agenda.inserir("João", "981276544");
        agenda.inserir("Maria", "989034577");
        agenda.inserir("José", "981824435");
        agenda.inserir("Carlos", "998651774");

        agenda.show();
    }
}
