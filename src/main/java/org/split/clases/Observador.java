package org.split.clases;

import org.split.interfaces.iObservador;

public class Observador implements iObservador {

    int id;

    public Observador(int id) {
        this.id = id;
    }

    @Override
    public void update(Observavel splitedWordNumber) {
        System.out.println("NOTIFICANDO OBSERVADOR " + this.id);
        System.out.println("Quantidade de palavras: "+splitedWordNumber.getAllWords());
        System.out.println("Quantidade de palavras pares: "+ splitedWordNumber.getPairsWords());
        System.out.println("Quantidade de palavras que começam com letra maiúscula: "+ splitedWordNumber.getUpperCaseWords());
        System.out.println(" ");
    }

}
