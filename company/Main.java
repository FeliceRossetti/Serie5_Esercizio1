package com.company;

public class Main {

    public static void main(String[] args) {

        Proprietario p1 = new Proprietario("Andrea Rossi");

        p1.assegnaIndirizzo("Appartamento 1");
        p1.assegnaIndirizzo("Appartamento 2");
        System.out.println(p1.ritornaIndirizo(3));
        System.out.println(p1.ritornaIndirizo(1));
        System.out.println(p1.slotNonVuoti());

        p1.stampaInfo();



    }
}
