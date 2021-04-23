package com.company;

import java.util.Arrays;

public class Proprietario {

    private String nome;
    private String[] slot;

    public Proprietario(String n){
        this.nome = n;
        this.slot = new String[10];
        Arrays.fill(slot, null);
    }

    public void assegnaIndirizzo(String indirizzo){

        for (int i = 0; i < this.slot.length; i++){
            if (slot[i] == null){
                slot[i] = indirizzo;
                break;
            }
        }

    }

    public String ritornaIndirizo(int slotNumber){
        if (slotNumber > -1 && slotNumber < this.slot.length){
            return slot[slotNumber];
        }
        return null;
    }

    public int slotNonVuoti(){
        int counter = 0;
        for (String s : this.slot) {
            if (s != null) counter++;
        }
        return counter;
    }

    public void stampaInfo(){

        System.out.println(this.nome + " possiede i seguenti appartamenti:");
        for (String s : this.slot) {
            System.out.println(s);
        }
    }

}
