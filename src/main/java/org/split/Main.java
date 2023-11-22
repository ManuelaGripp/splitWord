package org.split;

import org.split.clases.Observador;
import org.split.clases.Observavel;

public class Main {
    public static void main(String[] args) {

        Observavel wordSplitter = new Observavel();

        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);

        wordSplitter.registraObservador(obs1);
        wordSplitter.registraObservador(obs2);
        wordSplitter.registraObservador(obs3);

        wordSplitter.splitWord("Quantas palavras tem essa Frase");
        wordSplitter.splitWord("Quantas Palavras pares Tem aqui");
        wordSplitter.splitWord("Quantas Palavras començando MAIÚSCULA Tem nessa frAse");



        wordSplitter.removeObservador(obs3);

        wordSplitter.notificaObservadores();
    }
}