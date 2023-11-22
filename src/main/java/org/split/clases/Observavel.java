package org.split.clases;

import org.split.interfaces.iObservavel;

import java.util.ArrayList;
import java.util.List;

public class Observavel implements iObservavel {

    private int allWords;
    private int pairsWords;
    private int upperCaseWords;
    private List<Observador> clientes;

    public Observavel() {
        clientes = new ArrayList<Observador>();
    }

    @Override
    public void registraObservador(Observador obs) {
        clientes.add(obs);
    }

    @Override
    public void removeObservador(Observador obs) {
        if(clientes.contains(obs))
            clientes.remove(obs);
    }

    @Override
    public void notificaObservadores() {
        for (Observador observador : clientes) {
            observador.update(this);
        }
    }

    public void splitWord(String phrase) {
        this.allWords = 0;
        this.pairsWords = 0;
        this.upperCaseWords = 0;
        String[] splitedWord = phrase.split(" ");

//        All Words Counter
        this.allWords = splitedWord.length;

//        Pairs Words Counter
        for(String word : splitedWord){
            if(word.length() % 2 == 0 ){
                this.pairsWords++;
            }
        }

//        UpperCase Words Counter
        for(String word : splitedWord){
            if( Character.isUpperCase(word.charAt(0))){
                this.upperCaseWords++;
            }

        }
        notificaObservadores();
    }

    public int getAllWords() {
        return allWords;
    }

    public void setAllWords(int allWords) {
        this.allWords = allWords;
    }

    public int getPairsWords() {
        return pairsWords;
    }

    public void setPairsWords(int pairsWords) {
        this.pairsWords = pairsWords;
    }

    public int getUpperCaseWords() {
        return upperCaseWords;
    }

    public void setUpperCaseWords(int upperCaseWords) {
        this.upperCaseWords = upperCaseWords;
    }

    public List<Observador> getClientes() {
        return clientes;
    }

    public void setClientes(List<Observador> clientes) {
        this.clientes = clientes;
    }



}
